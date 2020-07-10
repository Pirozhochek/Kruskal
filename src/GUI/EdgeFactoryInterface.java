package GUI;

import Graph.Edge;
import Graph.Node;

public abstract class EdgeFactoryInterface {
    public abstract Edge getEdge();

    public abstract Edge getEdge(Node first, Node second, Integer weight);

}
