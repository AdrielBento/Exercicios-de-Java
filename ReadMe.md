# 💎Exercicios de JAVA™️ ☕

### Repositório criado para compartilhar exercicios e trabalhos de Java realizados na **UFPR**🏫.
![coder](https://cdn.dribbble.com/users/1162077/screenshots/3848914/programmer.gif)

## 📜Regras :
 * Commits de novos trabalhos e exercicios resolvidos ✔️
 * Lista de exercicios de Java para serem resolvidos ✔️
 * Fazer commits com bugs ❌
 * Fazer commits de outras linguagens ❌

## 📚Dicas:

 > ##  🔤 Formatação no output 
##### **System.out.printf** - Usado para formatar a saida.Os formatos sempre começam com "%",  a saída são separadas por vírgulas:
* %s = String
* %d = Inteiro
* %f = número com ponto flutuante. Na verdade o "f" representa a vírgula. 
* \t = tabulação
* \n = salto de linha
 #### ✏️💬 ex: 
 ```java 
 System.out.printf("A velocidade media e de %.2f",velocidade);// Imprime duas casas depois da virgula
 ``` 
 
 
> ## 💯 Math class
* **pow (base, expoente)** - calcula a potência da base elevada ao expoente. **ex : Math.pow(2, 10)**
* **sqrt (número)** - calcula a raíz quadrada de um número. **ex: Math.sqrt(121)**
* **abs (número)** - retorna o valor absoluto do mesmo tipo do parâmetro (ex.: inteiro retorna int positivo, decimal retorna float positivo, etc)
* **ceil (decimal)** - este método retorna o valor decimal do parâmetro sem a parte fracionada. Ex.: 2.1 será 2, 6.0 será 6, 10.8 será 10...
* **floor (decimal)** - este método retorna o primeiro inteiro após o valor decimal. Ex.: 2.1 será 3, 6.0 será 6, 10.8 será 11...
* **rint (decimal)** - retorna um valor double mais próximo do valor do parâmetro.
* **round (decimal)** - retorna o arredondamento aritmético do número decimal passado como parâmetro

> ## ♻️ Casting
##### Na linguagem Java, é possível se atribuir o valor de um tipo de variável a outro tipo de variável, porém para tal é necessário que esta operação seja apontada ao compilador. A este apontamento damos o nome de casting.

##### É possível fazer conversões de tipos de ponto flutuante para inteiros, e inclusive entre o tipo caractere, porém estas conversões podem ocasionar a perda de valores, quando se molda um tipo de maior tamanho, como um double dentro de um int.

* Conversão do double 5.0 para float.
 ```java 
float a  = (float) 5.0;
 ```
* Conversão de double para int.
```java 
int b = (int) 5.1987;
 ```
 * Conversão de int para float é implícito, não precisa de casting.
 ```java 
float c = 100;
 ```
* Conversão de char para int é implícito, não precisa de casting.
 ```java 
int d = 'd';
 ```
##### *O casting ocorre implicitamente quando adiciona uma variável de um tipo menor que o tipo que receberá esse valor.*

> ## 🔃 Conversões
  
```java 
int num = Integer.parseInt(var);
 ```
```java
double num = Double.parseDouble(var);
 ```
```java
float num = Float.parseFloat(var);
 ```
```java
String var = Integer.toString(number) or String.valueOf(number)
 ```

> ## ➗ Literais Fracionários 
Os literais do tipo float são representados colocando-se a letra F ou f após o número. Por exemplo:
 * 12f
 * 22F
* Observação: é importante a utilização do F (ou f) após o número para representar o tipo float já que sua omissão implicará que o literal passe a ser automaticamente interpretado como sendo do tipo double.  
**Por exemplo:** 
```java
float bonus= (salario * 0.8f) 
```

> ## 💻Scanner Class - Entrada de dados 
Essa classe implementa as operações de entrada de dados pelo teclado no console.
Para utilizar a classe Scanner em uma aplicação Java deve-se proceder da seguinte maneira:
* **Importar o pacote java.util:**
```java 
import java.util.Scanner;
```
* **Instanciar e criar um objeto Scanner:**
```java 
Scanner read = new Scanner(System.in);
```
#### **Lendo valores através do teclado: `variable = read.next*Type*();`**
* Lendo inteiros :`read.nextInt();`
* Lendo doubles :`read.nextDouble();`
* Lendo float :`read.nextFloat();`  
* Lendo uma String, usado na leitura de palavras simples que não usam o caractere de espaço (ou barra de espaço): `read.next();`  
* Lendo uma String, usado na leitura de palavras compostas, por exemplo, Pato Branco: `read.next();`  
*	Lendo um caractere usando o método read() do pacote de classes System.in: `c = (char)System.in.read();`

**Na leitura consecutiva de valores numéricos e String deve-se esvaziar o buffer do teclado antes da leitura do valor String, por exemplo:**  
```java
System.out.printf("Informe um Número Inteiro: ");
n = read.nextInt();  
read.nextLine();//Esvazia o buffer do teclado
System.out.printf("Informe uma cadeia de caracteres:\n");  
s = read.nextLine();  
 ```
> ## ⚙️ Metodos 
#### Valor de retorno
Um método pode retornar o valor de uma variável. O tipo do valor de retorno é definido antes do nome do método. O método deve retornar um dado desse tipo através do comando return.
Ex.: 
```java
public static float multasDoMes(int quantDvds, float valueDvds) {
        float dezPorcento = (valueDvds * 10) / 100;
        float multaPorMes = (quantDvds / 10) * dezPorcento;
        return multaPorMes;
    }
```

#### Public
É o modificador de acesso do método. Usando este modificador o método pode ser acessado por qualquer classe dentro (e fora) do projeto.
Outros modificadores são `protected`, `private` ou **sem modificador**. Aqui pode-se ler mais sobre os modificadores de acesso do Java.

#### Static
Define o método como estático, isso quer dizer que a classe não precisa ser instanciada para chamar este método.
No exemplo, tenho a classe `Cliente` com os métodos (estático) `FazerAlgo()` e (não-estático) `FazerAlgoDois()`, o uso seria assim:
```java
Cliente cliente = new Cliente();
cliente.FazerAlgoDois(); // Este é o método não-estático

Cliente.FazerAlgo(); // Este é o método estático
```
#### Void
É tipo de retorno do método. Este tipo de retorno significa vazio/nada, o método não dá retorno nenhum. Os métodos podem retornar qualquer tipo do seu projeto, até mesmo os criados por você.
