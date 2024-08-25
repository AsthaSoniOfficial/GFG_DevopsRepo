package demo;

public class MyCalculator {
	public int sum(int a, int l)
	{
		return a+l;
	}
	public static void main (String [] args)
	{
		MyCalculator calc = new MyCalculator();
		System.out.println(calc.sum(45, 2));
	}
}
