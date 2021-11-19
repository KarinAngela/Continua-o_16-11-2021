package application.controllers;

import org.springframework.stereotype.Controller; <!-- IMPORTAÇÃO DO CONTROLLER QUE É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS-->
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(method=RequestMethod.GET)
    public String index() {
        return "home/index.jsp";
    }
}