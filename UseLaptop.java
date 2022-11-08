package LoopsObjectArray;

public class UseLaptop {
	public static void main(String[]args) {
		Laptop l1=new Laptop();
		l1.brand="lenovo";
		l1.price=35000;
		l1.colour="white";
		l1.version=1023;
		l1.istouchscreen=true;
		
		
		
		Laptop l2=new Laptop();
		l2.brand="asus";
		l2.price=32000;
		l2.colour="yellow";
		l2.version=1089;
		l2.istouchscreen=false;
		Laptop l3=new Laptop();
		l3.brand="apple";
		l3.price=12000;
		l3.colour="blue";
		l3.version=1078;
		l3.istouchscreen=true;
		Laptop l4=new Laptop();
		l4.brand="dell";
		l4.price=56000;
		l4.colour="orange";
		l4.version=1034;
		l4.istouchscreen=true;
		Laptop l5=new Laptop();
		l5.brand="hp";
		l5.price=90000;
		l5.colour="red";
		l5.version=1052;
		l5.istouchscreen=false;
		Laptop l6=new Laptop();
		l6.brand="mi";
		l6.price=37000;
		l6.colour="violet";
		l6.version=1878;
		l6.istouchscreen=false;
		Laptop l7=new Laptop();
		l7.brand="reliance";
		l7.price=67000;
		l7.colour="white";
		l7.version=1789;
		l7.istouchscreen=false;
		Laptop l8=new Laptop();
		l8.brand="zen";
		l8.price=38000;
		l8.colour="black";
		l8.version=1458;
		l8.istouchscreen=true;
		Laptop l9=new Laptop();
		l9.brand="omen";
		l9.price=430000;
		l9.colour="lime";
		l9.version=1567;
		l9.istouchscreen=true;
		Laptop []laptops= {l1,l2,l3,l4,l5,l6,l7,l8,l9};
		for(int i=0;i<laptops.length;i++) {
			if(laptops[i].istouchscreen==true) {
				System.out.println("brand="+laptops[i].brand+"  price="+laptops[i].price);
				
			}
		}
		
		
		
		
		
		
	}

}
