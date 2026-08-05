public class Cylinder extends Circle2
	{
		private double height;
		
		public Cylinder()
		{
			super();
			this.height=1.0;
		}
		public Cylinder(double height)
		{
			super();
			this.height=height;
		}
		public Cylinder(double height,double radius)
		{
			super(radius);
			this.height=height;
		}
		public Cylinder(double height,double radius,String color)
		{
			super(radius,color);
			this.height=height;
			
		}
		public double getheight()
		{
			return this.height;
		}
		public void setheight(double height)
		{
			this.height=height;
		}
		public String toString()
		{
			return "this is a cylinder";
		}
		public double getvolume()
		{
			return getarea()*this.height;
		}
	}