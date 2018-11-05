
public class Max {
	public static <ItemType extends Comparable<ItemType>> ItemType getMax(ItemType[] items){
		
		ItemType maxSoFar = items[0];
		
		for(ItemType item:items){
			if (item.compareTo(maxSoFar) > 0){
				maxSoFar = item;
			}
		}
		
		return maxSoFar;
	}
	
}


import java.util.ArrayList;

ArrayList<Integer> mylist = new ArrayList<Integer>();
mylist.add(new Integer(12));
mylist.get(0);