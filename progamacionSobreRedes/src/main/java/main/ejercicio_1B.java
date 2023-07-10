package main;

import java.io.IOException;
import java.io.PrintStream;

public class ejercicio_1B {
    public ejercicio_1B(){
        PrintStream ps = new PrintStream( System.out );
        
        ps.println("Ejercicio 1B, valor del angulo que falla de un triangulo");
		try {
			ps.print("un angulo: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			
			int a1 = Integer.parseInt(cadena) ;
			
			
			ps.print("otro angulo: ");
			Byte = 0;
			cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			
			int a2 = Integer.parseInt(cadena) ;
			
			
			int resultado = 180 - (a1 + a2); 
			ps.println( "El angulo restante es de: "+ resultado + "°");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    

}

