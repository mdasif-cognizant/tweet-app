package com.java_oops;

public class Student {

	int id;
	String name;
	Address address;

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

//   public static  void display() {
//	   System.out.println("id=" + id + ", name=" + name + ", address=" + address");
//	   
//   }

	public static void main(String[] args) {

		Student student = new Student(101, "Shan", new Address("Varanasi", "Uttar Pradesh", "India"));
		System.out.println(student);

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
