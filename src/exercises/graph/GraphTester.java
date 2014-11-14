package exercises.graph;

import java.util.Random;

public class GraphTester {
    
    public static void main(String[] args) {
        
    }
    
    public GraphTester(int nodes) {
        Random r = new Random();
        Graph g = new Graph(nodes);
        g.connect(r.nextInt(nodes), r.nextInt(nodes));
    }
}