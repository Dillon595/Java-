/**  
 * @Title: PhoneTest.java
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:15:22 
 */  

package homework3;

/**  
 * @ClassName: PhoneTest
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:15:22 
*/

public class PhoneTest {
	public static void main(String[] args) {
		PhoneFactory pf = new PhoneFactory();
		pf.testPhone(new MobilePhone());
		System.out.println("***********");
		pf.testPhone(new Telephone());
		
		System.out.println("**********************");
		pf.getPhone(1);
		pf.getPhone(2);
		pf.getPhone(3);
	}
}
