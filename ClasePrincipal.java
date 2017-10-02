package paquete.principal;



import javax.swing.JOptionPane;

public class ClasePrincipal {
	
	static Legislador vectorlegisladores[];
	
	public static void main(String[] args) {
		try {
			String x= JOptionPane.showInputDialog("Inserte cantidad de Legizladores a ingresar: ");
			int R=Integer.parseInt(x);
			vectorlegisladores= new Legislador[R];
			String opciones[] = {"Diputado","Senador"};
			int cuenta=0;
				do{
					int seleccion=JOptionPane.showOptionDialog(null, "Es necesario que seleccione una opcion", "Elija entre diputado o Senador", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
					if (seleccion==0) {
						Diputado d1 = new Diputado("", "","", "");
						d1.setNombre(JOptionPane.showInputDialog("Escriba el Nombre del diputado: "));
						d1.setApellido(JOptionPane.showInputDialog("Escriba el Apellido del diputado: "));
						d1.setCamaraEnQueTrabaja();
						d1.setProvinciaQueRepresenta();
						vectorlegisladores[cuenta]=d1;		
						vectorlegisladores[cuenta].imprimirdatos();
						cuenta++;
					}
					if (seleccion==1) {
						Senador s1 = new Senador("", "","", "");
						s1.setNombre(JOptionPane.showInputDialog("Escriba el Nombre del senador: "));
						s1.setApellido(JOptionPane.showInputDialog("Escriba el Apellido del senador: "));
						s1.setCamaraEnQueTrabaja();
						s1.setProvinciaQueRepresenta();
						vectorlegisladores[cuenta]=s1;		
						vectorlegisladores[cuenta].imprimirdatos();
						cuenta++;
					}
			}while(cuenta!=vectorlegisladores.length);
			
					
		}catch(NumberFormatException e){
			System.out.println("No introdujo un numero, intente de nuevo");
			
		}
		 
	}

}
