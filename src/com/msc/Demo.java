package com.msc;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		
		 SubDemo ob[] = new SubDemo[5];
		 
		 Scanner li = new Scanner(System.in);
		 
		 
		 
		 for(int i=0;i<5;i++) {
			 
		String name= li.nextLine();
		int age= li.nextInt();
		Boolean covit= li.nextBoolean();
		li.nextLine();
		String location= li.nextLine();
		
		
		ob[i] = new SubDemo(name,age,location,covit);
		 }
		 
		 boolean search = li.nextBoolean();
				 
				 	 
				 
		ArrayList<String> naam = new ArrayList<>();
			
			for(int i=0;i<5;i++) {
				
				if(ob[i].getResult()==search) {
				
				naam.add(ob[i].getName());
				
				}
				
			}
			
			System.out.println(naam);


}
}