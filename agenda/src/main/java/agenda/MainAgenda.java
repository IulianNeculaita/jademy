/**
 * 
 */
package agenda;

import java.util.Scanner;

/**
 * @author iulia
 *
 */
public class MainAgenda {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Agenda agenda = new Agenda();
		
		//adaug 10 persoane in agenda
		Persoana persoana = new Persoana();
		
		persoana.setNume("pufi");
		persoana.setNumarTelefon("2222222222");
		agenda.contacte.add(persoana);
		
		persoana = new Persoana();
		persoana.setNume("rin");
		persoana.setNumarTelefon("3333333333");
		agenda.contacte.add(persoana);

		persoana = new Persoana();
		persoana.setNume("ran");
		persoana.setNumarTelefon("4444444444");
		agenda.contacte.add(persoana);
	
		persoana = new Persoana();
		persoana.setNume("run");
		persoana.setNumarTelefon("5555555555");
		agenda.contacte.add(persoana);
		
		persoana = new Persoana();
		persoana.setNume("ren");
		persoana.setNumarTelefon("6666666666");
		agenda.contacte.add(persoana);
		
		persoana = new Persoana();
		persoana.setNume("bam");
		persoana.setNumarTelefon("7777777777");
		agenda.contacte.add(persoana);
		
		persoana = new Persoana();
		persoana.setNume("ben");
		persoana.setNumarTelefon("8888888888");
		agenda.contacte.add(persoana);
		
		persoana = new Persoana();
		persoana.setNume("bum");
		persoana.setNumarTelefon("9999999999");
		agenda.contacte.add(persoana);
		
		persoana = new Persoana();
		persoana.setNume("bim");
		persoana.setNumarTelefon("1010101010");
		agenda.contacte.add(persoana);
		
		persoana = new Persoana();
		persoana.setNume("cin");
		persoana.setNumarTelefon("1111111111");
		agenda.contacte.add(persoana);
		
		System.out.println("Agenda noastra contine:\n "+ agenda.contacte);
	
	
	
//get use input name
	 Scanner keyboard = new Scanner(System.in);
	
	 do{
	 System.out.print("introduce numele persoanei: ");
	String nume = keyboard.next();
	 if (nume.equalsIgnoreCase("exit")){
		 System.out.println("the programm has ended ");
		 break;
	 }
	System.out.println(agenda.findNumarTelefonByNume(nume));
	 } while (true);
	 
	 keyboard.close();
	}
	

}
