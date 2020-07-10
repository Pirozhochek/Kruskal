package GUI;

import Graph.Node;

public class NodeFactory extends NodeFactoryInterface {

    @Override
    public Node getNode(){
        return new Node(String.valueOf(name++));
    }

    @Override
    public Node getNode(String name){
        return new Node(name);
    }
}
