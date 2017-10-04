package com.poonam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;


class Employee implements Comparable<Employee> {
	public Integer id;
	public String name;
	public Double salary;

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		Employee com = (Employee) o;
		if (salary > com.salary)
			return 1;
		else if (salary < com.salary)
			return -1;
		else
			return 0;
	}
	 
	    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return (int) (e1.getSalary() - e2.getSalary());
	        }
	    };

	    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

	        @Override
	        public int compare(Employee e1, Employee e2) {
	            return (int) (e1.getName().compareTo(e2.getName()));
	        }
	    };   
	@Override
	public String toString()

	{
		return "Employee : Id :" +id+ " Name "+name+ " Salary "+salary ;
	}

	public String getName() {
		return name;
	}

	public Double getSalary() {
		return salary;
	}
}

public class TreeSetExample {

	public static void main(String... strings) throws ClassNotFoundException {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("Apple");
		tree.add("Mango");
		tree.add("Mango");
		tree.add("School");
		tree.add("Student");
		tree.add("Lamp");
		tree.add("Lamps");
		CopyOnWriteArrayList<String> cowal = new CopyOnWriteArrayList<>();
		cowal.add("Poonam");
		cowal.add("Purva");
		tree.addAll(cowal);
//		Iterator<String> itr = tree.iterator();
//		while (itr.hasNext())
//			System.out.println(itr.next());
//		for (String s : tree)
//			System.out.println(s);
		Employee e5 = new Employee(2, "Purva", 1000.00);
		Employee e1 = new Employee(3, "Poonam", 100.00);
		Employee e2 = new Employee(1, "Pankaj", 900.00);
		Employee e3 = new Employee(9, "Piyush", 100.00);
		Employee e4 = new Employee(6, "Vijay", 500.00);
		List<Employee> emp = new ArrayList<>();
		emp.add(e5);
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		for (Employee s1 : emp)
		System.out.println("Before sorting "+s1);
		Collections.sort(emp);
		for (Employee s1 : emp)
			System.out.println("After sorting "+s1);
		Collections.sort(emp,Employee.NameComparator);
		for (Employee s1 : emp)
		System.out.println("After name sort"+s1);
		
//		Poonam p = null ;
//		p.getClass().forName("com.poonam.Poonam");
//		p.id=9;
//		System.out.println("Id"+p.id);
//		
	}
}
