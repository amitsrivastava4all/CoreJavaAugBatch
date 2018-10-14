package com.brainmentors.cas.staging;

import java.util.ArrayList;

import com.brainmentors.cas.customers.CustomerDetails;

public class Staging {
	static void clear() {
		for(int i = 1; i<=20;i++) {
			System.out.println();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Stage Demo....");
		ArrayList l = new ArrayList();
		while(true) {
			CustomerDetails c = new CustomerDetails();
			c.setId(1);
			c.setName("Ram");
			Thread.sleep(50);
			l.add(c);
		}
//		String ww[] = new String[10];
//		for(int i = 0 ; i<ww.length; i++) {
//			ww[i] = "Ram "+i;
//			System.out.println(ww[i]);
//		}
//		Scanner scanner= new Scanner(System.in);
//		System.out.println("Enter the Customer Id ");
//		int id = scanner.nextInt();
//		System.out.println("Enter the Name");
//		String name = scanner.nextLine();
//		CustomerDetails customer = new CustomerDetails();
//		customer.setId(id);
//		customer.setName(name);
//		Calendar c = Calendar.getInstance();
//	
//		c.set(Calendar.MONTH, 9);
//		c.set(Calendar.YEAR, 2010);
//		c.set(Calendar.DATE, 14);
//		Date d = c.getTime();
//		Date e = new Date();
//		Calendar g = Calendar.getInstance();
//		g.setTime(e);
//		System.out.println(d);
//		System.out.println(e);
//		int m = c.get(Calendar.MONTH) - g.get(Calendar.MONTH);
//		int y = g.get(Calendar.YEAR) -  c.get(Calendar.YEAR);
//		System.out.println("Age is "+y);
//		System.out.println(m);
		//clear();
		
		//System.out.println();
		
	}

}
