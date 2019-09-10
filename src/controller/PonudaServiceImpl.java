package controller;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class PonudaServiceImpl implements PonudaService{
	@PersistenceContext(name = "Aukcija")
	private EntityManager em;

	@Override
	public void addPonuda(String iznos, String id_aukcije) {
		try{

		    int cena =Integer.parseInt(iznos);
		    int aukcija=Integer.parseInt(id_aukcije);

		    Ponuda p1 = new Ponuda(cena,aukcija);
		    em.persist(p1);
		 
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		
	}


}