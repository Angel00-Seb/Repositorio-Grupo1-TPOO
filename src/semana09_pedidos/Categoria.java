package semana09_pedidos;

public class Categoria {
    private int idCategoria; // agregado
    private String Tipo;

    public Categoria() {
    }

    public Categoria(int idCategoria, String Tipo) { // agregado el idCategoria
        this.idCategoria = idCategoria;
        this.Tipo = Tipo;
    }

    // Getters y setters
    public int getIdCategoria() { // get de idCategoria
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) { // set de idCategoria
        this.idCategoria = idCategoria;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    // Simulan las operaciones crearCategoria() y obtenerProductos()
    public void crearCategoria() {
    }

    public void obtenerProductos() {
    }

    // Método toString
    @Override
    public String toString() {
        return " 'CATEGORIA' " + " ID_CATEGORIA:" + idCategoria + ", TIPO:" + Tipo;
    }

}
