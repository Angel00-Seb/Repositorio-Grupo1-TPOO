package semana09_pedidos;


public class Juridico extends Cliente{
    private String Ruc;
    private String Razon_Social;
    private String Fax;
    private String Contacto;

    public Juridico() {
    }

    public Juridico(String Ruc, String Razon_Social, String Fax, String Contacto, String Direccion, String Telefono, String Email) {
        super(Direccion, Telefono, Email);
        this.Ruc = Ruc;
        this.Razon_Social = Razon_Social;
        this.Fax = Fax;
        this.Contacto = Contacto;
    }

    public String getRuc() {
        return Ruc;
    }

    public void setRuc(String Ruc) {
        this.Ruc = Ruc;
    }

    public String getRazon_Social() {
        return Razon_Social;
    }

    public void setRazon_Social(String Razon_Social) {
        this.Razon_Social = Razon_Social;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }

    @Override
    public String toString() {
        return "Juridico{" + "Ruc=" + Ruc + ", Razon_Social=" + Razon_Social + ", Fax=" + Fax + ", Contacto=" + Contacto + '}' + super.toString();
    }
    
}
