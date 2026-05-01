package strategy;

public class CalculadoraFrete {

    private float distancia;
    private float peso;

    public CalculadoraFrete(float distancia, float peso) {
        this.distancia = distancia;
        this.peso = peso;
    }

    public float calcular(CalculoFrete estrategiaFrete) {
        return estrategiaFrete.calcular(distancia, peso);
    }
}
