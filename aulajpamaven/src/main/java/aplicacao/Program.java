package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
    	//id tem que ser nulo pois o bd que vai instanciar eles
    
        Pessoa p1 = new Pessoa(null,"Pedro","pedro@gmail.com");
        Pessoa p2 = new Pessoa(null,"João","joao@gmail.com");
        
        //cria o EntityManager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");//nome que vai estar no .xml
        //faz conexão com o banco de dados 
        EntityManager em = emf.createEntityManager();
        /*
        em.getTransaction().begin();//inicio da transação com o bd
        em.persist(p1);
        em.persist(p2);
        em.getTransaction().commit();//faz o commit das ações
        */
        
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p);
        
        //JPA só remove uma entidade monitorada (ou ela tem que ter sido inserida no próprio código ou tem que ser recuperada)
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
        
        System.out.println("Feito");
        em.close();
        emf.close();
    }
}
