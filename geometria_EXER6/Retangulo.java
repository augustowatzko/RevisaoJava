package geometria_EXER6;

public class Retangulo extends Forma {

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        super();
        this.comprimento = comprimento;
        this.largura = largura;
    }

    @Override
    public double getArea() {
        return comprimento * largura;
    }

    @Override
    public double getPerimetro() {
        return 2*comprimento + 2*largura;
    }
}