public class BubbleSort{
	
	
	
//	Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping 
//	the adjacent elements if they are in the wrong order. This algorithm is not suitable 
//	for large data sets as its average and worst-case time complexity is quite high.
	
	
//	Here, current element is compared with the next element. 
//	If current element is greater than the next element, it is swapped.
	public static void sort(int[] arr) {

		int n = arr.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){  
					//swap elements  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}  

			}  
		}  
	}
	
	public static void main(String[] args) {
		int[] arr = {1,5,3,7,5,9};
		sort(arr);
		
		for(int num : arr)
			System.out.print(num+",");
	}
}