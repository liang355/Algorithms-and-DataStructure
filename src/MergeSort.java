import java.util.Arrays;
import java.util.Random;


public class MergeSort {
	public static void main(String[] args){
		int i;
		int[] list;
		list = new int[8];
		//randomize an array
		Random rand = new Random();
		for(i = 0; i < list.length; i++){
			list[i] = rand.nextInt(100) + 1;
		}
		PrintList("Input List:  ", list);
		//execute Insertion Sort
		MergeSort(list);
		PrintList("Output List: ", list);
	}
	public static void MergeSort(int[] list){
		MergeSort(list, 0, list.length - 1);
	}

	public static void MergeSort(int[] list, int p, int r){
		if(p < r){
			int q = (p + r)/2;
			MergeSort(list, p, q);
			MergeSort(list, q + 1, r);
			Merge(list, p, q, r);
		}
	}
	
	public static void Merge(int[] list, int p, int q, int r){
		int[] sublistL = Arrays.copyOfRange(list, p, q + 1);
		int[] sublistR = Arrays.copyOfRange(list, q + 1, r + 1);
		int i = 0;
		int j = 0;
		int k = p;
		while(i < sublistL.length && j <sublistR.length && k <= r){
			if(sublistL[i] <= sublistR[j]){
				list[k] = sublistL[i];
				i++;
			}else{
				list[k] = sublistR[j];
				j++;
			}
			k++;
		}
		while(i >= sublistL.length && k <= r){
			list[k] = sublistR[j];
			j++;
			k++;
		}
		while(j >= sublistR.length && k <= r){
			list[k] = sublistL[i];
			i++;
			k++;
		}
	}
	
	public static void PrintList(String text, int list[]){
		int i;
		System.out.print(text);
		for(i = 0; i < list.length - 1; i++){
			System.out.print(list[i] + ",");
		}
		System.out.println(list[i]);
	}
}
