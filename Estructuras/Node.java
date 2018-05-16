public class Node <Type> {
    private Node <Type> next, previous;
    private Type information;
    private List <Type> children;

    public Node(Type information){
        this.next = null;
        this.previous = null;
        this.information = information;
        this.children = new List <Type> ();
    }

    public Node(){
        this.next = null;
        this.previous = null;
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

<<<<<<< HEAD
    public void setChildren(Queue <Type> children){
        this.children = children;
    }

    public void addChild(Type child){
        this.children.enqueue(child);
    }
    
    public void removeChild(Type child){
        /* Todavía no está */
=======
    public void setChildren(List <Type> children){
        this.children = children;
>>>>>>> d17d2a48d50a9df7280c26e139d4a879b7070bc6
    }

    public boolean hasChildren(){
        return !(this.children.size() == 0);
    }

<<<<<<< HEAD
    public int howManyChildren(){
        return this.children.size();
    }

=======
  
/*
>>>>>>> d17d2a48d50a9df7280c26e139d4a879b7070bc6
    public static void main(String [] args){
        Node <String> root = new Node <String> ("Caos");       
        root.addChild("Nix");
        root.addChild("Érebo");
        root.addChild("Gea");
        root.setChildTo(, "Temis");
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
<<<<<<< HEAD

=======
    
      To Print   
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

    public void setChildTo(Node <Type> node, Type information){
        Node <Type> aux = this.children.getNode(node);
        if(aux != null){
            aux.addChild(information);
        }
    }
*/
>>>>>>> d17d2a48d50a9df7280c26e139d4a879b7070bc6
}