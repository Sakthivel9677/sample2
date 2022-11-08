package LoopsObjectArray;

public class UseShirt {
	public static void main(String[]args) {
		Shirt s1=new Shirt();
		s1.brand="peter england";
		s1.price=1200;
		s1.isChecked=true;
		Shirt s2=new Shirt();
		s2.brand="otto";
		s2.price=2000;
		s2.isChecked=false;
		Shirt s3=new Shirt();
		s3.brand="allenshooly";
		s3.price=2500;
		s3.isChecked=true;
		Shirt s4=new Shirt();
		s4.brand="tata";
		s4.price=3000;
		s4.isChecked=true;
		Shirt [] shirts= {s1,s2,s3,s4};
		for(Shirt s:shirts) {
			if(s.isChecked==true) {
				System.out.println("net price="+(s.price+s.price*25/100));
			}
		}
	}
	}
