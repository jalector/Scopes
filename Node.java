public class Node <Type> {
    private Node <Type> next, previous;
    private Queue <Node> children;
    private Type information;

    public Node(Type information){
        this.next = null;
        this.previous = null;
        this.information = information;
        this.children = new Queue <Node> ();
    }

    public Node(){
        this.next = null;
        this.previous = null;
        this.information = null;
        this.children = new Queue <Node> ();
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

    public void addChild(Type information){
        this.children.enqueue(new Node <Type> (information));
    }
    
    public void addChild(Node <Type> child){
        this.children.enqueue(child);
    }

    public void removeChild(Type information){
        /* Todavía no está */
    }

    public int howManyChildren(){
        return this.children.size();
    }

    public Queue <Node> getChildren(){
        return this.children;
    }

    public void setChildren(Queue <Node> children){
        this.children = children;
    }

    public void printInfo(){
        System.out.println(this.information +", "+(this.information.getClass().getName()));
        if(this.information instanceof String || this.information instanceof Node){           
            if(!this.children.isEmpty()){
                this.children.printYou();
            }
        }
    }

    public String toString(){
        return String.valueOf(this.information);
    }

    public void printYouAndYourChildren(){
        this.printInfo();
    }

    public static void main(String [] args){
        Node <String> root = new Node <String> ("Caos");
            Node <String> urano     = new Node <String> ("Urano");
                urano.addChild("Erinias");
                urano.addChild("Meliades");
                Node <String> afrodita = new Node <String> ("Afrodita");
                    afrodita.addChild("Eros");
                urano.addChild(afrodita);
                
                

        root.addChild(urano);
        
        root.printInfo();
    }
}