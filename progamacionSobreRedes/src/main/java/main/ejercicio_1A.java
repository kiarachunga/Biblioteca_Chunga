package main;

import java.io.IOException;
import java.io.PrintStream;

public class ejercicio_1A {
		
		
		public ejercicio_1A () {
			
			

			PrintStream ps = new PrintStream( System.out );
			ps.println("Ejercicio N°1-A, muestra del valor del sueldo en bruto");
			try {
				
				ps.print("valor de hora de trabajo: ");
				
				int Byte = 0;
				String cadena = "";
				while(   ( Byte = System.in.read() )  != '\n'  )
				{
					if( Byte != '\r' )
						cadena += (char)Byte;
				}
				
				
				int horap = Integer.parseInt(cadena) ;


				
				ps.print("Cantidad de horas trabajadas: ");
				Byte = 0;
				cadena = "";
				while(   ( Byte = System.in.read() )  != '\n'  )
				{
					if( Byte != '\r' )
						cadena += (char)Byte;
				}
				
				
				int cant = Integer.parseInt(cadena) ;


				
				int valor = horap * cant;
				ps.println( valor );
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
			
			
			
		}

	}


