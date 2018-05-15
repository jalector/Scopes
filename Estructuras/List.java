public class List <Type> {
    private Node <Type> begin, end;
    private int size;

    public List(){
        this.begin = null;
        this.end  = null;
    }

    public boolean add(int position, Type information){
        boolean done = false;
        if(this.size >= position){
            Node <Type> newNode = new Node <Type> (information);
            if(this.size == 0){ 
                begin = end = newNode;
            }else{
                Node <Type> aux = begin;
                int p = 0;                
                while(p++ != position){
                    aux = aux.getNextNode();
                }
                if(p == 0){
                    aux.setNextNode(newNode);
                    newNode.setPreviousNode(aux);
                }else if(p == this.size){
                    aux.setPreviousNode(newNode);
                    newNode.setNextNode(aux);
                }else{
                    
                }
            }
            done = true;
            this.size++;
        }
        return done;
    }

    public Type get(int position){
        return null;
    }

    public void set(int position, Type information){
        
    }


    public Type remove(int position){

    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }
    
}