package Hello;


import Hello.views.GameView;

import Hello.views.SetView;
import Hello.views.StartView;

import java.io.IOException;

/**
 * 1.不要随意全局变量
 * 2.view不能直接调用dao层
 * 3.只能通过service来调用dao层
 * 4.有的地方异常要进行处理
 * 5.建议：有问题多提问，多百度
 */
public class Start {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        SetView.printView();
        StartView.printView();
//        GameView.StartView();
    }
}
