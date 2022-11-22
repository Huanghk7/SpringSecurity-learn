package cn.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author huanghk
 * @date 2022/11/14 15:42
 * @project SpringSecurity
 */
@SpringBootApplication
@MapperScan("cn.edu.mapper")
public class TokenApplication {
    public static void main(String[] args) {
        SpringApplication.run(TokenApplication.class, args);
    }
}
