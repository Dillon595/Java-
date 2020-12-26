
package homework2;

/**  
 * @ClassName: Cat
 * @Description: 
 * @author LYL
 * @date 2020-12-26 11:55:32 
*/

public class Cat extends Pet {
	
	Cat(){
		System.out.println("养了一只猫");
	}
	
	public void cry() {
		System.out.println("猫的叫声：喵喵...");
	}
	
	public void eat() {
		System.out.println("猫吃了一条鱼");
	}
	
	public void huntMice() {
		System.out.println("宠物猫捉了老鼠。。。");
	}
}
