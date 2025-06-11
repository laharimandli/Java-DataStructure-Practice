class MergeSort
{
	
	public static void mergeSort(int arr[],int l,int r){
		if(l<r){
			int m=(l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	public static void merge(int arr[],int l,int m,int r){
		int n1=m-l+1;
		int n2=r-m;
		int lArr[]=new int[n1];
		int rArr[]=new int[n2];
		for(int x=0;x<n1;x++)
			lArr[x]=arr[l+x];
		for(int x=0;x<n2;x++)
			rArr[x]=arr[m+1+x];
		int i=0,j=0,k=l;
		while(i<n1&&j<n2){
			if(lArr[i]<=rArr[j]){
				arr[k]=lArr[i];
				i++;
				
			}
			else{
				arr[k]=rArr[j];
				j++;
			}
			k++;
		}
			while(i<n1){
				arr[k]=lArr[i];
				i++;
				k++;
			}
			while(j<n2){
				arr[k]=rArr[j];
				j++;
				k++;
			}
				
		
		
			
	}
	
	public static void main(String args[]){
		int arr[]={6,3,9,5,2,8};
		System.out.println("Before Sorting:");
		for(int n:arr)
			System.out.print(n+" ");
		mergeSort(arr,0,arr.length-1);
		System.out.println("\nAfter Sorting:");
		for(int n:arr)
			System.out.print(n+" ");
		
	}
 }
