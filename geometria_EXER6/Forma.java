package geometria_EXER6;

abstract class Forma {

    private String cor;
    private boolean preenchido;

    public Forma() {
        cor = "Vermelho";
        preenchido = true;
    }

    abstract public double getArea();
    abstract public double getPerimetro();
}