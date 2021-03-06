package Graph;

import GUI.EdgeFactory;
import GUI.GraphFactory;
import GUI.NodeFactory;

import javax.swing.*;
import java.util.Queue;
import java.util.LinkedList;
import java.io.*;

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

    public void save(String filename){

        BufferedWriter writer;
        NodeFactory factoryNode = new NodeFactory();
        EdgeFactory factoryEdge = new EdgeFactory();
        GraphFactory factoryGraph = new GraphFactory();

        try{
            writer = new BufferedWriter(new FileWriter(filename));

            for(Edge e : edgeList){
                String toPut = e.getFirst().getName() + " " + e.getSecond().getName() + " "
                        + e.getWeight() + "\n";

                writer.write(toPut);
            }

            for(Node e : nodeList){
                if(adjacentNodes(e).size() == 0){
                    String toPut = e.getName() + "\n";

                    writer.write(toPut);
                }
            }

            writer.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Couldn't open/read file");

            return;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Couldn't open/read file");

            return;
        } finally {}

    }

    public static Graph load(String filename){
        BufferedReader reader;
        NodeFactory factoryNode = new NodeFactory();
        EdgeFactory factoryEdge = new EdgeFactory();
        GraphFactory factoryGraph = new GraphFactory();

        try{
            reader = new BufferedReader(new FileReader(filename));

            ArrayList<Edge> edgeList = new ArrayList<Edge>();

            String line = reader.readLine();

            ArrayList<Node> originalNodes = new ArrayList<Node>();

            while(line != null){
                String [] parsed = line.split("[\\s+]");

                Node first = null, second = null;

                for(Node n : originalNodes){
                    if (n.getName().equals(parsed[0])){
                        first = n;
                    }

                    if (n.getName().equals(parsed[1])){
                        second = n;
                    }
                }

                if(first == null){
                    first = (factoryNode).getNode(parsed[0]);
                    originalNodes.add(first);
                }


                if(second == null){
                    second = factoryNode.getNode(parsed[1]);
                    originalNodes.add(second);
                }

                edgeList.add(factoryEdge.getEdge(first, second, Integer.parseInt(parsed[2])));

                line = reader.readLine();
            }

            Graph result = factoryGraph.getGraph(edgeList);

            double angle = 0;

            int[] x = new int[result.getNodeList().size()];
            int[] y = new int[result.getNodeList().size()];

            for(int i = 0 ; i < result.getNodeList().size()  ;++i)
            {
                angle = i * (360/result.getNodeList().size());

                x[i] = (int) (550 + 200 * Math.cos(Math.toRadians(angle)));
                y[i] = (int) (250 + 200 * Math.sin(Math.toRadians(angle)));

            }

            int i = 0;

            for(Node e : result.getNodeList())
            {
                e.setX(x[i]);
                e.setY(y[i]);

                i++;
            }

            return result;
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Couldn't open/read file");

            return null;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Couldn't open/read file");

            return null;
        } finally {}

    }
}