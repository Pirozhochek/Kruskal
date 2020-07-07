package Graph;

import java.util.Queue;
import java.util.LinkedList;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Node> nodeList;
    private ArrayList<Edge> edgeList;

    public Graph(){
        nodeList = new ArrayList<Node>();
        edgeList = new ArrayList<Edge>();
    }

    public Graph(ArrayList<Edge> edgeList, ArrayList<Node> nodeList){
        this.edgeList = edgeList;
        this.nodeList = nodeList;
    }

    public Graph(ArrayList<Edge> edgeList){
        this.edgeList = edgeList;

        this.nodeList = new ArrayList<Node>();

        for (Edge e : edgeList){
            if (!nodeList.contains(e.getFirst())){
                nodeList.add(e.getFirst());
            }


            if (!nodeList.contains(e.getSecond())){
                nodeList.add(e.getSecond());
            }
        }
    }

    public void setEdgeList(ArrayList<Edge> edgeList) {
        this.edgeList = edgeList;
    }

    public ArrayList<Edge> getEdgeList() {
        return edgeList;
    }

    public void setNodeList(ArrayList<Node> nodeList) {
        this.nodeList = nodeList;
    }

    public ArrayList<Node> getNodeList() {
        return nodeList;
    }

    public ArrayList<Node> adjacentNodes(Node e){
        ArrayList<Node> result = new ArrayList<Node>();

        for (Edge edge : edgeList){
            if (edge.getFirst() == e) {
                result.add(edge.getSecond());
            }

            if  (edge.getSecond() == e) {
                result.add(edge.getFirst());
            }
        }

        return result;
    }

    public boolean isConnected(){
        Queue<Node> currentQueue = new LinkedList<Node>();
        Node current = nodeList.get(0);

        ArrayList<Node> adjacentToCurrent = adjacentNodes(current);

        for(Node e : adjacentToCurrent){
            if (!e.isVisited()){
                currentQueue.add(e);
            }
        }

        current.setVisited(true);

        while(!currentQueue.isEmpty()){
            current = currentQueue.poll();

            adjacentToCurrent = adjacentNodes(current);

            for(Node e : adjacentToCurrent){
                if (!e.isVisited()){
                    currentQueue.add(e);
                }
            }

            current.setVisited(true);
        }

        for(Node e : nodeList) {
            if (!e.isVisited()) {
                return false;
            }
        }

        return true;
    }
}
