
public class BinarySearch {
	public static <T extends Comparable<T>>int getIndex(T[] list, int startIndex, int endIndex, T searchKey){
		int middle = (startIndex + endIndex)/2;
		int compared = searchKey.compareTo(list[middle]);
		
		if(compared == 1){
			getIndex(list, middle, endIndex, searchKey);
		}
		else if(compared == -1){
			getIndex(list, startIndex, middle, searchKey);
		}
		else {
			return middle;
		}
	}
}
