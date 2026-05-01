# Padrões de Projeto - Strategy

---

## Estrutura do Projeto

- **Interface (A Estratégia):** `CalculoFrete` → Define o contrato base (assinatura) que todas as regras de negócio de cálculo de frete do sistema devem obrigatoriamente implementar.
- **Classes Concretas (Os Algoritmos):** `FretePadrao`, `FreteExpresso`, `FreteTransportadora`, `FreteFixo` e `FreteDrone` → Implementam a interface utilizando lógicas matemáticas e regras de negócio completamente diferentes umas das outras, tornando-as intercambiáveis sem uso de estruturas condicionais (`if/else`).
- **Contexto (O Motor de Cálculo):** `CalculadoraFrete` → Classe que armazena os dados de entrada (distância e peso) e recebe a estratégia escolhida dinamicamente. Ela apenas executa o método `calcular()` da interface, sem se importar com qual classe concreta foi passada (Polimorfismo).
- **Cliente (Contexto de Uso):** `Pedido` → Classe que orquestra a operação. É ela quem instancia a `CalculadoraFrete`, decide qual a estratégia concreta ideal para a situação atual, passa essa estratégia como parâmetro e armazena o resultado final do frete.
- **Testes:** `PedidoTest` → Valida se as equações matemáticas de cada estratégia retornam os valores exatos esperados e garante a integridade de regras de negócio específicas (como o lançamento de exceção `IllegalArgumentException` caso o Drone exceda o limite de peso) utilizando o JUnit.

---

## Diagrama de Classes

Abaixo está o diagrama de classes representando a estrutura da implementação. O grande destaque é o leque de estratégias concretas apontando para a interface `CalculoFrete`, e as dependências isoladas, ilustrando perfeitamente a delegação da responsabilidade e o encapsulamento dos algoritmos, característicos do padrão Strategy.

<img width="1523" height="675" alt="Diagrama (Strategy)" src="https://github.com/user-attachments/assets/631fbd36-378d-4d67-82a3-efa27b185136" />
