package strategy;

public class FreteExpresso implements CalculoFrete {
    public float calcular(float distancia, float peso) {
        return (distancia * 1.5f) + (peso * 3.0f);
    }
}