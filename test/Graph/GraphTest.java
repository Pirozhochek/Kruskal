package Graph;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }
    @RepeatedTest(5)
    public void ListT (){
        Random random = new Random();
        ArrayList<Node> nodes = new ArrayList<Node>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        nodes.add(new Node("0"));
        nodes.add(new Node("1"));
        nodes.add(new Node("2"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));

        edges.add(new Edge(new Node("0"), new Node("1"), 5));
        edges.add(new Edge(new Node("0"), new Node("2"), 3));
        edges.add(new Edge(new Node("2"), new Node("1"), 1));
        edges.add(new Edge(new Node("0"), new Node("3"), 7));
        edges.add(new Edge(new Node("2"), new Node("3"), 8));
        edges.add(new Edge(new Node("1"), new Node("3"), 5));
        edges.add(new Edge(new Node("1"), new Node("4"), 1));
        edges.add(new Edge(new Node("4"), new Node("3"), 3));

        Graph test = new Graph(edges, nodes);
        ArrayList<Node> edgesAdj = new ArrayList<Node>();
        int order = random.nextInt(nodes.size());
        Node[] arr = nodes.toArray(new Node[nodes.size()]);
        Node find = arr[order];
        for (Edge edge : edges){
            if (edge.getFirst() == find) {
                edgesAdj.add(edge.getSecond());
            }

            if  (edge.getSecond() == find) {
                edgesAdj.add(edge.getFirst());
            }
        }
        assertEquals(test.adjacentNodes(find), edgesAdj);
        assertEquals(test.getEdgeList(), edges);
        assertEquals(test.getNodeList(), nodes);

    }
    @RepeatedTest(6)
    public void Test2(){
        ArrayList<Node> nodes = new ArrayList<Node>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        nodes.add(new Node("1"));
        nodes.add(new Node("2"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));
        nodes.add(new Node("5"));
        nodes.add(new Node("6"));

        edges.add(new Edge(new Node("1"), new Node("2"), 7));
        edges.add(new Edge(new Node("1"), new Node("3"), 9));
        edges.add(new Edge(new Node("2"), new Node("3"), 10));
        edges.add(new Edge(new Node("2"), new Node("4"), 15));
        edges.add(new Edge(new Node("1"), new Node("6"), 14));
        edges.add(new Edge(new Node("6"), new Node("5"), 9));
        edges.add(new Edge(new Node("5"), new Node("4"), 6));
        edges.add(new Edge(new Node("3"), new Node("4"), 3));

        Graph test = new Graph(edges, nodes);
        ArrayList<Node> edgesAdj = new ArrayList<Node>();
        Random random = new Random();
        int order = random.nextInt(nodes.size());
        Node[] arr = nodes.toArray(new Node[nodes.size()]);
        Node find = arr[order];
        for (Edge edge : edges){
            if (edge.getFirst() == find) {
                edgesAdj.add(edge.getSecond());
            }

            if  (edge.getSecond() == find) {
                edgesAdj.add(edge.getFirst());
            }
        }
        assertEquals(test.adjacentNodes(find), edgesAdj);
        assertEquals(test.getEdgeList(), edges);
        assertEquals(test.getNodeList(), nodes);
    }
    @Test
    public void Con1(){
            ArrayList<Node> nodes = new ArrayList<Node>();
            ArrayList<Edge> edges = new ArrayList<Edge>();
            nodes.add(new Node("1"));
            nodes.add(new Node("2"));
            nodes.add(new Node("3"));
            nodes.add(new Node("4"));
            nodes.add(new Node("5"));
            nodes.add(new Node("6"));

            edges.add(new Edge(new Node("1"), new Node("2"), 7));
            edges.add(new Edge(new Node("1"), new Node("3"), 9));
            edges.add(new Edge(new Node("2"), new Node("3"), 10));
            edges.add(new Edge(new Node("2"), new Node("4"), 15));
            edges.add(new Edge(new Node("1"), new Node("6"), 14));
            edges.add(new Edge(new Node("6"), new Node("5"), 9));
            edges.add(new Edge(new Node("5"), new Node("4"), 6));
            edges.add(new Edge(new Node("3"), new Node("4"), 3));

            Graph test = new Graph(edges, nodes);
            assertEquals(true, test.isConnected());

    }
    @Test
    public void Con2(){
        ArrayList<Node> nodes = new ArrayList<Node>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        nodes.add(new Node("1"));
        nodes.add(new Node("2"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));
        nodes.add(new Node("5"));
        nodes.add(new Node("6"));

        edges.add(new Edge(new Node("1"), new Node("2"), 7));
        edges.add(new Edge(new Node("1"), new Node("3"), 9));
        edges.add(new Edge(new Node("2"), new Node("3"), 10));
        edges.add(new Edge(new Node("2"), new Node("4"), 15));
        edges.add(new Edge(new Node("1"), new Node("6"), 14));
        //edges.add(new Edge(new Node("6"), new Node("5"), 9));
        //edges.add(new Edge(new Node("5"), new Node("4"), 6));
        edges.add(new Edge(new Node("3"), new Node("4"), 3));

        Graph test = new Graph(edges, nodes);
        assertEquals(false, test.isConnected());

    }
    @Test
    public void Con3(){
        ArrayList<Node> nodes = new ArrayList<Node>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        nodes.add(new Node("1"));
        nodes.add(new Node("2"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));
        nodes.add(new Node("5"));
        nodes.add(new Node("6"));

        edges.add(new Edge(new Node("1"), new Node("2"), 7));
        //edges.add(new Edge(new Node("1"), new Node("3"), 9));
        //edges.add(new Edge(new Node("2"), new Node("3"), 10));
        //edges.add(new Edge(new Node("2"), new Node("4"), 15));
        //edges.add(new Edge(new Node("1"), new Node("6"), 14));
        edges.add(new Edge(new Node("6"), new Node("5"), 9));
        edges.add(new Edge(new Node("5"), new Node("4"), 6));
        edges.add(new Edge(new Node("3"), new Node("4"), 3));

        Graph test = new Graph(edges, nodes);
        assertEquals(false, test.isConnected());

    }
    @Test
    public void Con4(){
        ArrayList<Node> nodes = new ArrayList<Node>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        nodes.add(new Node("0"));
        nodes.add(new Node("1"));
        nodes.add(new Node("2"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));

        edges.add(new Edge(new Node("0"), new Node("1"), 5));
        //edges.add(new Edge(new Node("0"), new Node("2"), 3));
        //edges.add(new Edge(new Node("2"), new Node("1"), 1));
        //edges.add(new Edge(new Node("0"), new Node("3"), 7));
        edges.add(new Edge(new Node("2"), new Node("3"), 8));
        //edges.add(new Edge(new Node("1"), new Node("3"), 5));
        edges.add(new Edge(new Node("1"), new Node("4"), 1));
        //edges.add(new Edge(new Node("4"), new Node("3"), 3));


        Graph test = new Graph(edges, nodes);
        assertEquals(false, test.isConnected());

    }
    @Test
    public void Con5(){
        ArrayList<Node> nodes = new ArrayList<Node>();
        ArrayList<Edge> edges = new ArrayList<Edge>();
        nodes.add(new Node("0"));
        nodes.add(new Node("1"));
        nodes.add(new Node("2"));
        nodes.add(new Node("3"));
        nodes.add(new Node("4"));

        edges.add(new Edge(new Node("0"), new Node("1"), 5));
        edges.add(new Edge(new Node("0"), new Node("2"), 3));
        edges.add(new Edge(new Node("2"), new Node("1"), 1));
        edges.add(new Edge(new Node("0"), new Node("3"), 7));
        edges.add(new Edge(new Node("2"), new Node("3"), 8));
        edges.add(new Edge(new Node("1"), new Node("3"), 5));
        edges.add(new Edge(new Node("1"), new Node("4"), 1));
        edges.add(new Edge(new Node("4"), new Node("3"), 3));


        Graph test = new Graph(edges);
        assertEquals(true, test.isConnected());

    }

}