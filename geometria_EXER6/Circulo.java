package geometria_EXER6;

public class Circulo extends Forma {

    private double raio;

    public Circulo(double raio) {
        super();
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
}