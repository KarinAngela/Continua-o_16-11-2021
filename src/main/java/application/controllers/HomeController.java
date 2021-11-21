package application.controllers;

import org.springframework.stereotype.Controller; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS */
import org.springframework.web.bind.annotation.RequestMapping;  /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.web.bind.annotation.RequestMethod; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/

@Controller 
public class HomeController { /* QUANDO SE USA PUBLIC CLASS, A CLASSE FICA VISIVEL PARA TODOS*/
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return "home/index.jsp"; <!-- finaliza a execução de uma função e especifica os valores que devem ser retonados para onde a função foi chamada -->
    }
}