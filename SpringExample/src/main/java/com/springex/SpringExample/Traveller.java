package com.springex.SpringExample;

public class Traveller 
{
		private String name;
		private String email;
		private long mobile;
		Vechile vechile;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
		public Vechile getVechile() {
			return vechile;
		}
		public void setVechile(Vechile vechile) {
			this.vechile = vechile;
		}
		
		public void startJourny()
		{
			System.out.println("Hey"+name+"welcome to travel world");
			System.out.println("check your mobile.."+mobile+"email"+email);
			vechile.move();
		}
}
