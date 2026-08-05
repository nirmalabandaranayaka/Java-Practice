public class Point{
	int x;
	int y;
public Point()
{
	int x=0;
	int y=0;
}
public Point(int x,int y)
{
	this.x=x;
	this.y=y;
}
public int getx()
{
	return x;
}
public int gety()
{
	return y;
}
public void setx(int x)
{
	this.x=x;
}
public void sety(int y)
{
	this.y=y;
}
public String toString()
{
	return "("+this.x+","+this.y+")";
}
public int[] getxy()
{
	int[] result = new int[2];
	result[0]=this.x;
	result[1]=this.y;
	return result;
}
public void setxy(int x,int y)
{
	this.x=x;
	this.y=y;
}
public double distance(int x,int y)
{
	int xdiff=this.x-x;
	int ydiff=this.y-y;
	return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
	
}
public double distance(Point another)
{
	int xdiff=this.x-another.x;
	int ydiff=this.y-another.y;
	return Math.sqrt(xdiff*xdiff+ydiff*ydiff);
}
public double distance()
{
	return Math.sqrt(this.x*this.x+this.y*this.y);
}
}