package semana09_pedidos;


public class Categoria {
    private String Tipo;

    public Categoria() {
    }

    public Categoria(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    //Método toString
    @Override
    public String toString() {
        return "Categoria{" + "Tipo=" + Tipo + '}';
    }
    
}
