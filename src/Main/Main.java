package Main;

import GUI.*;
import Graph.*;
import Kruskal.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //ArrayList<Node> testList = new ArrayList<Node>();

        /*testList.add(new Node("falseff"));
        testList.add(new Node("danilkin"));
        testList.add(new Node("ivan"));
        testList.add(new Node("vanka"));
        testList.add(new Node("grechk@"));*/

       // ArrayList<Edge> testListEdges = new ArrayList<Edge>();

        /*testListEdges.add(new Edge(testList.get(0), testList.get(1), 1337));
        testListEdges.add(new Edge(testList.get(1), testList.get(3), 69));
        testListEdges.add(new Edge(testList.get(3), testList.get(2), 228));
        testListEdges.add(new Edge(testList.get(2), testList.get(0), 1488));
        testListEdges.add(new Edge(testList.get(0), testList.get(4), 1));
        testListEdges.add(new Edge(testList.get(1), testList.get(4), 1));
        testListEdges.add(new Edge(testList.get(2), testList.get(4), 2));
        testListEdges.add(new Edge(testList.get(3), testList.get(4), 3));*/

       // Graph testGraph = new Graph(testListEdges, testList);

        //System.out.println(testGraph.isConnected());

        //Kruskal.KruskalAnalyze(testGraph);

        GUI.execute();
    }
}
