package strategy;

public class FreteFixo implements CalculoFrete {
    public float calcular(float distancia, float peso) {
        // Frete fixo ignora a distância e o peso
        return 50.0f;
    }
}