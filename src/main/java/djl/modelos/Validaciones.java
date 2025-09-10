package djl.modelos;
public class Validaciones extends Exception {
    public Validaciones(String msg){
        super (msg);
    }
    public static void validarCampo(String dato) throws Validaciones{
        if(dato.isBlank()||dato.isEmpty()){
            throw new Validaciones("NO SE PERMIEN CAMPOS VACIOS!!");
        }
        else{
        if(dato.length()==1)
        {
            throw new Validaciones("NO SE PERMITE 1 CARACTER!!");
        }
        else if(dato.matches("[0-9]+"))
            
            throw new Validaciones("NO SE PERMITEN VALORES NUMERICOS!!");
            }
        }
            public static void validarId(int dato) throws Validaciones{
                        String aux=String.valueOf(dato);
            if(aux.isBlank()||aux.isEmpty()){
            throw new Validaciones("NO SE PERMIEN CAMPOS VACIOS!!");
        }
            else if(dato<0){
                throw new Validaciones("INTRODUCCE LA CANTIDAD CORRECTA");
            }
        }
            public static void validarCosto(double dato) throws Validaciones{
            String aux=String.valueOf(dato);
            if(aux.isBlank()||aux.isEmpty()){
            throw new Validaciones("NO SE PERMIEN CAMPOS VACIOS!!");
        }
            else if(dato==0){
                throw new Validaciones("INTRODUCCE EL COSTO CORRECTO");
        }
    }
            public static void validarCantidad(int dato) throws Validaciones{
                        String aux=String.valueOf(dato);
            if(aux.isBlank()||aux.isEmpty()){
            throw new Validaciones("NO SE PERMIEN CAMPOS VACIOS!!");
        }
            else if(dato<0){
                throw new Validaciones("INTRODUCCE LA CANTIDAD CORRECTA");
            }
        }
}
