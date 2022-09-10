package Hello.dao;

import Hello.Pojo.User;

import java.io.*;
import java.util.ArrayList;


public class Input {
    /**
     * 负责人：米墨
     * 参数：无
     * 返回值；用户对象的集合
     * 功能：从文件中读取用户数据
     */
    //read方法，用于注册的时候调用，查看文档返回的集合里是否有相同的用户名
    public static ArrayList<User> read() {
        //返回用户对象列表
        String filePath = "dao/note.txt";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            // 打印测试是否为空，正式运行可删除
//            System.out.println("ois为："+ois+"测试是否为空，正式运行可注释掉");
            try {

                //读取数据
                Object obj = ois.readObject();
                ArrayList<User> list = (ArrayList<User>)obj;

                //返回列表
                return list;

            } catch (Exception e) {
                throw new Exception(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流，释放资源
            try {
                ois.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


    //readscore方法，用于显示排行榜的调用，将成绩有效的集合返给排行榜打印

    public static ArrayList<User> readscore() {
        //返回用户对象列表
        String filePath = "dao/note.txt";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(filePath));
            try {
                //读取数据
                Object obj = ois.readObject();
                ArrayList<User> list = (ArrayList<User>)obj;

                //创建新的排行榜集合
                ArrayList<User> scorelist = new ArrayList<>();

                //对老集合进行判定，将成绩合法的对象装入新集合返回给排行榜
                for (int i = 0; i < list.size(); i++) {
                    User u = list.get(i);
                    //时间判定合法的装入集合
                    if (u.getUsedTime() > 0) {
                        scorelist.add(u);
                    }
                }
                //返回所有时间合法的对象给排行榜打印
                return scorelist;

            } catch (Exception e) {
                throw new Exception(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //关闭流，释放资源
            try {
                ois.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

