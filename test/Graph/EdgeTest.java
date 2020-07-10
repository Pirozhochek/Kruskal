package Graph;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import  java.util.Random;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EdgeTest {
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
    @RepeatedTest(7)
            public void TestW (){

                Node A = new Node("A");
                Node B = new Node("B");
                Node C = new Node("C");
                Node D = new Node("D");
                Node E = new Node("E");
                Node F = new Node("F");
                Edge first = new Edge(A, B, 3);
                Edge second = new Edge(B, C, 11);
                Edge third = new Edge(A, D, 5);
                Edge four = new Edge(A, C, 10);
                Edge five = new Edge(C, D, 10);
                Edge six = new Edge(B, E, 12);
                Edge seven = new Edge(E, F, 7);
                Edge eight = new Edge(F, D, 9);

                Edge[] test = new Edge[8];
                test[0] = first;
                test[1] = second;
                test[2] = third;
                test[3] = four;
                test[4] = five;
                test[5] = six;
                test[6] = seven;
                test[7] = eight;


                Random random = new Random();
                int order = random.nextInt(8);
                System.out.println(order);
                int result = test[order].getWeight();
                assertEquals(test[order].weight, result);

    }
    @RepeatedTest(7)
    public void TestN1(){
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Edge first = new Edge(A, B, 3);
        Edge second = new Edge(B, C, 11);
        Edge third = new Edge(A, D, 5);
        Edge four = new Edge(A, C, 10);
        Edge five = new Edge(C, D, 10);
        Edge six = new Edge(B, E, 12);
        Edge seven = new Edge(E, F, 7);
        Edge eight = new Edge(F, D, 9);

        Edge[] test = new Edge[8];
        test[0] = first;
        test[1] = second;
        test[2] = third;
        test[3] = four;
        test[4] = five;
        test[5] = six;
        test[6] = seven;
        test[7] = eight;


        Random random = new Random();
        int order = random.nextInt(8);
        System.out.println(order);
        Node res = new Node();
        res = test[order].getSecond();
        String res_ = new String();
        res_ = res.name;
        String right = new String();
        right = test[order].second.name;
        assertEquals(res_, right);
    }
    @RepeatedTest(7)
    public void TestN2(){
        Node A = new Node("A");
        Node B = new Node("B");
        Node C = new Node("C");
        Node D = new Node("D");
        Node E = new Node("E");
        Node F = new Node("F");
        Edge first = new Edge(A, B, 3);
        Edge second = new Edge(B, C, 11);
        Edge third = new Edge(A, D, 5);
        Edge four = new Edge(A, C, 10);
        Edge five = new Edge(C, D, 10);
        Edge six = new Edge(B, E, 12);
        Edge seven = new Edge(E, F, 7);
        Edge eight = new Edge(F, D, 9);

        Edge[] test = new Edge[8];
        test[0] = first;
        test[1] = second;
        test[2] = third;
        test[3] = four;
        test[4] = five;
        test[5] = six;
        test[6] = seven;
        test[7] = eight;


        Random random = new Random();
        int order = random.nextInt(8);
        System.out.println(order);
        Node res2 = new Node();
        res2 = test[order].getFirst();

        assertEquals(test[order].first.getName(), res2.name);
    }

}