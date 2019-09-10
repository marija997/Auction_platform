package controller;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;


@ManagedBean

public class KorisnikController {

	    
	     private String ime="";
	     private String prezime="";
	     private String username="";
	     private String password="";   
	    
	     
		@EJB
		private KorisnikService service;
		
		
	
	           
		
		public String getIme() {
			return ime;
		}





		public void setIme(String ime) {
			this.ime = ime;
		}





		public String getPrezime() {
			return prezime;
		}





		public void setPrezime(String prezime) {
			this.prezime = prezime;
		}





		public String getUsername() {
			return username;
		}





		public void setUsername(String username) {
			this.username = username;
		}





		public String getPassword() {
			return password;
		}





		public void setPassword(String password) {
			this.password = password;
		}





		public KorisnikService getService() {
			return service;
		}





		public void setService(KorisnikService service) {
			this.service = service;
		}





		public void addKorisnika(String ime, String prezime, String username, String password) {
			service.addKorisnika(ime,prezime,username,password);
		}}
	      