class InsertionSort{
    public static void main(String[] args) {
        int arr[]={5,1,4,2,8};
        System.out.println("Before Sorting:");
        for(int num:arr) 
           System.out.print(num+" ");
        bubbleSort(arr);
        System.out.println("\nAfter Sorting:");
        for(int num:arr)
        System.out.print(num+" ");
    }
    public static void bubbleSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        
    }
    
}