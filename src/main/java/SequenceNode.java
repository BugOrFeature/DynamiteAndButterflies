/**
 * Created by Lex on 25-4-17.
 */

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class Node2, which represents sequences of DNA. A sequence is a part of a genome.
 * The sequence is a String consisting of A, C T and G.
 */
public class SequenceNode {
    private int id;
    private String seq;
    private ArrayList<SequenceNode> adjecencyList;
    private ArrayList<Integer> ids;

    public SequenceNode(int id, String seq){
        this.id = id;
        this.seq = seq;
        this.adjecencyList = new ArrayList<SequenceNode>();
        this.ids = new ArrayList<Integer>();
    }

    public void addId(Integer id) {
        this.ids.add(id);
    }


    public ArrayList<SequenceNode> getChildren() {
        return this.adjecencyList;
    }

    public ArrayList<SequenceNode> returnChildren() {
        return this.getChildren();
    }

    public boolean hasChildren() {
        return getChildren().size() != 0;
    }
    public void addChild(SequenceNode child) {
        this.getChildren().add(child);
    }

    public Integer getId() {
        return id;
    }


    public String getSeq() {
        return seq;
    }

    public void setSeq(String seq) {
        this.seq = seq;
    }

    public String getSequence() {
        return this.seq;
    }

}
