package trainingday4LMSINTRO;

public class Demosplit {
	public static void main(String[] args) {
		String[] a = args[0].split(",");
		String name = a[0];
		int age = Integer.parseInt(a[1]);
		float weight = Float.parseFloat(a[2]);
		long phoneNo = Long.parseLong(a[3]);
		double height = Double.parseDouble(a[4]);
		boolean isgood = Boolean.parseBoolean(a[5]);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("weight = "+weight);
		System.out.println("phoneNo = "+phoneNo);
		System.out.println("height = "+height);
		System.out.println("he is good = "+isgood);		
	}

}
