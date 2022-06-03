public class DocumentoOfimatico {
    private String nombre;
    private String tamano;

    public DocumentoOfimatico(String nombre, String tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "DocumentoOfimatico{" +
                "nombre='" + nombre + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }
}
