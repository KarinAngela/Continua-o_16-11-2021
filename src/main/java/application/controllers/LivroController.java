package application.controllers; //PACOTE RESPONSÁVEL POR FAZER A INTERMIDIAÇÃO DA PARTE DE VIZUALIZAÇÃO E CONTROLE
import java.util.Optional; //IMPORTAÇÃO DO Optional DO JAVA

import org.springframework.beans.factory.annotation.Autowired; // IMPORTAÇÃO DO anotation.Autowired DO SPRING FRAMEWORK 
import org.springframework.stereotype.Controller; //IMPORTAÇÃO  É RESPONSÁVEL  Controller DO FRAMEWORK 
import org.springframework.web.bind.annotation.PathVariable; //IMPORTAÇÃO DO Path Variable DO FRAMEWORK 
import org.springframework.web.bind.annotation.RequestMapping; // IMPORTAÇÃO  DO RequestT Mapping DO FRAMEWORK
import org.springframework.web.bind.annotation.RequestMethod; // IMPORTAÇÃO  Request Method DO FRAMEWORK
import org.springframework.web.bind.annotation.RequestParam; //IMPORTAÇÃO DO Request Param PARA O FRAMEWORK 

import application.models.Livro; //É RESPONSAVEL PELA IMPORTAÇÃO DO MODELS.LIVRO
import application.repositories.LivroRepository; //IMPORTAÇÃO DO REPOSITORIO DOS LIVROS
import org.springframework.ui.Model; // IMPORTAÇÃO  DO MODEL PARA O SPRING BOOT

@Controller //É UMA ESPECIALIZAÇÃO DA ANOTAÇÃO @COMPONENT, QUE PERMITE QUE UMA CLASSE SEJA RECONHECIDA COMO UM COMPONENTE GERENCIADO POR UMA SPRING
@RequestMapping("/livro") //****É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET
public class LivroController { //DECLARANDO A CLASSE LivroController
   
    @Autowired //ANOTAÇÃO, FORNECE CONTROLE SOBRE ONDE E COMO A LIGRAÇÃO ENTRE AS CLASSES DEVE SER REALIZADA.
    private LivroRepository livrosRepo;  //NESSE CASO O LivroRepository NÃO PODE SER ACESSADO OU USADO POR NENHUMA OUTRA CLASSE
    
    @RequestMapping("/list") //É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL HANDLER
    public String list(Model model){  //CRIA UMA FUNÇÃO CHAMADA LIST QUE TERA UM ARGUMENTO CHAMADO MODEL
        model.addAttribute("livros", livrosRepo.findAll()); //ADICIONA O ATRIBUTO  livros, AO MODELO
        return "list.jsp"; //o return serve para retornar algo de dentro do método que seria o  list.jsp, como se fosse um loop
        
} //FECHA A CLASSE 
    public String listar(){  //CRIA UMA FUNÇÃO CHAMADA listar
        return "livro/list.jsp"; //o return serve para retornar algo de dentro do método que seria o  livro/list.jsp, como se fosse um loop
} //FECHA A FUNÇÃO 

@RequestMapping("/insert") //É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET
public String formInsert(){ //CRIA UMA FUNÇÃO CHAMADA formInsert
    return "insert.jsp"; //o return serve para retornar algo de dentro do método que seria o insert.jsp, como se fosse um loop

} //FECHA A FUNÇÃO 
@RequestMapping(value="/insert",method = RequestMethod.POST) //É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET
public String saveInsert(@RequestParam("titulo")String titulo){ //CRIA UMA FUNÇÃO CHAMADA saveInsert QUE TERA UM ARGUMENTO CHAMADO titulo 

    Livro livro=new Livro(); //ELE DEFINE O OBJETO LIVRO
    livro.setTitulo(titulo); //CONJUNTO DE COLLECTION, NÃO HÁ REPETIÇÕES
    livrosRepo.save(livro); //ELE SALVO O NOME DO LIVRO QUE FOI ESCRITO
    return "redirect:/livro/list"; //o return serve para retornar algo de dentro do método que seria o redirect:/livro/list, como se fosse um loop

} //FECHA A FUNÇÃO 
@RequestMapping("/delete/{id}") //É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET
public String formDelete(Model model,@PathVariable int id){ //CRIA UMA FUNÇÃO CHAMADA FormDelete QUE TERA UM ARGUMENTO CHAMADO Model model e PathVariable    
    Optional<Livro> livro = livrosRepo.findById(id); // SIMPLIFICAÇÃO DO <livro>livro=livrosRepo
    if (!livro.isPresent()) // USADO PARA TESTA A CONDIÇÃO !livro.isPresent
        return "redirect:/livro/list"; //o return serve para retornar algo de dentro do método que seria o redirect:/livro/list, como se fosse um loop 
     model.addAttribute("livro",livro.get()); //REFERECE A UM FORMULARIO livros,livro.get, ELE FORNECE O OBJETO PARA O get 
 
    return "/livro/delete.jsp"; //o return serve para retornar algo de dentro do método que seria o  /livro/delete.jsp, como se fosse um loop
    

} //FECHA A FUNÇÃO
@RequestMapping(value="/delete", method= RequestMethod.POST) //É A ANOTAÇÃO UTILIZADA TRADICIONALMENTE PARA IMPLEMENTAR URL, ELA SUPORTA MÉTODOS COMO POST E GET
public String confirmDelete(@RequestParam("id") int id){ //CRIA UMA FUNÇÃO CHAMADA confirmDelete QUE TERA UM ARGUMENTO CHAMADO RequestParam(id)
    livrosRepo.deleteById(id); // ELE IRA DELETAR O LIVRO
        return "redirect:/livro/list"; //o return serve para retornar algo de dentro do método que seria o  redirect:/livro/list, como se fosse um loop
    

} //FECHA A FUNÇÃO 

@RequestMapping("/update/{id}") // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis, marca como essa função pode ser acessada pela web.
public String formUpdate(Model model, @PathVariable int id) { // Cria uma função de retorno público de tipo String com o nome formUpdate, que recebe o id do livro e o modelo como parâmetro, essa função serve para confirmar se é possível atualizar títulos do repositório.
  Optional<Livro> livro = livrosRepo.findById(id);  // Busca o livro pelo id e marca campo como opcional pra caso o id não seja encontrado.
  if (!livro.isPresent()) // Define se o livro não for presente, o usuário será redirecionado de volta pra página que está.
    return "redirect:/livro/list";  // Retorna um redirecionamento para voltar pra lista após a atualização.
  model.addAttribute("livro", livro.get()); // Adiciona o atributo livro ao model e preenche com o livro obtido.
  // return "redirect:/livro/update.jsp";
  return "/livro/update.jsp"; // Redireciona para a página de atualização.
}

@RequestMapping(value = "/update", method = RequestMethod.POST) // Anotação para mapear solicitações da web em métodos em classes de tratamento de solicitações com assinaturas de método flexíveis, marca como essa função pode ser acessada pela web e seu método.
public String saveUpdate(@RequestParam("titulo") String titulo, @RequestParam("id") int id) { // Cria uma função de retorno público de tipo String com o nome confirmDelete, que recebe o id do livro como parâmetro, essa função serve para atualizar títulos do repositório.
  Optional<Livro> livro = livrosRepo.findById(id);  // Busca o livro pelo id e marca campo como opcional pra caso o id não seja encontrado.
  if (!livro.isPresent()) // Define se o livro não for presente, o usuário será redirecionado de volta pra página que está.
    return "redirect:/livro/list";  // Retorna um redirecionamento para voltar pra lista após a atualização.
  livro.get().setTitulo(titulo);  // Obtém o livro e atualiza seu título.
  livrosRepo.save(livro.get()); // Salva o livro no repositório.

  return "redirect:/livro/list";  // Redireciona o usuário de volta pra lista de 
}//FECHA A FUNÇÃO 
}