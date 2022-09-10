package Hello.service;

import Hello.Pojo.User;
import Hello.dao.Input;

import java.io.IOException;
import java.util.ArrayList;

public class LoginService {
    /**
     * 负责人：米墨
     *
     * @param name
     * @param password
     * @return 不同的判断值
     * 功能；1.读取数据库的数据
     * 2.根据传入的账号密码依据登录成功/密码错误/账号不存在不同情况返回不同的值
     */
    public static int login(String name, String password) throws IOException, ClassNotFoundException {
        //定义返回值
        int result = 0;

        //用户名合法性判定
        if(name.length()>8||name.equals(null)){
            System.out.println("账号输入不合法");
            return result;
        }

        //密码长度合法性判定
        if(password.length()>8||password.equals(null)){
            System.out.println("密码输入不合法");
            return result;
        }

        //先调用流，获取已经有了的用户数据集合
        ArrayList<User> list = Input.read();

        //空集合判定
        if(list!=null){
        //遍历这个集合，查询相关ID和密码的合法性
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getName().equals(name)) {
                if (user.getPassword().equals(password)) {
                    System.out.println("登录成功,你进入了游戏");
                    return  1;
                } else {
                    System.out.println("登录失败，密码错误");
                    return  2;
                }
            }
        }
        //若集合为空，直接返回未注册
        }
        System.out.println("该账号还未注册,请先注册");
        return result;
    }
}
