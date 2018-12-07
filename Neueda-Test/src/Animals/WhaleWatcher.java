package Animals;
import java.util.ArrayList;

import Animals.Whale;

public class WhaleWatcher {

	public static void main(String[] args) {
		ArrayList<Whale> whaleWatcher=new ArrayList<Whale>();
		//initialising array of whales
		whaleWatcher.add(new Whale("Right","Atlantic",2001,21,16));
		whaleWatcher.add(new Whale("Blue","Pacific",2001,23,16));
		whaleWatcher.add(new Whale("Sperm","Atlantic",1900,20,40));
		whaleWatcher.add(new Whale("Humpback","Antarctic",919,13,13));
		//prints all data on whales
		System.out.println((whaleWatcher.get(0)).toString());
		System.out.println((whaleWatcher.get(1)).toString());
		System.out.println((whaleWatcher.get(2)).toString());
		System.out.println((whaleWatcher.get(3)).toString());
		
		//loops through all arrayList items and prints name if mainOcean is Atlantic
		for(int i=0;i<whaleWatcher.size();i++)
		{
			if(whaleWatcher.get(i).getMainOcean()=="Atlantic")
				System.out.println(whaleWatcher.get(i).getName());
		}
	}

}
