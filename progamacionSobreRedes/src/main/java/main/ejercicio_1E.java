package main;
import java.io.IOException;
import java.io.PrintStream;


public class ejercicio_1E {
    public ejercicio_1E(){
    	
        PrintStream ps = new PrintStream( System.out );
        ps.println("Ejercicio 1E, tiempo expreado en días, horas, minutos y segundos.");
		try {
			ps.print("Tiempo en segundos: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			int seg = Integer.parseInt(cadena) ;
                        
			int dias = (int)seg/86400;
			
                        int segundosrest = seg - (dias * 86400);
                        
                        int horas = (int)segundosrest / 3600;
                        segundosrest = segundosrest - (horas * 3600);
                        
                        int minutos = (int)segundosrest/60;
                        segundosrest = segundosrest - (minutos *60);
                        
                        int sg = segundosrest;
                        
			ps.println( "El tiempo dado es igual a dias:"+ dias +"  horas: "+horas+" Minutos:  "+minutos+" segundos:  "+sg);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
