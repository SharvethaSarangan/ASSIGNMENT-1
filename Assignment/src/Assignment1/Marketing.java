package Assignment1;

public class Marketing {  // 1.3 User Define Class
	
	// declare all variables
	String Fb ; 
	String IG ;
	int whatsapp;
	String discount;
	
	public Marketing (String i , String j , int k, String l) {  //1.4 Constructor with 4 arguments
		this.Fb = i;
		this.IG = j;
		this.whatsapp = k;
		this.discount = l;   }
	
		public void setFb(String i)  {
			this.Fb = i;
		}
		
		public void setIG(String j)  {
			this.IG = j;
		}
		
		public void setwhatsapp(int k)  {
			this.whatsapp = k;
		}
		
		public void setdiscount(String l) {
			this.discount = l;
		}
		
		public String getFb()  {
			return Fb;
		}
		
		public String getIG()  {
			return IG;
		}
		
		public int getwhatsapp()  {
			return whatsapp;
		}
		
		public String getdiscount()  {
			return discount;
		}
	
	

} // end of class
