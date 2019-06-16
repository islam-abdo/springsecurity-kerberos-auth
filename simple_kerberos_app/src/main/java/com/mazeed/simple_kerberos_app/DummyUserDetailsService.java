package com.mazeed.simple_kerberos_app;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Slf4j // Lombok annotation for logging
public class DummyUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		System.out.println("################################User: " + username);

		return new User(username, "notUsed", true, true, true, true,
				AuthorityUtils.createAuthorityList("ROLE_USER", "ROLE_ADMIN"));
	}
}
