package Hello.views;

import Hello.Utils.pBlank;
import Hello.Utils.tools;

public class difficultSetting {

    public static void View(){
        pBlank.pBlanks();
        System.out.println("\t\t\t请对游戏进行难度设置" + "\n" +
                "\t\t\t1.简单" + "\n" +
                "\t\t\t2.普通" + "\n" + "\t\t\t3.困难");
        System.out.println();
        System.out.println("\t\t\t0.确定");
        pBlank.pBlanks();
    }
    public static void printView(){
        boolean flag = true;
        while(flag){
            View();
            int in = tools.scanner.nextInt();
            switch (in) {
                case 1:
                    //难度一数据调整
                    break;
                case 2:
                    //难度二数据调整
                    break;
                case 3:
                    //难度三调整
                    break;
                case 0:
                    flag = false;
                    break;
            }

        }
    }
}
