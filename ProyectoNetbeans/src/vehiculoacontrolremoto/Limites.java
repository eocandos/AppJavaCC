
package vehiculoacontrolremoto;


public class Limites {
    
    int[] xy;
    
    //int posHor = 0, posVer = 0;
    public Limites(){
    
           //VerificarLimites(comando, filas, columnas, x, y);       
 
    }

    public int[] VerificarLimites(String comando, int numOrdenes, int filas, int columnas, int x, int y) {
       ConvertirFormato cf = new ConvertirFormato();
        String[] vector = cf.convertir(comando);
        
        //xy[0] = 0; xy[1] = 0; 
        xy = new int[2];
        
        //Obtener la cantidad de ";" que hay en el comando para usarlo en el for
        for(int i = 0; i < (numOrdenes + 1)*4 ; i=i+4){
        
            //1) Obtener valores posiciones pedidas usuario
            try{
            if(vector[i+2].equals("N")){
                y =  y + Integer.parseInt(vector[i] );
            }
             if(vector[i+2].equals("S")){
                y = y - Integer.parseInt(vector[i] );
            }   

            if(vector[i+2].equals("E")){
                x = x + Integer.parseInt(vector[i] );
            }
             if(vector[i+2].equals("O")){
                x = x - Integer.parseInt(vector[i] );
            }     
            }                   
            
            catch(Exception ex) {
                System.out.println("ERROR EN EL FORMATO DE COMANDO!!!");
                VehiculoAControlRemoto.loop = false;
            }
        }
         //2) m > x         
         if((columnas >= x)) {
             
             xy[0] = x;
             //x = posHor;
             //System.out.print("Posicion en X: "+x);
             
         } else {   System.out.println("SE HA DETENIDO EL AVANCE POR SALIR DE LOS LIMITES!!"); 
            VehiculoAControlRemoto.loop = false;
         }

        if((filas >= y)) {
             
             xy[1] = y;
             //y = posVer;
             //System.out.print("Posicion en Y: "+y);
             
         } else {   System.out.println("SE HA DETENIDO EL AVANCE POR SALIR DE LOS LIMITES!!");  
            VehiculoAControlRemoto.loop = false;
         }
        
        System.out.println(">>> POSICION ACTUAL: ( "+y+" , "+x+ ")");
                  
         return xy;    }
}
