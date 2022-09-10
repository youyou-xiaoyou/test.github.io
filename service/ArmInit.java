package Hello.service;

import Hello.Pojo.Arm;

public class ArmInit {
    /**
     * 负责人：小孙
     * 参数：无
     *返回值：武器集合
     * @return 无
     *功能：初始化武器库，返回角色可使用的武器
     */
    public static Arm[] ArmStart(){
        Arm[] arms = new Arm[4];
        String[] weaponName = {"奢华防晒套装","夏梦与飞花","沙滩排球","山河避暑经"};
        String[] weaponEffect = {"造成点数×10伤害(每回合限制使用3次)","造成点×10伤害，并获取一个最小3的骰子(最小4，每回合限使用3次)","造成20点伤害(可以重复使用)","对敌方造成15点伤害，每次使用后伤害+10"};
        for(int i = 0;i < arms.length;i++){
            arms[i] = new Arm(weaponName[i],weaponEffect[i]);
        }
        return arms;
    }

    /**
     *负责人：小孙
     * @param index
     * @param arms
     * @return Arm
     * 功能：返回角色使用的武器
     */
    public static Arm getArm(int index,Arm[]arms){
        return arms[index];
    }
}
