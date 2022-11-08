package LoopsObjectArray;

public class UseBag {
	public static void main(String[]args) {
		Bag b1=new Bag();
		b1.noofzips=10;
		b1.price=1200;
		b1.brand="roshan";
		b1.iswaterproof=true;
		b1.bagtype="tour bag";
		Bag b2=new Bag();
		b2.noofzips=8;
		b2.price=1290;
		b2.brand="bata";
		b2.iswaterproof=false;
		b2.bagtype="travel bag";
				Bag b3=new Bag();
		b3.noofzips=12;
		b3.price=1345;
		b3.brand="passion";
		b3.iswaterproof=true;
		b3.bagtype="tour bag";
				Bag b4=new Bag();
		b4.noofzips=9;
		b4.price=1878;
		b4.brand="tesla";
		b4.iswaterproof=true;
		b4.bagtype="hand bag";
		Bag []bags= {b1,b2,b3,b4};
		for(Bag b:bags) {
			if(b.bagtype.equalsIgnoreCase("tour bag")) {
				System.out.println("brand="+b.brand+" price="+b.price);
			}
		}
	}

}
