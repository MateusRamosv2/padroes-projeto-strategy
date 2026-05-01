package strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFretePadrao() {
        Pedido pedido = new Pedido();
        pedido.calcularFretePadrao(100.0f, 5.0f);

        assertEquals(60.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteExpresso() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteExpresso(100.0f, 5.0f);

        assertEquals(165.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteTransportadora() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteTransportadora(100.0f, 5.0f);

        assertEquals(70.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteFixo() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteFixo(100.0f, 5.0f);

        assertEquals(50.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteDrone() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteDrone(10.0f, 1.5f);

        assertEquals(51.5f, pedido.getValorFrete());
    }

    @Test
    void naoDeveCalcularFreteDroneComPesoExcedido() {
        try {
            Pedido pedido = new Pedido();
            pedido.calcularFreteDrone(10.0f, 3.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Drone não suporta cargas maiores que 2kg", e.getMessage());
        }
    }
}