package Hello.service;

import Hello.Pojo.User;
import Hello.dao.Input;
import Hello.dao.Output;

import java.io.IOException;
import java.util.ArrayList;

public class EntrolService {
    /**
     *负责人：米墨
     * @param name
     * @return password/无
     * 功能：1.根据传入的账号，密码来检测合法性
     *      2.将所注册的数据保存到数据库
     */
    /**
     * @param name
     * @return
     */
    public static int entrol(String name, String password) throws IOException, ClassNotFoundException {
        //将传入的name与数据库中的name进行比较，设定返回值
        int result = 0;
        try {
            //用户名合法性判定
            if (name.length() > 8 || name.equals(null)) {
                return 3;
            }

            //密码长度合法性判定
            if (password.length() > 8 || password.equals(null)) {
                return 4;
            }

            //创建User与list对象把输入的账户密码存起来
            User u = new User();
            u.setName(name);
            u.setPassword(password);
            ArrayList<User> ulist = new ArrayList<>();
            ulist.add(u);

            //如果输入都合法，再继续往下走读出已经储存的用户列表
            ArrayList<User> list = Input.read();

//            遍历集合看看，集合里到底有什么，用于调试，后续不需要可注释
//            System.out.println("当前已储存的所有用户信息显示（用于调试，正式运行可注释掉）");
//            for (int i = 0; i < list.size(); i++) {
//                User u1 = list.get(i);
//                System.out.println(u1.getName() + "," + u1.getPassword());
//            }

            //空集合判定
            if (list.size() != 0) {
                //遍历这个列表，看看有没有相同的用户名
                for (int i = 0; i < list.size(); i++) {
                    User user = list.get(i);
                    //如果找到了一样的用户名，就返回错误2
                    if (user.getName().equals(name)) {
                        return 2;
                    }
                }
                //当用户名没有重复的时候，注册成功返回1
                //把对象传给Output存起来
                Output.save(ulist);
                return 1;
            }
            //源文件为空时，注册成功返回1
            else {
                //把对象传给Output存起来
                Output.save(ulist);
                return 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}