/**  
 * @Title: Game.java
 * @Description: 
 * @author LYL
 * @date 2020-12-26 11:32:09 
 */  

package homework1;

import java.util.Scanner;

/**  
 * @ClassName: Game
 * @Description: 
 * @author LYL
 * @date 2020-12-26 11:32:09 
*/

public class Game {
	public void create() {
		System.out.println("请选择需要创建的英雄：1、德玛西亚 2、寒冰射手 3、后羿");
		Scanner sc = new Scanner(System.in);
		if(sc.nextInt()==1) {
			GaiLun gl = new GaiLun();
			System.out.println("德玛西亚之力被创建");
			System.out.println("请选择是否释放技能 ？  1、释放  2、不释放");
			if(sc.nextInt()==1) {
				release(gl);
			}else {
				System.out.println("游戏结束");
				return;
			}
		}else if(sc.nextInt()==2) {
			AiXi ax = new AiXi();
			System.out.println("寒冰射手被创建");
			System.out.println("请选择是否释放技能 ？  1、释放  2、不释放");
			if(sc.nextInt()==1) {
				release(ax);
			}else {
				System.out.println("游戏结束");
				return;
			}
		}else if(sc.nextInt()==3) {
			HouYi hy = new HouYi();
			System.out.println("后羿被创建");
			System.out.println("请选择是否释放技能 ？  1、释放  2、不释放");
			if(sc.nextInt()==1) {
				release(hy);
			}else {
				System.out.println("游戏结束");
				return;
			}
		}
		System.out.println();
		
		
		
	}
	
	public void release(Role role) {
		System.out.println(role.name+"，成功释放"+role.skill);
	}
}
