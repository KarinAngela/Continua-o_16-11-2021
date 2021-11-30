package application.models; //PACOTE RESPONSÁVEL PELO ACESSO E MANIPULAÇÃO DOS DADOS DA SUA APLICAÇÃO


import javax.persistence.Entity; //IMPORTAÇÃO É RESPONSAVEL POR persistence.Entity 
import javax.persistence.GeneratedValue; // IMPORTAÇÃO É RESPONSAVEL POR GeneratedValue 
import javax.persistence.GenerationType; //IMPORTAÇÃO É RESPONSAVEL POR GenerationType 
import javax.persistence.Id;  //IMPORTAÇÃO É RESPONSAVEL POR  persistence.Id 
import javax.persistence.Table;  //IMPORTAÇÃO É RESPONSAVEL POR  persistence.Table 

@Entity //DECLARA UMA ENTIDADE DO TIPO RELACIONAL, COMO UM TABELA
@Table(name="livros") //USADO PARA ALTERAR O NOME DA TABELA DO BANCO DE DADOS
public class Livro { // DECLARANDO A CLASSE Livro

    @Id //identifica a chave primaria da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ANOTAÇÃO do GenerationType.IDENTITY
    private int id;  //SE REFERE NÚMERO INTEIROS (ID)
    private String titulo;   //CRIA UMA FUNÇÃO CHAMADA titulo

    public int getId() { //SE REFERE EM LER A INFORMAÇÃO DE NÚMERO INTEIROS 
        return id; //o return serve para retornar algo de dentro do método que seria o id
    }
    public void setId(int id) { ///USADO PARA NÃO DUBPLICAR O NÚMERO INTEIRO
        this.id = id; // THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO id

    }
    public String getTitulo() { //SE REFERE EM LER A INFORMAÇÃO DO Titulo
        return titulo; //o return serve para retornar algo de dentro do método que seria o  titulo
    }
    public void setTitulo(String titulo) { //USADO PARA NÃO DUBPLICAR O Titulo
        this.titulo = titulo; //THIS É USADA PARA REFERENCIAR A INSTÂNCIA ATUAL DO MÉTODO (titulo)
}


    
}
