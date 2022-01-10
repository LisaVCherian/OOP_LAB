import java.util.Scanner;

class BinarySearch
{
	void BSearch(int arr[],int search,int first,int last)
	{
		int mid;
		mid=(first+last)/2;
		while(first<=last)
		{
			if(arr[mid]==search){
				System.out.println("Element found at indec: " + mid);
				break;
			}
			else if(arr[mid]<search)
				first=mid+1;
			else
				last=mid-1;	
			mid=(first+last)/2;
		}
		if(first>last)
			System.out.println("Element not found :(");
	}
}

class Main
{
	public static void main(String args[])
	{
		int[] arr=new int[100];
		int n,search;
		
		Scanner sc=new Scanner(System.in);
		BinarySearch BS=new BinarySearch();
		
		System.out.print("Enter the number of elements: ");
		n=sc.nextInt();
		int first=0,last=n-1;
		
		System.out.println("\nEnter the elements in sorted order: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
			
		System.out.println("\nEnter the element to be searched: ");
		search=sc.nextInt();
		
		BS.BSearch(arr,search,first,last);
	}
	
}
