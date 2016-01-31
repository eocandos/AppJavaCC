package vehiculoacontrolremoto;

import java.util.Arrays;
import java.util.Vector;

public class Formato {
    
    private String[] vector;
    public static boolean ok = false; 
    int cont = 0;
    
    public Formato(String comando){
        
        ConvertirFormato cf = new ConvertirFormato();
        vector = cf.convertir(comando);
        
        //Obtener cantidad de ";"

            
            /*
            System.out.println("Validacion Numero: " +entero(vector)); 
            System.out.println("Validacion Coma: " +coma(vector));
            System.out.println("Validacion letra: " +letra(vector));
            System.out.println("Validacion PuntoYComa: " +puntoComa(vector)); */
            
            if(! (entero(vector) && coma(vector) && letra(vector) && puntoComa(vector))){
               System.out.print("ERROR EN EL FORMATO DE COMANDO!!!");
                VehiculoAControlRemoto.loop = false;
            } 
            
    }
    
            public boolean entero(String[] vector){
            
                boolean correcto = true;
                int num = 0;
                
                for(int i = 0; i < vector.length; i = i + 4){

                    try{
                        num = Integer.parseInt(vector[i]);                         
                    } catch(Exception ex) {                    
                        //Si encuentra un caracter donde debe ir un numero da falso
                        correcto = false;
                        break;
                    }
                }
                
            return correcto;
        }
             
            public boolean coma(String[] vector){            
                boolean correcto = true;
                for(int i = 1; i < vector.length - 1; i = i + 4){
                   
                   if(vector[i].equals(",")){

                   } else { correcto = false; }
                    
                }              
                
            return correcto;
        }             
            public boolean letra(String[] vector){            
                boolean correcto = true;
                 for(int i = 2; i < vector.length; i = i + 4){
                   
                   if(vector[i].equals("N") || 
                      vector[i].equals("S") ||  
                      vector[i].equals("E") ||
                      vector[i].equals("O") ){

                   } else { correcto = false; }
                    
                }              
                
            return correcto;    
        }        
            public boolean puntoComa(String[] vector){            
                
                boolean correcto = true;
                
                 for(int i = 3; i < vector.length; i = i + 4){
                   
                   if(vector[i].equals(";")) {                          
                           
                   } else { correcto = false; break; }
                    
                }              
                
            return correcto;
        }
        public int getPuntosComas(String comando){            
            //Obtener cantidad de ";"
                    
        ConvertirFormato cf = new ConvertirFormato();
        vector = cf.convertir(comando);
        
            for(int i = 0; i < vector.length; i++){

                if(vector[i].equals(";")) {
                    cont++;
                }
            }
            
            return cont;
            
        }
            
            public String[] vector(){
            
                return vector;
            }
            


}
