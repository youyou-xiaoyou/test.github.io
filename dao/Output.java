package Hello.dao;

import Hello.Pojo.User;

import java.io.*;
import java.util.ArrayList;

public class Output {
    public static void save(ArrayList<User> u) throws IOException {
        String filePath = "dao/note.txt";
        ObjectOutputStream oss = null;
        try {
            //获取原有列表
           ArrayList<User> list = Input.read();
            //ArrayList<User> list = new ArrayList<>();

            //将传入的列表加入新列表中
            for (int i = 0; i < u.size(); i++) {
                User user = u.get(i);
                list.add(user);
            }

            oss = new ObjectOutputStream(new FileOutputStream(filePath));
            oss.writeObject(list);
            System.out.println("储存进用户列表成功");
        } catch (IOException e) {
            throw new IOException(e);
        } finally {
            //关闭流，释放资源
            try {
                oss.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
//        String filePath = "dao\\note.txt";
//        //建立输入流
//        //BufferedWriter bw = new BufferedWriter(new FileWriter("dao\\note.txt"));
//        ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(filePath));
//
//        //检测文件是否存在
//        File df = new File(filePath);
//        if(!df.exists()){
//            df.mkdir();
//        }
//
//        ArrayList<User> list = Input.read();
//        //存入数据
//        if(list!=null){
//            list.add(u);
//            oss.writeObject(list);
//        }else{
//            ArrayList<User> list1 = new ArrayList<>();
//            list1.add(u);
//            oss.writeObject(list1);
//        }
//        //关闭流，释放资源
//        oss.close();
//    }
//}

    /**
     * 负责人：米墨
     * 参数：传入的用户数据
     * 返回值：无
     * 功能；进行用户数据的存储(目前就是账号及其通关用时存储)
     *
     * * 思路：
     *      * 先读取用户列表
     *      * 将传入的用户数据插入其中
     *      * 再将新用户列表存入数据库
     */


