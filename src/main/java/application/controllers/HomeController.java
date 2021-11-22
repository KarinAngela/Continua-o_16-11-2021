package application.controllers; /*Pacote responsável por fazer a intermediação */

import org.springframework.stereotype.Controller; /* IMPORTAÇÃO  É RESPONSÁVEL  DCONTROLLER DO SPRING BOOT */
import org.springframework.web.bind.annotation.RequestMapping;  /* IMPORTAÇÃO  DO REQUESTMAPPIN DO SPRING BOOT*/
import org.springframework.web.bind.annotation.RequestMethod; /* IMPORTAÇÃO  REQUEST METHOD DO SPRIN BOOT*/

@Controller  /* ATRAVES DA ANOTAÇÃO DO CONTROLLER INDICA QUE A CLASSE A ABAIXO É CONROLLER */
public class HomeController { /* DECLARANDO A CLASSE HomeController */
    @RequestMapping(method=RequestMethod.GET) /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER, PODE SER USADO O GET*/
    public String index() { /* CRIA UMA FUNÇÃO CHAMADA INDEX()*/
        return "home/index.jsp"; /*o return serve para retornar algo de dentro do método que seria o index.jsp */
    } /*FECHA A FUNÇÃO INDEX.JSP*/
} /*FECHA A CLASSE HOMECONTROLLER*/