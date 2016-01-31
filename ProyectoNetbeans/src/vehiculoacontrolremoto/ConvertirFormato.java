
package vehiculoacontrolremoto;

public class ConvertirFormato {
    
        public ConvertirFormato(){        
 
        }
        
        public String[] convertir(String comando){
        
            String[] vector = new String[comando.length()];

           //Pasar comando string a vector
               for(int i = 0; i < comando.length(); i++) {       
                   try{
                   vector[i] = comando.substring(i,i+1);               
                   } 
                   catch(Exception ex) {
                       System.out.println("ERROR EN EL FORMATO DE COMANDO!!!");
                       VehiculoAControlRemoto.loop = false;
                   }
               }  
               
               return vector;
        
        }  
}
    


