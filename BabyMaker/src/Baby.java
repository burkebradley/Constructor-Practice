
public class Baby
	{
		private	String name;
		private	double speed;
	//	private	double weight;
		
		public Baby (String n, double s)
		{
			name = n;
			speed = s;
	//		weight = w;
		}
		public static void getBread()
		{
			System.out.println("Baby gets some bread");
		}
		public static void eatBread()
		{
			System.out.println("Baby eats some bread");
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public double getSpeed()
			{
				return speed;
			}
		public void setSpeed(double speed)
			{
				this.speed = speed;
			}
// 		public double getWeight()
//			{
//				return weight;
//			}
//		public void setWeight(double weight)
//			{
//				this.weight = weight;
//			}
		
		
		
	}
