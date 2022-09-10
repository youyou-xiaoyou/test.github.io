package Hello.Pojo;

public class Skill6 extends Skill {
    public Skill6() {
        name = "伤害·攻其要害";
        des = "造成点数×10伤害，敌方血量小于50%造成双倍伤害(每回合限使用1次)";
        label = 0;
    }


    /**
     * 骰子使用次数判断
     */
    static int roundnumber = 1;
    static int maxUseTime = 1;

    @Override
    public boolean maxRoundTimeJudge(int round) {
        //最开始roundnumber=1,round=1,maxUseTime不需要重新赋值，到了round=2的时候，此时roundnumber仍然为1，
        //round != roundnumber,这时对maxUseTime重新赋值，并将maxUseTime变成2，等到round=3的时候才会重新赋值
        if (round != roundnumber) {
            maxUseTime = 1;
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
        if (boss.getBloodPercent(boss.getBlood()) < 0.5) {
            injure = dice * 20;
            return injure;
        } else {
            injure = dice * 10;
            return injure;
        }
    }
}
