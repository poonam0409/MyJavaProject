package com.poonam.designPattern;

import java.util.Scanner;

interface Medicine {
	void showValue();
}

class Medicinefactory {
	Medicine getInstance(String shape) {
		if (shape.equals("capsule"))
			return new Capsule();
		else if (shape.equals("tablet"))
			return new Tablet();
		else
			return null;

	}
}

public class FactoryPattern {

	public static void main(String... poonam) {
		Medicinefactory produceMedicine = new Medicinefactory();
		System.out.println("please enter type of medicine you want capsule/tablet");
		Scanner scan = new Scanner(System.in);
		String typeOfMedicine = scan.nextLine();
		Medicine medicine = produceMedicine.getInstance(typeOfMedicine);
		medicine.showValue();
	}

}
