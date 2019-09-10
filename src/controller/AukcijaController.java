package controller;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class AukcijaController {
	
	    
		 private String bid="";
	     private String naziv="";
	     private String opis="";
	     private String stanje_proizvoda="";
	     private String pocetna_cena="";
	     private String trajanje_aukcije="";
	     
	     
	     
	     
		
		
		public String getBid() {
			return bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getNaziv() {
			return naziv;
		}

		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}

		public String getOpis() {
			return opis;
		}

		public void setOpis(String opis) {
			this.opis = opis;
		}

		public String getStanje_proizvoda() {
			return stanje_proizvoda;
		}

		public void setStanje_proizvoda(String stanje_proizvoda) {
			this.stanje_proizvoda = stanje_proizvoda;
		}

		public String getPocetna_cena() {
			return pocetna_cena;
		}

		public void setPocetna_cena(String pocetna_cena) {
			this.pocetna_cena = pocetna_cena;
		}

		public String getTrajanje_aukcije() {
			return trajanje_aukcije;
		}

		public void setTrajanje_aukcije(String trajanje_aukcije) {
			this.trajanje_aukcije = trajanje_aukcije;
		}

		public String getAid() {
			return aid;
		}

		public void setAid(String aid) {
			this.aid = aid;
		}

		public String getaNovOpis() {
			return aNovOpis;
		}

		public void setaNovOpis(String aNovOpis) {
			this.aNovOpis = aNovOpis;
		}

		public AukcijaService getService() {
			return service;
		}

		public void setService(AukcijaService service) {
			this.service = service;
		}

		private String aid="";  
	     private String aNovOpis ="";
		
		@EJB
		private AukcijaService service;
		 
	        
	 
	    public void deleteAukcija(String bid){
			service.deleteAukcija(bid);
		}
	    
		public void addAukcija(String naziv, String opis, String stanje_proizvoda, String pocetna_cena, String trajanje_aukcije) {
			service.addAukcija(naziv, opis, stanje_proizvoda, pocetna_cena, trajanje_aukcije);
		}
		
		public void updateAukcija(String aid, String nov_opis){
			service.updateAukcija(aid, nov_opis);
		}
	      
	        
	}


