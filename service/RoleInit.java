package Hello.service;

import Hello.Pojo.Role;

public class RoleInit {
    /**
     * 负责人：小杜
     * 参数：无
     * @return 角色数组
     * 功能：初始化角色列表，并返回
     */
    public static Role[] RoleStart(){
        Role jack = new Role("爱莉希雅", 300,"将当前骰子点数+1(每回合限用3次)");
        Role mary = new Role("符华", 300,"将所选骰子拆分成两个(最小2，每回合限使用两次)");
        Role[] roles = new Role[2];
        roles[0] = jack;
        roles[1] = mary;
        return roles;
    }
    /**
     * * 负责人：小杜
     *      * 参数：无
     *      * @return 角色数组
     *      功能：根据传入的数据，返回角色
     */
    public static Role getRole(int dex,Role[] roles){
        return roles[dex];
    }
}
