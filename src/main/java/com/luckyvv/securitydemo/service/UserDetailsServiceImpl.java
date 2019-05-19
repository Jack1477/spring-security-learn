package com.luckyvv.securitydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author JackJun
 * 2019/5/18 20:45
 * Life is not just about survival, but VV and distance.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String password=passwordEncoder.encode("123456");
        System.out.println("Access Password:"+password);
        return new User(s,password, AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
    }
}
