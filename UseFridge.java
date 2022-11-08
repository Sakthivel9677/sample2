package LoopsObjectArray;

public class UseFridge {
	public static void main(String[]args) {
		Fridge f1=new Fridge();
		f1.price=34000;
		f1.brand="whirlpool";
		f1.colour="blue";
		f1.discountamount=25;

		Fridge f2=new Fridge();
		f2.price=12000;
		f2.brand="whirlpool";
		f2.colour="pink";
		f2.discountamount=20;
		

		Fridge f3=new Fridge();
		f3.price=23000;
		f3.brand="samsung";
		f3.colour="white";
		f3.discountamount=22;
		

		Fridge f4=new Fridge();
		f4.price=24000;
		f4.brand="omega";
		f4.colour="lime";
		f4.discountamount=18;
		Fridge []fridges= {f1,f2,f3,f4};
		for(Fridge f:fridges) {
			if(f.brand.equalsIgnoreCase("whirlpool")) {
				System.out.println("net price="+(f.price+f.price*f.discountamount/100));
				
			}
		}
		
	
		
	}

}


