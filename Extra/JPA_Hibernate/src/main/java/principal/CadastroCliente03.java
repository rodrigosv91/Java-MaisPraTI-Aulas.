
package principal;

import com.mycompany.jpa_hibernate.model.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rodrigo
 */
public class CadastroCliente03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Clientes-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Cliente cliente = new Cliente();
        cliente.setNome("Armazém Estrela");

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();    
    }
}
