public class Value {
    public static final int ACCESS_FRIENDLY = 0;
    public static final int ACCESS_PUBLIC = 1;
    public static final int ACCESS_PRIVATE = 2;
    public static final int ACCESS_PROTECTED = 3;

    public static final int TYPE_VOID = 0;
    public static final int TYPE_STRING = 2;
    public static final int TYPE_BYTE = 3;
    public static final int TYPE_SHORT = 4;
    public static final int TYPE_LONG = 5;    
    public static final int TYPE_INT = 6;
    public static final int TYPE_FLOAT = 7;
    public static final int TYPE_DOUBLE = 8;
    public static final int TYPE_OTHER = 9;
    
    private int accessMode;
    private int type;
    private String lexema;
    private Object value;
    private int returnValue;

    public Value(int accessMode, int type, String lexema, Object value, int returnValue){
        this.accessMode = accessMode;
        this.type = type;
        this.lexema = lexema;
        this.value = value;
        this.returnValue = returnValue;
    }

    public void setAccessmode (int accessMode){
        this.accessMode = accessMode;
    }
    public void setType (int type){
        this.type = type;
    }
    public void setLexema (String lexema){
        this.lexema = lexema;
    }
    public void setValue(Object value){
        this.value = value;
    }
    public void setReturnValue(int returnValue){
        this.returnValue = returnValue;
    }

    public int getaccessMode(){
        return this.accessMode;
    }
    public int getType(){
        return this.type;
    }
    public String getLexema(){
        return this.lexema;
    }
    public Object getValue(){
        return this.value;
    }
    public int getReturnValue(){
        return this.returnValue;
    }

    public String toString(){
        //return "{M. accesso: "+this.accessMode+", Tipo: "+this.type+", Lexema: "+this.lex+", Value: "+this.value+", Return: "+this.returnValue+"}";
        return "{"+this.accessMode+", "+this.type+", "+this.lexema+", "+this.value+", "+this.returnValue+"}";
    }


}