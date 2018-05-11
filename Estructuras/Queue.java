public class Queue <Type> {
    private int size;
    private Node <Type> node; 

    public Queue(){
        this.size = 0;
        this.node = null;
    }
/*
    public static void main(String [] args){
        Queue <Integer> q = new Queue <Integer> ();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
       
        q.printYou();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.printYou();
    }
*/
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
    
    public Type front(){
        return this.node.getInformation();
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

    public void printYou(){
        Node <Type> aux = this.node;
        while(aux != null){
            aux.printInfo();
            aux = aux.getPreviousNode();
        }
    }

}