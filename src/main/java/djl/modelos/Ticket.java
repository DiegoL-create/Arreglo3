package djl.modelos;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Ticket {
    private static int folio;
    private static String fecha;
    private static double totalVenta;

    public static int getFolio() {
        return folio;
    }

    public static String getFecha() {
        return fecha;
    }
    public static double getTotalVenta() {
        return totalVenta;
    }

    public static void setTotalVenta(double totalVenta) {
        Ticket.totalVenta = totalVenta;
    }
    
    public static void generarFolio(){
        Ticket.folio++;
    }
    public static void generarFecha(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy  hh:mm:ss");
        Ticket.fecha=dtf.format(LocalDateTime.now());
    }
}