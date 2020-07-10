package GUI;

import Graph.Edge;
import Graph.Graph;
import Graph.Node;

import java.util.ArrayList;

public abstract class GraphFactoryInterface {
    public abstract Graph getGraph();

    public abstract Graph getGraph(ArrayList<Edge> edgeList, ArrayList<Node> nodeList);

    public abstract Graph getGraph(ArrayList<Edge> edgeList);
}
