package com.training.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DserialStud {

	public static void main(String[] args) throws ClassNotFoundException {
   
   try (
	FileInputStream fs=new FileInputStream("test.ser");
	ObjectInputStream os=new ObjectInputStream(fs);
		   ){
	Student student=(Student) os.readObject();
	System.out.println(student);
} catch (FileNotFoundException e) {
	e.printStackTrace();
}
	catch (IOException e) {
		e.printStackTrace();
	}
   
	   		   
   }
	}

 	


