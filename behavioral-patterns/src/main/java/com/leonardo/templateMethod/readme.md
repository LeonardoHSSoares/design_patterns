# Padrão Template Method (pacote `templateMethod`) ✅

Este README descreve o propósito do padrão **Template Method** e como ele foi aplicado no pacote `com.leonardo.templateMethod` do projeto.

## Visão geral

O padrão **Template Method** define o esqueleto de um algoritmo em uma operação, deixando alguns passos para que subclasses implementem. Ele permite que subclasses redefinam etapas específicas do algoritmo sem alterar sua estrutura geral.

---

## Como foi aplicado no projeto

- **Classe base:** `Worker` 🧭
  - Define o *template method* `performDuties()` (final) que organiza a sequência de passos: `startWork()`, `doWork()`, `takeBreak()`, `finishWork()`.
  - Declara os métodos abstratos/protegidos que representam os passos do algoritmo (as "partes mutáveis").

- **Subclasses concretas:** `Bombeiro` e `Policial` 🚒👮
  - Implementam os métodos abstratos definidos em `Worker`, fornecendo comportamentos específicos para cada tipo de trabalhador.
  - A execução do `performDuties()` segue a mesma sequência para todas as subclasses; apenas o comportamento interno muda.

> Observação: o método `performDuties()` é marcado como `final` para garantir a estrutura do algoritmo e evitar que subclasses alterem a ordem dos passos.

---

## Por que usar este padrão 💡
- **Vantagens:**
  - Reutilização do fluxo geral (evita duplicação de código).
  - Facilita a extensão com novas variantes (novas subclasses) sem modificar a lógica comum.
  - Torna explícita a sequência de etapas do algoritmo.
- **Desvantagens / Trade-offs:**
  - Pode introduzir muitas subclasses se houver muitas variantes.
  - Menor flexibilidade se for necessária alteração da sequência de passos em tempo de execução.

---

## Exemplo rápido de uso

```java
Policial policial = new Policial();
policial.performDuties();

Bombeiro bombeiro = new Bombeiro();
bombeiro.performDuties();
```

No projeto existe uma classe `com.leonardo.Main` que demonstra esse comportamento executando ambas as implementações.

---

## Recomendações
- Use Template Method quando você tiver um algoritmo com um esqueleto fixo e passos que podem variar entre implementações.
- Mantenha o *template method* claro e simples; delegue comportamentos específicos para métodos protegidos/abstratos nas subclasses.

---

Se quiser, eu posso adicionar um exemplo extra (mais passos/hook methods) ou criar uma nova subclasse demonstrando outro tipo de `Worker`. 🚀
