package principal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class EscribirLeerArchivo{

    public static void leerarchivo(){
    
        File archivo = null;
        FileReader fr= null;
        BufferedReader br= null;
        
        try{
        
           archivo= new File("personas.txt");
           fr= new FileReader(archivo);
           br= new BufferedReader(fr);
           
           String letras;
           
           while ((letras= br.readLine())!=null) {
            
               System.out.println(letras);
           }
        } catch (Exception e) {
            System.out.println("Error de archivo");
        }finally {
            try {
                if (fr!=null){
                    fr.close();
                
                }  
            
            
            } catch (Exception e2) {
                System.out.println("Eror cerrando el archivo");
            
            }
        
        }
        
    
    
    }
    
    public static void escribirarchivo(){
    
        FileWriter fichero = null;
        PrintWriter pw = null;
        Scanner sc = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
        
        try{
            fichero = new FileWriter("personas.txt", true);
            pw = new PrintWriter(fichero);
            System.out.println("Escriba el nombre");
            nombre= sc.nextLine();
            System.out.println("Escriba su apellido");
            apellido= sc.nextLine();
            System.out.println("Escriba Su edad");
            edad= sc.nextInt();
            pw.println(nombre+" "+ apellido+" "+ edad);
             
        }catch(Exception e){
            System.out.println("Error escribiendo en el archivo");
        }finally {
            try{
                if(null!=fichero)
                fichero.close();
            } catch(Exception e) {
                System.out.println("Error cerrando archivo");
            }
        }
    
    
    }
    public static void main(String[] args) throws IOException {
        	
	       for (int i = 0; i < 5; i++) {
            escribirarchivo();
        }
	
            
            
    }
    
}

