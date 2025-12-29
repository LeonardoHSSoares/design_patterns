# Padrão Builder (pacote `builder`) ✅

Este README descreve o propósito das classes no pacote `com.leonardo.builder` e demonstração do padrão Builder presente no projeto (exemplo: `fastfood`).

## Visão geral

O padrão **Builder** separa a construção de um objeto complexo da sua representação, permitindo que a mesma construção gere diferentes representações. No projeto, o exemplo principal do pacote é a construção de **burgers** (hambúrgueres) usando um `Gerente` (diretor) e diferentes `BurgerBuilder`s.

---

## Estrutura e classes

### `Burger` 🍔
- **Tipo:** Produto (classe concreta)
- **O que faz:** Representa o objeto complexo que está sendo construído. Possui campos como `bun`, `patty`, `cheese`, `sauce`, `veggies` e método `exibeBurguer()` para exibir os detalhes.

### `BurgerBuilder` 🛠️
- **Tipo:** Builder (abstrato)
- **O que faz:** Define os passos abstratos para construir as partes do `Burger` (`buildBun()`, `buildPatty()`, `buildCheese()`, `buildSauce()`, `buildVeggies()`) e um método `build()` que retorna o `Burger` final.

### `CheeseBurguerBuilder` e `VeggieBurgerBuilder` 🔁
- **Tipo:** Builders concretos
- **O que fazem:** Implementam os passos definidos em `BurgerBuilder` para construir variações específicas de burgers (ex: cheeseburger com ingredientes gerados por `Faker`, veggie burger com ingredientes fixos).

### `Gerente` (diretor) 👨‍🍳
- **O que faz:** Recebe um `BurgerBuilder`, executa os passos de construção na ordem correta e retorna o `Burger` finalizado via `criaBurger()`.

### `AppRestaurante` ▶️
- **O que faz:** Classe com `main` que demonstra a criação de diferentes burgers usando o `Gerente` e os `BurgerBuilder`s.

> Observação: O sub-pacote `carros` está disponível na estrutura, mas está vazio neste repositório (pode ser usado como exercício para aplicar o Builder a `Carro`).

---

## Quando usar 💡
- Quando a criação de um objeto envolve vários passos e combinações possíveis.
- Quando se quer isolar a lógica de construção e permitir diferentes representações do produto final.

---

## Exemplo rápido de uso

```java
Gerente gerente = new Gerente();

BurgerBuilder cheeseBuilder = new CheeseBurguerBuilder();
gerente.setBurgerBuilder(cheeseBuilder);
Burger cheeseBurger = gerente.criaBurger();
cheeseBurger.exibeBurguer();

BurgerBuilder veggieBuilder = new VeggieBurgerBuilder();
gerente.setBurgerBuilder(veggieBuilder);
Burger veggieBurger = gerente.criaBurger();
veggieBurger.exibeBurguer();
```

---

## Como executar (rápido)
- Rode a classe `com.leonardo.builder.fastfood.AppRestaurante` como uma aplicação Java para ver exemplos de uso e saída.

---

## Recomendações e trade-offs 🔧
- **Vantagens:** Flexibilidade para criar variações complexas de objetos, código cliente desacoplado da construção. 
- **Desvantagens:** Aumenta o número de classes (mais código boilerplate) e pode ser overkill para objetos simples.

---

