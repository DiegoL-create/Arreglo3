package djl.modelos;

public class ImprimirTicket {
    private static Cliente objCliente1;
    private static TicketDetalles objTic1;
    
    private static String agregarPro="";
    public static void setObjCliente1(Cliente objCliente1) {
        ImprimirTicket.objCliente1 = objCliente1;
    }

    public static void setObjTic1(TicketDetalles objTic1) {
        ImprimirTicket.objTic1 = objTic1;
    }
    
    public static void AgregarPro(){
        ImprimirTicket.agregarPro+="                 "+objTic1.getCantidadPro()+"                      "+objTic1.getCostoP()+"                             "+objTic1.getImporte()+"\n";
    }
    public static String generarTicket(){
        String ticketInformacion=" *****************cuidado con el perro********************\n";
        ticketInformacion+="Fecha:  "+Ticket.getFecha()+"\n"+
                "Folio:    "+Ticket.getFolio()+"\n"+
                "Nombre cliente:  "+objCliente1.getName()+"\n"+
                "CANTIDAD----------------COSTO------------------IMPORTE\n"+
                ImprimirTicket.agregarPro+"\n"+
                "Subtotal:    "+objTic1.getSubTotal()+"\n"+
                "Factura: "+objTic1.getFactura()+"\n"+
                "Total:   "+Ticket.getTotalVenta();
        return ticketInformacion;
    }
}
