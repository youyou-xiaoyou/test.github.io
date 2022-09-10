package Hello.views;

import Hello.Utils.tools;

import java.io.IOException;

public class FailView {

    public static void printView() throws IOException, ClassNotFoundException {
        System.out.println("\033[41;34;1m" + "\t\t\t你死了" + "\033[0m");
        System.out.println("\t\t\t1.重新开始（回到主界面）");
        System.out.println("\t\t\t2.回到登录注册界面");
        System.out.println("\t\t\t3.退出游戏");
        System.out.println("请输入你的选择");
        int in = tools.scanner.nextInt();
        switch (in) {
            case 1:
                GameView.printView();
                break;
            case 2:
                StartView.printView();
                break;
            case 3:
                break;
            default:
                System.out.println("\033[40;31;1m" + "你的输入有误，请重新输入" + "\033[0m");
                //System.out.println("你的输入有误，请重新输入");
                break;
        }
        if (in == 3){
            System.out.println("你退出了游戏");
            return;
        }
    }
}
