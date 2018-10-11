# 🧰 Collections

A Sun criou um conjunto de classes e interfaces
(Collections Framework) para suprir necessidade de
estruturas de dados básica, como lista ligadas e
tabelas de espalhamento.

## 📜 ArrayList

**List**: herda de Collection. Modela listas de dados, onde os elementos (repetidos ou não) estão ordenados;

**ArrayList**: implentação de List, usa métodos não sincronizados.

**Criando uma ArrayList de forma genérica**

```java
List lista = new ArrayList();
```

A lista é dinâmica e genérica , ou seja, pode ser utilizada para qualquer tipo de objeto.

```java
public interface List<E> extends Collection<E>
```

**Exemplo:**

```java
List<ContaCorrente> contas = new ArrayList();
```

As coleções tem como base a interface `Collection`,
que define métodos para adicionar e remover um
elemento, entre outros:

```java
boolean add(Object);
boolean remove(Object);
int size();
boolean contains();
Iterator iterator();
```

## 🗺️ Map

Podemos utilizar o Map quando nos referimos a
objetos que podem ser encotrados por meio de uma
chave dentro de uma coleção.

**Exemplo:** Conta de um cliente pelo cpf.

Um mapa é composto por um conjunto de
associações entre um objeto chave a um objeto
valor

**Map:** herda da Collection, modela mapeamentos entre
chaves não-repetidas a valores;

**HashMap:** implementa Map, modela mapas não
classificados, com métodos não-sincronizados;

```java
Map<String, ContaCorrente> mapaDeContas = new HashMap<String,ContaCorrente>();

// adiciona duas chaves e seus respectivos valores
mapaDeContas.put("diretor", new ContaCorrente());
mapaDeContas.put("gerente", new ContaCorrente());
// qual a conta do diretor? (sem casting!)
ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
```

## Boas práticas com coleções

- Criar uma coleção já com uma capacidade grande, para
  evitar o excesso de redimensionamento.
- Evite usar coleções que guardam os elementos pela sua
  ordem de comparação quando não há necessidade.
- Não itere sobre uma List utilizando um for de 0 até list.size()
  e usando get(int) para receber os objetos. Enquanto isso
  parece atraente, algumas implementações da List não são de
  acesso aleatório como a LinkedList, fazendo esse código ter
  uma péssima performance computacional. (use for
  avançado, que por sua vez usa Iterators)
