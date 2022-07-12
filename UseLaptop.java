package trainingday4LMSINTRO;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.brand = args[0];
		l.colour = args[1];
		l.price = Integer.parseInt(args[3]);
		l.disAmount = Integer.parseInt(args[4]);
		l.netPrice = l.price-l.disAmount;
		char[] b = args[0].toCharArray();
		char c = args[0].charAt(3);
		boolean d = args[1].contains("E");
		
		System.out.println("BRAND = "+l.brand.toUpperCase());
		System.out.println("Colour = "+l.colour.toLowerCase());
		System.out.println("brand startswith = "+l.brand.startsWith("D"));
		System.out.println("brand endsswith = "+l.brand.endsWith("D"));
		System.out.println("BRAND = "+l.brand.length());
		System.out.println("CharArray = "+b[0]+" "+b[1]+" "+b[2]+" "+b[3]);
		System.out.println("NETPRICE = "+l.netPrice);
		System.out.println(l.brand+" "+l.colour+" "+l.price+" "+l.disAmount+" "+l.netPrice);
	    System.out.println(c);
	    System.out.println(d);
	    
		
	}

}
