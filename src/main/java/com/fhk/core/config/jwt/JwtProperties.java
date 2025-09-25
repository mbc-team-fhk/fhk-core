package com.fhk.core.config.jwt;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * import 한 MSA 모듈 application properties 에서 변수 설정가능
 *
 * jar lib 이라서 Spring boot Scan 불가 (Application X)
 * Settings -> Editor -> Inspections -> Spring | Spring Boot | Invalid @ConfigurationProperties  기존 Error 표기 -> Warning 표기로 변경
 */
@ConfigurationProperties(prefix = "jwt")
public record JwtProperties(
        String accessSecret,
        long accessExpireMs,
        String refreshSecret,
        long refreshExpireMs
) {

}