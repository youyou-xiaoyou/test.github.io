package Hello.views;

import Hello.Utils.tools;
import Hello.service.EntrolService;

import java.io.IOException;

//注册界面
public class EnrollView {
    /**
     * 负责人：王明
     * 参数：无
     * 返回值：无
     * 功能：1.打印注册界面
     *      2.实现注册功能
     */

    public static void printView() throws IOException, ClassNotFoundException {
        boolean flag = true;
        while(flag) {
            System.out.println("请输入八位以内的账号");
            String name = tools.scanner.next();
            System.out.println("请输入八位以内的密码");
            String password = tools.scanner.next();
            int res = EntrolService.entrol(name,password);
            if (res == 1){
                System.out.println("注册成功");
                flag = false;
            }
            if (res == 2){
                System.out.println("\033[40;31;1m" + "用户重名" + "\033[0m");
                //System.out.println("用户重名");
            }
            if (res == 3){
                System.out.println("\033[40;31;1m" + "用户名不合法" + "\033[0m");
                //System.out.println("用户名不合法");
            }
            if (res == 4){
                System.out.println("\033[40;31;1m" + "密码不合法" + "\033[0m");
                //System.out.println("密码不合法");
            }
        }
    }
}
