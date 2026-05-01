package strategy;

public class FreteTransportadora implements CalculoFrete {
    public float calcular(float distancia, float peso) {
        // Transportadora cobra barato pela distância, mas tem taxa maior por kg
        return (distancia * 0.2f) + (peso * 10.0f);
    }
}