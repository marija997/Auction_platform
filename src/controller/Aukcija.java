package controller;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
 
@Entity
@Table(name = "aukcija")

public class Aukcija {
	    
		@TableGenerator(name = "aukcija_gen", table = "id_aukcija_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "aukcija_gen")
		@Id
		@GeneratedValue(strategy = GenerationType.TABLE, generator = "aukcija_gen")
		

	    /*
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column*/
		private int id;
		
		@Column(name = "naziv")
	    private String naziv;
	 
	
	    @Column(name = "opis")
	    private String opis;
	 
	    @Column(name = "stanje_proizvoda")
	    private String stanje_proizvoda;
	    

	    @Column(name = "pocetna_cena")
	    private int pocetna_cena;
	    
	    @Column(name = "trajanje_aukcije")
	    private int trajanje_aukcije;
	    
	    
		
	 
	    public int getId() {
			return id;
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

		public int getPocetna_cena() {
			return pocetna_cena;
		}

		public void setPocetna_cena(int pocetna_cena) {
			this.pocetna_cena = pocetna_cena;
		}

		public int getTrajanje_aukcije() {
			return trajanje_aukcije;
		}

		public void setTrajanje_aukcije(int trajanje_aukcije) {
			this.trajanje_aukcije = trajanje_aukcije;
		}

		public Aukcija() {}
	 
	    public Aukcija(String naziv, String opis, String stanje_proizvoda, int pocetna_cena, int trajanje_aukcije) {
	    	this.naziv = naziv;
	    	this.opis = opis;
	    	this.stanje_proizvoda = stanje_proizvoda;
	    	this.pocetna_cena = pocetna_cena;
	    	this.trajanje_aukcije = trajanje_aukcije;
	       
	    }
	 
	   
	}


