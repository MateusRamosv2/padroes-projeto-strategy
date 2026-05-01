package strategy;

public class FreteDrone implements CalculoFrete {
    public float calcular(float distancia, float peso) {

        if (peso > 2.0f) {
            throw new IllegalArgumentException("Drone não suporta cargas maiores que 2kg");
        }
        else {
            return (distancia * 5.0f) + (peso * 1.0f);
        }
    }
}