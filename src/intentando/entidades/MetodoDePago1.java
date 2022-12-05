 
package metodoPago;

public class MetodoDePago1 {
   
    protected int precio;
    protected int opcion;
    protected double descuento;
    protected double recargo;
    protected double recargo2;
    protected double totalTarjeta;
    public MetodoDePago1(){
   
}
    public MetodoDePago1(int precio, double descuento, double recargo, double recargo2){
        this.precio = precio;
        this.descuento = descuento;
        this.recargo = recargo; // Recargo del 15%
        this.recargo2 = recargo2; // Recargo del 20%
        
    }

    public MetodoDePago1(int precio, int opcion, double descuento, double recargo, double recargo2) {
        this.precio = precio;
        this.opcion = opcion;
        this.descuento = descuento;
        this.recargo = recargo;
        this.recargo2 = recargo;
    }
    
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getOpcion() {
        return this.opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public double getDescuento() {
        return this.descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getRecargo() {
        return this.recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }
     public double getRecargo2() {
        return this.recargo2;
    }

    public void setRecargo2(double recargo2) {
        this.recargo2 = recargo2;
    }

    @Override
    public String toString() {
        return "MetodoDePago1{" + "precio=" + precio + ", opcion=" + opcion + ", descuento=" + descuento + ", recargo=" + recargo + ", recargo2=" + recargo2 + '}';
    }

     
    
    public double precio_contado(int precio, double descuento){
        this.precio = precio;
        this.descuento = descuento;
        return precio * descuento;
    }
    
    public double precio_tarjeta(int precio, double recargo){
        this.precio = precio;
        this.recargo = recargo;
        totalTarjeta = precio * recargo;
        return precio * recargo;
    }
    
    public double precioTarjeta_cuota(int precio, double recargo){
        this.precio = precio;
        this.recargo = recargo;
        return (precio * recargo /6);
    }
    public double precioFinanciado_casa(int precio, double recargo2){
        this.precio = precio;
        this.recargo2 = recargo2;
        return (precio * recargo2 /12);
    }
    public double precio_financiado (int precio,double recargo2){
        this.precio = precio;
        this.recargo2 = recargo2;
        return precio * recargo2;
    }
    
//    public String Ciclo_repetir(int opcion, double precio_contado, double precio_tarjeta, 
//            double precio_financiado){
//        while((opcion > 0) && (opcion < 4)){
//            System.out.println("Digite una opción entre 1 y 3: ");
//        }
//            if (opcion == 1){
//                System.out.println("El precio total es: "+precio_contado);
//            }
//            if (opcion == 2){
//                System.out.println("El precio total es: "+precio_tarjeta);
//            }
//            if (opcion == 3){
//                System.out.println("El precio total es: "+precio_financiado);
//            }
//            else{
//                System.out.println("Digite una opción valida(1-4)");
//            }
//            return "Opcion ingresada: "+ opcion;
//    }

    


    }

    
        
        
      

    
        
            
    
        
    