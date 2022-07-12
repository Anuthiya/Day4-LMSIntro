package trainingday4LMSINTRO;

public class UseSaree {
	public static void main(String[] args) {
		Saree saree = new Saree();
		String[] a = args[0].split(",");
		saree.material = a[0];
		saree.colour = a[1];
		saree.price = Integer.parseInt(a[2]);
		saree.disPercentage = Integer.parseInt(a[3]);
		saree.netPrice = saree.price-(saree.price*saree.disPercentage/100);
		
		System.out.println("BRAND = "+saree.material + ", COLOUR = "+saree.colour + ", NETPRICE = "+saree.netPrice);
       
}
}