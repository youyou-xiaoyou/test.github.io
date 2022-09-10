package Hello.Pojo;

public class Skill4 extends Skill {
    public Skill4() {
        name = "回复·芥末章鱼";
        des = "回复点数×10生命值，并造成点数×5伤害(每回合限使用3次)";
        label = 4;
    }


    /**
     * 骰子使用次数判断
     */
    static int roundnumber = 1;
    static int maxUseTime = 3;

    @Override
    public boolean maxRoundTimeJudge(int round) {
        //最开始roundnumber=1,round=1,maxUseTime不需要重新赋值，到了round=2的时候，此时roundnumber仍然为1，
        //round != roundnumber,这时对maxUseTime重新赋值，并将maxUseTime变成2，等到round=3的时候才会重新赋值
        if (round != roundnumber) {
            maxUseTime = 3;
            roundnumber = round;
        }

        if (maxUseTime > 0) {
            maxUseTime -= 1;
            return true;
        } else
            return false;
    }

    /**
     * 骰子伤害判断
     */
    @Override
    public int getInjure(int dice, int round, Boss boss) {
        int injure;
        injure = dice * 5;
        return injure;
    }

    /**
     * 回复血量
     */
    public void addBlood(int dice,Role role){
        int blood1 = (int)(dice*10);
        role.setBlood(role.getBlood()+blood1);
        System.out.println("角色回复血量"+blood1);
    }
}
