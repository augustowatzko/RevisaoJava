package cartas_EXER8;

public class Carta {
    private String naipe;
    private String valor;

    public Carta(String naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}
