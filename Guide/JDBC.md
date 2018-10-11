# 🗄️ JDBC - Java Database Conectivity

#### O JDBC (Java Database Conectivity) é a API do Java que contém os elementos necessários para que uma aplicação Java possa acessar SGBD relacionais;

- Utiliza extensivamente a SQL (Structured Query Language);
- Esta API é composta pelos pacotes java.sql e javax.sql,
  os quais fazem parte do JavaSE

###### O JDBC faz automaticamente o mapeamento de tipos de dados existentes no banco de dados para os tipos do Java (nativos ou classes específicas).

| Tipo Sql |    Tipo Java     |
| :------- | :--------------: |
| BIGINT   |       long       |
| VARCHAR  | java.lang.String |

## 🔁 Conexão

A classe DriverManager é responsável por administrar e selecionar tal
driver conforme o banco de dados específico, possibilitando efetuar a
conexão;

```java
try {
    Connection con = DriverManager.getConnection
    ("jdbc:mysql://localhost/exemploDb","user","senha");
} catch (SQLException e) {
    //conexão não foi possível
}
```

## Operação interativa;

A operação interativa sobre o banco de dados
se faz por meio da interface
java.sql.Statement, que permite o envio de
comandos SQL estáticos.

Por meio do método `createStatement()`
disponível na interface `Connection`, é possível
obter um objeto que implementa esta
interface;

```java
Statement stmt = con.createStatement();
```

### ResultSet

Um objeto `ResultSet` representa uma espécie de tabela
dinâmica, dotada de um cursor que pode navegar por
suas linhas;

```java
ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE
WHERE SOBRENOME=\"Wandresen\"");
```

O conteúdo das colunas do registro em que está
posicionado o cursor pode ser recuperado por meio de
um método de acesso específico, conforme seu tipo:

- getInt para INT ou INTEGER;
- getDouble para DOUBLE ou FLOAT;
- getFloat para REAL;
- getTime para TIME;
- O método getObject pode ser usado sem qualquer restrição;
- O método getString converte o conteúdo da coluna em um
  objeto String;

Todos eles podem ser utilizados enviando-se como
argumento o índice da coluna (iniciado em 1) ou o
nome da coluna (String);

```java
String nomePlaneta = rs.getString(“NOME”);
```

```java
String nomePlaneta = rs.getString(2);
```

**Exemplo: Busca um Cliente.**

```java
public static void getCliente(){
    //Pega uma conexao
    Connection conexao = new ConnectionFactory().getConnection();
    //Cria um Statement
    Statement stmt = conexao.createStatement();
    //Guarda o resultado da busca
    ResultSet rs = stmt.executeQuery("SELECT * FROM CLIENTE
    WHERE SOBRENOME=\"Wandresen\"");

    //Percorrer o ResultSet
    while(rs.next()){
        System.out.println("------");
        System.out.println(rs.getString("nome"));
        System.out.println(rs.getString(2));
    }
    //Fecha a conexão
    conexao.close();
}
```

## Operação Preparada

Um objeto do tipo `PreparedStatement` permite
definir um comando SQL que será pré-compilado no
SGBDR, permitindo sua execução eficiente;

O comando SQL preparado pode conter um ou mais
parâmetros de entrada, representados pelo símbolo
de ? (interrogação);

```java
// Cria a Query
String sql = "INSERT INTO contatos (nome, re, prof)
VALUES (?, ?,?)";
//Cria um PreparedStatement,passando a query criada para o metodo da conexao
PreparedStatement pstmt = con.prepareStatement(sql);

//Seta as VALUES da query
// pstmr.DataType(posicao,valor);
pstmt.setString(1, "Joãozinho");
pstmt.setInt (2, 1105);
pstmt.setBoolean(3, true);
//Retorna o numero de linhas afetadas
int re = pstmt.executeUpdate();
//Fecha o PreparedStatement
pstmt.close();
```

## Execute Query e Update

O `executeUpdate()` deve ser realizado com você utilizar operações que modifique o estado do Banco de Dados como: **Update,Delete e Insert**.  
O valor retornado é o numero de linhas afetadas.

```java
int re = pstmt.executeUpdate();
```

No `executeQuery()` utiliza-se para executar comandos de busca no banco de dados como: **Select**.  
O retorno é os dados buscados no proprio `Select`.

```java
ResultSet rs = pstmt.executeQuery();
```
