import java.util.*;
class Graph {
    private Map<Integer, List<Integer>> adjList;
    public Graph() {
        adjList = new HashMap<>();
    }
    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }
    public Map<Integer, List<Integer>> getAdjList() {
        return adjList;
    }
}
public class Graph2 {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        System.out.println("Adjacency List: " + graph.getAdjList());
    }
}
