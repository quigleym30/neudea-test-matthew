package Animals;
import java.util.ArrayList;

import Animals.Whale;

public class WhaleWatcher {
	public static void main(String[] args) {
		ArrayList<Whale> whaleWatcher= initialiseArray();
		printData(whaleWatcher);
		findAtlantic(whaleWatcher);
		findFastest(whaleWatcher);
		averageLength(whaleWatcher);
		
		
	}
	public static ArrayList<Whale> initialiseArray()
	{

		//initialising array of whales
		ArrayList<Whale> whaleWatcher=new ArrayList<Whale>();
		whaleWatcher.add(new Whale("Right","Atlantic",2001,21,16));
		whaleWatcher.add(new Whale("Blue","Pacific",2001,23,16));
		whaleWatcher.add(new Whale("Sperm","Atlantic",1900,20,40));
		whaleWatcher.add(new Whale("Humpback","Antarctic",919,13,13));
		return whaleWatcher;
	}
	public static void printData(ArrayList<Whale> whaleWatcher) {
		//prints all data on whales
		System.out.println((whaleWatcher.get(0)).toString());
		System.out.println((whaleWatcher.get(1)).toString());
		System.out.println((whaleWatcher.get(2)).toString());
		System.out.println((whaleWatcher.get(3)).toString());
	}
	public static void findAtlantic(ArrayList<Whale> whaleWatcher)
	{
		//loops through all arrayList items and prints name if mainOcean is Atlantic
				for(int i=0;i<whaleWatcher.size();i++)
				{
					if(whaleWatcher.get(i).getMainOcean()=="Atlantic")
						System.out.println(whaleWatcher.get(i).getName()+" Swims in the Atlantic");
				}
	}
	public static void findFastest(ArrayList<Whale> whaleWatcher)
	{
		//loop to determain one or more fastest whale(s) put them in a new array and print them
				ArrayList<Whale> fastestWhales=new ArrayList<Whale>();
				int speed=whaleWatcher.get(0).getMaxSpeed();
				for(int i=0;i<whaleWatcher.size();i++)
				{
					if(whaleWatcher.get(i).getMaxSpeed()>speed)
					{	fastestWhales.clear();
					fastestWhales.add(whaleWatcher.get(i));
					}
					else if(whaleWatcher.get(i).getMaxSpeed()==speed)
					{
						fastestWhales.add(whaleWatcher.get(i));
					}
				}
				for(int i=0;i<fastestWhales.size();i++)
				System.out.println("Fastest Whale(s): "+fastestWhales.get(i).getName());
	}
	
	public static void averageLength(ArrayList<Whale> whaleWatcher)
	{
		double sum=0;
		for(int i=0;i<whaleWatcher.size();i++)
		{
			sum+=whaleWatcher.get(i).getLength();
		}
		System.out.println("Average Length of the Whales are :"+(sum/whaleWatcher.size()));
	}

}
