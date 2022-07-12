package trainingday4LMSINTRO;

public class DemoStr {
	public static void main(String[] args) {
		String a = args[0];
		int b = Integer.parseInt(args[1]);
		float c = Float.parseFloat(args[2]);
		long d = Long.parseLong(args[3]);
		double e = Double.parseDouble(args[4]);
		char[] f = args[0].toCharArray();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
