package paquete.principal;


public abstract class Legislador extends Persona {
		public String provinciaQueRepresenta;
		public String CamaraEnQueTrabaja;
		
		public Legislador(String nombre, String apellido, String CamaraEnQueTrabaja, String provinciaQueRepresenta) {
			super(nombre, apellido);
			this.CamaraEnQueTrabaja= CamaraEnQueTrabaja;
			this.provinciaQueRepresenta=provinciaQueRepresenta;
		}

	public abstract String  getCamaraEnQueTrabaja();
	public abstract void setCamaraEnQueTrabaja();
	

	public String getProvinciaQueRepresenta() {
		return provinciaQueRepresenta;
	}

	public abstract void setProvinciaQueRepresenta();
	
	
	void imprimirdatos() {
		
		System.out.println("Nombre es:  " + super.getNombre());
		System.out.println("Apellido es:  " + super.getApellido());
		System.out.println("Camara en que trabaja es:  " + CamaraEnQueTrabaja);
		System.out.println("provincia que representa es:  " + provinciaQueRepresenta);
	}
	
}
