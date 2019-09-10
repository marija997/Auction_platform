package controller;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class AukcijaServiceImpl implements AukcijaService{
	@PersistenceContext(name = "Aukcija")
	private EntityManager em;

	@Override
	public void addAukcija(String naziv, String opis, String stanje_proizvoda, String pocetna_cena, String trajanje_aukcije) {
		try{

		    int cena =Integer.parseInt(pocetna_cena);
		    int trajanje=Integer.parseInt(trajanje_aukcije);

		    Aukcija a1 = new Aukcija(naziv,opis, stanje_proizvoda,cena,trajanje);
		    em.persist(a1);
		 
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
		
	}

	@Override
	public void deleteAukcija(String bid) {
		try{
			 
		    int kid=Integer.parseInt(bid);
		    Aukcija a1 =em.find(Aukcija.class, kid);
		    em.remove(a1);
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}
	}
	
	@Override
	public void updateAukcija(String aid, String nov_opis) {
		try{

		    
		    int kid=Integer.parseInt(aid);
		    Aukcija a1 =em.find(Aukcija.class, kid);
		    
		    a1.setOpis(nov_opis);   
		    
		        } catch(Exception ex) {
			
			System.out.println("Greska prilikom rada sa bazom: \n" + ex.getMessage());
			
			}  
	}

}
