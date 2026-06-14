import java.util.*;
class Edge {
    int destination;
    int weight;
    public Edge(int destination,int weight){
        this.destination = destination;
        this.weight = weight;
    }
}
class Graph {
    int vertices;
    ArrayList<List<Edge>> adjList;  
    public Graph(int vertices){
        this.vertices = vertices;
        adjList = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            adjList.add(new ArrayList<>());
        }
    }
    public void addEdges(int source,int destination,int weight,boolean direction){
        adjList.get(source).add(new Edge(destination,weight));
        if(!direction){
            adjList.get(destination).add(new Edge(source,weight));
        }
    }
    public void display(){
        for(int i=0;i<vertices;i++){
            char c = (char) (i+65);
            System.out.print(c+" ");
            List<Edge> edge = adjList.get(i);
            for(Edge k:edge){
                char d = (char) (k.destination+65);
                System.out.print(" "+d+" ->"+" ");
                System.out.print(k.weight);
            }
            System.out.println();
        }
    }
}
public class graph_implementation {
    public static void main(String[] args){
        Graph g = new Graph(5);
        g.addEdges(0,1,7,false);
        g.addEdges(0,4,1,false);
        g.addEdges(1,2,3,false);
        g.addEdges(1,4,8,false);
        g.addEdges(2,3,6,false);
        g.addEdges(2,4,1,false);
        g.addEdges(3,4,7,false);
        g.display();
    }
}