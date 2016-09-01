/**
 * 
 */
package agenda;

/**
 * @author iulia
 *
 */
public class Persoana {
	
	
	private String nume;
	private String numarTelefon;
	
	
	
	
	public Persoana(){
		
	
	}




	/**
	 * @return the nume
	 */
	public String getNume() {
		return nume;
	}




	/**
	 * @param nume the nume to set
	 */
	public void setNume(String nume) {
		this.nume = nume;
	}




	/**
	 * @return the numarTelefon
	 */
	public String getNumarTelefon() {
		return numarTelefon;
	}




	/**
	 * @param numarTelefon the numarTelefon to set
	 */
	public void setNumarTelefon(String numarTelefon) {
		this.numarTelefon = numarTelefon;
	}

	public String toString(){
		return this.nume + ":"+ this.numarTelefon + "\n";
	}
	
}
