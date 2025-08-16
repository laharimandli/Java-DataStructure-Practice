import java.util.Scanner;
class InsertionSort{
	static void insertionSort(int a[]){
		for(int i=1;i<a.length;i++){
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key){
				a[j+1]=a[j];
				j--;
			}
		    a[j+1]=key;
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("\nArray Elements Before Sorting:");
		for(int x:arr)
			System.out.print(x+" ");
		insertionSort(arr);
		System.out.println("\nArray Elements After Sorting:");
		for(int x:arr)
			System.out.print(x+" ");
	}
}