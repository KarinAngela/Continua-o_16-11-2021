package application; /* É UMA CONJUNTO DE CLASSES LOCALIZADA NA MESMA ESTRUTURA HIERARQUICA DE DIRETORIOS*/

import org.springframework.boot.SpringApplication; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.boot.autoconfigure.SpringBootApplication; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/

@SpringBootApplication  /*O TRABALHO DO SPRINGBOOT É CONFIGURAR E PROPORCIONAR AO DESENVOLVEDOR QUE SUA APLICAÇÃO SEJA EXECUTADA O MAIS RAPIDO POSSIVEL */
public class Application { /* QUANDO SE USA PUBLIC CLASS, A CLASSE FICA VISIVEL PARA TODOS*/
    public static void main(String[] args) { /* METODO PRINCIPAL DO PROJETO*/
        SpringApplication.run(Application.class, args);
    }
}