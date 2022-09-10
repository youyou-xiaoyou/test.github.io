package Hello.Utils;

import Hello.Pojo.Skill;
import java.util.Scanner;
public class tools {
    /**
     * 负责人：酋长
     * 功能：创建全局变量，方便管理
     */
    public static Scanner scanner = new Scanner(System.in);
    //0 角色技能 1 武器技能 2-4 额外技能
    public static Skill[] skills ;
    public static int skillLen ;
    //选择角色是创建一个新的长度为5的数组，存放技能，赋值给skills skilllen = 1
    //选择武器技能  skills[1] = 新技能  skillLen ++
}
