package main;
import java.io.IOException;
import java.io.PrintStream;

public class ejercicio_1G {
	
	public ejercicio_1G(){
		
		PrintStream ps = new PrintStream( System.out );
        ps.println("Ejercicio 1G");
		try {
			ps.print(" Su signo zodiacal cual es: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			cadena = cadena.toLowerCase();
			
			switch(cadena) {
				case "acuario":
					ps.println("Naciste entre Enero y Febrero");
					break;
				case "Picis":
					ps.println("Naciste entre Febrero y Marzo");
			
				case "aries":
					ps.println("Naciste entre Marzo y Abril");
					break;
				case "tauro":
					ps.println("Naciste entre Abril y Mayo");
					break;
				case "geminis":
					ps.println("Naciste entre Mayo y Junio");
					break;
				case "cancer":
					ps.println("Naciste entre Junio y Julio");
					break;
				case "leo":
					ps.println("Naciste entre Julio y Agosto");
					break;
				case "virgo":
					ps.println("Naciste entre Agosto y Septiembre");
					break;
				case "libra":
					ps.println("Naciste entre Septiembre y Octubre");
					break;
				case "escorpio":
					ps.println("Naciste entre Octubre y Noviembre");
					break;
				case "sagitario":
					ps.println("Naciste entre Noviembre y Diciembre");
					break;
				case "capricornio":
					ps.println("Naciste entre Diciembre y Enero");
					break;
				
				default:
					ps.println("signo no encontrado");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

