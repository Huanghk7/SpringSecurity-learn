package cn.edu.handle;

import cn.edu.domain.ResponseResult;
import cn.edu.util.WebUtils;
import com.alibaba.fastjson.JSON;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author huanghk
 * @date 2022/11/22 11:33
 * @project SpringSecurity
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {


    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        ResponseResult result = new ResponseResult(HttpStatus.UNAUTHORIZED.value(), "用户认证失败，请重新登录");
        String json = JSON.toJSONString(result);
        // 处理异常
        WebUtils.renderString(response, json);
    }
}
