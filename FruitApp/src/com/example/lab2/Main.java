package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) {
		//Create arrayList of user-defined class objects
		List<Fruit> fl = new ArrayList<Fruit>();
		
		Fruit s1 = new Fruit(101, "Apple", 1000);
		fl.add(s1); //adding Student class object
		Fruit s2 = new Fruit(102, "Orange", 1500);
		fl.add(s2); //adding Student class object
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Mango", 4000));
		fl.add(new Fruit(105, "Peach", 3000));
		fl.add(new Fruit(106, "Lemon", 1300));
		fl.add(new Fruit(107, "Banana", 1100));
		fl.add(new Fruit(108, "Coconut", 3500));
		fl.add(new Fruit(109, "Grape", 5000));
		fl.add(new Fruit(110, "Cherry", 4500));
		
		System.out.println("Fruit List (ordered by name)");
		Collections.sort(fl, new FruitComparator());
		
		//Traverse elements of arraylist (method #1)
		for (Fruit s : fl) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reverse ordered by name)");
		Collections.sort(fl, new FruitComparatorDesc());
		
		//Traverse elements of arraylist (method #2)
		for (int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}