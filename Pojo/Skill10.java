package Hello.Pojo;

public class Skill10 extends Skill{
    public Skill10() {
        name = "骰子·化整为零";
        des = "获得2个1点骰子(最大3,每回合限使用1次)";
        label = 2;
    }


    /**
     * 骰子使用次数判断
     */
    static int roundnumber = 1;
    static int maxUseTime = 1;
    @Override
    public boolean maxRoundTimeJudge(int round){
        //最开始roundnumber=1,round=1,maxUseTime不需要重新赋值，到了round=2的时候，此时roundnumber仍然为1，
        //round != roundnumber,这时对maxUseTime重新赋值，并将maxUseTime变成2，等到round=3的时候才会重新赋值
        if (round != roundnumber){
            maxUseTime = 1;
            roundnumber = round;
        }

        if (maxUseTime>0){
            maxUseTime-=1;
            return true;
        }
        else
            return false;
    }

    /**
     * 骰子点数判断
     *
     */
    @Override
    public boolean judgeDice(int dice){
        if (dice<=3)
            return true;
        else
            return false;
    }

    /**
     * 获得骰子技能
     */
    @Override
    public int[] getNewDice(int dice) {
        int[] otherDice = new int[2];
        otherDice[0]=1;
        otherDice[1]=1;
        return otherDice;
    }
}
