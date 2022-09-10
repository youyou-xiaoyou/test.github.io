package Hello.views;

import Hello.Utils.pBlank;
import Hello.Utils.tools;

import java.io.IOException;

public class StartView {

    /**
     * 负责人：空
     * 参数：无
     * 返回值：无
     * 功能：打印初始界面
     */
    private static void View(){
        pBlank.pBlanks();
        System.out.println("\033[34;1m" + "\t\t\t欢迎来到地牢闯关" + "\033[5m");
        System.out.println("\t\t\t1.登录");
        System.out.println("\t\t\t2.注册");
        System.out.println("\t\t\t3.退出游戏");
        pBlank.pBlanks();
        System.out.println("请输入你的选择");
    }



//菜单界面的接收收入

    /**
     * 负责人：空
     * 参数：无
     * 返回值：无
     * 功能：
     */
    public static void printView() throws IOException, ClassNotFoundException {
        boolean flag = true;
        while (flag == true){
            View();
            int in = tools.scanner.nextInt();
            switch (in) {
                        case 1:
                            LoginView.printView();
                            break;
                        case 2:
                            EnrollView.printView();
                            break;
                case 3:
                    flag = false;
                    break;
                default:
                    System.out.println("\033[40;31;1m" + "你的输入有误，请重新输入" + "\033[0m");
                    break;
            }
        }
    }
}
