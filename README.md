# design_patterns 🎯

Repositório com implementações e exemplos de **Design Patterns** em Java. O objetivo é manter implementações didáticas e executáveis que ilustrem padrões comuns usados em projetos reais.

---

## Tipos de Patterns (visão geral)

- **Creational (Padrões de Criação)** 🔧
  - Definem como criar objetos de forma flexível e desacoplada.
  - Exemplos neste repositório: **Abstract Factory**, **Singleton**.
  - Leia o README específico: `src/main/java/com/leonardo/abstractFactory/readme.md` e `src/main/java/com/leonardo/singleton/readme.md`.

- **Structural (Padrões Estruturais)** 🧩
  - Tratam de como compor classes e objetos para formar estruturas maiores e reutilizáveis.
  - (Ainda não há implementações dedicadas neste repositório — contributions são bem-vindas.)

- **Behavioral (Padrões Comportamentais)** 🔁
  - Focam em comunicação e responsabilidades entre objetos.
  - (Ainda não há implementações dedicadas neste repositório — contributions são bem-vindas.)

---

## Estrutura do projeto

- `creational-patterns/` – contém exemplos de padrões de criação (implementações em `com.leonardo.abstractFactory` e `com.leonardo.singleton`).
- Cada pacote tem um `readme.md` explicando as classes e quando usar cada variação.

---

## Como executar

- Rode as classes `FabricaLeonardo` e `MainSingleton` pela sua IDE (ex.: Run → `com.leonardo.abstractFactory.FabricaLeonardo`).
- Opcional (Maven + plugin `exec`):

```bash
# Exemplo: executar AbstractFactory
mvn -f creational-patterns exec:java -Dexec.mainClass="com.leonardo.abstractFactory.FabricaLeonardo"

# Exemplo: executar demonstração de Singleton
mvn -f creational-patterns exec:java -Dexec.mainClass="com.leonardo.singleton.MainSingleton"
```

> Nota: se o plugin `exec` não estiver configurado, execute as classes diretamente pela IDE ou adicione o plugin ao `pom.xml`.

---

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para:
- Adicionar mais padrões (especialmente Structural e Behavioral);
- Melhorar exemplos e adicionar testes unitários e concorrência quando aplicável;
- Documentar decisões e trade-offs no README do pacote correspondente.

Por favor, abra um Pull Request e descreva a mudança.

---

## Licença

Este projeto segue a licença presente no arquivo `LICENSE`.

---


