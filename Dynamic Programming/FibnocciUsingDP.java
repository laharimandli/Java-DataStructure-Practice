import java.util.*;
class FibnocciUsingDP{
    public static int fibMemorization(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=fibMemorization(n-1,dp)+fibMemorization(n-2,dp);
    }
    public static int fibTabulation(int n){
        if(n<=1) return n;
       int[] dp=new int[n+1];
       dp[0]=0;
       dp[1]=1;
       for(int i=2;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
       }
       return dp[n];
    }
    public static int fibSpaceOptimized(int n){
       if(n<=1)return n;
       int prev1=1,prev2=0,cur=0;
       for(int i=2;i<=n;i++){
           cur=prev1+prev2;
           prev2=prev1;
           prev1=cur;
       }
       return cur;
    }
    
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter n value:");
       int n=sc.nextInt();
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       System.out.println("DP Using Memoization: " + fibMemorization(n, dp));
       System.out.println("DP Using Tabulation: " + fibTabulation(n));
       System.out.println("DP Using Space Optimization: " + fibSpaceOptimized(n));
    
    }
}