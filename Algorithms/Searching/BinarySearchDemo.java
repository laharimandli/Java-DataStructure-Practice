import java.util.Scanner;
class BinarySearchDemo{
	static int BinarySearch(int key,int arr[]){
		int left=0,right=arr.length-1;
		while(left<=right){
			int mid=(left+right)/2;
			if(arr[mid]==key){
				return mid;
			}
			else if(key<arr[mid]){
				right=mid-1;
			}
			else{
			    left=mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of an Array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are:");
		for(int a:arr){
			System.out.print(a+" ");
		}
		System.out.println("\nEnter Key to Search:");
		int key=sc.nextInt();
		int res=BinarySearch(key,arr);
		if(res!=-1){
			System.out.println(key+" Found at a["+res+"]");
		}
		else{
          System.out.println(key+" Not Found!");
		}
	}
}