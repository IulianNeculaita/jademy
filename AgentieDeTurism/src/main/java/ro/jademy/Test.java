/**
 * 
 */
package ro.jademy;

/**
 * @author iulian
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AgentiaFloarei agentia2 = new AgentiaFloarei();
		
		
		
		AgentiaTurism agentia1 = new AgentiaTurism();
		
		
		
		
		System.out.println("AgenziaTurism");
		
		System.out.println("+------------------------------------------------+");
		System.out.println("sejurul 1: ");
		System.out.println("# " +agentia1.getHotelA() + ": " + agentia1.getHotel1Nopti() + " noapte. cost:  50 euro/noapte");
		System.out.println("# " +agentia1.getHotelB() + ": " + agentia1.getHotel2Nopti() + " nopti, cost:  40 euro/noapte");
		System.out.println("# " +agentia1.getHotelC() + ": " + agentia1.getHotel3Nopti() + " noapte, cost:  60 euro/noapte");
		System.out.println("+------------------------------------------------+");
		
		System.out.println("sejurul 2: ");
		System.out.println("# " +agentia1.getHotelB() + ": " + agentia1.getHotel2Nights() + " nopti, cost:  40 euro/noapte");
		
		System.out.println("+------------------------------------------------+");
		
		System.out.println("sejurul 3: ");
		System.out.println("# " +agentia1.getHotelC() + ": " + agentia1.getHotel3Nights() + " noapte, cost:  60 euro/noapte");
		
		System.out.println("+---------------------------------------------------------------------------+");
		System.out.println("+---------------------------------------------------------------------------+");
		
		System.out.println("AgentiaFloarei");
		System.out.println("+------------------------------------------------+");
		System.out.println("sejurul 4: ");
		System.out.println("# " +agentia2.getHotelA() + ": " + agentia2.getHotel1Nopti() + " noapte. cost:  50 euro/noapte.");
		System.out.println("# " +agentia2.getHotelB() + ": " + agentia2.getHotel2Nopti() + " noapte. cost:  40 euro/noapte.");
		System.out.println("# " +agentia2.getHotelC() + ": " + agentia2.getHotel3Nopti() + " noapte. cost:  60 euro/noapte.");
		System.out.println("+------------------------------------------------+");

		System.out.println("sejurul 5: ");
		System.out.println("# " +agentia2.getHotelA() + ": " + agentia2.getHotel1Nights() + " noapte. cost:  50 euro/noapte.");
		
		System.out.println("+------------------------------------------------+");
		

	}

}
