package Graph;

import java.util.Comparator;
import java.util.Objects;

public class Edge {
    private Node first;
    private Node second;
    private Integer weight;

    public Edge(){
        first = null;

        second = null;

        weight = null;
    }

    public Edge(Node first, Node second, Integer weight){
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    public void setSecond(Node second) {
        this.second = second;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getSecond() {
        return second;
    }

    public Node getFirst() {
        return first;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    static public class EdgeComparator implements Comparator<Edge> {

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.getWeight() - o2.getWeight();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return Objects.equals(first, edge.first) &&
                Objects.equals(second, edge.second) &&
                Objects.equals(weight, edge.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, weight);
    }
}
