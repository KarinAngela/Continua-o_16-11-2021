package application.models;


import javax.persistence.Entity; /*IMPORTAÇÃO É RESPONSAVEL POR persistence.Entity por javax*/
import javax.persistence.GeneratedValue; /* IMPORTAÇÃO É RESPONSAVEL POR GeneratedValue por JAVAX*/
import javax.persistence.GenerationType; /*IMPORTAÇÃO É RESPONSAVEL POR GenerationType por JAVAX*/
import javax.persistence.Id;  /*IMPORTAÇÃO É RESPONSAVEL POR  persistence.Id POR JAVAX*/
import javax.persistence.Table;  /*IMPORTAÇÃO É RESPONSAVEL POR  persistence.Table POR JAVAX*/

@Entity
@Table(name="livros") /*ANOTAÇÃO*/
public class Livro { /* DECLARANDO A CLASSE Livro */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  /* PRIVATE, DEIXARÁ VISÍVEL O ATRIBUTO APENAS PARA A CLASSE EM QUE ESTE ATRIBUTO SE ENCONTRA, INT USADO PARA NÚMERO INTEIRO*/
    private String titulo;  /* /*CRIA UMA FUNÇÃO CHAMADA titulo*/

    public int getId() { /* PUBLIC DEIXA A CLASSE VISIVEL PARA TODOS, INT É PARA NÚMEROS INTEIROS*/
        return id; /* FINALIZA A EXECUÇÃO DE UMA FUNÇÃO E ESPECIFICA OS VALORES QUE DEVEM SER RETORNADOS PARA ONDE A FUNÇÃO FOI CHAMADA*/
    }
    public void setId(int id) { /*PARA ALTERAR, MODIFICAR OS VALORES DE UM ATRIBUTO DA CLASSE DE MANEIRA PROTEGIDA, UTILIZAMOS O SET, ESSE MÉTODO NÃO TERA UM RETORNO POIS O ATRIBUTO SERA SOMENTE MODIFICADO*/
        this.id = id; /*/* THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO (id)*/
    }
    public String getTitulo() /*QUANDO PRECISAMOS "PEGAR" ALGO USAMOS O GET, ESSE MÉTODO SEMPRE RETORNARA UM VALOR SEJA ELE STRING,INT, DOUBLE. O PUBLIC DEIXA A CLASSE VISIVEL PARA TODOS */
        return titulo; /* FINALIZA A EXECUÇÃO DE UMA FUNÇÃO E ESPECIFICA OS VALORES QUE DEVEM SER RETORNADOS PARA ONDE A FUNÇÃO FOI CHAMADA*/
    }
    public void setTitulo(String titulo) { /*PARA ALTERAR, MODIFICAR OS VALORES DE UM ATRIBUTO DA CLASSE DE MANEIRA PROTEGIDA, UTILIZAMOS O SET, ESSE MÉTODO NÃO TERA UM RETORNO POIS O ATRIBUTO SERA SOMENTE MODIFICADO*/
        this.titulo = titulo; /* THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO (titulo)*/
    }


    
}
