package controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class PonudaController {
	
	     private String iznos="";
	     private String id_aukcije="";
	     
	     @EJB
			private PonudaService service;
			 
	     
	     
		        
		 
		   
			public String getIznos() {
			return iznos;
		}






		public void setIznos(String iznos) {
			this.iznos = iznos;
		}






		public String getId_aukcije() {
			return id_aukcije;
		}






		public void setId_aukcije(String id_aukcije) {
			this.id_aukcije = id_aukcije;
		}






		public PonudaService getService() {
			return service;
		}






		public void setService(PonudaService service) {
			this.service = service;
		}






			public void addPonuda(String iznos, String id_aukcije) {
				service.addPonuda(iznos,id_aukcije);
			}
			
			
	     
}
	     
	     
	     
	     