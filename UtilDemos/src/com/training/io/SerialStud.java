package com.training.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialStud {

	public static void main(String[] args) {
		Student student=new Student("kavya", 120, "ECE");
		System.out.println("Serialiing: "+student);
		FileOutputStream fs=null;
		ObjectOutputStream os=null;

		try {
			fs=new FileOutputStream("test.ser");
			os=new ObjectOutputStream(fs);
			os.writeObject(student);
		} 
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}finally {

			try {
				if(fs!=null)
					fs.close();
				if(os!=null)
					os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
