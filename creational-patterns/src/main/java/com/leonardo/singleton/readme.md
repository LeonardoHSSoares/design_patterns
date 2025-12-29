# Padrão Singleton (pacote `singleton`) ✅

Este README explica o propósito de cada classe presente no pacote `com.leonardo.singleton` e quando utilizar cada variação do padrão Singleton.

## Visão Geral

O padrão Singleton garante que uma classe tenha apenas uma instância durante a execução da aplicação e fornece um ponto global de acesso a ela. Existem múltimas formas de implementá-lo em Java, com trade-offs relacionados a inicialização (eager vs lazy), desempenho e segurança em ambientes concorrentes.

---

## Classes do pacote

### `SingletonEager` ⚡
- **O que faz:** Instancia o singleton no carregamento da classe (inicialização imediata).
- **Por que usar:** Simples e naturalmente *thread-safe* sem sincronização adicional.
- **Trade-offs:** Instância criada mesmo que não seja utilizada; pode desperdiçar recursos se a criação for cara.

Exemplo de uso:
```
SingletonEager.getInstance().doSomething();
```

---

### `SingletonLazy` 💤
- **O que faz:** Cria a instância apenas quando `getInstance()` é chamado pela primeira vez (lazy initialization).
- **Por que usar:** Evita custo de criação quando a instância talvez não seja necessária.
- **Trade-offs:** Implementação simples geralmente **não é thread-safe**; não recomendada em ambientes concorrentes sem proteção adicional.

---

### `SingletonDCL` (Double-Checked Locking) 🔒
- **O que faz:** Usa a técnica de double-checked locking com variável `volatile` para possibilitar inicialização *lazy* segura em ambientes multi-thread.
- **Por que usar:** Boa opção quando quer-se lazy initialization e também performance (sincronização apenas na primeira criação).
- **Trade-offs:** Mais complexa; requer `volatile` e atenção a detalhes de memória/visibilidade.

---

### `SingletonHolder` (Initialization-on-demand holder idiom) 🧩
- **O que faz:** Utiliza uma classe estática interna que contém a instância; a JVM garante inicialização segura e *lazy*.
- **Por que usar:** Geralmente a melhor opção: simples, *thread-safe*, e com inicialização lazy sem sincronização explícita.
- **Trade-offs:** Recomendado na maioria dos cenários que precisam de singleton *lazy* e seguro.

---

### `MainSingleton` ▶️
- **O que faz:** Classe de demonstração que mostra como obter instâncias das diferentes implementações e ilustrar comportamento.
- **Por que usar:** Útil para testes manuais e verificação de funcionamento.

---

## Recomendações rápidas 💡
- Use **`SingletonHolder`** quando quiser lazy initialization segura e simples.
- Use **`SingletonEager`** quando a instância for barata ou sempre necessária e você quer simplicidade.
- Use **`SingletonDCL`** se precisa de lazy initialization e estiver confortável com a complexidade do padrão DCL.
- **Evite** usar a implementação lazy simples (`SingletonLazy`) em aplicações concorrentes sem adicionar sincronização.

---

## Como executar (rápido)
- Rode a classe `MainSingleton` como uma aplicação Java para ver exemplos de uso e saída.

---
