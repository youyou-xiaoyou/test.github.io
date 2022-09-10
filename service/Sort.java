package Hello.service;

import Hello.Pojo.User;

public class Sort {
    /**
     * 负责人：李华
     * @param
     * @return 返回排序好之后的用户集合
     * 功能：根据传入的用户结合按时间进行排序，并返回
     */
    public static User[] sort(User[] users){
        User temp = null;
        for (int i = 0; i < users.length - 1; i++) {
            for (int j = 0; j < users.length - 1 -i; j++) {
                if(users[j].getUsedTime() > users[j+1].getUsedTime()) {
                    temp = users[i];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                }
            }
        }
        return users;
    }
}
