package com.userapp.service;

import com.userapp.exception.NameExistsException;

public class ValidationServiceImpl implements IValidationService {

	@Override
	public boolean validateUsername(String username) throws NameExistsException {
		String[] usernames= {"priya","kavya","navya"};
		for(String existname:usernames) {
			if(existname.equalsIgnoreCase(username)) {
				throw new NameExistsException("Name exists");
			}
		}
     		return true;
	}

	@Override
	public void checkPassword(String password) throws TooShortException,TooLongException {
 if(password.length()<5) {
	 throw new TooShortException("password should have atleast 5 letters");
 }
 else {
	 throw new TooLongException("charcters in password exceeded");
 }
	}

}
