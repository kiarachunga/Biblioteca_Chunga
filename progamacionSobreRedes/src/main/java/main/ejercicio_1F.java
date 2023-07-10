package main;
import java.io.IOException;
import java.io.PrintStream;


public class ejercicio_1F {
    public ejercicio_1F(){
        PrintStream ps = new PrintStream( System.out );
        ps.println("Ejercicio 1F, valoes a pagar segun cada plan");
		try {
			ps.print("Precio del articulo: ");
			
			int Byte = 0;
			String cadena = "";
			while(   ( Byte = System.in.read() )  != '\n'  )
			{
				if( Byte != '\r' )
					cadena += (char)Byte;
			}
			
			int precio = Integer.parseInt(cadena) ;
                        // Plan 1
                        double p1 = precio - (precio * 0.1);
                        
                        // Plan 2
                        double p2 = precio * 1.10;
                        double p2Co = p2/2;
                        double p2Cu = p2Co/2;
                        
                        // Plan 3
                        double p3 = precio * 1.15;
                        double p3Co = precio/4;
                        double p3Cu = precio;
          
                        
                        // Plan 4
                        double p4 = precio * 1.25;
                        double p4Cu = precio * 0.60;
                        p4Cu = p4Cu/4;
                        double p4Cuo = precio * 0.40;
                        p4Cuo = p4Cuo/4;
                        
                        
                        ps.println("En el plan 1 el costo junto con el descuento seria de $"+p1+" al contado.");
                        ps.println("En el plan 2 se paga el 50% del articulo que seria: $"+p2Co+" y el resto en 2 cuotas iguales de $"+p2Cu+", el costo total mas el aumento del 10% seria de $"+p2);
                        ps.println("En el plan 3 se paga el 25% del articulo que seria: $"+p3Co+" al contado más 5 cuotas iguales de $"+p3Cu+", el costo total mas el aumento del 15% seria de $"+p3);
                        ps.println("En el plan 4 es totalmente financiado en 8 cuotas, las cuatro primeras tienen un costo de: $"+p4Cu+" y las otras 4 de $"+p4Cuo+", el costo total mas el aumento del 25% seria: $"+p4);
			//ps.println(  (char)System.in.read()  ) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

