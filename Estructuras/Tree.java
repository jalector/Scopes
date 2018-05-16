public class Tree <Type> {
    private Node <Type> root;
    private int size;
    private Node <Type> currentNode;

    public Tree(Type name){
        this.root = new Node <Type> (name);
        this.size = 0;
        currentNode = this.root;
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

    public Node <Type> parent(Node Type){
        return null;
    }

    public List <Type> children(Node Type){
        return null;
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

    public void print(Node <Type> subtree, String space){
        System.out.println(space+subtree);
        if(subtree.hasChildren()){
            List <Type> l = subtree.getChildren();
            for(int i = 0, e = l.size(); i < e; i++){
                print(l.getChild(i),space+space);
            }
        }
    }

    public static void main(String [] args){
        Tree <String> t = new Tree <String> ("Caos");
        
        t.addChildTo(t.getRoot(), "Caos", "Gea");
        t.addChildTo(t.getRoot(), "Caos", "Cronos");
        t.print(t.getRoot(), " ");
    }
}