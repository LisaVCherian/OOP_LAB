import java.util.Scanner;

class QuickSort
{
	void swap(int arr[],int x,int y){
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	int partition(int arr[], int low, int high){
		int i = low-1;
		int pivot = arr[high];
		
		for(int j = low; j<=high-1; j++){
			if(arr[j]<pivot){
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return (i+1);
	}
	
	void quickSort(int arr[], int low, int high){
		if(low<high){
		
			int pi = partition(arr, low, high);
			
			quickSort(arr,low,pi-1);
			quickSort(arr,pi+1,high);
		}
	}
	
	void printArray(int arr[], int n){
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}

class Main
{
	public static void main(String args[]){
	
		int[] arr=new int[20];
		Scanner sc=new Scanner(System.in);
	
		QuickSort QS=new QuickSort();
		
		System.out.print("Enter the number of elements: ");
		int n=sc.nextInt();
		
		int low=0,high=n-1;
		
		System.out.println("\nEnter the elements: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
			
		QS.quickSort(arr,low,high);
		
		System.out.println("\nSorted array: ");
		QS.printArray(arr,n);
			
	}
}
