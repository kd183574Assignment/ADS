package que1;

import java.util.Scanner;

public class mainStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		descendingStack st = new descendingStack(4);
		int choice =0;
		Scanner sc = new Scanner(System.in);
		 
		do {
			System.out.println("0. EXIT \n 1.PUSH \n 2. POP ");
			System.out.println("ENTER CHOICE :");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				if(st.isFull())
				{
					System.out.println("Stack is FULL");
				}
				else
				{
					System.out.println("ENTER VALUE");
					int value = sc.nextInt();
					st.push(value);
				}
				break;
				
			case 2:
				if(st.isEmpty())
				{
					System.out.println("STACK IS EMPTY");
					
				}
				else
				{
					System.out.println("Poped Value : " st.pop());
				
				}
				break;

			default:
				break;
			}
			
		} while (choice != 0);
				
	}

}
