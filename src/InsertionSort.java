
public class InsertionSort {
	public static void main(String[] args){
		int[] list = {4, 9, 2, 7, 8, 5, 1, 3, 6};
		InsertionSort(list);
		
	}
	
	public static void InsertionSort(int[] list){
		int key, i, j;
		for(j = 1; j < list.length; j++){
			key = list[j];
			i = j - 1;
			while(i >= 0 && list[i] > key){
				list[i+1] = list[i];
				i = i - 1;
			}
			list[i+1] = key;
			PrintList(list);
		}
	}
	
	public static void PrintList(int list[]){
		int i;
		for(i = 0; i < list.length - 1; i++){
			System.out.print(list[i] + ",");
		}
		System.out.println(list[i]);
	}
}
