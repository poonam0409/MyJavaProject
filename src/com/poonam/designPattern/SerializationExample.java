package com.poonam.designPattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 16670514720930627L;
	String name;
	 int pageNumber;
	 transient Singleton p;

	public Book(String name, int pageNumber,Singleton p) {
		super();
		this.name = name;
		this.pageNumber = pageNumber;
		this.p =p;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", pageNumber=" + pageNumber + ", p=" + p + "]";
	}

}

public class SerializationExample {

	public static void main(String... strings) throws IOException {
		Book b = new Book("Geeta", 566,Singleton.getInstance());
		System.out.println("Serialization Started");
		FileOutputStream fos = new FileOutputStream("persistantState.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		System.out.println("Serialization ended");

	}

}
