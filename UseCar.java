package trainingday4LMSINTRO;

public class UseCar {
	public static void main(String[] args) {
		Car car = new Car();
		car.brand = args[0].length();
		car.colour = args[1];
		car.price = Integer.parseInt(args[2]);
		car.taxAmount = Integer.parseInt(args[3]);
		car.netPrice = car.price+car.taxAmount;
		
		System.out.println(+car.brand);
		//System.out.println("Colour ="+car.colour);
		//System.out.println("Price = "+car.price);
		//System.out.println("taxAmount = "+car.taxAmount);
		//System.out.println("Netprice = "+car.netPrice);
		
	}

}
