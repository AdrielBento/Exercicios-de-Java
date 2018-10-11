# ❔ Generics

São mecanismos para criação de tipos
parametrizados.

Classes e métodos podem funcionar com uma
variedade de tipos

#### Exemplo:

Utilização casting ao se obter os dados de uma lista com multiplos tipos,possibilitando erros de conversão.

```java
public static void main(String[] args){
    List lista = new ArrayList();
    lista.add(new Integer(0));
    lista.add("1");
    lista.add(new Integer(2));
    Integer i1 = (Integer) lista.get(0);
    //Erro:String cannot be cast to Integer
    Integer i2 = (Integer) lista.get(1);
}
```

Com o uso de genéricos estes problemas seriam
facilmente resolvidos.

```java
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(new Integer(0));
        lista.add("1"); //erro de compilação
        lista.add(new Integer(2));
        Integer i1 = lista.get(0);
        Integer i2 = lista.get(1);
    }
```

## Classes Genéricas

**Criando uma classe genérica**

```java
public class NomeClasse<T>{

}
```

**Atributo Genérico**

```java
private T valor;
```

**Getters e Setters Genéricos**

```java
public void setValor(T valor){
    this.valor = valor;
}

public T getValor(){
    return this.valor;
}
```

## Limites superiores e inferiores

#### Limites superiores: <? extends T>

- Aceita T e todos os seus descendentes
  **Ex: se T for Collection, aceita List, Set, ArrayList, etc.**

```java
public <T extends Superficie> double calculaArea(T[] formas) {

    double total = 0.0;
    for(Superficie object : formas) {
        total += object.area();
    }
    return total;
}

public Number teste(Inteiro<T extends Number> valor){
    return valor*4
}
```

#### Limites inferiores: <? super T>

- Aceita T e todos os seus ascendentes
  **Ex: se T for ArrayList, aceita List, Collection, Object**

### ✔️ Vantagens :

- Permitem que classes ou métodos operem sobre
  objetos de diversos tipos
- Provê verificação em tempo de compilação e
  execução
- Eliminam a necessidade de operações de coerção
  (type casting)
