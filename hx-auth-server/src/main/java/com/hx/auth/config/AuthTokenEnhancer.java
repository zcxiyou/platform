package com.hx.auth.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import com.hx.auth.entity.UserDetail;
/**
* @Date :2020/10/13 11:07
* @Description :token增强器,根据自己业务 往token存储业务字段
* @Version :V1.0
*/
public class AuthTokenEnhancer implements TokenEnhancer {
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
    	UserDetail userDetail = (UserDetail) authentication.getPrincipal();

        final Map<String, Object> additionalInfo = new HashMap<>();
        final Map<String, Object> retMap = new HashMap<>();

        additionalInfo.put("username",userDetail.getUsername());

        retMap.put("additionalInfo",additionalInfo);

        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(retMap);

        return accessToken;
    }
}
