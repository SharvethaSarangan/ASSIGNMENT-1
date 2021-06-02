package Assignment1;

public class HomeTuitionCentre {  // 1.3 User Define Class
	
	String tuitionname,areas,subjects,tuitioncontactnum;
	public HomeTuitionCentre (String a,String b,String c,String d) // 1.4 Constructor 
	{
		this.tuitionname=a;
		this.areas=b;
		this.subjects=c;
		this.tuitioncontactnum=d;
		
			}
	// setter methods
	public void settuitionname(String a) {
	this.tuitionname=a;
	}

	public void setareas(String b) {
	this.areas=b;
	}
	public void subjects(String c) {
	this.subjects=c;
	}
	public void settuitionphonenum(String d) {
	this.tuitioncontactnum=d;
	}
	
	//getter methods
	public String gettuitionname() {
	return tuitionname;
	}
	public String getareas() {
		return areas;
	}
	public String getsubjects() {
	return subjects;
	}
	public String gettuitioncontactnum() {
	return tuitioncontactnum;
	}

	public String toString() {
	return tuitionname+areas+subjects+tuitioncontactnum;

	} // end of toString

	} // end of class

