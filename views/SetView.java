package Hello.views;

import Hello.Utils.pBlank;
import Hello.Utils.tools;
public class SetView {
    /**
     * 负责人：池鱼
     * 参数：无
     * 返回值：无
     * 功能：打印设置界面
     */
    public static void View(){
        System.out.println("\033[32;1m" + "\t\t\t玩法说明" + "\033[1m");
        System.out.println("\t\t\t2.选择难度");
        System.out.println("\t\t\t3.退出设置");
        pBlank.pBlanks();
        System.out.println("请输入你的选择");
    }
    public static void printView(){
        boolean flag = true ;
        while(flag) {
            pBlank.pBlanks();
            View();
            int in = tools.scanner.nextInt();
            switch (in) {
                case 1:
                    gameDes.printView();
                    break;
                case 2:
                    difficultSetting.printView();
                    break;
                case 3:
                    System.out.println("你退出了设置");
                    flag = false;
                    break;
            }

        }
    }
}
