package com.userapp.service;

import com.userapp.exception.NameExistsException;

public interface IValidationService {
	boolean validateUsername(String username) throws NameExistsException;
	void checkPassword(String password) throws TooShortException, TooLongException;
	

}
