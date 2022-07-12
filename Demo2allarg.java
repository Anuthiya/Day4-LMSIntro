package trainingday4LMSINTRO;

public class Demo2allarg {
	public static void main(String[] args) {
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		float weight = Float.parseFloat(args[2]);
		long phoneNo = Long.parseLong(args[3]);
		double height = Double.parseDouble(args[4]);
		boolean isgood = Boolean.parseBoolean(args[5]);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("weight = "+weight);
		System.out.println("phoneNo = "+phoneNo);
		System.out.println("height = "+height);
		System.out.println("he is good = "+isgood);		
	}

}
