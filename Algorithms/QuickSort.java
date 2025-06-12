class QuickSort{
	public static void quickSort(int arr[],int l,int h){
		if(l<h){
			int pi=partition(arr,l,h);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,h);
		}
	}
	public static int partition(int arr[],int l,int h){
		int pivot=arr[h];
		int i=l-1;
		for(int j=l;j<h;j++)
		{
			if(arr[j]<pivot){
				i++;
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		int t=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=t;
		return i+1;
	}
	
	public static void main(String arg[]){
		int arr[]={5,3,6,1,4,2};
		System.out.println("Before Sorting:");
		for(int n:arr)
			System.out.print(n+" ");
		quickSort(arr,0,arr.length-1);
		System.out.println("\nAfter Sorting:");
		for(int n:arr)
			System.out.print(n+" ");
	}
}