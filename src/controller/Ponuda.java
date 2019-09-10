package controller;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
 
@Entity
@Table(name = "ponuda")

public class Ponuda {
	    
		@TableGenerator(name = "ponuda_gen", table = "id_ponuda_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "ponuda_gen")
		@Id
		@GeneratedValue(strategy = GenerationType.TABLE, generator = "ponuda_gen")
		

	    /*
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column*/
		private int id;
		
		@Column(name = "iznos")
	    private int iznos;
	 
	
	    @Column(name = "aukcija_id")
	    private int id_aukcije;
	    
	    
	 
	    public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getIznos() {
			return iznos;
		}

		public void setIznos(int iznos) {
			this.iznos = iznos;
		}

		public int getId_aukcije() {
			return id_aukcije;
		}

		public void setId_aukcije(int id_aukcije) {
			this.id_aukcije = id_aukcije;
		}
		
		

		public Ponuda() {}
		 
	    public Ponuda(int iznos, int id_aukcije) {
	    	this.iznos = iznos;
	    	this.id_aukcije = id_aukcije;
	    	
	       
	    }
	    

}