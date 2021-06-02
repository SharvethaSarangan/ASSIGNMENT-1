package Assignment1;

import java.util.Scanner;  // 1.2 Pre-Define Class

public class Finance {  // 1.3 User-Define Class
	
	Scanner f = new Scanner(System.in);

	// declare the variables
	String name;
	char voucher , choice;
	double payment, expenses, salary, profit;
	
			public void Calstudentsfee() {  // 1.4 constructor with zero arguments
			do {
			payment++;
			System.out.println("\n\n***************************************FINANCE***************************************");
			f.nextLine();
		    System.out.print("Enter student's name                                   : ");
		    name = f.nextLine();
		    System.out.print("Enter the payment made by the student                  : ");
		    payment = f.nextDouble(); 
		    
			
			System.out.print("\nAdd other students' details? (Y or N)                  : ");
		    choice = f.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');  }

			public void Expenses()  {   // method to calculate expenses
				System.out.print("Enter the total amount of expenses made for tuition    : ");
				expenses = f.nextDouble();
			}
			
			public void Salary()  {  // method to calculate staffs' salary
				System.out.print("Enter the total salary of all the staffs               : ");
				salary = f.nextDouble();
			}
			
			public void CalProfit() {   // method to calculate total profit of Home Tuition
				profit = payment-(expenses+salary);
			}
			
			public String toString() {
				return "The profit of the month is : RM " + profit;  }
			

			} // end of class
