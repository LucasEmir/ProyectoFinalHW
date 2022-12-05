package intentando.servicio;

import intentando.entidades.Viaje;
import java.util.Scanner;

public class ServicioViaje {

    Scanner leer = new Scanner(System.in);
    Viaje viaje = new Viaje();

    public void nombreDeLAEmpresa() {

        System.out.println(" ----    ----    --------    ----        ----          --------         -----    -----    -----     --------     ---------     ----       ----- ");
        System.out.println(" ----    ----    --------    ----        ----         ----------         -----   -----   -----     ----------    ----------    ----       --------");
        System.out.println(" ----    ----    --------    ----        ----         ----------          -----  -----  -----      ----------    ----  ----    ----       ---------");
        System.out.println(" ----    ----    ----        ----        ----         ----------           ----- ----- -----       ----------    ---    ---    ----       ----------");
        System.out.println(" ------------    ----        ----        ----         ---    ---            ---------------        ---    ---    ---    ---    ----       ---    ---");
        System.out.println(" ------------    --------    ----        ----         ---    ---             -------------         ---    ---    ----  ---     ----       ---    ---");
        System.out.println(" ------------    --------    ----        ----         ---    ---              -----------          ---    ---    --------      ----       ---    ---");
        System.out.println(" ------------    --------    ----        ----         ---    ---               ---------           ---    ---    ---------     ----       ---    ---");
        System.out.println(" ------------    ----        ----        ----         ---    ---                -------            ---    ---    ---  -----    ----       ---    ---");
        System.out.println(" ----    ----    ----        ----        ----         ----------                 -----             ----------    ---   ----    ----       ----------");
        System.out.println(" ----    ----    --------    --------    --------     ----------                  ---              ----------    ---   ----    --------   ---------");
        System.out.println(" ----    ----    --------    --------    --------     ----------                   -               ----------    ---   ----    --------   --------");
        System.out.println(" ----    ----    --------    --------    --------      --------                    -                --------     ---   ----    --------   -----");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("                                                **********   **********   ***    ***   **********   **********   ");
        System.out.println("                                                **********   **********   ***    ***   ****  ****   ****         ");
        System.out.println("                                                   ****      ***    ***   ***    ***   ****  ****   **********   ");
        System.out.println("                                                   ****      ***    ***   ***    ***   **********   **********   ");
        System.out.println("                                                   ****      **********   **********   ***  *****         ****   ");
        System.out.println("                                                   ****      **********   **********   ***   ****   **********   ");

    }

    //Función principal, llama al resto de las funciones
    public Viaje definirDestino() {
        int num;
        
        do {

            System.out.println("-----------------------------------------------------------");
            System.out.println("                 DESTINOS TURISTICOS SAN RAFAEL            ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("                       1 - Valle Grande                    ");
            System.out.println("                       2 - Los Reyunos                     ");
            System.out.println("          3 - El Nihuil y Las Salinas del Diamante         ");
            System.out.println("                       4 - El Sosneado                     ");

            num = leer.nextInt();

            switch (num) {
                case 1:
                    viaje.setDestino("Valle Grande");
                    viaje.setPrecio(1800);
                    System.out.println("El destino seleccionado es: " + viaje.getDestino());
                    System.out.println("Precio = $ 1800");
                    espacio();
                    servicioAdicional();
                    espacio();
                    break;
                case 2:
                    viaje.setDestino("Los Reyunos");
                    viaje.setPrecio(2000);
                    System.out.println("El destino seleccionado es: " + viaje.getDestino());
                    System.out.println("Precio = $ 2000");
                    espacio();
                    servicioAdicional();
                    espacio();
                    break;
                case 3:
                    viaje.setDestino("El Nihuil y Las Salinas del Diamante");
                    viaje.setPrecio(2500);
                    System.out.println("El destino seleccionado es: " + viaje.getDestino());
                    System.out.println("Precio = $ 2500");
                    espacio();
                    servicioAdicional();
                    espacio();
                    break;
                case 4:
                    viaje.setDestino("El Sosneado");
                    viaje.setPrecio(3300);
                    System.out.println("El destino seleccionado es: " + viaje.getDestino());
                    System.out.println("Precio = $ 3300");
                    espacio();
                    servicioAdicional();
                    espacio();
                    break;
                default:
                    System.out.println("Los datos ingresados son incorrectos");

            }

        } while (num != 1 && num != 2 && num != 3 && num != 4);
        
        mostrarResultado(viaje);
        return viaje;
    }

    // Seleccionar servicio adicional
    public void servicioAdicional() {
        int adicional;
        int opcion;

        inicio:
        do {

            System.out.println("¿Desea agregar algún servicio adicional?");
            System.out.println("                   1-SI                 ");
            System.out.println("                   2-NO                 ");
            opcion = leer.nextInt();

            if (opcion == 1) {
                do {
                    System.out.println("       Seleccione una opción: ");
                    System.out.println("1 - Busqueda por alojamiento: $350");
                    System.out.println("2 - Vianda en destino: $500");
                    System.out.println("3 - Pack Souvenir: $850");
                    System.out.println("4 - No deseo ningún adicional.");

                    adicional = leer.nextInt();
                    switch (adicional) {
                        case 1:
                            viaje.setAdicional(350);
                            break;
                        case 2:
                            viaje.setAdicional(500);
                            break;
                        case 3:
                            viaje.setAdicional(850);
                            break;
                        case 4:
                            continue inicio;
                        default:

                    }
                } while (adicional != 1 && adicional != 2 && adicional != 3 && adicional != 4);

            } else if (opcion != 1 && opcion != 2) {

                System.out.println("Los datos ingresados son incorrectos.");
                System.out.println("Por favor,intente nuevamente.");
            }

        } while (opcion != 1 && opcion != 2);
        //Mostrar pantalla: mostrara los resulados por pantalla

    }

    
    //Muestra los resultados finales
    public void mostrarResultado(Viaje viaje) {
        int suma;
        suma = viaje.getPrecio() + viaje.getAdicional();
        System.out.println("************************************************");
        System.out.println("El destino seleccionado es: " + viaje.getDestino());
        System.out.println("************************************************");
        System.out.println("El precio es: $" + viaje.getPrecio());
        System.out.println("************************************************");
        System.out.println("El costo adicional seleccionado es: $" + viaje.getAdicional());
        System.out.println("************************************************");
        System.out.println("El valor total del viaje es: $" + suma);
    }
    
    //Genera espaciós
    public void espacio(){
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
        System.out.println("    ");
    }
    
    //Metodo para comprar boletos
    public void comprarBoleto(){
        int opcion;
        System.out.println("1_ Comprar Boleto");
        System.out.println("2_ Volver");
        
        opcion = leer.nextInt();
        
    }
    
    
    /*  public Viaje definirPrecioDestino(int num , Viaje viaje) {

        switch (num) {
            case 1:
                System.out.println("Valle Grande");
                System.out.println("Precio = $ 1800");
                viaje.setPrecio(1800); 
                break;
            case 2:
                System.out.println(" Los Reyunos");
                System.out.println("Precio = $ 2000");
                viaje.setPrecio(2000);
                break;
            case 3:
                System.out.println("El Nihuil y Las Salinas del Diamante");
                System.out.println("         Precio = $ 2500");
                viaje.setPrecio(2500);
                break;
            case 4:
                System.out.println("El Sosneado");
                System.out.println("Precio = $ 3300");
                viaje.setPrecio(2000);
                break;
        }
        return viaje;
    }
     */
    
}
