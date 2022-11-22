package cn.edu;

import cn.edu.domain.User;
import cn.edu.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * @author huanghk
 * @date 2022/11/14 17:55
 * @project SpringSecurity
 */
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void TestBCryptPasswordEncoder() {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("1234");
        String encode2 = passwordEncoder.encode("1234");
        System.out.println(encode);
        System.out.println(encode2);
        System.out.println(passwordEncoder.matches("1234", "$2a$10$RMHvz656EvwS0XWvyo6KI.XBwBpj7LLnsa2p07v7uD.kLDXBJ9IH6"));
    }

    @Test
    public void userMapperTest() {
        List<User> users = userMapper.selectList(null);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
