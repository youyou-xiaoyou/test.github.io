package Hello.views;

import Hello.Utils.pBlank;
import Hello.Utils.tools;

public class gameDes {
    /**负责人：池鱼
     *参数：无
     *返回值：无
     *功能：打印玩法说明
     */
    public static void View(){
        pBlank.pBlanks();
        System.out.println("\033[30;1m" + "该游戏是地牢闯关" + "\033[0m");
        System.out.println("\033[30;1m" + "1.玩家如果没有账号的话首先进行注册，" +"\n"+
                "注册完后即可登陆进入游戏。" + "\n" +
                "2.进入游戏后玩家可以对游戏难度进行选择简单、普通、困难。" +"\n" +
                "3.自由选择两个英雄角色和四把武器（都自带一个专属技能）。" +"\n" +
                "4.开局随机生成三个骰子点数。" + "\n" +
                "5.该游戏一共6层，每一层玩家通过骰子点数和技能匹配对boss造成伤害，" +"\n" +
                "如果骰子点数不能和技能匹配或者让boss击杀的则失败。" + "\n" +
                "6.每成功打过一层会有一个新的技能或一个血量百分比恢复供玩家自行选择，" +"\n" +
                "玩家最多不超过四个技能（含血量恢复和专属技能）。" + "\n" +
                "7.通过玩家通关时间的长短对玩家进行排名，通关时间越短排名则越高。"+"\033[0m");
        System.out.println();
        System.out.println("\t\t\t\t\t0.返回设置");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public static void printView(){
        boolean flag = true;
        while (flag){
            View();
            int in = tools.scanner.nextInt();
            if(in == 0)flag = false;

        }
    }
}
