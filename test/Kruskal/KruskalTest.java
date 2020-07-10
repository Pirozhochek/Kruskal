package Kruskal;

import Graph.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KruskalTest {
    @Test
    public void Test1() {

        for (int i = 1; i < 9; i++) {
            Graph curr = new Graph().load("example/test" + String.valueOf(i) + ".txt");
            Graph result = Kruskal.KruskalAnalyze(curr);
            System.out.printf("%d test\n", i);
            for (Edge edge : result.getEdgeList()){

                System.out.printf("%s %s\n",edge.getFirst().getName(),edge.getSecond().getName());
            }

        }
    }
}