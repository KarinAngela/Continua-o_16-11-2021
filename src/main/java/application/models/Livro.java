package application.models; /*Pacote responsável por fazer a intermediação */


import javax.persistence.Entity; /*IMPORTAÇÃO É RESPONSAVEL POR persistence.Entity */
import javax.persistence.GeneratedValue; /* IMPORTAÇÃO É RESPONSAVEL POR GeneratedValue */
import javax.persistence.GenerationType; /*IMPORTAÇÃO É RESPONSAVEL POR GenerationType */
import javax.persistence.Id;  /*IMPORTAÇÃO É RESPONSAVEL POR  persistence.Id */
import javax.persistence.Table;  /*IMPORTAÇÃO É RESPONSAVEL POR  persistence.Table */

@Entity /* AVISANDO QUE UMA CLASSE É TAMBÉM UMA ENTIDADE, ANOTAÇÃO*/
@Table(name="livros") /*ANOTAÇÃO*/
public class Livro { /* DECLARANDO A CLASSE Livro */

    @Id /*ANOTAÇÃO DO ID DO LIVRO*/
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*ANOTAÇÃO do GenerationType.IDENTITY*/
    private int id;  /*SE REFERE NÚMERO INTEIROS (ID)*/
    private String titulo;  /* /*CRIA UMA FUNÇÃO CHAMADA titulo*/

    public int getId() { /*SE REFERE EM LER A INFORMAÇÃO DE NÚMERO INTEIROS (ID)*/
        return id; /* FINALIZA A EXECUÇÃO DE UMA FUNÇÃO E ESPECIFICA OS VALORES QUE DEVEM SER RETORNADOS PARA ONDE A FUNÇÃO FOI CHAMADA*/
    }
    public void setId(int id) { /*USADO PARA NÃO DUBPLICAR O NÚMERO INTEIRO (id) */
        this.id = id; /* THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO (id)*/
    }
    public String getTitulo() /* SE REFERE EM LER A INFORMAÇÃO DO Titulo*/
        return titulo; /*  A EXECUÇÃO DE UMA FUNÇÃO E ESPECIFICA OS VALORES QUE DEVEM SER RETORNADOS PARA ONDE A FINALIZANÇÃO FOI CHAMADA*/
    }
    public void setTitulo(String titulo) { /*USADO PARA NÃO DUBPLICAR O Titulo*/
        this.titulo = titulo; /* THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO (titulo)*/
    }


    
}
