package application;  //Pacote responsável por fazer a intermediação 

import org.springframework.boot.SpringApplication; //IMPORTAÇÃO  É RESPONSÁVEL POR SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication; //IMPORTAÇÃO  É RESPONSÁVEL POR SpringBootApplication

@SpringBootApplication  //O TRABALHO DO SPRINGBOOT É CONFIGURAR E PROPORCIONAR AO DESENVOLVEDOR QUE SUA APLICAÇÃO SEJA EXECUTADA O MAIS RAPIDO POSSIVEL 
public class Application {  //DECLARANDO A CLASSE Application 
    public static void main(String[] args) { //METODO PRINCIPAL DO PROJETO
        SpringApplication.run(Application.class, args); //ELE É RESPONSAVEL POR DA UM BOOT NA APLICAÇÃO JAVA 
    
    }

}