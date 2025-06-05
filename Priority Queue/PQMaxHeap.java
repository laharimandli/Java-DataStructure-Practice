import java.util.*;
public class PQMaxHeap{
  public static void main(String args[]){
  PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
  maxHeap.add(10);
  maxHeap.add(5);
  maxHeap.add(30);
  System.out.println("Priority Queue:"+maxHeap);
  System.out.println("Max:"+maxHeap.peek());
  System.out.println("Remove Min:"+maxHeap.poll());
  System.out.println("New Min:"+maxHeap.peek());
  }
}