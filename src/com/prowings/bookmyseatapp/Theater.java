package com.prowings.bookmyseatapp;

public class Theater {
	
	int totalSeats = 10;
	
	public  void bookSeats(int seats) {
		
		if(seats <= totalSeats)
		{
			System.out.println(Thread.currentThread().getName()+" "+seats+"seats booked successfully !!!");
			
			totalSeats = totalSeats - seats;
			
			System.out.println(Thread.currentThread().getName()+" "+"available seats are : "+totalSeats);
			
		}
		else
		{
			
			System.out.println(Thread.currentThread().getName()+" "+seats + " seats not availabe..");
			System.out.println(Thread.currentThread().getName()+" "+"Available seats are : "+ totalSeats);
		}
		
	}
}
