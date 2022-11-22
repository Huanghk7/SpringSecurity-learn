package cn.edu.service.impl;

import cn.edu.domain.LoginUser;
import cn.edu.domain.User;
import cn.edu.mapper.MenuMapper;
import cn.edu.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * @author huanghk
 * @date 2022/11/18 17:03
 * @project SpringSecurity
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // 查询用户信息
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserName, username);
        User user = userMapper.selectOne(queryWrapper);
        // 没有查找到用户则抛出异常
        if (Objects.isNull(user)) {
            throw new RuntimeException("用户名或密码错误");
        }
        // TODO 查询对应的权限信息
        // List<String> list = new ArrayList<>(Arrays.asList("test", "admin"));
        List<String> list = menuMapper.selectPermsByUserId(user.getId());
        // 封装数据
        return new LoginUser(user, list);
    }
}
