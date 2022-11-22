package cn.edu.mapper;

import cn.edu.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author huanghk
 * @date 2022/11/14 17:42
 * @project SpringSecurity
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
