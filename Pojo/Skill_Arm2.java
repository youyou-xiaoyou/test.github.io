package Hello.Pojo;

import java.util.Random;

public class Skill_Arm2 extends Skill{
    public Skill_Arm2() {
        name = "夏梦与飞花";
        des = "造成点×10伤害，并获取一个最小3的骰子(最小4，每回合限使用3次)";
        label = 3;
    }

    @Override
    public boolean judgeDice(int dice) {
        if (dice>=4){
            return true;
        }
        else
            return false;
    }


    static int roundnumber = 1;
    static int maxUseTime = 3;
    @Override
    public boolean maxRoundTimeJudge(int round){
        //最开始roundnumber=1,round=1,maxUseTime不需要重新赋值，到了round=2的时候，此时roundnumber仍然为1，
        //round != roundnumber,这时对maxUseTime重新赋值，并将maxUseTime变成2，等到round=3的时候才会重新赋值
        if (round != roundnumber){
            maxUseTime = 3;
            roundnumber = round;
        }

        if (maxUseTime>0){
            maxUseTime-=1;
            return true;
        }
        else
            return false;
    }



    @Override
    public int getInjure(int dice,int round,Boss boss) {
        int injure;
        injure = dice*10;
        return injure;
    }


    @Override
    public int[] getNewDice(int dice) {
        int[] otherDice = new int[1];
        otherDice[0]  = (int)(Math.random()*(6-3+1)+3);
        return otherDice;
    }

}
