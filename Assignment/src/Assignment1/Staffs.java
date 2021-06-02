package Assignment1;

import java.util.Scanner;  // 1.2 pre-define class

public class Staffs {  //1.3 User define class
	
	  Scanner e = new Scanner(System.in);
	
	 int empid;
	 String name;
	 double hours;
	 double salary;
	 double increment;
	 double totalsalary;
	 

	 public Staffs() {   // 1.4 Constructor with no argument
	  System.out.println("\n\n************************************TUTORS' DETAILS**************************************");
	  System.out.print("Enter the empid : ");
	  this.empid = e.nextInt();
	  e.nextLine();
	  System.out.print("Enter the name : ");
	  this.name = e.nextLine();
	  System.out.print("Enter the working hours : ");
	  this.hours = e.nextDouble();
	 } // end of constructor with zero argument
	 
	 public Staffs(int e) {  // Constructor with 1 argument
		 this.empid = e;
			System.out.println("\nDETAILS: ");
			System.out.println("Staff Id  : " + e);
			
		} // end of constructor with 1 argument
	 
	 public Staffs(int e, double h) {  // Constructor with 2 arguments
		 this.empid = e;
		 this.hours = h;
		 	System.out.println("Staff Id : " + e);
		 	System.out.println("Working Hours : " + h);
	 } // end of constructor with 2 arguments
	 
		//create getter method
		public int getempid() {
			return this.empid;
		}
		
		public double gethours() {
			return this.hours;
		}
	 
	 public void CalSalary()  {  // Method to calculate staff's salary
		 salary = 15*hours ;
	 } 
	 
	 public void CalIncrement()  {  //Method to calculate staffs' increment
		 increment = ((15*hours)*5)/100;
	 System.out.print("The increment for the month is : " + increment);
	 }
	 
	 public void CalTotalSalary()  {  // Method to calculate staffs' total salary
		 totalsalary = salary + increment ;
	 }

	 public String toString() {  // printing details
			
			return "\n\nStaff Details : " + 
				   "\n*************************************************************************************" +
				   "\nStaff ID               : " + this.empid+
				   "\nStaff Name             : " + this.name +
				   "\nStaff Working Hours    : " + this.hours+
				   "\nSalary                 : RM " + salary+
				   "\nStaff Increment        : RM " + increment+
				   "\nTotal Salary           : RM " + totalsalary +
				   "\n*************************************************************************************";
				
		} // end of toString
		 
	 
       } // end of class
	  

	          

