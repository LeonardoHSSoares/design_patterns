# Padrão Abstract Factory (pacote `abstractFactory`) ✅

Este README descreve o propósito de cada classe no pacote `com.leonardo.abstractFactory` e quando utilizar este padrão.

## Visão geral

O padrão **Abstract Factory** fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas. No projeto, cada fábrica cria um tipo específico de carro (Passeio, Esportivo, Hatch, Sedan, SUV).

---

## Estrutura e classes

### `ICarro` 🔧
- **Tipo:** Interface (produto abstrato)
- **O que faz:** Define a API comum para todos os tipos de carro (`exibirInfo()`, `getAno()`, `getModelo()`, `getCombustivel()`).
- **Por que usar:** Permite manipular objetos de diferentes implementações de carro de forma uniforme.

---

### Produtos concretos (implementam `ICarro`) 🚗
- **`Passeio`**, **`Esportivo`**, **`Hatch`**, **`Sedan`**, **`SUV`**
- **O que fazem:** Cada classe representa uma família/concreto de carro com seus campos e implementação de `exibirInfo()`.
- **Por que usar:** Permitem especializar comportamento ou atributos por categoria de carro mantendo a mesma interface.

---

### `IFabricaDeCarros` 🏭
- **Tipo:** Interface da fábrica (Abstract Factory)
- **O que faz:** Declara o método `criarCarro(String modelo, int ano, String combustivel)`.
- **Por que usar:** Fornece um contrato para criar produtos (carros) sem acoplar o código às classes concretas.

---

### Fábricas concretas (implementam `IFabricaDeCarros`) 🔁
- **`FabricaPasseio`**, **`FabricaEsportivo`**, **`FabricaHatch`**, **`FabricaSedan`**, **`FabricaSUV`**
- **O que fazem:** Implementam `criarCarro(...)` e retornam instâncias dos respectivos tipos de carro.
- **Por que usar:** Encapsulam a criação de objetos concretos; facilita trocar toda uma "família" de produtos criando outra fábrica.

---

### `FabricaLeonardo` ▶️
- **Tipo:** Classe demonstrativa com `main`
- **O que faz:** Mostra exemplos de uso das fábricas para criar e exibir informações de diferentes carros.
- **Por que usar:** Ponto de entrada para testes manuais e entendimento do fluxo do pattern.

---

## Recomendações e trade-offs 💡
- **Quando usar:** Quando o sistema precisa criar famílias de objetos relacionados e quer desacoplar o código cliente das implementações concretas.
- **Vantagens:** Facilita manutenção, extensão e substituição de famílias inteiras de produtos.
- **Desvantagens:** Aumenta o número de classes e pode ser overkill para casos simples onde apenas um tipo de produto é necessário.

---

## Exemplo rápido de uso

```java
IFabricaDeCarros fabrica = new FabricaPasseio();
ICarro carro = fabrica.criarCarro("Palio", 1995, "Gasolina");
carro.exibirInfo();
```

---

Se quiser, posso adicionar diagramas simples, exemplos mais detalhados ou testes unitários que comprovem o comportamento de criação das fábricas. 🔧