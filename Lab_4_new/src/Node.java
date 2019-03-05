
public class Node <Word, Occurences extends Comparable<Occurences>>implements Comparable<Node> {

    Word word;
    Occurences occurences;
    
    public Node(Word task , Occurences priority){
        this.word = task;
        this.occurences = priority ;              
    }
     
    @Override
    public int compareTo(Node compareNode){
        if (this.occurences.getClass().equals(compareNode.occurences.getClass()))
            return this.occurences.compareTo((Occurences) compareNode.occurences);
        return -255;
    }
}
