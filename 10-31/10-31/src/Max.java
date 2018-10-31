import java.util.ArrayList;

public class Max
{
	public static <T extends Comparable<T>> T getMax(ArrayList<T> items)//T is just a type could replace with something like String or Integer
	{
		T max = items.get(0);
		
		for(T item: items)
		{
			if(item.compareTo(max) > 0)
			{
				max = item;
			}
		}
		
		return max;
	}
	
}
