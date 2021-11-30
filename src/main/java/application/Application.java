package application;  //ELE CRIA O PACOTE APPLICATION

import org.springframework.boot.SpringApplication; //IMPORTAÇÃO  É RESPONSÁVEL POR SpringApplication DO SPRING BOOT
import org.springframework.boot.autoconfigure.SpringBootApplication; //IMPORTAÇÃO  É RESPONSÁVEL POR SpringBootApplication do SPRING BOOT

@SpringBootApplication  //ANOTAÇÃO spring boot application
public class Application {  //DECLARANDO A CLASSE Application 
    public static void main(String[] args) { //cria o metodo main do projeto retorno void
        SpringApplication.run(Application.class, args); //responsavel por incializar a aplicação do spring boot 
    
    } //fecha o metodo maina

} //fecha a classe application 