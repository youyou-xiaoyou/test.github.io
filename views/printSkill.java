package Hello.views;

import Hello.Pojo.Skill;
import Hello.service.SkillInit;

public class printSkill {
    /**
     * 负责人：小幽
     *
     * @param index
     * @param skills 功能：根据传入的数来获取技能信息
     */
    public static void printSkill(int index, Skill[] skills) {
        //得到具体的某一个skill对象
        Skill skill = SkillInit.getSKill(index, skills);
        //对这个skill对象使用toString方法
        System.out.println("\033[35;1m" + "\t" + skill.toString() + "\033[5m");

    }
}
