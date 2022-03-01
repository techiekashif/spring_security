package com.upgrad.course.demo.service;

import org.springframework.stereotype.Service;

import com.upgrad.course.demo.model.UserPrincipal;

@Service
public class TokenProviderService {
	
	public String genererateToken(UserPrincipal userPrincipal) {
		return null;
	}
	
	public boolean validateToken(String jwt) {
		return false;
	}

}
