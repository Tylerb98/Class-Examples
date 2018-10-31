
public class Sorter {
	public static void sort(Comparable[] arr){
		for (int i = 0; i < arr.length; ++i){
			for (int j = i + 1;j <arr.length; ++j){
				if(arr[j].compareTo(arr[i]) < 0){
					swap(arr, i, j);
				}
			}
		}
	}
}
