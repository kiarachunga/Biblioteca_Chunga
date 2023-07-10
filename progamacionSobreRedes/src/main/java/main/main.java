package main;

import java.io.IOException;
import java.io.PrintStream;

public class main {

	public static void main(String[] args) {

		        PrintStream ps = new PrintStream( System.out );
		        try {
					ps.println("Seleccione el numero de ejercicio: ");
					ps.println("1: Ejercicio 1");
		            ps.println("2: Ejercicio 2 ");
		            ps.println("3: Ejercicio 3 ");
		            ps.println("4: Ejercicio 4");
		            
					int Byte = 0;
					String cadena = lecturaDatos();
					int numej = Integer.parseInt(cadena) ;
		         
		                        switch(numej){
		                            case 1:
		                                ps.println("Seleccione el ejercicio: ");
		                                ps.println("a: Sueldo bruto.");
		                                ps.println("b: Angulos de un triangulo.");
		                                ps.println("c: Superficie de un cuadrado.");
		                                ps.println("d: Grados Fahrenheit a centigrados.");
		                                ps.println("e: Segundos a días, horas, minutos y segundos.");
		                                ps.println("f: Precios según los planes.");
		                                ps.println("g: En qué mes naciste según tu signo zodiacal.");
		                                
		                                cadena = lecturaDatos();
		                                cadena = cadena.toLowerCase();
		                                
		                                switch(cadena){
		                                    case "a":
		                                        ejercicio_1A ej = new ejercicio_1A();
		                                        break;
		                                    case "b":
		                                    	ejercicio_1B ejb = new ejercicio_1B();
		                                        break;
		                                }
		                        break;
		                        default:
		                                ps.println("No existe");
		                                
		                        }
		                        
		        
					//ps.println(  (char)System.in.read()  ) ;
		        } catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		        
		    }
		        
		        
    public static String lecturaDatos() throws IOException{
        int Byte = 0;
        String cadena = "";
	while(   ( Byte = System.in.read() )  != '\n'  )
	{
            if( Byte != '\r' )
            cadena += (char)Byte;
	}
        return cadena;
    }
    
}
