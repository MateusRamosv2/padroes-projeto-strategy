package strategy;

public class FretePadrao implements CalculoFrete {
    public float calcular(float distancia, float peso) {
        return (distancia * 0.5f) + (peso * 2.0f);
    }
}