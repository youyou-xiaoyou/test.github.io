package Hello.views;

import Hello.Pojo.Role;
import Hello.service.RoleInit;

//打印角色
public class printRole {
    /**
     * 负责人：王明
     * @param index
     * @param roles
     * 功能：根据传入的数来获取角色信息
     */
    public static void printRole(int index,Role[] roles){
        Role role = RoleInit.getRole(index,roles);
        System.out.println("\033[34;1m" + role + "\033[5m");

    }
}
