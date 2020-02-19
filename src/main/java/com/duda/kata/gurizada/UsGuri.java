package com.duda.kata.gurizada;

/**
 *  Dica #1:
 *
 *  <p>Aqui temos uma classe ja criada com o nome de 'UsGuri'. Note que a criacao da classe possui alguns elementos que sao:</p>
 *  - public:       ESCOPO do que estamos declarando. Nao se preocupe em entender isso neste momento;
 *  - class:        Descritor do que estamos declarando que, neste caso, eh uma classe;
 *  - UsGuri:       Nome da classe;
 *  - '{' e '}':    Abertura e fechamento da classe, respectivamente. TUDO o que estiver dentro disso pertence a essa classe.
 *
 *  A partir daqui fica a teu criterio: Podes criar uma classe ou renomear a classe 'UsGuri' para 'Guri'.
 *
 */
public class UsGuri {

    /**
     *  Dica #2:
     *
     *  <p>
     *      Neste momento devemos criar algo que chamamos de 'atributo' ou 'campo', que sao as informacoes da classe.
     *      Para isso podemos utilizar outras CLASSES ou tipos PRIMITIVOS para tipificacao, mas para manter a simplicidade utilizaremos
     *      apenas campos nativos do Java. Para criar um atributo, temos que nos ater novamente a alguns elementos:
     *  </p>
     *  - escopo:   Escopo eh como chamamos a visibilidade de seus componentes declarados. Neste momento iremos apenas utilizar os seguintes:
     *      - public:   Visivel para qualquer objeto criado desta classe
     *      - private:  Visivel apenas dentro da propria classe
     *  - tipo:     O tipo do objeto propriamente dito. Dentre os tipos mais comuns, podemos citar:
     *      - Integer:  Numeral que pode ser positivo, negativo ou zero com limite de 2.147.483.647
     *      - Long:     Numeral que pode ser positivo, negativo ou zero com limite de 9.223.372.036.854.775.807
     *      - Double:   Numeral com fracoes
     *      - String:   Texto
     *      - Boolean:  true or false
     *  - nome:     Nome atribuido ao atributo
     *
     *  Ex.: public Integer numero;
     *
     */

    /**
     *  Dica #3:
     *
     *  <p>
     *      Agora comecamos a adentrar no principal conceito da programacao orientada a objetos que sao os....objetos :)
     *      Objetos sao nossas estruturas que fornecerao logica e informacao com base em seus atributos e metodos.
     *      Para poder criar um objeto, precisamos de um metodo CONSTRUTOR (que vai construir o objeto pra nos).
     *      Por padrao, toda classe no Java ja vem com um metodo construtor vazio, a menos que voce declare outro construtor.
     *
     *      Segue abaixo as caracteristicas dessa estrutura:
     *  </p>
     *  - escopo:       Escopo eh como chamamos a visibilidade de seus componentes declarados. Neste momento iremos apenas utilizar os seguintes:
     *      - public:   Visivel para qualquer objeto criado desta classe
     *      - private:  Visivel apenas dentro da propria classe
     *  - nome:         Nome da classe
     *  - parametros:   Atributos que influenciarao na construcao do objeto
     *
     *  Ex.:
     *  public Guri(String parametro1, Integer parametro2){
     *      // qualquer coisa que queira fazer ou nada
     *  }
     *
     */
    private UsGuri(){}

    /**
     *  Dica #4:
     *
     *  <p>
     *      Ja sabemos como criamos uma classe e instanciamos um objeto, mas por que temos objetos?
     *      Criamos objetos para utilizar de seus atributos e metodos, que conterao logicas e informacoes unicas dentro de um determinado contexto.
     *      Se atributos sao as informacoes da classe (como nome e idade), metodos definem acoes (como comer, falar, andar e etc).
     *
     *      Segue abaixo as caracteristicas dessa estrutura:
     *  </p>
     *  - escopo:       Escopo eh como chamamos a visibilidade de seus componentes declarados. Neste momento iremos apenas utilizar os seguintes:
     *      - public:   Visivel para qualquer objeto criado desta classe
     *      - private:  Visivel apenas dentro da propria classe
     *  - tipo:         O tipo do objeto RETORNADO. Dentre os tipos mais comuns, podemos citar:
     *      - Integer:  Numeral que pode ser positivo, negativo ou zero com limite de 2.147.483.647
     *      - Long:     Numeral que pode ser positivo, negativo ou zero com limite de 9.223.372.036.854.775.807
     *      - Double:   Numeral com fracoes
     *      - String:   Texto
     *      - Boolean:  true or false
     *      - void:     Este eh bem especial. Normalmente um metodo retorna algo, mas quando o tipo 'void' eh atribuito ao retorno do metodo, este nao precisa retornar nada
     *  - nome:         Nome do metodo
     *  - parametros:   Atributos que influenciarao na logica do metodo
     *
     *  Ex. void:
     *  public void jogaTurno(Integer cartas){
     *      if(cartas > 0){
     *          joga();
     *      } else {
     *          passa();
     *      }
     *  }
     *
     *  Ex. retornando objeto:
     *  public String reclamaDoSuporte(){
     *      return "Cade as ward?";
     *  }
     *
     *  Observe que no exemplo que retorna objetos temos uma palavra reservada chamada 'return'. O que vem depois dessa palavra que sera retornado.
     *
     */

    /**
     *  Dica #5:
     *
     *  <p>
     *      Quando falamos de encapsulamento, isso quer dizer que estamos limitando o acesso aos nossos atributos e metodos de acordo com determinado contexto.
     *      Para isso, declaramos diferentes escopos para diferentes especies de informacoes, por exemplo:
     *
     *      Possuo um metodo que pode ser acessado externamente chamado <b>isAdulto()</b>,
     *      mas este metodo <b>isAdulto()</b> acessa o atributo <b>idade</b> da classe <b>Guri</b>.
     *
     *      Sendo assim, o codigo ficaria mais ou menos assim:
     *  </p>
     *
     *  Ex.:
     *  public Boolean isAdulto(){
     *      if(isMaiorDeIdade()){
     *          return true;
     *      } else {
     *          return false;
     *      }
     *  }
     *
     *  private Boolean isMaiorDeIdade(){
     *      return this.idade > 17;
     *  }
     *
     *  Perceba que neste codigo utilizamos um novo descritor, o 'this'. Ele nos garante que o que estamos utilizando e o atributo do escopo DA CLASSE,
     *  e nao DO METODO, mas veremos isso mais tarde com mais detalhes.
     *
     *  Para definir o encapsulamento de atributos da classe, eh muito comum declararmos metodos publicos GET e SET, sendo estes:
     *  - get: acesso a dados
     *  - set: escrita de dados
     *
     *  Por exemplo:
     *  public Integer getIdade(){
     *      return this.idade;
     *  }
     *
     *  public void setIdade(Integer idade){
     *      this.idade = idade;
     *      // a primeira idade eh com 'this', ou seja, da classe. A segunda SEM o 'this' porque esta se referindo ao parametro passado pelo metodo
     *  }
     *
     */
}
