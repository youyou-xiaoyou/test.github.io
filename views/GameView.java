package Hello.views;

import Hello.Pojo.*;
import Hello.Utils.pBlank;
import Hello.Utils.tools;
import Hello.service.*;

import java.io.IOException;
import java.util.ArrayList;

//进入界面
public class GameView {
    /**
     * 负责人：空
     * 参数：无
     * 返回值：无
     * 功能：1.打印主页面
     * 2.根据用户的输入来进行不同方法的调用
     */
    public static void View() {
        System.out.println("\033[34;1m" + "\t\t\t1.新的游戏" + "\033[5m");
        System.out.println("\t\t\t2.排行榜");
        System.out.println("\t\t\t3.设置");
        System.out.println("\t\t\t4.退出游戏");
        pBlank.pBlanks();
        System.out.println("请输入你的选择 ");
    }

    public static void printView() throws IOException, ClassNotFoundException {
        boolean flag = true;
        while (flag) {
            pBlank.pBlanks();
            View();
            int in = tools.scanner.nextInt();
            switch (in) {
                case 1:
                    StartView();
                    break;
                case 2:
                    System.out.println("该功能还在开发中、、、");
                    break;
                case 3:
                    SetView.printView();
                    break;
                case 4:
                    flag = false;
                    break;
            }

        }
    }

    /**
     * 负责人：
     * 参数：无
     * 返回值：无
     * 功能：游戏开始
     */
    public static void StartView() throws IOException, ClassNotFoundException {
        Boss[] bosses = BossInit.BossStart();
        Role[] roles = RoleInit.RoleStart();
        Arm[] arms = ArmInit.ArmStart();
        pBlank.pBlanks();


        System.out.println("你可选择的角色如下");
        for (int i = 0; i < 2; i++) {
            printRole.printRole(i, roles);
        }
        pBlank.pBlanks();
        System.out.println("请选择你的英雄");
        System.out.println("\t\t\t1." + roles[0].getName());
        System.out.println("\t\t\t2." + roles[1].getName());
        int index1 = tools.scanner.nextInt() - 1;
        Role role = RoleInit.getRole(index1, roles);
        pBlank.pBlanks();

        System.out.println("你可选择的武器如下");
        for (int i = 0; i < 4; i++) {
            printArm.printArm(i, arms);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("请选择你的武器");
        System.out.println("\t\t\t1." + arms[0].getName());
        System.out.println("\t\t\t2." + arms[1].getName());
        System.out.println("\t\t\t3." + arms[2].getName());
        System.out.println("\t\t\t4." + arms[3].getName());
        int index2 = tools.scanner.nextInt() - 1;
        Arm arm = ArmInit.getArm(index2, arms);
        pBlank.pBlanks();


        System.out.println("你选择的角色为:\t" + role.getName());
        System.out.println("你选择的武器为:\t" + arm.getName());
        System.out.println();
        Boss boss = BossInit.getBoss(1, bosses);
        ArrayList<Integer> dice = DiceInit.getDice();

        /**
         * 这里根据index1和index2对技能进行初始化
         */
        SkillInit skillInit = new SkillInit();
        Skill[] skills = skillInit.SkillStart(index1, index2);




        int floor = 1;
        int round = 1;//这里的round我暂时写为1，合并的时候要重新定义一个round，记录闯关到第几层
        label2:
        {
            while (floor <= 6) {
                System.out.println("\033[30;1m" + "现在进入第" + floor + "层" + "\033[0m");
                System.out.println("你获得了三个随机色子");
                boss = BossInit.getBoss(floor, bosses);


                label1:
                {
                    while (boss.getBlood() > 0) {
                        round++;
                        pBlank.pBlanks();
                        dice = DiceInit.getDice();

                        boolean rounds = true;


                        while (dice.isEmpty() == false && rounds) {
                            System.out.println("\033[30;1m" + "\t\t\t\t\t\t\t\t第"+floor+"层" + "\033[0m");
                            System.out.println("\033[34;1m"+"角色： " + role.getName() +"\033[5m" + "\033[31;1m" +"  血量:  " + role.getBlood()+ "\033[1m" + "\t\t\t\t\t" + "\033[34;1m" + "boss： " + boss.getName() + "\033[5m" + "\033[31;1m" +"  血量:  " + boss.getBlood()+ "\033[1m");
                            System.out.println("\033[33;1m" + "\t\t\t\t\t\t武器\t\t" + arm.getName() + "\t\t\t" + "\t\t"+ "\033[5m");
                            System.out.println("\033[36;1m" + "骰子\t\t" + "\033[0m");
                            for (int i = 0; i < dice.size(); i++) {
                                System.out.println("\033[36;1m" + "\t\t骰子" + (i + 1) + "：\t" + dice.get(i) + "\033[0m");
                            }


                            System.out.println();
                            System.out.println("\033[35;1m" + "技能\t\t" + "\033[5m");

                            for (int i = 0; i < skillInit.skillNumber; i++) {
                                System.out.print("\t" + (i + 1) + ".");
                                printSkill.printSkill(i, skills);
                            }
                            System.out.println("\t0.  结束回合");
                            pBlank.pBlanks();


                            System.out.println("\033[34;1m" + "请选择你的技能" + "\033[5m");
                            int index3 = tools.scanner.nextInt() - 1;

                            //输入0结束回合
                            if (index3 == -1) {
                                rounds = false;
                                break;
                            }


                            //若输入的数字大于技能列表长度，请重新输入
                            while (index3 + 1 > skills.length & rounds) {
                                System.out.println("技能列表的长度为：" + skills.length + "\t请重新选择你的技能");
                                index3 = tools.scanner.nextInt() - 1;
                            }
                            Skill skill = SkillInit.getSKill(index3, skills);
                            System.out.println("\033[34;1m" + "你选择的技能为:" + "\033[5m");
                            System.out.println("\033[35;1m" + skill + "\033[8m");

                            System.out.println("\033[34;1m" + "技能已选择，请输入所需骰子：" + "\033[5m");

                            int index4 = tools.scanner.nextInt() - 1;
                            while (index4 + 1 > dice.size()) {
                                System.out.println("\033[40;31;1m" + "骰子列表的长度为：" + dice.size() + "\t请重新选择你的骰子" + "\033[0m");
                                index4 = tools.scanner.nextInt() - 1;
                            }


                            /**
                             * 技能效果，多反面考虑
                             */
                            if (skill.judgeDice(dice.get(index4)) && skill.maxRoundTimeJudge(round)) {
                                System.out.println("\033[34;1m" + "你发动了该技能" + "\033[5m");
                                //这个SkillAffectService负责对输入的技能类型进行判断，并根据不同技能返回不同的效果
                                //注意！！！使用完之后需要自己把已经使用的骰子从列表中去掉
                                SkillAffectService skillAffectService = new SkillAffectService();
                                skillAffectService.SkillAffect(dice.get(index4), round, skill, boss, role, dice);
                                dice.remove(index4);

                                System.out.println();
                                System.out.println();
                                System.out.println();
                            } else {
                                System.out.println("\033[40;31;1m" + "骰子点数不符合技能要求或使用次数有限"+ "\033[0m");
                                System.out.println("\033[40;31;1m" + "请重新选择"+ "\033[0m");
                                //System.out.println("骰子点数不符合技能要求或使用次数有限\n请重新选择");
                                System.out.println();
                                System.out.println();
                                System.out.println();
                            }

                            //boss死亡是直接退出当前回合
                            if (boss.getBlood() <= 0) {
                                System.out.println("\033[31;1m" +"boss已死亡"+ "\033[1m");
                                //System.out.println("boss已死亡");
                                break label1;
                            }


                        }


                        //角色回合介绍，boss攻击
                        pBlank.pBlanks();
                        System.out.println("\033[34;1m" + "boss发动攻击" + "\033[5m");
                        role.setBlood(role.getBlood() - boss.attack());
                        System.out.println("\033[31;4m"+"角色受到"+"\033[1m" + "\033[31;4m" + boss.attack() + "\033[1m"+ "\033[31;4m"+"点伤害"+"\033[1m");

                        if (role.getBlood() <= 0) {
                            //彩蛋
                            pBlank.pBlanks();
                            System.out.println("\t\t\t\t\t世界咀嚼了我、、、");
                            FailView.printView();
                            break label2;
                        }


                        pBlank.pBlanks();
                        System.out.println("输入任意数字进入下回合");
                        int index = tools.scanner.nextInt() - 1;


                    }
                }

                System.out.println("技能奖励界面：");
                Skill[] newSkill = skillInit.newSkill();
                Skill[] getNewSkill = skillInit.getNewSkill(newSkill);
                for (int i = 0; i < 3; i++) {
                    System.out.print("\t" + (i + 1) + ".");
                    printSkill.printSkill(i, getNewSkill);
                }
                System.out.println("\t" + "0:放弃选择，回复50点血量");


                System.out.println("\033[34;1m" + "请输入想要选择的技能：" + "\033[5m");
                int index5 = tools.scanner.nextInt() - 1;


                if (index5 == -1) {
                    System.out.println("回复30点血量");
                    role.setBlood(role.getBlood() + 50);
                } else if (SkillInit.skillNumber == 5) {
                    System.out.println("技能已满，请选择需要替换的技能：");
                    for (int i = 0; i < 5; i++) {
                        System.out.println((i + 1));
                        printSkill.printSkill(i, skills);
                    }
                    int index6 = tools.scanner.nextInt() - 1;
                    skills[index6] = getNewSkill[index5];

                } else {
                    //技能未满正常选择0

                    for (int i = 0; i < 5; i++) {
                        if (skills[i] == null) {
                            skills[i] = getNewSkill[index5];
                            SkillInit.skillNumber += 1;
                            break;
                        }
                    }

                }



                floor += 1;

            }
            //彩蛋
            pBlank.pBlanks();
            System.out.println("恭喜你通过了最后的试炼，你已经有资格去探寻第十三律者最后的真相了");
            System.out.println("输入任意数字返回主菜单");
            int index = tools.scanner.nextInt() ;

        }
    }

}
