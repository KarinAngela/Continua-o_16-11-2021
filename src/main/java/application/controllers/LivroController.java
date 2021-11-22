package application.controllers;// pacote responsável por fazer a intermediação 
import java.util.Optional; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/

import org.springframework.beans.factory.annotation.Autowired; /* IMPORTAÇÃO */
import org.springframework.stereotype.Controller; /* IMPORTAÇÃO  É RESPONSÁVEL  CONTROLLER DO SPRING BOOT */
import org.springframework.web.bind.annotation.PathVariable; /*IMPORTAÇÃO DO PATH VARIABLE DO SPRING BOOT */
import org.springframework.web.bind.annotation.RequestMapping; /* IMPORTAÇÃO  DO REQUESTMAPPIN DO SPRING BOOT*/
import org.springframework.web.bind.annotation.RequestMethod; /* IMPORTAÇÃO  REQUEST METHOD DO SPRING BOOT*/
import org.springframework.web.bind.annotation.RequestParam; /*IMPORTAÇÃO DO REQUESTPARAM PARA O SPRING BOOT */

import application.models.Livro; /* É RESPONSAVEL PELA IMPORTAÇÃO DO MODELS.LIVRO*/
import application.repositories.LivroRepository; /* IMPORTAÇÃO DO REPOSITORIO DOS LIVROS*/
import org.springframework.ui.Model; /* IMPORTAÇÃO  DO MODEL PARA O SPRING BOOT*/

@Controller /* ATRAVES DA ANOTAÇÃO DO CONTROLLER INDICA QUE A CLASSE A ABAIXO É CONROLLER */
@RequestMapping("/livro") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER*/
public class LivroController { /* QUANDO SE USA PUBLIC CLASS, A CLASSE FICA VISIVEL PARA TODOS, ASSIM SENDO POSSIVVEL MEXER NELA*/
    @Autowired /* permite que você pule as configurações em outro lugar do que injetar e faça isso por você.*/
    private LivroRepository livrosRepo;  /* PRIVATE, DEIXARÁ VISÍVEL O ATRIBUTO APENAS PARA A CLASSE EM QUE ESTE ATRIBUTO SE ENCONTRA*/
    @RequestMapping("/list") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER*/
    public String list(Model model){  /*CRIA UMA FUNÇÃO CHAMADA LIST QUE TERA UM ARGUMENTO CHAMADO MODEL */   
        model.addAttribute("livros", livrosRepo.findAll()); /* */
        return "list.jsp"; /* RETORNA O CAMINHO QUE CONTEM O list.jsp*/
        
}
    public String listar(){ /* É UM MODIFICADOR DE ACESSO, ELE NOS PERMITE ACESSAR POR QUALQUER CLASSE ESTANDO DENTRO E FORA*/
        return "livro/list.jsp";/* RETORNA O CAMINHO QUE CONTEM livro/list.jsp*/
}

@RequestMapping("/insert") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER*/
public String formInsert(){ /* CRIA UMA FUNÇÃO CHAMADA formInsert*/
    return "insert.jsp"; /* RETORNA O CAMINHO QUE CONTEM insert.jsp */

}
@RequestMapping(value="/insert",method=RequestMethod.POST) /*É A ANOTAÇÃO  UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER, GERALMENTE PODE SER USADO O POST JUNTO*/
public String saveInsert(@RequestParam("titulo")String titulo){

    Livro livro=new Livro();
    livro.setTitulo(titulo);
    livrosRepo.save(livro);
    return "redirect:/livro/list"; /* RETORNA O CAMINHO QUE CONTEM O redirect:/livro/list */

}
@RequestMapping("/delete/{id}") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER*/
public String formDelete(Model model,@PathVariable int id){
    Optional<Livro>livro=livrosRepo.findById(id);
    if (!livro.isPresent()) 
        return "redirect:/livro/list"; /* RETORNA O CAMINHO QUE CONTEM O redirect:/livro/list */
     model.addAttribute("livro",livro.get());
 
    return "/livro/delete.jsp";/* RETORNA O CAMINHO QUE CONTEM O /livro/delete.jsp*/
    

}
@RequestMapping(value="/delete",method=RequestMethod.POST) /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER, GERALMENTE PODE SER USADO O POST JUNTO*/
public String confirmDelete(@RequestParam("id") int id){
    livrosRepo.deleteById(id);
        return "redirect:/livro/list"; ;/* RETORNA O CAMINHO QUE CONTEM O redirect:/livro/list */
    

}
}
