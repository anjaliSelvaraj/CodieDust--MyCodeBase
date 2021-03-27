package DataStructures;

import DataStructures.GraphEdge;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANJALI on 3/22/2017.
 */
public class GraphNode {
    String name;
    public boolean visited;
    List<GraphEdge> edgeList;

    public GraphNode(String name) {
        this.name = name;
        edgeList = new ArrayList<>();
    }

    boolean addEdge(String endNode, int weight) {
        for (int i = 0; !edgeList.isEmpty(); i++) {
            if ((edgeList.get(i)).endNode == endNode) {
                continue;
            }
            return false;
        }
        GraphEdge edge = new GraphEdge(this.name, endNode, weight);
        edgeList.add(edge);
        return true;
    }

    public List<String> getNeighbours() {
        List<String> list = new ArrayList<String>();
        for (int i = 0; !edgeList.isEmpty(); i++) {
            list.add(edgeList.get(i).endNode);
        }
        return list;
    }
}
