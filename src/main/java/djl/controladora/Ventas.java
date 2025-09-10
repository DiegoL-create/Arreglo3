
package djl.controladora;
import javax.swing.JOptionPane;
import djl.modelos.*;

public class Ventas {

    public static void main(String[] args) throws Validaciones {
             int  Respuesta=1; 
         int opc=1;
         boolean bandera=true;
         
            Cliente objCliente1=new Cliente(" ", 0);
            Producto objProducto1=new Producto (0,"",0.0);
            TicketDetalles objTic1=new TicketDetalles((byte)3,0.0,0.0,0.0,0.0,0.016);
            Ticket.generarFolio();
            Ticket.generarFecha();
            do{
                try{
                     objCliente1.setName(JOptionPane.showInputDialog("introduce el nombre del cliente: "));
                     Validaciones.validarCampo(objCliente1.getName());
                     bandera=false;
                }catch(Validaciones e){
                    JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
                }
            }while (bandera);
            bandera=true;
            
                do{
                    try{
                        objCliente1.setIdCliente(Short.parseShort(JOptionPane.showInputDialog("introduce el id del cliente:  ")));
                        Validaciones.validarId(objCliente1.getIdCliente());
                        bandera=false;
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, e.getMessage()+"id no valida");
                    }
                }while(bandera);
                bandera=true;
            
                do{ 
            do{
                try{
                    objProducto1.setIdProducto(Integer.parseInt(JOptionPane.showInputDialog("introduce el id del producto: ")));
                    Validaciones.validarId(objProducto1.getIdProducto());
                    bandera=false;
                }catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, e.getMessage()+"introduce el id correcto");
                }
            }while(bandera);
            bandera=true;
            
            do{
                try{
                    objProducto1.setNombreProducto(JOptionPane.showInputDialog("introduce el nombre del producto: "));
                    Validaciones.validarCampo(objProducto1.getNombreProducto());
                    bandera=false;
                }catch(Validaciones e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }while(bandera);
            bandera=true;
            do{
                try{
                    objProducto1.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("introduce el costo del producto: ")));
                    Validaciones.validarCosto(objProducto1.getPrecio());
                    bandera=false;
                }catch(Validaciones e){
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "introduce el costo en numeros!!");
                }
            }while (bandera);
            bandera=true;
            
            do{
                try{ 
                    objTic1.setCantidadPro(Byte.parseByte(JOptionPane.showInputDialog("introduce la cantidad del producto: ")));
                    Validaciones.validarCantidad(objTic1.getCantidadPro());
                    bandera=false;
                }catch(Validaciones e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }catch(NumberFormatException e){
                    JOptionPane.showInternalMessageDialog(null, "la cantidad se introduce en numero por favor!!");
                }
            }while (bandera);
            bandera=true;
            
           objTic1.setCostoP(objProducto1.getPrecio());
           objTic1.CalcularImporte();
           objTic1.generarSubtotal();
           
           ImprimirTicket.setObjCliente1(objCliente1);
           ImprimirTicket.setObjTic1(objTic1);
           ImprimirTicket.AgregarPro();
          Respuesta=Integer.parseInt(JOptionPane.showInputDialog("¿hay algun otro articulo que desea comprar (si 1 /no 2): ")); 
            }while(Respuesta==1);
            
            opc=Integer.parseInt(JOptionPane.showInputDialog("deseas facturar:"+"\n"
                    + "1. si deseo facturar"+"\n"
                    + "2. no deseo facturar gracias"));
            switch (opc){
                case 1: objTic1.generarSubtotal(objTic1.getSubTotal());
                break;
                case 2: objTic1.generarTotal1(objTic1.getFactura());
            }
            objTic1.generarTotal1();
            JOptionPane.showMessageDialog(null, ImprimirTicket.generarTicket()); 
    }
}
