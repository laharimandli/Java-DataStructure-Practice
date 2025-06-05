import java.util.PriorityQueue;
import java.util.Scanner;
public class PQInsertion{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   PriorityQueue<Integer> pq=new PriorityQueue<>();
   System.out.println("Enter no.of Elements:");
   int n=sc.nextInt();
   for(int i=0;i<n;i++){
   System.out.println("Enter Element:"+i);
   pq.offer(sc.nextInt());
   }
   System.out.println("The sorted Elemts are:");
   while(!pq.isEmpty()){
   System.out.print(pq.poll()+" ");
   }
}
}