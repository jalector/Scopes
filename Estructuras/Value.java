package Estructuras;
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
    public static final int IF = 4;
    public static final int ELSE = 5;

    private int accessMode;
    private int type;
    private String lexema;
    private Object value;
    private int returnValue;

    /*

        - int:      Modificador de acceso
                    {public | private | protected | friendly}

        - int:      Tipo
                    {var | fun | param}

        - String:   Nombre
                    {"*"}
                    
        - Object:   Valor
                    {*}

        - int:      Valor de retorno
                    {int | String | double| boolean | FLOAT | ..}
    */
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
        int result = -1;
        switch(accessMode){
            case "":            result = FRIENDLY;   break;
            case "public":      result = PUBLIC;     break;
            case "private":     result = PRIVATE;    break;
            case "protected":   result = PROTECTED;  break;
        }
        return result;
    }

    public String accessMode(int accessMode){
        String result = "";
        switch(accessMode){
            case FRIENDLY:  result = "friendly";            break;
            case PUBLIC:    result = "public";      break;
            case PRIVATE:   result = "private";     break;
            case PROTECTED: result = "protected";   break;            
        }   
        return result;
    }

    public static int type(String type){
        int result = -1;
        switch(type){
            case "var":     result =  VARIABLE;   break;
            case "fun":     result =  FUNCTION;   break;
            case "param":   result =  PARAM;      break;
            case "class":   result =  CLASS;      break;
            case "if":      result =  IF;         break;
            case "else":    result =  ELSE;       break;
        }
        return result;
    }

    public String type(int type){
        String result = "";
        switch(type){
            case VARIABLE : result = "var";     break;
            case FUNCTION : result = "fun";     break;
            case PARAM:     result = "param";   break;
            case CLASS:     result = "class";   break;
            case IF:        result = "if";      break;
            case ELSE:      result = "else";    break;
        }
        return result;
    }

    public static int returnValue(String returnValue){
        int result = -1;
        switch(returnValue){
            case "void":        result =  VOID ;         break;
            case "string":      result =  STRING ;       break;
            case "byte":        result =  BYTE ;         break;
            case "short":       result =  SHORT ;        break;
            case "long":        result =  LONG ;         break;
            case "int":         result =  INT ;          break;
            case "float":       result =  FLOAT ;        break;
            case "double":      result =  DOUBLE ;       break;
            case "boolean":     result =  BOOLEAN ;      break;
            default:            result =  OTHER ;        break;
        }
        return result;
    }

     public String returnValue(int returnValue){
        String result = "";
        switch(returnValue){
            case VOID :        result =  "void" ;         break;
            case STRING :      result =  "String" ;       break;
            case BYTE :        result =  "byte" ;         break;
            case SHORT :       result =  "short" ;        break;
            case LONG :        result =  "long" ;         break;
            case INT :         result =  "int" ;          break;
            case FLOAT :       result =  "float" ;        break;
            case DOUBLE :      result =  "double" ;       break;
            case BOOLEAN :     result =  "boolean" ;      break;
            default:           result =  "other" ;        break;
        }
        return result;
    }

    public String toString(){
        //return "{M. accesso: "+this.accessMode+", Tipo: "+this.type+", Lexema: "+this.lex+", Value: "+this.value+", Return: "+this.returnValue+"}";
        return "{"+accessMode(accessMode)+", "+type(type)+", "+this.lexema+", "+this.value+", "+returnValue(returnValue)+"}";
    }


}