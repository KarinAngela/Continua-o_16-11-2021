package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application { /* QUANDO SE USA PUBLIC CLASS, A CLASSE FICA VISIVEL PARA TODOS*/
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}