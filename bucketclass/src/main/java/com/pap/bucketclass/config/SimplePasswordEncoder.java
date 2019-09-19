package com.pap.bucketclass.config;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Spring Security 기능의 비밀번호 인코더 구현
 */
public class SimplePasswordEncoder implements PasswordEncoder{

	@Override
    public String encode(CharSequence charSequence) {
        return charSequence == null ? null : charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return charSequence == null ? false : charSequence.equals(s);
    }
	
}
