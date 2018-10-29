import java.util.ArrayList;

public class BabyRunner
	{

		public static void main(String[] args)
			{
				ArrayList<Baby>nursery = new ArrayList<Baby>();
				nursery.add(new Baby("Ted", 10.6));
				nursery.add(new Baby("Tom", 1.1));
				nursery.add(new Baby("Toad", 8.7));
				nursery.add(new Baby("Tim", 4.8));
				nursery.add(new Baby("Tony", 1000));
//				System.out.println(nursery.get(0).getName());
//				System.out.println(nursery.get(0).getSpeed());
//			for(int i=0; i<nursery.size(); i++)	
//				{
//					System.out.println(nursery.get(i).getName() + " can run " + nursery.get(i).getSpeed() + " mph.");
//				}
			nursery.remove(2);
			
			nursery.get(3).setSpeed(600);
			for(int i=0; i<nursery.size(); i++)	
				{
					System.out.println(nursery.get(i).getName() + " can run " + nursery.get(i).getSpeed() + " mph.");
					nursery.get(i).setSpeed(nursery.get(i).getSpeed()-1);
				}
			
			
			}

	}
