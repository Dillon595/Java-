/**  
 * @Title: PetTest.java
 * @Description: 
 * @author LYL
 * @date 2020-12-26 11:59:24 
 */  

package homework2;

/**  
 * @ClassName: PetTest
 * @Description: 
 * @author LYL
 * @date 2020-12-26 11:59:24 
*/

public class PetTest {
	public static void main(String[] args) {
		
		System.out.println("************第一题***************");
		Pet pet1 = new Dog();
		pet1.cry();
		pet1.eat();
		System.out.println("-------------------------");
		Pet pet2 = new Cat();
		pet2.cry();
		pet2.eat();
		System.out.println("-------------------------");
		if(pet1 instanceof Dog) {
			Dog dog1 = (Dog)pet1;
			dog1.guardEntrance();
		}
		if(pet2 instanceof Cat) {
			Cat cat1 = (Cat)pet2;
			cat1.huntMice();
		}
		
		System.out.println();
		System.out.println("*****第一题第三问*******");
		PetPark pp = new PetPark();
		Dog dog2 = new Dog();
		Cat cat2 = new Cat();
		pp.feedPet(dog2);
		pp.feedPet(cat2);
	}
}
