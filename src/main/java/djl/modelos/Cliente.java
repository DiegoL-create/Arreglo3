package djl.modelos;
public class Cliente {
    private String name;
    private int idCliente;

    public Cliente(String name, int idCliente) {
        this.name = name;
        this.idCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(short idCliente) {
        this.idCliente = idCliente;
    }
    
}