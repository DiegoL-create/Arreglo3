package djl.modelos;
import java.text.NumberFormat;
public class Configuracion {
    public static NumberFormat objNF;
    
    public static String formaMoneda(double precio){
        objNF=NumberFormat.getCurrencyInstance();
        return objNF.format(precio);
    }
}
