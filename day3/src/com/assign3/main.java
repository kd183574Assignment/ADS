package com.assign3;

import java.util.Scanner;

public class main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackDescending st = new stackDescending(4);
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
			System.out.print("Enter choice : ");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				if(st.isFull())
					System.out.println("Stack is full");
				else {
					System.out.print("Enter value : ");
					int value = sc.nextInt();
					st.push(value);
				}
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is empty");
				else
					System.out.println("Poped value : " + st.pop()); 
				break;
//			case 3:
//				if(st.isEmpty())
//					System.out.println("Stack is empty");
//				else
//					System.out.println("Peeked value : " + st.peek());
//				break;
			}
		}while(choice != 0);
		sc.close();
	}

}
