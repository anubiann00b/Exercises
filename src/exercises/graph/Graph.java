package exercises.graph;

public class Graph {
    
    class Node {
        
        int pos;
        int[] connections;
        
        Node() {
            pos = 0;
            connections = new int[1];
        }

        private void addConnection(int node) {
            if (node<0 || node>=size)
                throw new IndexOutOfBoundsException("Size: " + size + ". Accessing " + node + ".");
            if (connections.length>=node) {
                int[] newConnections = new int[connections.length*2];
                System.arraycopy(connections, 0, newConnections, 0, connections.length);
                connections = newConnections;
            }
            connections[pos] = node;
            pos++;
        }
    }
    
    private final int size;
    private final Node[] nodes;
    
    public Graph(int s) {
        size = s;
        nodes = new Node[s];
        for (Node n : nodes)
            n = new Node();
    }
    
    public void connect(int n1, int n2) {
        if (n1<0 || n1>=size)
            throw new IndexOutOfBoundsException("Size: " + size + ". Accessing " + n1 + ".");
        
        if (n1 == n2)
            return;
        
        nodes[n1].addConnection(n2);
    }
    
    public boolean isConnection(int n1, int n2) {
        if (n1 == n2)
            return true;
        return false;
    }
}