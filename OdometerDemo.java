public class OdometerDemo
{
	public static void main(String[]args)
	{

		Odometer trip1 = new Odometer();
		Odometer trip2 = new Odometer();
		Odometer trip3 = new Odometer();

		trip1.setMpg(35);
		trip1.setMiles(100);
		System.out.println("For trip 1, "+trip1.toString());

		trip2.setMpg(19);
		trip2.setMiles(200);
		System.out.println("For trip 2, "+trip2.toString());


		trip3.setMpg(31);
		trip3.setMiles(150);
		System.out.println("For trip 3, "+trip3.toString());


	}
}