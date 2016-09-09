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
		
		Teacher teacher1 = new Teacher();
		Student student1 = new Student();
		
		
		
		teacher1.name =  "Ionescu";
		teacher1.subject = "POO";
		
		student1.name = "Popescu";
		student1.nota = 4;

		System.out.println(student1);
		System.out.println(teacher1);
		

	}

}
