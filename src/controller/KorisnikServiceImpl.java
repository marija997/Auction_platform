package controller;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class KorisnikServiceImpl implements KorisnikService{
	@PersistenceContext(name = "Aukcija")
	private EntityManager em;
	
@Override
	public void addKorisnika(String ime, String prezime, String username, String password) {
try{
	
    
    	 Korisnik k = new Korisnik(ime,prezime,username,password);
    	 em.persist(k);
        } 
catch(Exception ex) {
	
	System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
	
	}  
    
  }

}
