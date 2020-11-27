package com.hx.auth.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
* @Date :2020/10/25 17:54
* @Description : jwt证书信息
* @Version :V1.0
*/
@Data
@ConfigurationProperties(prefix = "hx.jwt")
public class JwtCAProperties {

    /**
     * 证书名称
     */
    private String keyPairName;


    /**
     * 证书别名
     */
    private String keyPairAlias;

    /**
     * 证书私钥
     */
    private String keyPairSecret;

    /**
     * 证书存储密钥
     */
    private String keyPairStoreSecret;

}
