import java.util.Scanner;
class SelectionSort{
	static void selectionSort(int a[]){
		int len=a.length;
		int minIndex;
		for(int i=0;i<len;i++){
			 minIndex=i;
			for(int j=i;j<len-1;j++){
                if(a[minIndex]>a[j+1])
				   minIndex=j+1;
			}
			int t=a[i];
			a[i]=a[minIndex];
			a[minIndex]=t;
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
		selectionSort(arr);
		System.out.println("\nArray Elements After Sorting:");
		for(int x:arr)
			System.out.print(x+" ");
	}
}