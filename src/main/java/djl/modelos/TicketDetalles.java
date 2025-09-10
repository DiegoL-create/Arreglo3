
package djl.modelos;

public class TicketDetalles {
    private byte cantidadPro;
    private double costoP;
    private double importe;
    private double subTotal;
    private double total;
    private double factura;   

    public TicketDetalles(byte cantidadPro, double costoP, double importe, double subTotal, double total, double descuento) {
        this.cantidadPro = cantidadPro;
        this.costoP = costoP;
        this.importe = importe;
        this.subTotal = subTotal;
        this.total = total;
        this.factura=factura;
    }
    public void setFactura(){
        this.factura=factura;
    }
    public double getFactura(){
        return factura;
    }

    public byte getCantidadPro() {
        return cantidadPro;
    }

    public void setCantidadPro(byte cantidadPro) {
        this.cantidadPro = cantidadPro;
    }

    public double getCostoP() {
        return costoP;
    }

    public void setCostoP(double costoP) {
        this.costoP = costoP;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSubTotal() {
        return subTotal;
    }
    

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        Ticket.setTotalVenta(this.subTotal*this.factura);
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public void CalcularImporte(){
        this.importe=this.cantidadPro*this.costoP;
    }
    public void generarSubtotal(){
        this.subTotal+=this.importe;
    } 
    public void generarSubtotal(double subTotal ){
        this.factura=this.subTotal*0.16;
    }
    public void generarTotal1(){
        Ticket.setTotalVenta(this.subTotal+this.factura);
    }
    public void generarTotal1( double factura){
        Ticket.setTotalVenta(this.subTotal*this.factura);
    }
}
