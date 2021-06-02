package Assignment1;

import java.util.Scanner; // 1.2 Pre-Define Class
	
	public class Subject {  // 1.3 User defined Class
		
		Scanner b = new Scanner(System.in);
		
		// declare all variables
		String details;
		String subjects;
		String time;
		String tutor;
		double fees;
		char c;
		char choice;
				
				Subject(){  // 1.4 Constructor with zero arguments
					this.details= "WELCOME TO SM HOME TUITION";
				}

				public void details() {
					char choice;
					System.out.println("\n\nDo you need more details reagrding SS HOME TUITION ? ");
			    	char c = b.next().charAt(0); 
			    	System.out.println("We are providing home tuition services at Johor Bahru areas. We are providing tuition services for four subjects for FORM 3 AND FORM 5");
			    	do {
			    	System.out.println("PLEASE DO CHOOSE ANY OPTION BELOW TO GET TO KNOW MORE DETAILS : " +
			    					   "\n************************FORM 3************************" +
			    					   "\n 1. BAHASA MELAYU "   +
			    					   "\n 2. ENGLISH       "   +
			    					   "\n 3. MATHEMATICS   "   +
			    					   "\n 4. SCIENCE       "   +
			    					   "\n\n************************FORM 5************************" +
			    					   "\n 5. BAHASA MELAYU "   +
			    					   "\n 6. ENGLISH       "   +
			    					   "\n 7. MATHEMATICS   "   +
			    					   "\n 8. SCIENCE       "   ); 
			    	
			    	System.out.print("\nEnter your option : ");
			    	int s = b.nextInt();
			    	switch(s)  {
			    	case 1 :b.nextLine();
			    	 		System.out.println("SUBJECT : BAHASA MELAYU FORM 3"  +
    			  			 				  "\nTIME   : 10.00 A.M - 11.30 A.M " +
			    			 			      "\nTUTOR  : EN.AHMAD "); 
			    	 	break ;
			    	 
			    	case 2 :System.out.println("SUBJECT	: ENGLISH FORM 3 	" +
 						   					 "\nTIME	: 12.00P.M - 1.30P.M"  +
 						   					 "\nTUTOR   : MS.SHIRLEY" ); 
			    	
			    		break ;
			    	
			    	case 3:	System.out.println("SUBJECT : MATHEMATICS FORM 3" +
 						                       "\nTIME	: 4.00 P.M - 6.00 P.M"  +
 						                       "\nTUTOR	: MDM.CHUAA" ); 
			    	
			    		break;
 	
			    	case 4 :System.out.println("SUBJECT : SCIENCE FORM 3"  +
 						                       "\nTIME	: 8.00P.M - 10.00 P.M"	+
 						                       "\nTUTOR	: MDM.ANJALI"   ); 
			    	
			    		break;
			    	
			    	case 5 :System.out.println("SUBJECT : BAHASA MELAYU FORM 5"  +
			    							   "\nTIME	: 8.00 A.M - 9.30 A.M"  +
			    							   "\nTUTOR : PUAN.AMIRAH " );
			    	
			    		break;
			    		
			    	case 6 :System.out.println("SUBJECT : ENGLISH FORM 5"  +
							                   "\nTIME	: 12.00 P.M - 1.30 A.M"  +
							                   "\nTUTOR  : SIR RAJ" );
			    	
			    		break;
			    	
			    	case 7 :System.out.println("SUBJECT : MATHEMATICS FORM 5"  +
			                                   "\nTIME	: 3.00 P.M - 4.30 A.M"  +
			                                   "\nTUTOR : MDM ZAKIAH " );
			    	
			    		break;
			    		
			    	
			    	case 8 :System.out.println("SUBJECT : SCIENCE FORM 5"  +
			    								"\nTIME	: 7.00 P.M - 9.00 A.M"  +
                            				   "\nTUTOR :   MDM RAMYA " );   
	
			    	break ;
			    	
			    	default :
			    		System.out.println("INVALID SUBJECT OR FORM");  } // end of switch class
			    	
					   // ask for continue?
				      System.out.print("\nWould you like to see about some other subjects? (Y or N): ");
				      choice = b.next().charAt(0);

				} while (choice == 'Y' || choice == 'y');
			    		
			    	}// end of void details()
			    	
			    	



			    } // end of class
	
			    	
			    
					
			