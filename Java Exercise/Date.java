
public class Date
{
	private int day;
	private int month;
	private int year;
	
	Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	int getyear()
	{
		return year;
	}
	int getmonth()
	{
		return month;
	}
	int getday()
	{
		return day;
	}
	void setyear(int year)
	{
		this.year=year;
	}
	void setmonth(int month)
	{
		this.month=month;
	}
	void setday(int day)
	{
		this.day=day;
	}
	public String toString()
	{
		return String.format("%02d/%02d/%04d",day,month,year);
	}
	void setdate(int year,int month,int day)
	{
		this.year=year;
		this.month=month;
		this.day=day;
	}
}
	