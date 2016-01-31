
package vehiculoacontrolremoto;

import java.util.Scanner;

public class VehiculoAControlRemoto {

    public static boolean loop = true;
    public static void main(String[] args) {

        String posicion = null;
        
        int fil = 0, col = 0, x = 0, y = 0, numOrdenes = 0;
            
        //1.============= Ingreso del usuario de # de filas y columnas =============//
        Scanner filas = new Scanner(System.in);
        System.out.print("Por favor ingresar Numero de Filas: >> ");        
        try { 
            fil = filas.nextInt();        
        } catch(Exception ex) {            
           System.out.print( "Numero no valido, debe ser un numero entero!!" );
        }
 
        Scanner columnas = new Scanner(System.in);
        System.out.print("Por favor ingresar Numero de Columnas: >> ");        
        try { 
            col = columnas.nextInt();        
        } catch(Exception ex) {            
           System.out.print( "Numero no valido, debe ser un numero entero!!" );
        }
        while(loop){
            //2.=================== Ingreso de los comandos =====================
            Scanner comando = new Scanner(System.in);
            System.out.print("Por favor ingrese Posicion para ubicar el vehiculo >> ");    
            
            try{
                posicion = comando.next();

            Formato formato = new Formato(posicion);
            numOrdenes = formato.getPuntosComas(posicion);
            
            } catch(Exception ex) {
                System.out.println("Error con el comando!!");
            }

            int[] xy;
            
            Limites limites = new Limites();       
        
            xy = limites.VerificarLimites(posicion, numOrdenes, fil, col, x, y);

            x = xy[0];
            y = xy[1];
            
        }
        
    }
    
}
