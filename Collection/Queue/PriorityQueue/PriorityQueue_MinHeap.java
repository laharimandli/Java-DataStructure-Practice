import java.util.PriorityQueue;
class PriorityQueue_MinHeap{
   public static void main(String args[]){
	   PriorityQueue<Integer> pq=new PriorityQueue<>();
	   pq.add(10);
	   pq.add(30);
	   pq.add(20);
	   pq.add(15);
	   System.out.println("Elements are: "+pq);
	   pq.offer(22);
	   System.out.println(pq.peek());
	   System.out.println(pq.poll());
	   System.out.println(pq.contains(20));
	   System.out.println("Elements are: "+pq);
	   System.out.println(pq.size());
	   pq.clear();
	   System.out.println("Elements are: "+pq);
   }
}