package application.controllers;// pacote responsável por fazer a intermediação 
import java.util.Optional; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/

import org.springframework.beans.factory.annotation.Autowired; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.stereotype.Controller;/* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.web.bind.annotation.PathVariable; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.web.bind.annotation.RequestMapping; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.web.bind.annotation.RequestMethod; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.web.bind.annotation.RequestParam; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/

import application.models.Livro; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import application.repositories.LivroRepository; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/
import org.springframework.ui.Model; /* IMPORTAÇÃO  É RESPONSÁVEL POR RECEBER AS REQUISIÇÕES DO USUÁRIOS*/

@Controller
@RequestMapping("/livro")
public class LivroController { /* QUANDO SE USA PUBLIC CLASS, A CLASSE FICA VISIVEL PARA TODOS*/
    @Autowired
    private LivroRepository livrosRepo;
    @RequestMapping("/list")
    public String list(Model model){ 
        model.addAttribute("livros", livrosRepo.findAll());
        return "list.jsp"; /* finaliza a execução de uma função e especifica os valores que devem ser retonados para onde a função foi chamada */
        
    }
    public String listar(){
        return "livro/list.jsp";/* finaliza a execução de uma função e especifica os valores que devem ser retonados para onde a função foi chamada */
    }

@RequestMapping("/insert")
public String formInsert(){
    return "insert.jsp"; /* finaliza a execução de uma função e especifica os valores que devem ser retonados para onde a função foi chamada */

}
@RequestMapping(value="/insert",method=RequestMethod.POST)
public String saveInsert(@RequestParam("titulo")String titulo){

    Livro livro=new Livro();
    livro.setTitulo(titulo);
    livrosRepo.save(livro);
    return "redirect:/livro/list"; /* finaliza a execução de uma função e especifica os valores que devem ser retonados para onde a função foi chamada */

}
@RequestMapping("/delete/{id}")
public String formDelete(Model model,@PathVariable int id){
    Optional<Livro>livro=livrosRepo.findById(id);
    if (!livro.isPresent()) 
        return "redirect:/livro/list";
     model.addAttribute("livro",livro.get());
 
    return "/livro/delete.jsp";/* finaliza a execução de uma função e especifica os valores que devem ser retonados para onde a função foi chamada */
    

}
@RequestMapping(value="/delete",method=RequestMethod.POST)
public String confirmDelete(@RequestParam("id") int id){
    livrosRepo.deleteById(id);
        return "redirect:/livro/list"; ;/* finaliza a execução de uma função e especifica os valores que devem ser retonados para onde a função foi chamada */
    

}
}
