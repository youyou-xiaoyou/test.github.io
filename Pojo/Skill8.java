package Hello.Pojo;

import java.util.Random;

public class Skill8 extends Skill{
    public Skill8() {
        name = "骰子·幸运礼盒";
        des = "随机获取0-2个骰子(每回合限使用1次)";
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
     * 获得骰子技能
     */
    @Override
    public int[] getNewDice(int dice) {
        int i = (int)(Math.random()*3);
        int[] otherDice = new int[i];
        for (int j = 0; j < i; j++) {
            otherDice[j] = (int)(Math.random()*(6-1+1)+1);
        }
        return otherDice;
    }


}
