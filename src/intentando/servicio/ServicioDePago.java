  
package test_pago;

import java.util.Scanner;
import metodoPago.MetodoDePago1;

public class ServicioDePago extends MetodoDePago1{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        int precio = 200;
        
        MetodoDePago1 metodoPago = new MetodoDePago1();
        do  {System.out.println("..:Ingresar medio de pago:..");
            System.out.println("1. Pago contado (20% de descuento)");
            System.out.println("2. Tarjeta en 12 cuotas (15% de recargo)");
            System.out.println("3. Financiado en 6 cuotas (25% recargo)");
            System.out.println("Digite una opción entre 1 y 3: ");
            
            opcion = Integer.parseInt(entrada.nextLine());
                 switch(opcion){
                    case 1 -> System.out.println("El precio total de contado es: "+metodoPago.precio_contado(precio, 0.8) +" pesos");
            
                    case 2 -> {System.out.println(String.format("El precio total con tarjeta es: %.2f",metodoPago.precio_tarjeta(precio, 1.15))+" pesos");
                              System.out.println(String.format("Seis cuotas de %.2f",metodoPago.precioTarjeta_cuota(precio, 1.15))+" pesos");
                    }
                    case 3 -> {System.out.println(String.format("El precio total con financiado de la casa es: %.2f", metodoPago.precio_financiado(precio, 1.25))+" pesos");
                              System.out.println(String.format("Doce cuotas de %.2f", metodoPago.precioFinanciado_casa(precio, 1.25))+" pesos");
                    
                    }
                    default ->{ System.out.println("|---------------------|");
                                System.out.println("|Número fuera de rango|");
                                System.out.println("|---------------------|");
                    }            
                }
        }while((opcion != 1 ) && (opcion != 2)&&(opcion != 3));
            
        
        if (opcion == 2){
            System.out.println("Ingrese el nombre completo del titular de la tarjeta: ");
            String titular = sc.nextLine();
            System.out.println("Ingrese el número de la tarjeta: ");
            var numeroTarjeta = Integer.parseInt(entrada2.nextLine());
            System.out.println("Ingrese el CV de la tarjeta: ");
            var numeroCV = Integer.parseInt(entrada3.nextLine());
            System.out.println("Sus datos son: Titular: "+titular+ ", Número de tarjeta: "+numeroTarjeta+ ", CV de la tarjeta: "+numeroCV);
        }else {
                
            }
                
    }
        
        
        
        
    }
        
       

      

