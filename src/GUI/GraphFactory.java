package GUI;

import Graph.Edge;
import Graph.Graph;
import Graph.Node;

import java.util.ArrayList;

public class GraphFactory extends GraphFactoryInterface {
    @Override
    public Graph getGraph(){
        return new Graph();
    }

    @Override
    public Graph getGraph(ArrayList<Edge> edgeList, ArrayList<Node> nodeList){
        return new Graph(edgeList, nodeList);
    }

    @Override
    public Graph getGraph(ArrayList<Edge> edgeList) {
        return new Graph(edgeList);
    }

}
