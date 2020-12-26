/**  
 * @Title: PhoneFactory.java
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:11:41 
 */  

package homework3;

/**  
 * @ClassName: PhoneFactory
 * @Description: 
 * @author LYL
 * @date 2020-12-26 01:11:41 
*/

public class PhoneFactory {
	public void testPhone(Phone phone) {
		phone.call();
		phone.getPhone();
	}
	
	public Phone getPhone(int type) {
		if(type == 1) {
			Telephone tp = new Telephone();
			System.out.println("固定电话生成完毕");
			return tp;
		}else if(type==2) {
			MobilePhone mp = new MobilePhone();
			System.out.println("手机生成完毕");
			return mp;
		}else {
			Phone phone = new Phone();
			System.out.println("电话生成完毕");
			return phone;
		}
	}
}
