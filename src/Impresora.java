import java.util.ArrayList;

public class Impresora {
    private boolean estado;
    private ArrayList<DocumentoOfimatico> colaImpresion = new ArrayList<>();

    public Impresora() {
        this.estado = false;
    }

    public void anadirTrabajo(DocumentoOfimatico documentoOfimatico) {
        if (this.estado) {
            colaImpresion.add(documentoOfimatico);
        } else {
            System.out.println("Documento rechazado. Impresora apagada");
        }
    }

    public int colaImpresionSize() {
        return colaImpresion.size();
    }

    public boolean isEstado() {
        return estado;
    }

    public void encenderImpresora() {
        this.estado = true;
    }

    public void apagarImpresora() {
        this.estado = false;
    }

    public DocumentoOfimatico imprimir() {
        return colaImpresion.remove(0);
    }


    @Override
    public String toString() {
        return "Impresora{" +
                ", colaImpresion=" + colaImpresion +
                '}';
    }
}
