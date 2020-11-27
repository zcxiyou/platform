package com.hx.auth.mapper;

import com.hx.auth.entity.UserEntity;

public interface UserMapper {

	/**根据username查找用户信息
	 * @param userName
	 * @return
	 */
	public UserEntity findByUserName(String userName);
}
