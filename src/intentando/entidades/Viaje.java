package intentando.entidades;

public class Viaje {

    private String destino;
    private int precio;
    private int adicional;

    public Viaje() {
    }

    public Viaje(String destino, int precio, int adicional) {
        this.destino = destino;
        this.precio = precio;
        this.adicional = adicional;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return "Destino{" + "destino=" + destino + ", precio=" + precio + ", adicional=" + adicional + '}';
    }

}
