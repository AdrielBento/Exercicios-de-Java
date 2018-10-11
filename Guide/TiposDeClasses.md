# 📮 Classe Aninhada

Por meio da linguagem Java é possível a declaração
aninhada de classes, ou seja, uma classe dentro da outra.
Recebe o nome de classe interna ou inner class.

```java
public class Externa {
    private int valor;
    public Externa(int valor) { this.valor = valor; }
    public class Aninhada {
        public void exibir() {
        System.out.println("valor = "+ valor);
        }
    }
}
```

```java
Externa externa = new Externa(10);
// instanciação da classe aninhada
Externa.Aninhada aninhada = externa.new Aninhada();

// ou se a classe aninhada for Static
Exeterna.Aninhada aninhada = Exeterna.Aninhada();
```

# 👥 Classe Anônima

É uma classe interna auxiliar sem nome, definida
como uma subclasse ou realização de uma
interface.

- O objetivo é instanciar um único objeto desta
  classe.
- Este objeto é de uma classe que extende de outra
  classe ou implementa uma interface.

```java
public class Carro{
    public void acelerar(){
        System.out.println("100km");
    }
}

public class Gol{
    Carro car = new Carro(){
        public void acelerar(){
            System.out.println("50km");
        }
    }
}
```

Classes finais não podem ser anônimas(O modificador final na frente de uma classe significa
que a classe não pode ser herdada).

Incluir métodos não referenciados na classe pai ou
na interface em uma classe anônima, fará com que
sejam inacessíveis da sua instância.

```java
class Gol{
    Carro car = new Carro(){
        public void acelerar(){
            System.out.println("50km");
        }
        // Erro: Esse metodo não existe na classe Carro
        public void frear(){
            System.out.println("0km");
        }
    }
}
```

# 📦 Classe Wrapper

As classes Wrapper são classes que encapsulam
tipos primitivos na forma de objetos.

Os tipos Wrappres por se tratar de objetos agregam
funcionalidades de conversão e tratamento.

As classes Wrappers podem ser utilizadas para: conversão
de tipos,conversão de base, parse de string para algum
tipo primitivo,entre outros.

### 📥 Boxing

Permite atribuir valores primitivos para referências
do tipo wrapper:

```java
// é equivalente a Double objD = new Double(-2.75);
Double objD = -2.75; // boxing
// ----- Lista ------
List<Integer> lista = new ArrayList();
//Adicionando um tipo primitivo em uma lista de Integer(Wrapper)
lista.add(1);
```

### 📤 Unboxing

Atribuição de objetos wrapper a variáveis de tipo
primitivo:

```java
Double objD = new Double(2.3);
// é equivalente a double vd = objD.doubleValue();
double vd=objD; // unboxing
```
