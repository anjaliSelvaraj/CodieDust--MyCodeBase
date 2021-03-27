package DataStructures;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * Created by ANJALI on 3/22/2017.
 */
public class Graph {
    boolean hasCycle = true;

    public String startNode;

    public String getStartNode() {
        return this.startNode;
    }

    public HashMap<String, GraphNode> Nodes;

    public Graph() {
        this.startNode = "";
        Nodes = new HashMap<>();
        Initialize();
    }


    private void Initialize() {

        GraphNode nodeA = new GraphNode("A");
        GraphNode nodeB = new GraphNode("B");
        GraphNode nodeC = new GraphNode("C");
        GraphNode nodeD = new GraphNode("D");
        GraphNode nodeE = new GraphNode("E");
        GraphNode nodeF = new GraphNode("F");
        GraphNode nodeG = new GraphNode("G");

        nodeA.addEdge("B", 1);

        nodeB.addEdge("C", 1);
        nodeB.addEdge("D", 1);
        nodeB.addEdge("E", 1);

        nodeC.addEdge("E", 1);

        nodeD.addEdge("E", 1);

        nodeE.addEdge("F", 1);

        nodeG.addEdge("D", 1);


        Nodes.put("A", nodeA);
        Nodes.put("B", nodeB);
        Nodes.put("C", nodeC);
        Nodes.put("D", nodeD);
        Nodes.put("E", nodeE);
        Nodes.put("F", nodeF);
        Nodes.put("G", nodeG);


    }

    public boolean setStartNode(String nodeName) {

        if (Nodes.containsKey(nodeName)) {
            startNode = nodeName;
            return true;

        }
        return false;
    }

    public boolean addNode(GraphNode node) {

        if (Nodes.containsKey(node.name))
            return false;

        Nodes.put(node.name, node);
        return true;
    }

    public void resetVisited() {
        for (Map.Entry n : Nodes.entrySet()) {


        }

    }


    public void DepthFirst(String startNode) {

        setStartNode(startNode);
        resetVisited();

        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(null);
        stack.push(Nodes.get(startNode));

        while (!stack.isEmpty()) {
            GraphNode node = stack.pop();
            if (node != null) {
                if (node.visited != true) {

                    node.visited = true;
                } else {

                    hasCycle = false;
                    break;
                }


                List<String> neighbours = node.getNeighbours();
                for (int i = 0; !neighbours.isEmpty(); i++) {
                    stack.push(Nodes.get(neighbours.get(i)));
                }

            } else {
                if (stack.isEmpty())
                    break;
                else
                    stack.push(null);

            }

        }

    }


}
