package com.fhk.core.config.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * application properties 에서 변수 설정가능
 * @param accessExpireMs
 */
@ConfigurationProperties(prefix = "jwt")
public record JwtProperties(
        String accessSecret,
        long accessExpireMs,
        String refreshSecret,
        long refreshExpireMs
) {

}