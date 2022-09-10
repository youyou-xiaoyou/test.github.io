package Hello.views;

import Hello.Utils.tools;
import Hello.service.LoginService;

import java.io.IOException;

//登录界面
public class LoginView {
    /**
     * 负责人：王明
     * 参数：无
     * 返回值：无
     * 功能：根据用户的输入进行登录确认
     */
    public static void printView() throws IOException, ClassNotFoundException {
        System.out.println("\033[34;1m" + "请输入你的账号" + "\033[5m");
        String name = tools.scanner.next();
        System.out.println("\033[34;1m" + "请输入你的密码" + "\033[5m");

        String password = tools.scanner.next();
        int res = LoginService.login(name,password);
        if(res == 1){
            GameView.printView();
        }
    }
}
