package GUI;

import Graph.Edge;
import Graph.Node;

public class EdgeFactory extends EdgeFactoryInterface{
    @Override
    public Edge getEdge(){
        return new Edge();
    }


    @Override
    public Edge getEdge(Node first, Node second, Integer weight)
    {
        return new Edge(first, second, weight);
    }
}
