package Kruskal;


import Graph.*;
import GUI.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kruskal {


    public static Graph KruskalAnalyze(Graph graph){
        ArrayList<Edge> result = new ArrayList<Edge>();

        Map<Integer, ArrayList<Node>> Unions = new HashMap<Integer, ArrayList<Node>>();

        graph.getEdgeList().sort(new Edge.EdgeComparator());

        int i = 0;

        for (Edge e : graph.getEdgeList()){
            if ((e.getFirst().getUnionIndex() == null) && (e.getSecond().getUnionIndex() == null)){
                result.add(e);

                Unions.put(i, new ArrayList<Node>());
                Unions.get(i).add(e.getFirst());
                Unions.get(i).add(e.getFirst());

                e.getFirst().setUnionIndex(i);
                e.getSecond().setUnionIndex(i);

                ++i;
            }

            else if((e.getFirst().getUnionIndex() != null) && (e.getSecond().getUnionIndex() == null)){
                result.add(e);

                Unions.get(e.getFirst().getUnionIndex()).add(e.getSecond());

                e.getSecond().setUnionIndex(e.getFirst().getUnionIndex());
            }

            else if((e.getFirst().getUnionIndex() == null) && (e.getSecond().getUnionIndex() != null)){
                result.add(e);

                Unions.get(e.getSecond().getUnionIndex()).add(e.getFirst());

                e.getFirst().setUnionIndex(e.getSecond().getUnionIndex());
            }

            else if (e.getFirst().getUnionIndex() == e.getSecond().getUnionIndex()) {
                continue;
            }

            else{
                for (Node n : Unions.get(e.getFirst().getUnionIndex())) {
                    Unions.get(e.getSecond().getUnionIndex()).add(n);

                    n.setUnionIndex(e.getSecond().getUnionIndex());
                }


                Unions.get(e.getFirst().getUnionIndex()).removeAll(Unions.get(e.getSecond().getUnionIndex()));
            }

        }

        return new Graph(result);

    };

}