package LoopsObjectArray;

public class UseBike {
	public static void main(String[]args) {
		Bike b1=new Bike();
		b1.brand="BMW";
		b1.speed=120;
		b1.colour="green";
		b1.regno=6754;
		Bike b2=new Bike();
		b2.brand="honda";
		b2.speed=180;
		b2.colour="white";
		b2.regno=1089;
		Bike b3=new Bike();
		b3.brand="hero";
		b3.speed=190;
		b3.colour="orange";
		b3.regno=8759;
		Bike b4=new Bike();
		b4.brand="tesla";
		b4.speed=140;
		b4.colour="lime";
		b4.regno=9865;
		Bike []bikes= {b1,b2,b3,b4};
		for(Bike b:bikes) {
			if(b.regno !=0) {
				System.out.println("brand="+b.brand+" speed="+b.speed);
				System.out.println();//extra for reference
			}
		}
		
	}

}
