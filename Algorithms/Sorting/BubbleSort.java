import java.util.Scanner;
class BubbleSort{
	static void bubbleSort(int a[]){
		int len=a.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len-1;j++){
				if(a[j]>a[j+1]){
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
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
		bubbleSort(arr);
		System.out.println("\nArray Elements After Sorting:");
		for(int x:arr)
			System.out.print(x+" ");
	}
}