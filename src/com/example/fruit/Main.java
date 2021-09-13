package com.example.fruit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		List<Fruit> arr = new ArrayList<Fruit>();
		for(int i=0;i<10;i++) {
			
			
			String name = s.nextLine();
			Fruit a1 = new Fruit(name);
			a1.setName(name);
			arr.add(a1);
			
		}
		
		Collections.sort(arr, new FruitCom());
		
		for(int i = 0;i<arr.size();i++) {
			
			System.out.print(arr.get(i).toString());
			
		}

	}

}
