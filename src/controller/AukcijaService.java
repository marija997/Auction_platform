package controller;

public interface AukcijaService {
	public void addAukcija(String naziv, String opis, String stanje_proizvoda, String pocetna_cena, String trajanje_aukcije);
	public void deleteAukcija(String bid);
	public void updateAukcija(String aid, String nov_opis);

}
