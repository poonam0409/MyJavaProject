package com.poonam.designPattern;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationExample {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Deseriarization started");
		FileInputStream fis = new FileInputStream("persistantState.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
         Book b1=(Book)ois.readObject();
		System.out.println(b1);	
		System.out.println("Deseriarization ended");

	}

}
