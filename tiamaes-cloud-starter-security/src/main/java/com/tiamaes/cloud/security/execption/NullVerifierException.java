package com.tiamaes.cloud.security.execption;

import org.springframework.security.core.AuthenticationException;

public class NullVerifierException extends AuthenticationException {
	private static final long serialVersionUID = -2611957529782343318L;
	
	public NullVerifierException(String msg) {
		super(msg);
	}
	
	public NullVerifierException(String msg, Throwable t) {
        super(msg, t);
    }
}
