import java.util.Scanner;
public class HouseRobber{
    public static int rob(int arr[]){
        if(arr.length==0)return 0;
        if(arr.length==1)return arr[0];
        int n=arr.length;
        int dp[]=new int[n];
       dp[0]=arr[0];
       dp[1]=Math.max(arr[0],arr[1]);
       for(int i=2;i<n;i++){
           dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
       }
       return dp[n-1];
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No.of values in Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
         System.out.println("Enter Elements into Array:");
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Maximum money that can be robbed: "+rob(arr));
         
        
    }
}