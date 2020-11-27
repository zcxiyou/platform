package com.hx.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.hx.auth.entity.UserDetail;
import com.hx.auth.entity.UserEntity;
import com.hx.auth.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * @Date :2020/10/13 11:11
 * @Description :
 * @Version :V1.0
 */
@Component("userDetailsService")
@Slf4j
public class AuthUserDetailService implements UserDetailsService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserDetail loadUserByUsername(String userName) throws UsernameNotFoundException {
		UserDetail userDetail = null;
		UserEntity userEntity = userMapper.findByUserName(userName);
		// oauth2验证密码不能为空、权限也不能为null
		if (StringUtils.isEmpty(userEntity.getPassword())) {
			throw new UsernameNotFoundException("");
		}else {
			userDetail = new UserDetail(userEntity);
		}
		return userDetail;

	}
}
