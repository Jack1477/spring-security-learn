package com.luckyvv.securitydemo.config;

import com.luckyvv.securitydemo.handler.AuthenticationFailureHandlerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

/**
 * @author JackJun
 * 2019/5/18 13:40
 * Life is not just about survival, but VV and distance.
 */
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;

    @Autowired
    private AuthenticationSuccessHandler authenticationSuccessHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        String loginPage="/login";
        String loginProcessingUrl="/api/v1/login.do";
        http.formLogin()
                .loginPage(loginPage)
                .loginProcessingUrl(loginProcessingUrl)
                .defaultSuccessUrl("/sayHello")
                .successHandler(authenticationSuccessHandler)
                .failureHandler(authenticationFailureHandler)
                .and()
                .authorizeRequests()
                .antMatchers(loginPage).permitAll()
                .anyRequest()
                .authenticated()
                .and().csrf().disable(); //Spring Security CSRF 防护, 不添加此行且表单中没有_csrf属性会报出403
    }
}
