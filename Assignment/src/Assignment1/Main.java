package Assignment1;

public class Main {

	public static void main(String[] args) {

			
			HomeTuitionCentre h = new HomeTuitionCentre("SS HOME TUITION","ALL AREAS AROUND JOHOR BAHRU","BAHASA MELAYU, ENGLISH, MATHEMATCS AND SCIENCE FOR FORM 3 AND FORM 5", "014-3166261");
			System.out.println("**********************************"+h.gettuitionname()+"**********************************");
			System.out.println("Areas Covered : "+ h.getareas());
			System.out.println("Subjects offered : "+h.getsubjects());
			System.out.println("Contact number : " + h.gettuitioncontactnum());
			
			Marketing m = new Marketing("https://www.facebook.com/", "https://www.instagram.com/_sharvetha_/", 014-3166261, "10%");
			System.out.println("\n\nFor further enquiries and questions please do refer : " + m.getFb()+m.IG+m.whatsapp);
			System.out.println("There will be a special discount for the early birds. We will provide" +m.discount+ "to the first 30 students for the first 5 months");
			

			Subject ss = new Subject();
			ss.details();
			
			Student s = new Student();
			s.getInput();
			s.Calfees();
			
			Staffs e = new Staffs();
			e.CalSalary();
			e.CalIncrement();
			e.CalTotalSalary();
			System.out.println(e.toString());
			
			Finance f = new Finance();
			f.Calstudentsfee();
			f.Expenses();
			f.Salary();
			f.CalProfit();
			System.out.println(f.toString());
			System.out.println("****************************************************************************************");
			
	}
	
}
			
