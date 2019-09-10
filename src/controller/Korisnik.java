package controller;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "korisnik")
public class Korisnik {
	@TableGenerator(name = "korisnik_gen", table = "id_korisnik_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 1, pkColumnValue = "korisnik_gen")
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "korisnik_gen")


    /*
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column*/
	
		private int id;
	
	 	@Column(name = "ime")
	    private String ime;
	 
	
	    @Column(name = "prezime")
	    private String prezime;
	 
	    @Column(name = "username")
	    private String username;
	    

	    @Column(name = "password")
	    private String password;
	    
	    //PROVERI DA LI IDE I FOREIGN KEY

	    public Korisnik(){}
	    
	    public Korisnik(String ime, String prezime, String username,String password)
	    {
	    	this.setIme(ime);
	    	this.setPrezime(prezime);
	    	this.setUsername(username);
	    	this.setPassword(password);
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

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
	    
	  
}
