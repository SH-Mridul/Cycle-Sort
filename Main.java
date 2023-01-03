package CycleSort;

import java.util.Arrays;

public class Main {
	
  public static void main(String[] args) {
	int arr[] = {3,5,2,1,4};
	cycleSort(arr);
	System.out.println(Arrays.toString(arr));
  }

  public static void cycleSort(int arr[])
  {
	  int i = 0;
	  while(i<arr.length)
	  {
		  int correctIndex = arr[i] - 1;
		   
		  if(arr[i] != arr[correctIndex])
		  {
			  swap(arr,i,correctIndex);
		  }else {
			  i++;
		  }
	  }
  }
  
  //swaping
  public static void swap(int[] arr, int first,int sec)
  {
	//3,5,2,1,4
	  int temp = arr[first];
	  arr[first] = arr[sec];
	  arr[sec] = temp;
  }
}