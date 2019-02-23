public class temperaturedemo
{
	public static void main(String[]args)
	{
		System.out.println("Conversions from C to F");
		temperature t1 = new temperature(0,"C");
		System.out.println(t1.toString());
		t1.setTempScale(100,"C");
		System.out.println(t1.toString());
		System.out.println("Conversions from F to C");
		temperature t2 = new temperature(0,"F");
		System.out.println(t2.toString());
		t2.setTempScale(100,"F");
		System.out.println(t2.toString());
		System.out.println("Comparing Two Temperature objects");
		temperature celsius1 = new temperature(0, "C");
		temperature celsius2 = new temperature(40, "C");

		if(celsius1.compareTo(celsius2)<0)
		System.out.println(celsius1.getCelsius()+" "+celsius1.getScale()+" temperature is less than "+celsius2.getCelsius()+" "+celsius2.getScale());
		else if(celsius1.compareTo(celsius2)>0)
			System.out.println(celsius1.getCelsius()+" "+celsius1.getScale()+ " temperature is greater than "+celsius2.getCelsius()+" "+celsius2.getScale());
		else
			System.out.println(celsius1.getCelsius()+" "+celsius1.getScale()+" temperature is equal to "+celsius2.getCelsius()+" "+celsius2.getScale());

	}
}