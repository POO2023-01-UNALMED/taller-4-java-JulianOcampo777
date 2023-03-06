package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	final int codigo;
	//private String nombre;
	/*public*/ Tipo(int codigo) {
		this.codigo = codigo;
		//this.nombre = nombre;
	}
}