public class Tree <Type> {
    private Node <Type> root;
    private Node <Type> currentNode;
    private int size;

    public Tree(Type name){
        this.root = new Node <Type> (name);
        this.size = 0;
        this.currentNode = this.root;
    }

    public Node <Type> getRoot(){
        return this.root;
    }

    public boolean isRoot(Node <Type> node){
        return (node == this.root);
    }

    public Node <Type> getChild(Node <Type> subtree, Type information){
        Node <Type> answer = null;
            if(subtree.getInformation() == information){
                answer = subtree;
            }else if (subtree.hasChildren()){
                List <Type> l = subtree.getChildren();
                for(int i = 0, e = l.size(); i < e; i++){
                    Node <Type> child = l.getChild(i);
                    answer = this.getChild(child, information);
                    if(answer != null) break;
                }
            }
        return answer;
    }

    public boolean addChildTo(Node <Type> subtree, Type node, Type information){
        boolean done = false;
        if(subtree.getInformation() == node){
            subtree.getChildren().addLast(information);
            done = true;
        }else if (subtree.hasChildren()){
            List <Type> l = subtree.getChildren();
            for(int i = 0, e = l.size(); i < e; i++){
                Node <Type> child = l.getChild(i);
                done = this.addChildTo(child, node, information);
                if(done) break;
            }
        }
        return done;
    }

    public Node <Type> get Parent(<Type> subtree, Type information){
        Node <Type> aux = null,
                    answer = null;
            if(subtree.getInformation() == information){
                aux = subtree;
            }else if (subtree.hasChildren()){
                List <Type> l = subtree.getChildren();
                for(int i = 0, e = l.size(); i < e; i++){
                    Node <Type> child = l.getChild(i);
                    aux = this.getParent(child, information);
                    if(aux != null) break;
                }
                if(aux != null)answer = subtree 
            }
        return answer;
        
    }

    public List <Type> children(Node <Type> node){
        return node.getChildren();
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public boolean isInternal(Node <Type> node){
        return node.hasChildren();
    }

    public boolean isExternal(Node <Type> node){
        return !node.hasChildren();
    }
    
    private void print(Node <Type> subtree, String space){
        System.out.println(space+"├─"+subtree);
        if(subtree.hasChildren()){
            List <Type> l = subtree.getChildren();
            for(int i = 0, e = l.size(); i < e; i++){
                print(l.getChild(i),space+"│"+"  ");
            }
        }
    }
    public void print(Node <Type> subtree){
        System.out.println(subtree);
        if(subtree.hasChildren()){
            List <Type> l = subtree.getChildren();
            for(int i = 0, e = l.size(); i < e; i++){
                print(l.getChild(i), "  ");
            }
        }
    }

    public static void main(String [] args){
        Tree <String> t = new Tree <String> ("Caos");

        t.addChildTo(t.getRoot(), "Caos", "Nix");
        t.addChildTo(t.getRoot(), "Caos", "Érebo");
        t.addChildTo(t.getRoot(), "Caos", "Gea");

        t.addChildTo(t.getRoot(), "Gea", "Temis");
        t.addChildTo(t.getRoot(), "Gea", "Cronos");
        t.addChildTo(t.getRoot(), "Cronos", "Hestia");
        t.addChildTo(t.getRoot(), "Cronos", "Poseidon");
        t.addChildTo(t.getRoot(), "Cronos", "Zeus");
        t.addChildTo(t.getRoot(), "Zeus", "Hefesto");
        t.addChildTo(t.getRoot(), "Zeus", "Hebe");
        t.addChildTo(t.getRoot(), "Zeus", "Ares");
        t.addChildTo(t.getRoot(), "Zeus", "Apolo");
        t.addChildTo(t.getRoot(), "Zeus", "Atenea");
        t.addChildTo(t.getRoot(), "Zeus", "Persefone");
        t.addChildTo(t.getRoot(), "Cronos", "Hades");
        t.addChildTo(t.getRoot(), "Cronos", "Deméter");
        t.addChildTo(t.getRoot(), "Gea", "Rea");
        t.addChildTo(t.getRoot(), "Gea", "Febe");
        t.addChildTo(t.getRoot(), "Gea", "Tía");
        t.addChildTo(t.getRoot(), "Caos", "Urano");
        t.addChildTo(t.getRoot(), "Urano", "Erinias");
        t.addChildTo(t.getRoot(), "Urano", "Merlina");
        t.addChildTo(t.getRoot(), "Urano", "Afrodita");
        t.addChildTo(t.getRoot(), "Afrodita", "Eros");
        t.addChildTo(t.getRoot(), "Caos", "Hémera");
        t.addChildTo(t.getRoot(), "Caos", "Éter");
        t.print(t.getRoot());
    }
}