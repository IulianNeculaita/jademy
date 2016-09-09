/**
 * 
 */
package ro.jademy;

/**
 * @author iulian
 *
 */
public class Teacher extends Person {
	String name;
	String subject;
	
	public Teacher(){
		
	}
	@Override
	public String toString(){
		
		return "Profesor: " + this.name + ", "+ this.subject;
	}

}
