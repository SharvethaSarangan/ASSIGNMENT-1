package Assignment1;

import java.util.Scanner;  // 1.2 Pre-Define class

public class Student {   // 1.3 User define class
	
	Scanner s = new Scanner(System.in);

	 //declare variables
	 String name;
	 String icnum;
	 String phonenum;
	 String emailaddress;
	 int subject;
	 double discount;
	 double fee;
	 double totalfee;
	
	    // 1.4 constructor with zero argument
		public void getInput() {
		System.out.print("\n\n**********************************STUDENT REGISTRATION************************************");
	    System.out.print("\nEnter your name                  : ");
	    name = s.nextLine();
	    System.out.print("Enter your identification number : ");
	    icnum = s.nextLine();
	    System.out.print("Enter your phone number          : ");
	    phonenum = s.nextLine();
	    System.out.print("Enter your email address         : ");
	    emailaddress = s.nextLine();
	    System.out.print("\n\n******************************************************************************************");
	 }
		
		public void Calfees()  {  // input for calculating fees
		 System.out.print("\n----------------------------------FEES CALCULATION-----------------------------------------");
	     System.out.print("\nEnter the number of subjects    : ");
	     int sub= s.nextInt();
	     System.out.print("Do you have our special voucher ? :");
	     char voucher = s.next().charAt(0);
	     if (voucher == 'Y' || voucher == 'y') {
	     fee = (sub*80);
	     discount = (sub*80)*0.1 ;
	     totalfee = fee-discount;
	     System.out.printf("Fees : RM %.2f" ,totalfee);  } // end of if
	     else if(voucher == 'N' || voucher == 'n'){
	     fee = (sub*80);
	     System.out.printf("Fees : RM %.2f" , fee); } // end of if
	     else {
	     System.out.println("Invalid input. Please try again!"); 
	     } // end of else
	     System.out.print("\n-------------------------------------------------------------------------------------------");
	     System.out.print("\n\n*****************************************************************************************");
	     } // end of Calfees
		
		

	    } // end of class