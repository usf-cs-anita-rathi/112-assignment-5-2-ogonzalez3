public class Odometer
{
	
	private int miles;
	private double mpg;
	private double gas;

	public Odometer()
	{
		miles = 0;
		mpg = 0;
		gas = (miles/mpg);
	}

	public Odometer(int newMiles, double newMpg, double newGas)
	{
		miles = newMiles;
		mpg = newMpg;
	}

	public void setMiles(int newMiles)
	{
		miles += newMiles;
	}

	public int getMiles()
	{
		return miles;
	}

	public void setMpg (double newMpg)
	{
		mpg = newMpg;
	}
	public double getMpg()
	{
		return mpg;
	}
	public void setGas(double newGas)
	{
		gas = newGas;
		newGas = (miles/mpg);
	}
	public double getGas()
	{
		return gas;
	}
	public double getUsage()
	{
		return miles/mpg;
	}
	public String toString()
	{
		return String.format("You have driven %.2f miles at %.2f miles per gallon, consuming %.2f gallons of gasoline.",(double)miles,mpg,getUsage());
	}
}