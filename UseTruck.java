package LoopsObjectArray;

public class UseTruck {
	public static void main(String[]args) {
		Truck t1=new Truck();
		t1.noofwheels=12;
		t1.regno="TN";
		t1.load="coffee";
		Truck t2=new Truck();
		t2.noofwheels=16;
		t2.regno="AP";
		t2.load="tea";
		Truck t3=new Truck();
		t3.noofwheels=14;
		t3.regno="TL";
		t3.load="rubber";
		Truck t4=new Truck();
		t4.noofwheels=14;
		t4.regno="AP";
		t4.load="rubber";
		Truck t5=new Truck();
		t5.noofwheels=12;
		t5.regno="TN";
		t5.load="mango";
		Truck []trucks= {t1,t2,t3,t4,t5};
		for(Truck t:trucks) {
			if(t.regno.contains("TN")) {
				System.out.println("wheels="+t.noofwheels+" regno="+t.regno+" load="+t.load);
				
			}
			
		}
		
	}

}
