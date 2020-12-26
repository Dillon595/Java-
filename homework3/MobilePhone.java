/**  
 * @Title: MobilePhone.java
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:08:18 
 */  

package homework3;


/**  
 * @ClassName: MobilePhone
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:08:18 
*/

public class MobilePhone extends Phone {
	public void call() {
		System.out.println("手机打电话");
	}
	
	public void getPhone() {
		System.out.println("手机接电话");
	}
	
	public void getText() {
		System.out.println("手机接短信");
	}
}
