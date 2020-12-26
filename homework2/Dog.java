/**  
 * @Title: Dog.java
 * @Description: 
 * @author LYL
 * @date 2020-12-26 11:55:22 
 */  

package homework2;

/**  
 * @ClassName: Dog
 * @Description: 
 * @author LYL
 * @date 2020-12-26 11:55:22 
*/

public class Dog extends Pet {
	Dog(){
		System.out.println("养了一只狗");
	}
	public void cry() {
		System.out.println("狗的叫声：汪汪...");
	}

	public void eat() {
		System.out.println("狗啃了一根骨头");
	}
	
	public void guardEntrance() {
		System.out.println("宠物狗在看家。。。");
	}
}
