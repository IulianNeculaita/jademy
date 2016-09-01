/**
 * 
 */
package agenda;

import java.util.ArrayList;

/**
 * @author iulian
 *
 */
public class Agenda {
	
	
	ArrayList <Persoana> contacte;
	
	public Agenda(){
	
	this.contacte = new ArrayList <Persoana>();
	}
	
	public String findNumarTelefonByNume(String nume){
		String result = "nu am gasit numele in agenda.";
		
		for (Persoana persoana : contacte) {
			if(persoana.getNume().equalsIgnoreCase(nume)){
				return "numarul persoanei " + persoana.getNume()+ " este " + persoana.getNumarTelefon();
			}
		}
		
		
		return result;
	}
	
	
	
}
