package Estructuras;

public class Tree <Type> {
    private Node <Type> root;
    public Node <Type> currentNode;
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

    public Node <Type> addChildCN(Type information){
        Node <Type> answer = new Node <Type> (information);
        this.currentNode.addChild(answer);
        return answer;
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

    public Node <Type>  addChildTo(Node <Type> subtree, Type node, Type information){
        Node <Type> done = null;
        if(subtree.getInformation() == node){
            done = new Node <Type> (information);
            subtree.addChild(done);
        }else if (subtree.hasChildren()){
            List <Type> l = subtree.getChildren();
            for(int i = 0, e = l.size(); i < e; i++){
                Node <Type> child = l.getChild(i);
                done = this.addChildTo(child, node, information);
                if(done != null) break;
            }
        }
        this.size++;
        return done;
    }

    public Node <Type> getParent(Node <Type> subtree, Type information){
       return null;
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
                print(l.getChild(i),space+"│"+"      ");
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
    
     /* metodo para buscar por identificador y obtener ese nodo */
    public Node <Type> getNodeByLexema(Node <Value> son, String lexema){
        List <Type> l= getRoot().getChildren();
        Node <Type> auxNode= null;  
        Value auxValue= null;           //para almacenar el conjunto del objeto "Value"
        for(int i=0; i< l.size(); i++){
            auxNode= l.getChild(i);
            auxValue= (Value) auxNode.getInformation();
            if(lexema.equalsIgnoreCase(auxValue.getLexema())){
                return auxNode;
            }
        }
        return null;
    }

    public Node <Type> getParentOfParents(Node <Type> son, String information){
        Node <Type> answer = null, aux = son;
       do{
            Value v = (Value) aux.getInformation();
            if(information.equalsIgnoreCase(v.getLexema())){
                answer = aux; break;
            }
            aux = aux.getNextNode();
        } while(aux != null);
        if(answer == null){
            if(son.getParentNode() != null){
                answer = getParentOfParents(son.getParentNode(), information);
            }
        }
        return answer;
    }

    public static void main(String [] args){
        Tree <String> t = new Tree <String> ("Caos");

        t.addChildCN("Nix");
        t.addChildCN("Érebo");
        t.currentNode = t.addChildCN("Gea");
        t.addChildCN("Temis");
        t.currentNode = t.addChildCN("Cronos");
        t.addChildCN("Hestia");
        t.addChildCN("Poseidon");
        t.currentNode = t.addChildCN("Zeus");
        t.addChildCN("Hefesto");
        t.addChildCN("Hebe");
        t.addChildCN("Ares");
        t.addChildCN("Apolo");
        t.addChildCN("Atenea");        
        t.addChildCN("Persefone");        
        t.currentNode = t.currentNode.getParentNode();
        t.addChildCN("Hades");
        t.addChildCN("Deméter");
        t.currentNode = t.currentNode.getParentNode();
        t.addChildCN("Rea");
        t.addChildCN("Febe");
        t.addChildCN("Tía");
        t.currentNode = t.currentNode.getParentNode();        
        t.currentNode = t.addChildCN("Urano");
        t.addChildCN("Erinias");
        t.addChildCN("Merlina");
        t.currentNode = t.addChildCN("Afrodita");
        t.addChildCN("Eros");
        t.currentNode = t.currentNode.getParentNode().getParentNode();
        t.addChildCN("Hémera");
        t.addChildCN("Éter");
        t.print(t.getRoot());
        System.out.println(t.getParentOfParents(t.getChild(t.getRoot(),"Hémera"), "Nix"));
        
    }
    
}

/*
    > Buscamos un padre lejano.
    > Tenemos un hijo.
        > obtenemos su padre directo.
        > (1)Nos moviemos a la derecha haste que se null.
            > Nos saltamos las funciones, sólo variables.
        > Tenemos el primer nodo.
        > Es Root()
            Sí:     > Buscamos desde el primer hijo hasta al ultimo
                    > Nos saltamos todas las funciones
            No:     > Regresamos a la etiqueta (1)

    searchParent(Node <Type> node, Type information){
        Node <Type> parent = node.getParent();
        Node <Type> answer = null;
        while(true){
            if(parent.getInformation() == information){

            }else{
                if(parent.getNextNode() != null)
                    parent = parent.getNextNode();
                else 
                    break;
            }
        }
    }  
*/