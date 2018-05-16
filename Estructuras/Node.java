public class Node <Type> {
    private Node <Type> next, previous;
    private Queue <Type> children;
    private Type information;

    public Node(Type information){
        this.next = null;
        this.previous = null;
        this.information = information;
        this.children = new Queue <Type> ();
    }

    public Node(){
        this.next = null;
        this.previous = null;
        this.information = null;
        this.children = new Queue <Type> ();
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

    public Type getInformation(){
        return this.information;
    }

    public void setInformation(Type information){
        this.information = information;
    }

    public String toString(){
        return String.valueOf(this.information);
    }

    /* To Print */    
    public void printNode(String str){
        System.out.println(str+"├─"+this.information);
        if(!this.children.isEmpty()){
            this.children.printQueue(str+"│"+"  ");
        }
    }
    public void printRoot(){
        System.out.println(this.information);
        if(!this.children.isEmpty()){
            this.children.printQueue(" ");
        }
    }
    public void printNode(){
        System.out.println(this.information);
        if(!this.children.isEmpty()){
            this.children.printQueue();
        }
    }

    /* Method's children */

    public Queue <Type> getChildren(){
        return this.children;
    }

    public void setChildren(Queue <Type> children){
        this.children = children;
    }

    public void addChild(Type child){
        this.children.enqueue(child);
    }
    
    public void removeChild(Type child){
        /* Todavía no está */
    }

    public boolean hasChildren(){
        return !this.children.isEmpty();
    }

    public void setChildTo(Type node, Type information){
        Node <Type> aux = this.children.getNode(node);
        if(aux != null){
            aux.addChild(information);
        }
    }

    public int howManyChildren(){
        return this.children.size();
    }

    public static void main(String [] args){
        Node <String> root = new Node <String> ("Caos");       
        root.addChild("Nix");
        root.addChild("Érebo");
        root.addChild("Gea");
        root.setChildTo("Gea", "Temis");
        root.setChildTo("Gea", "Cronos");
        root.setChildTo("Cronos", "Hestia");
        root.setChildTo("Cronos", "Poseidon");
        root.setChildTo("Cronos", "Zeus");
        root.setChildTo("Zeus", "Hefesto");
        root.setChildTo("Zeus", "Hebe");
        root.setChildTo("Zeus", "Ares");
        root.setChildTo("Zeus", "Apolo");
        root.setChildTo("Zeus", "Atenea");
        root.setChildTo("Zeus", "Persefone");
        root.setChildTo("Cronos", "Hades");
        root.setChildTo("Cronos", "Deméter");
        root.setChildTo("Gea", "Rea");
        root.setChildTo("Gea", "Febe");
        root.setChildTo("Gea", "Tía");
        root.addChild("Urano");
        root.setChildTo("Urano", "Erinias");
        root.setChildTo("Urano", "Merlina");
        root.setChildTo("Urano", "Afrodita");
        root.setChildTo("Afrodita", "Eros");
        root.addChild("Éter");
        root.addChild("Hémera");        

        root.printRoot();
    }

}