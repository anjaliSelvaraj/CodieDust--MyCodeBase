package Algos.Graphs;

/**
 * Created by ANJALI on 3/22/2017.
 */
public class GraphEdge {
    GraphEdge(){

    }
   public   String startNode ;
    public String endNode;
  public     int weight;

    GraphEdge(String startNode, String endNode, int weight){
        this.startNode=startNode;
        this.endNode=endNode;
        this.weight=weight;
    }
}
