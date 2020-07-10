package GUI;

import Graph.Node;

public abstract class NodeFactoryInterface {
    protected char name = 'a';

    public abstract Node getNode();
    public abstract Node getNode(String name);
}
