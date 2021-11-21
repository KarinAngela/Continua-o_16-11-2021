package application.models;


import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="livros")
public class Livro { /* QUANDO SE USA PUBLIC CLASS, A CLASSE FICA VISIVEL PARA TODOS*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  /* PRIVATE, DEIXARÁ VISÍVEL O ATRIBUTO APENAS PARA A CLASSE EM QUE ESTE ATRIBUTO SE ENCONTRA, INT USADO PARA NÚMERO INTEIRO*/
    private String titulo;  /* PRIVATE, DEIXARÁ VISÍVEL O ATRIBUTO APENAS PARA A CLASSE EM QUE ESTE ATRIBUTO SE ENCONTRA, STRING É UMA SEQUENCIA DE CARACTERES*/

    public int getId() { /* PUBLIC DEIXA A CLASSE VISIVEL PARA TODOS, INT É PARA NÚMEROS INTEIROS*/
        return id; /* FINALIZA A EXECUÇÃO DE UMA FUNÇÃO E ESPECIFICA OS VALORES QUE DEVEM SER RETORNADOS PARA ONDE A FUNÇÃO FOI CHAMADA*/
    }
    public void setId(int id) { /* PARA ALTERAR, MODIFICAR OS VALORES DE UM ATRIBUTO DA CLASSE DE MANEIRA PROTEGIDA, UTILIZAMOS O SET, ESSE MÉTODO NÃO TERA UM RETORNO POIS O ATRIBUTO SERA SOMENTE MODIFICADO, USANDO O MÉTODO TIPO VOID, SEM RETORNO*/
        this.id = id; /* THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO NO QUAL É USADA*/
    }
    public String getTitulo() /*QUANDO PRECISAMOS "PEGAR" ALGO USAMOS O GET, ESSE MÉTODO SEMPRE RETORNARA UM VALOR SEJA ELE STRING,INT, DOUBLE. O PUBLIC DEIXA A CLASSE VISIVEL PARA TODOS */
        return titulo; /* FINALIZA A EXECUÇÃO DE UMA FUNÇÃO E ESPECIFICA OS VALORES QUE DEVEM SER RETORNADOS PARA ONDE A FUNÇÃO FOI CHAMADA*/
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo; /* THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO NO QUAL É USADA */
    }


    
}
