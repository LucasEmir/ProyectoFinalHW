
package servicioadicional;

import java.util.Scanner;
        
public class ServicioAdicional {

    
    public static void main(String[] args) {
      
        Scanner SelecciónCorrecta = new Scanner(System.in);
          boolean Opción;
          int num1;
          int num2;
          int num3;
         
            System.out.println("                            ¿Desea agregar algún servicio adicional?"); 
            
            System.out.println("                                              1 - SI ");
            System.out.println("                                              2 - NO ");
            
            num1= SelecciónCorrecta.nextInt();
          
          
          
                  
          /* do{
            if(num1 > 0 && num1 <3){
                Opción = true;
                
            }
            else{
                Opción= false;
                System.out.println("                              Digite una opcion válida (1 o 2):");
             num1= SelecciónCorrecta.nextInt();
            }
           } while(Opción = true);*/
   
    
     switch(num1){
         case 1: 
             System.out.println("                                1 - Busqueda por alojamiento: $");//Valor1
             System.out.println("                                   2 - Vianda en destino: $");//Valor2
             System.out.println("                                       3 - Pack Souvenir: $ ");//Valor3
             num2= SelecciónCorrecta.nextInt();
             switch(num2){
                 case 1:
                     System.out.println("                            ------------------------------");
                     System.out.println("                                     Total a pagar $");//ValorDePasaje+Valor1
                     System.out.println("                            ------------------------------");
                     //PrecioAPagar<-(ValorDePasaje+Valor1)
                     //adicional<- 1;
                    break;
                 case 2:
                     System.out.println("                            ------------------------------");
                     System.out.println("                                     Total a pagar $ ");//ValorDePasaje+Valor2
                     System.out.println("                            ------------------------------");
                     //PrecioAPagar<-(ValorDePasaje+Valor2)
                     //adicional<- 2;
                    break;
                 case 3:
                     System.out.println("                            ------------------------------");
                     System.out.println("                                     Total a pagar $ ");//ValorDePasaje+Valor3
                     System.out.println("                            ------------------------------");
                     //PrecioAPagar<-(ValorDePasaje+Valor3)
                     //adicional<- 3;
                    break;
         
             }
             
         case 2:  
              System.out.println("                            ------------------------------");
              System.out.println("                                     Total a pagar $ ");//ValorDePasaje;
              System.out.println("                            ------------------------------");
                //mPrecioAPagar<-(valorDePasaje);
              break;
             
      }
    
    }
    
}
