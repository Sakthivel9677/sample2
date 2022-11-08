package LoopsObjectArray;

public class UseCar {
	public static void main(String[]args) {
	Car c1=new Car();
		c1.brand="BMW";
		c1.price=3000000;
		c1.colour="Ash";
		c1.isAlloy=true;
		
		
		Car c2=new Car();
		c2.brand="AUDI";
		c2.price=490000;
		c2.colour="blue";
		c2.isAlloy=true;
		
		
		Car c3=new Car();
		
		c3.brand="Benz";
		c3.price=4000000;
		c3.colour="yellow";
		c3.isAlloy=true;
		
		
		
		
		Car c4=new Car();
		
		
		c4.brand="suzuki";
		c4.price=3200000;
		c4.colour="blue";
		c4.isAlloy=true;
		
		
		Car c5=new Car();
		
		
		c5.brand="Honda";
		c5.price=4390000;
		c5.colour="skyblue";
		c5.isAlloy=false;
		
		Car[] cars= {c1,c2,c3,c4,c5};
		for(int i=0;i<cars.length;i++) {
			
			if(cars[i].brand.startsWith("A")) {
				System.out.println(cars[i].brand);	}
		}	
		
	}
}
