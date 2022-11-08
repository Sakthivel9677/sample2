package LoopsObjectArray;

public class UseFruit {
	public static void main(String[]args) {
		Fruit f1=new Fruit();
		f1.name="apple";
		f1.price=90;
		f1.ishybrid=true;
		Fruit f2=new Fruit();
		f2.name="orange";
		f2.price=50;
		f2.ishybrid=true;
		Fruit f3=new Fruit();
		f3.name="lemon";
		f3.price=20;
		f3.ishybrid=false;
		Fruit f4=new Fruit();
		f4.name="kiwi";
		f4.price=123;
		f4.ishybrid=false;
		Fruit f5=new Fruit();
		f5.name="waterlemon";
		f5.price=56;
		f5.ishybrid=true;
		Fruit f6=new Fruit();
		f6.name="muskmelon";
		f6.price=145;
		f6.ishybrid=true;
		Fruit f7=new Fruit();
		f7.name="banana";
		f7.price=156;
		f7.ishybrid=false;
		Fruit []fruits= {f1,f2,f3,f4,f5,f6,f7};
		for(int i=0;i<fruits.length;i++) {
			if(fruits[i].price>=100) {
				System.out.println("fruit name="+fruits[i].name);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
