package com.example.studyoidc.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.core.OAuth2Error;
import org.springframework.security.oauth2.core.OAuth2TokenValidator;
import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;
import org.springframework.security.oauth2.jwt.Jwt;

import org.springframework.security.oauth2.core.OAuth2TokenValidatorResult;

@RequiredArgsConstructor
public class AudienceValidator implements OAuth2TokenValidator<Jwt> {
    private final String audience;

    @Override
    public OAuth2TokenValidatorResult validate(Jwt jwt) {
        if (jwt.getAudience().contains(this.audience)) {
            return OAuth2TokenValidatorResult.success();
        }

        return OAuth2TokenValidatorResult.failure(new OAuth2Error("invalid token", "The required audience is missing", null));
    }
}
