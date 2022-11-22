package cn.edu;

import cn.edu.mapper.MenuMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author huanghk
 * @date 2022/11/21 17:54
 * @project SpringSecurity
 */
@SpringBootTest
public class MenuMepperTest {

    @Autowired
    private MenuMapper menuMapper;

    @Test
    public void testSelectPermsUserId() {
        List<String> list = menuMapper.selectPermsByUserId(1L);
        System.out.println(list);
    }
}
