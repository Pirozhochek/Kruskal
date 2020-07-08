package Graph;

import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Node {
    private String name;
    private boolean visited;
    private Color color = new Color(255, 255, 255);
    private int x;
    private int y;

    Integer unionIndex = null;

    public Node(){
        name = null;
        visited = false;
    }

    public Node(String name){
        this.name = name;
        visited = false;
    }
    public Node(int first, int second){
        name = null;
        this.x = first;
        this.y = second;
        visited = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }


    public Integer getUnionIndex() {
        return unionIndex;
    }

    public void setUnionIndex(Integer unionIndex) {
        this.unionIndex = unionIndex;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(name, node.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
