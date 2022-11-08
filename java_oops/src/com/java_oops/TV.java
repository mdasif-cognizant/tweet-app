package com.java_oops;

public class TV {

	// Properties of TV
	String brand;
	String modelName;
	Integer screenSize;
	Integer price;
	String color;
	String displayType;


	public void insertData(String brand, String modelName, Integer screenSize, Integer price, String color,
			String displayType) {
		this.brand = brand;
		this.modelName = modelName;
		this.screenSize = screenSize;
		this.price = price;
		this.color = color;
		this.displayType = displayType;

	}
	
	public void display() {
		
		System.out.println("\n brand=" + brand
				+ ", \n modelName=" + modelName
				+ ",\n screenSize=" + screenSize 
				+ ",\n price=" + price
				+ ",\n color=" + color 
				+ ",\n displayType=" + displayType 
				);
	}

	// main method
	public static void main(String[] args) {

		// creating object/instances of the class

		TV tv1 = new TV();
		TV tv2 = new TV();

		tv1.brand = "Redmi";
		tv1.modelName = "4K High Resolution";
		tv1.screenSize = 55;
		tv1.price = 65000;
		tv1.color = "Grey";
		tv1.displayType = "LED";

//		System.out.println("Brand Name =" + tv1.brand + " " + "Price" + tv1.price);
//		tv2.insertData("LG", "LG 4k OLED TV", 32, 26000, "Black", "OLED");
//		System.out.println("Brand Name =" + tv2.brand + " " + "Price" + tv2.price);
		tv2.insertData("LG", "LG 4k OLED TV", 32, 26000, "Black", "OLED");
		
		
		tv1.display();
		tv2.display();

		System.out.println(tv1);
		System.out.println(tv2);

	}

	@Override
	public String toString() {
		return "TV [brand=" + brand + ", modelName=" + modelName + ", screenSize=" + screenSize + ", price=" + price
				+ ", color=" + color + ", displayType=" + displayType + "]";
	}

}
