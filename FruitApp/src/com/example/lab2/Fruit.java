package com.example.lab2;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit> {
	int no;	//number
	String name; //name
	int price; //price
	
	@Override
	public int compareTo(Fruit o) {
		return name.compareTo(o.name);
	}
	
	public Fruit(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setAge(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
}

class FruitComparator implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}

class FruitComparatorDesc implements Comparator<Fruit>{
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}