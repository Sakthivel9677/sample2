package LoopsObjectArray;

public class UseMarker {
	public static void main(String[]args) {
		Marker m1=new Marker();
		m1.price=78;
		m1.brand="cello";
		m1.colour="yellow";
		m1.isRefilled=true;
		Marker m2=new Marker();
		m2.price=120;
		m2.brand="renolyds";
		m2.colour="red";
		m2.isRefilled=false;
		Marker m3=new Marker();
		m3.price=90;
		m3.brand="camelin";
		m3.colour="blue";
		m3.isRefilled=true;
		Marker m4=new Marker();
		m4.price=45;
		m4.brand="flair";
		m4.colour="red";
		m4.isRefilled=true;
		Marker m5=new Marker();
		m5.price=96;
		m5.brand="rorito";
		m5.colour="brown";
		m5.isRefilled=true;
		Marker []markers= {m1,m2,m3,m4,m5};
		for(Marker m:markers) {
			if(m.colour.equals("red")) {
				System.out.println("NET PRICE="+(m.price-m.price*5/100));
				
			}
			
			
		}

		
		
		
		
	}

}
