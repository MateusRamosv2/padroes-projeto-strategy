package strategy;

public class Pedido {

    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFretePadrao(float distancia, float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, peso);
        this.valorFrete = calculadora.calcular(new FretePadrao());
    }

    public void calcularFreteExpresso(float distancia, float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, peso);
        this.valorFrete = calculadora.calcular(new FreteExpresso());
    }

    public void calcularFreteTransportadora(float distancia, float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, peso);
        this.valorFrete = calculadora.calcular(new FreteTransportadora());
    }

    public void calcularFreteFixo(float distancia, float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, peso);
        this.valorFrete = calculadora.calcular(new FreteFixo());
    }

    public void calcularFreteDrone(float distancia, float peso) {
        CalculadoraFrete calculadora = new CalculadoraFrete(distancia, peso);
        this.valorFrete = calculadora.calcular(new FreteDrone());
    }
}