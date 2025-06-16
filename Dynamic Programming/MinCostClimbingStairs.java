import java.util.Scanner;
public class MinCostClimbingStairs{
    public static int minCostClimbing(int cost[]){
       int n=cost.length;
       int[] dp=new int[n];
       dp[0]=cost[0];
       dp[1]=cost[1];
       for(int i=2;i<n;i++){
           dp[i]=cost[i]+Math.min(dp[i-1],dp[i-2]);
       }
       return Math.min(dp[n-1],dp[n-2]);
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No.of values in Array:");
        int n=sc.nextInt();
        int cost[]=new int[n];
         System.out.println("Enter Elements into Array:");
         for(int i=0;i<n;i++){
             cost[i]=sc.nextInt();
         }
         System.out.println("MinCostClimbingStairs: "+minCostClimbing(cost));
         
        
    }
}