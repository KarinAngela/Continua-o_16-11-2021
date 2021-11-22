package application.repositories;  /*Pacote responsável por fazer a intermediação */
import org.springframework.data.repository.CrudRepository; /* IMPORTAÇÃO RESPONSAVEL PELA CrudRepository*/

import application.models.Livro; /*IMPORTAÇÃO RESPONSAVEL PELA models.Livro*/

public interface LivroRepository extends CrudRepository<Livro, Integer> { /*NESSE É USADO extends SE REFERE A UMA EXTENSÃO, ONDE SE APLICA HERANÇA Á CLASSE DESEJADA*/

    

}