package Estructuras;
public class Queue <Type> {
    private int size;
    private Node <Type> node; 

    public Queue(){
        this.size = 0;
        this.node = null;
    }

    public void enqueue(Type element){
        if(this.isEmpty()){
            this.node = new Node <Type> (element);
        }else{            
            Node <Type> n = new Node <Type> (element);
            Node <Type> aux = this.node;
            
            while(aux.getPreviousNode() != null){
                aux = aux.getPreviousNode(); 
            }
            n.setNextNode(aux);
            aux.setPreviousNode(n);
        }
        this.size++;
    }

    public Type dequeue(){
        Type answer = null;
            if(!this.isEmpty()){
                answer = this.node.getInformation();
                this.node = this.node.getPreviousNode();
                this.node.setNextNode(null);
                this.size--;
            }
        return answer;
    }
    
    public Node <Type> front(){
        return this.node;
    }

    
    public boolean isEmpty(){
        return this.node == null;
    }

    public void clear(){
        this.node = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public void printQueue(){
        Node <Type> aux = this.node;
        while(aux != null){
            System.out.println(aux);
            aux = aux.getPreviousNode();
        }
    }

}