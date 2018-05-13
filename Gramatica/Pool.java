/*
	Automátas II
	Juda Alector
	Daniel Davalos
	26 de Febrero del 2017	
*/
public class Pool{
	private Tupla [] pool;
	private int size; 
	/*
	public static void main(String [] args){
		Pool test = new Pool();

		test.addTupla("Nombre", "Juan");
		test.addTupla("Apellido", "Alberto");
		test.addTupla("Edad", 24);
		test.addTupla("Materia", "Automátas");
		test.addTupla("Ciudad", "León");
		test.addTupla("Estado", "Guanajuato");

		test.removeTupla("Apellido");
		test.removeTupla("Edad");
		test.removeTupla("Materia");
		test.removeTupla("Ciudad");

		test.addTupla("a", 1232);

		System.out.println(test.size);
		System.out.println(test.findTupla("Estado").getValue());

		test.printPool();
	}
	*/
	public Pool(){
		this.pool = new Tupla[1];
		this.size = 0;
	}

	public void addTupla(String id, Object value){
		Tupla aux = this.findTupla(id);
		if( aux == null){			
			if(size == pool.length){
				Tupla [] oldPool = this.pool;
				this.pool = new Tupla[this.size+1];
				System.arraycopy(oldPool, 0, this.pool, 0, this.size);
			}
			this.pool[this.size++] = new Tupla(id, value);
			//System.out.println("added{"+ id +", "+value+"}");
		}else{
			aux.setValue(value);
		}
	}//Vuelve a meter variables aunque ya esten.

	public void addTupla(String id, String type, Object value){
		Tupla aux = this.findTupla(id);
		if( aux == null){			
			if(size == pool.length){
				Tupla [] oldPool = this.pool;
				this.pool = new Tupla[this.size+1];
				System.arraycopy(oldPool, 0, this.pool, 0, this.size);
			}
			this.pool[this.size++] = new Tupla(type, id, value);
			//System.out.println("added{"+ id +", "+value+"}");
		}else{
			aux.setValue(value);
		}
	}//Vuelve a meter variables aunque ya esten.

	public boolean isCoherent(String type, Object value){
		boolean is = false;			
			if(type.equals("unboolean")){
				//System.out.println("Centinela unboolean("+value.getClass()+")");
				is = (value.toString().equals("true") || value.toString().equals("false")); 
			}else if(type.equals("unnumero")){
				//System.out.println("Centinela unnumero("+value.getClass()+")");
				is = (value.getClass() == Integer.class);
			}
			//System.out.println("Tipo: " + type +", Valor: "+ value+" , r= "+is);
		return is;
	}
	public boolean removeTupla(String id){
		boolean done = false;
		for(int i = 0; i < this.size; i++){
			if(this.pool[i].getId() == id){
				Tupla [] aux = this.pool;
				this.pool = new Tupla[size--];
				if(i == 0){
					System.arraycopy(aux, 1, this.pool, 0, size);
				}else if(i == size){
					System.arraycopy(aux, 0, this.pool, 0, size);
				}else{
					System.arraycopy(aux, 0, this.pool, 0, i);
					System.arraycopy(aux, i+1, this.pool, i, size-i);
				}
				done = true;
				break;
			}
		}
		return done;
	}
	public Tupla findTupla(String id){
		Tupla found = null;
		for(int i = 0; i < this.size; i++){
			if(this.pool[i].getId().equals(id)){
				found = this.pool[i];
				break;
			}
		}
		return found;
	}
	public void printPool(){
		for(int i = 0; i < this.size; i++){
			System.out.println(this.pool[i]);
		}	
	}
}
