package paquete.principal;

import javax.swing.JOptionPane;

public class Diputado extends Legislador {

	public Diputado(String nombre, String apellido, String CamaraEnQueTrabaja, String provinciaQueRepresenta) {
		super(nombre, apellido, CamaraEnQueTrabaja,provinciaQueRepresenta);
	}

	@Override
	public String getCamaraEnQueTrabaja() {
		return CamaraEnQueTrabaja;
		
	}
	
	@Override
	public void setCamaraEnQueTrabaja(){
		CamaraEnQueTrabaja=JOptionPane.showInputDialog("Ingrese la camara donde trabaja este diputado: "); 
	}
	
	@Override
	public void setProvinciaQueRepresenta() {
		
		provinciaQueRepresenta=JOptionPane.showInputDialog("Ingrese la provincia donde trabaja este diputado: ");
	}
}
