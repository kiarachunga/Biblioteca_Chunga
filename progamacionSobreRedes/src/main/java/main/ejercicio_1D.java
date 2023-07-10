package main;
import java.io.IOException;
import java.io.PrintStream;

public class ejercicio_1D {
    public ejercicio_1D(){
    	
        PrintStream ps = new PrintStream( System.out );
        ps.println("Ejercicio 1D, muestra de grados centígrados");
		try {
			ps.print("Temperatura en grados Fahrenheit: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			int gradosF = Integer.parseInt(cadena) ;
                        
			double cent = (gradosF-32)/1.8; 
			ps.println( "Temperatura: "+ cent + " °C");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
