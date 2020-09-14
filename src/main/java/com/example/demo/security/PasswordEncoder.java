package com.example.demo.security;

public interface PasswordEncoder {

	String code(CharSequence var1);
	
	boolean match(CharSequence var1, String var2);
	
	default boolean upgrateEncoding(String encodedPasswor){ return false;}
	
}
