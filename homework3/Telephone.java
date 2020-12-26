/**  
 * @Title: Telephone.java
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:10:30 
 */  

package homework3;

/**  
 * @ClassName: Telephone
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:10:30 
*/

public class Telephone extends Phone {
	public void call() {
		System.out.println("固定电话打电话");
	}
	
	public void getPhone() {
		System.out.println("固定电话接电话");
	}
	
	public void getInternet() {
		System.out.println("固定电话有宽带");
	}
}
