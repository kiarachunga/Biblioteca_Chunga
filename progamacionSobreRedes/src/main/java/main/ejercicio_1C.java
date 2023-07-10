package main;

import java.io.IOException;
import java.io.PrintStream;

public class ejercicio_1C{
    public ejercicio_1C(){
    	
    PrintStream ps = new PrintStream( System.out );
    ps.println("Ejercicio 1C, perimetro de un cuadrado");
		try {
			ps.print("superficie m2: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			int superficie = Integer.parseInt(cadena) ;
                        
			int perimetro = superficie *4; 
			ps.println( "El perimetro del cuadrado es: "+ perimetro + " mts");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
    
}
