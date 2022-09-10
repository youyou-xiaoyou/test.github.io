package Hello.views;

import Hello.Pojo.User;

public class rankListView {
    /**
     * 负责人：李华
     * 参数：无
     * @param users
     * 功能：打印排行榜
     */
    public static void printView(User[] users){
        for (int i = 0; i < users.length; i++) {
            System.out.println("\033[31;1m" +users[i].getName() + "\t\t\t" + users[i].getUsedTime()+ "\033[1m");
        }
    }
}
