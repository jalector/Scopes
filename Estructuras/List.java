package Estructuras;
public class List <Type> {
    private Node <Type> begin, end;
    private int size;

    public List(){
        this.begin = null;
        this.end  = null;
        this.size = 0;
    }

    public boolean add(int position, Type information){
        boolean done = false;
        if(position <= this.size && position >= 0){
            Node <Type> newNode = new Node <Type> (information);
            if(this.isEmpty()){ 
                this.begin = this.end = newNode;
            }else{
                int index = 0;                
                Node <Type> aux = this.begin;
                while(index < position){
                    aux = aux.getPreviousNode();
                    index++;
                }
                if(index == 0){
                    aux.setNextNode(newNode);
                    newNode.setPreviousNode(aux);
                    this.begin = newNode;
                }else if(index == this.size()){
                    this.end.setPreviousNode(newNode);
                    newNode.setNextNode(end);
                    this.end = newNode;
                }else{
                    aux.getNextNode().setPreviousNode(newNode);
                    newNode.setPreviousNode(aux);
                    newNode.setNextNode(aux.getNextNode());
                    aux.setNextNode(newNode);
                }
            }
            done = true;
            this.size++;
        }
        return done;
    }

    public void addFirst(Type information){
        Node <Type> newNode = new Node <Type>  (information);
        if(this.isEmpty()){
            this.begin = this.end = newNode;
        }else{
            this.begin.setNextNode(newNode);
            newNode.setPreviousNode(begin);
            this.begin = newNode;
        }
        this.size++;
    }

    public void addLast(Type information){
        Node <Type> newNode = new Node <Type> (information);
        if(this.isEmpty()){
            this.begin = this.end = newNode;
        }else{
            this.end.setPreviousNode(newNode);
            newNode.setNextNode(end);
            this.end = newNode;
        }
        this.size++;
    }

     public void addLast(Node <Type> newNode){
        if(this.isEmpty()){
            this.begin = this.end = newNode;
        }else{
            this.end.setPreviousNode(newNode);
            newNode.setNextNode(end);
            this.end = newNode;
        }
        this.size++;
    }


    public Type get(int position){
        Type answer = null;
        if(position >= 0 && position < this.size){
            int index = 0;
            Node <Type> aux = this.begin;
            while(index < position){
                aux = aux.getPreviousNode();
                index++;
            }
           answer = aux.getInformation();
        }
        return answer;
    } 

    public Node <Type> getLast(){
        return this.end;
    }

    public Node <Type> getFirst(){
        return this.begin;
    }

    public Node <Type> getChild(int position){
        Node <Type> answer = null;
        if(position >= 0 && position < this.size){
            int index = 0;
            Node <Type> aux = this.begin;
            while(index < position){
                aux = aux.getPreviousNode();
                index++;
            }
           answer = aux;
        }
        return answer;
    }

    public void set(int position, Type information){
        if(position >= 0 && position < this.size){
            int index = 0;
            Node <Type> aux = this.begin;
            while(index < position){
                aux = aux.getPreviousNode();
                index++;
            }
            aux.setInformation(information);
        }
    }


    public Type remove(int position){
        Type answer = null;
        if(position >= 0 && position < this.size){
            int index = 0;
            Node <Type> aux = this.begin;
            while(index < position){
                aux = aux.getPreviousNode();
                index++;
            }
            if(aux == this.begin){
                answer  = removeFist();
            }else if(aux == this.end){
                answer = removeLast();
            }else{
                answer = aux.getInformation();
                aux.getNextNode().setPreviousNode(aux.getPreviousNode());
                aux.getPreviousNode().setNextNode(aux.getNextNode());
                aux = null;
                this.size--;
            }
        }
        return answer;
    }

    public Type removeFist(){
        Type answer = null;
        if(!this.isEmpty()){
            answer = this.begin.getInformation();
            this.begin = this.begin.getPreviousNode();

            if(begin != null){
                this.begin.setNextNode(null);
            }else{
                this.begin = this.end = null;
            }

            this.size--;
        }
        return answer;
    }

    public Type removeLast(){
        Type answer = null;
        if(!this.isEmpty()){
            answer = this.end.getInformation();
            this.end = this.end.getNextNode();

            if(end == null){
                this.begin = this.end = null;
            }else{
                this.end.setPreviousNode(null);
            }
            this.size--;
        }
        return answer;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int size(){
        return this.size;
    }

    public void print(){
        Node <Type> node = this.begin;
        while(node != null){
            System.out.println(node);
            node = node.getPreviousNode();
        }
    }
    public String toString(){
        return "Lista("+this.size+"): {Begin: "+this.begin+", this.end: "+this.end+"}";
    }
}