public class Node <Type> {
    private Node <Type> next, previous;
    private Queue <Node> children;
    private Type information;

    public Node(Type information){
        this.next = null;
        this.previous = null;
        this.information = information;
    }

    public Node(){
        this.next = null;
        this.previous = null;
        this.information = null;
    }

    public void setNextNode(Node <Type> node){
        this.next = node;
    }    
    public Node <Type> getNextNode(){
        return this.next;
    }

    public void setPreviousNode(Node <Type> node){
        this.previous = node;
    }
    public Node <Type> getPreviousNode(){
        return this.previous;
    }

    public Type getInformation(){
        return this.information;
    }

    public void setInformation(Type information){
        this.information = information;
    }

    public void addChild(Node node){
        /* Todavía no está */
    }
    public void removeChild(Type information){
        /* Todavía no está */
    }

    public void printInfo(){
        System.out.println(this.information);
    }

    public String toString(){
        return String.valueOf(this.information);
    }
}