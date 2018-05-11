public class Tupla{
	private String id;
	private String type;
	private Object value;

	public Tupla(String id, Object value){
		this.id = id;
		this.value = value;
	}

	public Tupla(String type, String id, Object value){
		this.type = type;
		this.id = id;
		this.value = value;
	}

	public String getId(){
		return this.id;
	}

	public String getType(){
		return this.type;
	}

	public Object getValue(){
		return this.value;
	}

	public void setType(String tipo){
		this.type = type;
	}

	public void setValue(Object value){
		this.value = value;
	}

	@Override
	public String toString(){
		return ("{"+this.id +", \t\t"+this.value+"}");
	}

}