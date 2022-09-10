package Hello.service;

import Hello.Pojo.Boss;
import Hello.Pojo.Role;
import Hello.Pojo.Skill;


import java.util.ArrayList;

/**
 * 负责人：小幽
 * 参数：dice,skill
 * 返回值：void 只显示技能最后产生了什么效果
 * 功能：根据角色使用的技能来输出不同效果
 */
public class SkillAffectService {
    public SkillAffectService() {
    }

    public void SkillAffect(int dice, int round, Skill skill, Boss boss, Role role, ArrayList<Integer> dice0) {
        switch (skill.label) {
            //造成伤害技能
            case 0:
                int injure = skill.getInjure(dice, round, boss);
                //boss.血量扣除(injure)
                boss.setBlood(boss.getBlood() - injure);
                System.out.println("扣除血量" + injure);
                break;

            //回复血量技能
            case 1:
                //回复血量
                break;

            //获得骰子技能
            case 2:
                //骰子使用泛型数组列表ArrayList<Integer> dice0，
                // otherDice[] 是用来存放使用技能后得到的骰子
                //循环otherDice中的int元素，将其添加到dice0列表
                //注意，在此之前要把已经用掉的骰子去掉
                int[] otherDice = skill.getNewDice(dice);
                for (int i = 0; i < otherDice.length; i++) {
                    dice0.add(otherDice[i]);
                    System.out.println("获得骰子点数" + otherDice[i]);
                }
                break;

            //造成伤害的同时获得骰子
            case 3:
                //这里的警告不用管
                int injure3 = skill.getInjure(dice, round, boss);
                boss.setBlood(boss.getBlood() - injure3);
                System.out.println("扣除血量" + injure3);


                int[] otherDice3 = skill.getNewDice(dice);
                for (int i = 0; i < otherDice3.length; i++) {
                    dice0.add(otherDice3[i]);
                    System.out.println("获得骰子点数" + otherDice3[i]);
                }
                break;


                //造成伤害的同时回复血量
            case 4:
                int injure4 = skill.getInjure(dice, round, boss);
                boss.setBlood(boss.getBlood() - injure4);
                System.out.println("扣除血量" + injure4);


                skill.addBlood(dice, role);
                break;

            default:
                System.out.println("标签有问题");
        }

    }
}
