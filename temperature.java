public class temperature
{
	double temp;
	String scale;
	public temperature()
	{
		temp = 0;
		scale = "C";
	}
	public temperature(String scale)
	{
	this.scale = scale;
	temp = 0;
	}
	public temperature(double temp)
	{
		this.temp = temp;
		scale = "C";
	}
	public temperature(double temp, String scale)
	{
		this.temp = temp;
		this.scale = scale;
	}
	public double getCelsius()
	{
		if (scale.equals("C"))
			return temp;
		else
			return((double)(Math.round((5*(temp - 32.0)/9.0)*10.0))/10);
	}
	public double getFahrenheit()
	{
		if (scale.equals("F"))
			return temp;
		else
			return(Math.round((9*(temp/5)+32)*10)/10);
	}
	public void setTemp(double temp)
	{
		this.temp = temp;
	}
	public void setScale(String scale)
	{
		this.scale = scale;
	}
	public void setTempScale(double temp, String scale)
	{
		this.temp = temp;
		this.scale = scale;
	}
	public int compareTo(temperature obj)
	{
		if (getCelsius()<obj.getCelsius())
			return -1;
		else if (getCelsius()>obj.getCelsius())
			return 1;
		else
			return 0;
	}
	public double getTemperature()
	{
		return temp;
	}
	public String getScale()
	{
		return scale;
	}
	public String toString()
	{
		if (getScale().equals("C"))
			return String.format("%.1f degrees C = %.1f degrees F",getTemperature(),getFahrenheit());
		else
			return String.format("%.1f degrees F= %.1f degrees C", getTemperature(),getCelsius());
	}
}