/*
Boleto Digital(Maca)
 */
package proyectohw;

public class BoletoDigital {
     
    int matrizCombi1 [][] = new int [11][4];
    int matrizCombi2 [][] = new int [11][4];
    public BoletoDigital() {
        System.out.println("Por default");
    }
    public static void mostrarPantalla (int destino, int opcion, int precio1, int horarioSalida, int horarioLlegada, int dia, int mes, int duracion, int combiSeleccionada, int asientoSeleccionado){
	System.out.println("");
        System.out.println("");
	System.out.println("\t\t\t\t\t\tOpción: ");
	System.out.println("\t\t\t\t\t\t"+destino+" ");
        System.out.println("\t\t\t\t\tINFORMACION DEL TUR: ");
        System.out.println("\t\t\t--------------------------------------------------");
        System.out.println("\t\t\t\t\tDestino:   "+destino+" ");
        System.out.println("\t\t\t\t\tCombi: Combi Nº"+combiSeleccionada+" ");
        System.out.println("\t\t\t\t\tAsiento:    "+asientoSeleccionado+" ");
	System.out.println("\t\t\t---------------------------------------------------");
        System.out.println("\t\t\t   --------------------     -------------------- ");
        System.out.println("\t\t\t\t  SALIDA                   LLEGADA");
        System.out.println("\t\t\t  Lunes "+dia+" de "+mes+"             Lunes "+dia+" de "+mes+" ");
        System.out.println("\t\t\t\t"+horarioSalida+":00    hs               "+horarioLlegada+":40   hs ");
        System.out.println("\t\t\t   --------------------     -------------------- ");
        System.out.println("\t\t\t\t   [Duración Viaje:"+duracion+" min.] ");
        System.out.println("\t\t\t\t     Precio: $ "+precio1);
        System.out.println("");
    }

//simulamos una base de datos
    
    public static void baseDeDatos() {
	int asiento = 0;
        int[][] mockMatriz = new int [11][4];

	//llenado de matriz 
	for(var i = 0 ; i < 3 ; i++){ 
            for(var j = 0 ; j < 3 ; j++){ 
		mockMatriz[i][j] = (int)(Math.random()*1);
            }
        }
	for(var i = 0 ; i < 3 ; i++){ 
            for(var j = 0 ; j < 2 ; j++){
                asiento++;
                if(mockMatriz[i][j] == 1){
                    System.out.println("                [ X] \\n");
                }
                else{
                    if(asiento < 10){
                        System.out.println("                [ "+asiento+"");
                    }
                    else{
                        System.out.println("                [ "+asiento+"");
                    }
                }
            }
        }
           System.out.println(""); 
        }
//Dibujar la matriz ingresada con los asientos disponibles
    public void mostrarMatriz(int matriz[][]){
	int asiento = 0;
        for(var i = 0; i <3; i++){ 
            for(var j = 0; j <2; j++){
                asiento++;
                if(matriz[i][j] == 1){
                    System.out.println("                [ X] \\n");
                }
                else{
                    if(asiento < 10){
                        System.out.println("                [ "+asiento+"");
                    }
                    else{
                        System.out.println("                [ "+asiento+"");
                    }
                }
            }
           System.out.println(""); 
        }
    }
}