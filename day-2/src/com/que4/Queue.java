package com.que4;

import java.util.Scanner;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linQueue lq = new linQueue(5);
		
		int choice =0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("0. EXIT \n 1. PUSH \n 2. POP \n 3. PEEK \n");
			System.out.println("Enter your Choice :");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(lq.isFull())
					System.out.println("Queue is FULL");
				else
				{
					System.out.println("Enter value :");
					int value = sc.nextInt();
					lq.push(value);
				}
				
				break;
			
			case 2:
				if(lq.isEmpty())
					System.out.println("Queue is EMPTY");
				else
				{
//					System.out.println("Popped :" + lq.pop()); 
					
					lq.pop();
				}
			
			case 3:
				if(lq.isEmpty())
					System.out.println("Queue is Empty");
				else
				{
					System.out.println("Peeked Value : "+ lq.peek());
					
				}

			default:
				break;
			}
			
		} while (choice !=0);
		

	}

}
