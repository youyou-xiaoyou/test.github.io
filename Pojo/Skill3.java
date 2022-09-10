package Hello.Pojo;

import java.util.Random;

public class Skill3 extends Skill{
    public Skill3() {
        name = "骰子·顺手牵羊";
        des = "造成点数×10伤害，并获取一个骰子(每回合限使用1次)";
        label = 3;
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
     * 骰子伤害判断
     */
    @Override
    public int getInjure(int dice,int round,Boss boss){
        int injure;
        injure = dice*10;
        return injure;
    }



    /**
     * 获得骰子技能
     */
    @Override
    public int[] getNewDice(int dice) {
        int[] otherDice = new int[1];
        otherDice[0]  = (int)(Math.random()*(6-1+1)+1);
        return otherDice;
    }


}
