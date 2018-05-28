package Estructuras;

public class Node <Type> {
    private Node <Type> next, previous, parent;
    private Type information;
    private List <Type> children;

    public Node(Type information){
        this.next = null;
        this.previous = null;
        this.parent = null;
        this.information = information;
        this.children = new List <Type> ();
    }

    public Node(){
        this.next = null;
        this.previous = null;
        this.parent = null;
        this.information = null;
        this.information = information;
        this.children = new List <Type> ();
        
    }
    
    /* Method's node */
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

    public void setParentNode(Node <Type> node){
        this.parent = node;
    }
    public Node <Type> getParentNode(){
        return this.parent;
    }

    public Type getInformation(){
        return this.information;
    }

    public void setInformation(Type information){
        this.information = information;
    }

    public String toString(){
        return String.valueOf(this.information);
    }

    public List <Type> getChildren(){
        return this.children;
    }

    public void setChildren(List <Type> children){
        this.children = children;
    }

    public void addChild(Node <Type> node){
        node.setParentNode(this);
        this.children.addLast(node);
    }

    public boolean hasChildren(){
        return !(this.children.size() == 0);
    }

    public int howManyChildren(){
        return this.children.size();
    }

}