package application.controllers;// pacote responsável por fazer a intermediação 
import java.util.Optional; /* IMPORTAÇÃO DO Optional DO JAVA*/

import org.springframework.beans.factory.annotation.Autowired; /* IMPORTAÇÃO DO anotation.Autowired DO SPRING BOOT */
import org.springframework.stereotype.Controller; /* IMPORTAÇÃO  É RESPONSÁVEL  Controller DO SPRING BOOT */
import org.springframework.web.bind.annotation.PathVariable; /*IMPORTAÇÃO DO Path Variable DO SPRING BOOT */
import org.springframework.web.bind.annotation.RequestMapping; /* IMPORTAÇÃO  DO RequestT Mapping DO SPRING BOOT*/
import org.springframework.web.bind.annotation.RequestMethod; /* IMPORTAÇÃO  Request Method DO SPRING BOOT*/
import org.springframework.web.bind.annotation.RequestParam; /*IMPORTAÇÃO DO Request Param PARA O SPRING BOOT */

import application.models.Livro; /* É RESPONSAVEL PELA IMPORTAÇÃO DO MODELS.LIVRO*/
import application.repositories.LivroRepository; /* IMPORTAÇÃO DO REPOSITORIO DOS LIVROS*/
import org.springframework.ui.Model; /* IMPORTAÇÃO  DO MODEL PARA O SPRING BOOT*/

@Controller /* É UMA ESPECIALIZAÇÃO DA ANOTAÇÃO @COMPONENT, QUE PERMITE QUE UMA CLASSE SEJA RECONHECIDA COMO UM COMPONENTE GERENCIADO POR UMA SPRING */
@RequestMapping("/livro") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET*/
public class LivroController { /* DECLARANDO A CLASSE LivroController*/
    @Autowired /* ANOTAÇÃO, FORNECE CONTROLE SOBRE ONDE E COMO A LIGRAÇÃO ENTRE AS CLASSES DEVE SER REALIZADA.*/
    private LivroRepository livrosRepo;  /*NESSE CASO O LivroRepository NÃO PODE SER ACESSADO OU USADO POR NENHUMA OUTRA CLASSE*/
    @RequestMapping("/list") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER*/
    public String list(Model model){  /*CRIA UMA FUNÇÃO CHAMADA LIST QUE TERA UM ARGUMENTO CHAMADO MODEL */   
        model.addAttribute("livros", livrosRepo.findAll()); /*REFERECE A UM FORMULARIO livros,livrosRepo, ELE FORNECE O OBJETO PARA O CONTROLLER */
        return "list.jsp"; /*o return serve para retornar algo de dentro do método que seria o  list.jsp*/
        
} /*FECHA A CLASSE*/ 
    public String listar(){  /*CRIA UMA FUNÇÃO CHAMADA listar */
        return "livro/list.jsp";/ *o return serve para retornar algo de dentro do método que seria o  livro/list.jsp*/
} /*FECHA A FUNÇÃO */

@RequestMapping("/insert") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET*/
public String formInsert(){ /* CRIA UMA FUNÇÃO CHAMADA formInsert*/
    return "insert.jsp"; /* o return serve para retornar algo de dentro do método que seria o insert.jsp */

} /*FECHA A FUNÇÃO */
@RequestMapping(value="/insert",method=RequestMethod.POST) /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET*/
public String saveInsert(@RequestParam("titulo")String titulo){ /*CRIA UMA FUNÇÃO CHAMADA saveInsert QUE TERA UM ARGUMENTO CHAMADO titulo */   

    Livro livro=new Livro(); /*ELE DEFINE O OBJETO LIVRO*/
    livro.setTitulo(titulo); /*CONJUNTO DE COLLECTION, NÃO HÁ REPETIÇÕES*/
    livrosRepo.save(livro); /*ELE SALVO O NOME DO LIVRO QUE FOI ESCRITO*/
    return "redirect:/livro/list"; /*o return serve para retornar algo de dentro do método que seria o redirect:/livro/list */

} /*FECHA A FUNÇÃO */
@RequestMapping("/delete/{id}") /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET*/
public String formDelete(Model model,@PathVariable int id){ /*CRIA UMA FUNÇÃO CHAMADA FormDelete QUE TERA UM ARGUMENTO CHAMADO Model model e PathVariable */   
    Optional<Livro>livro=livrosRepo.findById(id); /* SIMPLIFICAÇÃO DO <livro>livro=livrosRepo*/
    if (!livro.isPresent()) /* USADO PARA TESTA A CONDIÇÃO !livro.isPresent*/
        return "redirect:/livro/list"; /*o return serve para retornar algo de dentro do método que seria o redirect:/livro/list */
     model.addAttribute("livro",livro.get()); /*REFERECE A UM FORMULARIO livros,livro.get, ELE FORNECE O OBJETO PARA O get */
 
    return "/livro/delete.jsp";/ *o return serve para retornar algo de dentro do método que seria o  /livro/delete.jsp*/
    

} /*FECHA A FUNÇÃO */
@RequestMapping(value="/delete",method=RequestMethod.POST) /*É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET*/
public String confirmDelete(@RequestParam("id") int id){ /*CRIA UMA FUNÇÃO CHAMADA confirmDelete QUE TERA UM ARGUMENTO CHAMADO RequestParam(id)*/
    livrosRepo.deleteById(id); /* ELE IRA DELETAR O LIVRO*/
        return "redirect:/livro/list"; ;/ *o return serve para retornar algo de dentro do método que seria o  redirect:/livro/list */
    

} /*FECHA A FUNÇÃO */
}/*FECHA A FUNÇÃO */
