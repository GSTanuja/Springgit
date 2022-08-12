package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.service.IValidationService;
import com.userapp.service.TooLongException;
import com.userapp.service.TooShortException;
import com.userapp.service.ValidationServiceImpl;

public class Register {

	public static void main(String[] args) {
		IValidationService ref=new ValidationServiceImpl();
		try {
			ref.validateUsername("arya");
		} catch (NameExistsException e) {
			System.out.println(e.getMessage());
		}
		
			try {
				ref.checkPassword("anu");
			} catch (TooShortException | TooLongException e) {
				System.out.println(e.getMessage());
			}
		} 
	}


