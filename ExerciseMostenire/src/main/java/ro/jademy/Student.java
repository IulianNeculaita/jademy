/**
 * 
 */
package ro.jademy;

/**
 * @author iulian
 *
 */
public class Student extends Person {
	int nota;
	String name;
	
	
	public Student(){
		
	}
	@Override
	public String toString(){
		
		return "Student: " + this.name + ", " + this.nota;
	}
}
