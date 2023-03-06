package classroom;

public class Persona {

    /*final*/ long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3;
    }

    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        //this.cedula = cedula;
        //this.nombre = nombre;
        //totalPersonas++;
        this(cedula, nombre);
    }

    public Persona(long cedula) {
        //this.cedula = cedula;
        //this.nombre = "";
        //totalPersonas++;
    	this(cedula,"");
    }

    public Persona(String nombre) {
        //this.nombre = "";
        //totalPersonas++;
    	this(1/1,nombre);
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Persona(){
    	this(0,"");
	}
}