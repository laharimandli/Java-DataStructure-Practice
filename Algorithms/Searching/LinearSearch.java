import java.util.Scanner;
class LinearSearch{
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
		boolean found=false;
		int k=0;
		System.out.println("\nEnter Key to Search:");
		int key=sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]==key){
				found=true;
				k=i;
				break;
				
			}
		}
		if(found){
			System.out.println(key+" Found at a["+k+"]");
		}
		else{
          System.out.println(key+" Not Found!");
		}
		
	}

}