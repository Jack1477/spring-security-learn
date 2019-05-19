package com.luckyvv.securitydemo.config;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author JackJun
 * 2019/5/18 21:23
 * Life is not just about survival, but VV and distance.
 */
@Component
public class PasswordEncoderImpl extends BCryptPasswordEncoder {
//    @Override
//    public String encode(CharSequence rawPassword) {
//        String pwd = rawPassword.toString();
//        //此处进行加密操作
//        return pwd;
//    }
//
//    @Override
//    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        return encodedPassword.equals(encode(rawPassword));
//    }
}
