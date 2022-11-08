package LoopsObjectArray;

public class UseSaree {
	public static void main(String[]args) {
		String[]a=args[0].split(",");
		Saree s1=new Saree();
	 	
		s1.material=a[0];
		s1.price=Integer.parseInt(a[1]);
		s1.colour=a[2];
		s1.discountamount=Integer.parseInt(a[3]);
		
		String []b=args[1].split(",");
		Saree s2=new Saree();
		s2.material=b[0];
		s2.price=Integer.parseInt(b[1]);
		s2.colour=b[2];
		s2.discountamount=Integer.parseInt(b[3]);
		
		String[]c=args[2].split(",");
		Saree s3=new Saree();
		s3.material=c[0];
		s3.price=Integer.parseInt(c[1]);
		s3.colour=c[2];
		s3.discountamount=Integer.parseInt(c[3]);
		
		System.out.println(s1.material+s1.price+s1.colour+s1.discountamount+s1.netprice);
		System.out.println(s2.material+s2.price+s2.colour+s2.discountamount+s2.netprice);
		System.out.println(s3.material+s3.price+s3.colour+s3.discountamount+s3.netprice);
		
		
	}

}
