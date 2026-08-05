public class Time
{
	private int second;
	private int minite;
	private int hour;
	
	public Time(int second,int minite,int hour)
	{
		this.second=second;
		this.minite=minite;
		this.hour=hour;
	}
	public Time()
	{
		this.second=0;
		this.minite=0;
		this.hour=0;
	}
	public int getsecond()
	{
		return second;
	}
	public int getminite()
	{
		return minite;
	}
	public int gethour()
	{
		return hour;
	}
	public void setsecond(int second)
	{
		this.second=second;
	}
	public void setminite(int minite)
	{
		this.minite=minite;
	}
	public void sethour(int hour)
	{
		this.hour=hour;
	}
	public void settime(int second,int minite,int hour)
	{
		this.second=second;
		this.minite=minite;
		this.hour=hour;
	}
	public String toString()
	{
		return String.format("%02d/%02d/%02d",hour,minite,second);
	}
	public Time nextsecond()
	{
		second++;
		
		if(second>=60){
			second=0;
			minite++;
		if(minite>=60){
			minite=0;
			hour++;
		if(hour>=24){
			hour=0;
		}
		}
		}
		return this;
	}
}
	