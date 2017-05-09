import com.yworks.yfiles.geometry.PointD;
import com.yworks.yfiles.geometry.RectD;
import com.yworks.yfiles.graph.*;
import com.yworks.yfiles.graph.portlocationmodels.FreeNodePortLocationModel;
import com.yworks.yfiles.view.GraphControl;

public class HelloWorldController {

    public GraphControl graphControl;

    public void initialize() {

        IGraph graph = graphControl.getGraph();

        INode node1 = graph.createNode(new RectD(0, 0, 30, 30));
        INode node2 = graph.createNode(new RectD(100, 0, 30, 30));
        INode node3 = graph.createNode(new RectD(300, 300, 60, 30));

        IEdge edge1 = graph.createEdge(node1, node2);
        IEdge edge2 = graph.createEdge(node2, node3);

        IBend bend1 = graph.addBend(edge2, new PointD(330, 15));

        IPort portAtNode1 = graph.addPort(node1);
        IPort portAtNode3 = graph.addPort(node3, FreeNodePortLocationModel.NODE_LEFT_ANCHORED);
        IEdge edgeAtPorts = graph.createEdge(portAtNode1, portAtNode3);

        ILabel ln1 = graph.addLabel(node1, "n1");
        ILabel ln2 = graph.addLabel(node2, "n2");
        ILabel ln3 = graph.addLabel(node3, "n3");
        ILabel le3 = graph.addLabel(edgeAtPorts, "Edge at Ports");
    }

    public void onLoaded() {
        graphControl.fitGraphBounds();
    }
}