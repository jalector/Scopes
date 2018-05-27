public class Value {
    public static final int FRIENDLY = 0;
    public static final int PUBLIC = 1;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 3;

    public static final int VOID = 0;
    public static final int STRING = 2;
    public static final int BYTE = 3;
    public static final int SHORT = 4;
    public static final int LONG = 5;    
    public static final int INT = 6;
    public static final int FLOAT = 7;
    public static final int DOUBLE = 8;
    public static final int BOOLEAN = 9;
    public static final int OTHER = 10;

    public static final int CLASS = 0;
    public static final int VARIABLE = 1;
    public static final int PARAM = 2;
    public static final int FUNCTION = 3;

    private int accessMode;
    private int type;
    private String lexema;
    private Object value;
    private int returnValue;

    //public - {var | fun | param} - nombre - valor -  {int | String | double| boolean | FLOAT | ..}
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

    public static int accessMode(String accessMode){
        switch(accessMode){
            case "":            return this.FRIENDLY;   break;
            case "public":      return this.PUBLIC;     break;
            case "private":     return this.PRIVATE;    break;
            case "protected":   return this.PROTECTED;  break;
        }
    }

    public static int type(Strin type){
        switch(type){
            case "var":     return this.VARIABLE;   break;
            case "fun":     return this.FUNCTION;   break;
            case "param":   return this.PARAM;      break;
            case "class":   return this.CLASS;      break;
        }
    }

    public static int return(Strin returnValue){
        switch(returnValue){
            case "void":        return this.VOID ;         break;
            case "String":      return this.STRING ;       break;
            case "byte":        return this.BYTE ;         break;
            case "short":       return this.SHORT ;        break;
            case "long":        return this.LONG ;         break;
            case "int":         return this.INT ;          break;
            case "float":       return this.FLOAT ;        break;
            case "double":      return this.DOUBLE ;       break;
            case "boolean":     return this.BOOLEAN ;      break;
            default:            return this.OTHER ;        break;
        }
    }

    public String toString(){
        //return "{M. accesso: "+this.accessMode+", Tipo: "+this.type+", Lexema: "+this.lex+", Value: "+this.value+", Return: "+this.returnValue+"}";
        return "{"+this.accessMode+", "+this.type+", "+this.lexema+", "+this.value+", "+this.returnValue+"}";
    }


}