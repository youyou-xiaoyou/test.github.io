package Hello.Pojo;

public class Skill_Role_FuHua extends Skill{
    public Skill_Role_FuHua() {
        name = "符华";
        des = "将所选骰子拆分成两个(最小2，每回合限使用两次)";
        label = 2;
    }


    @Override
    public boolean judgeDice(int dice){
        if (dice>=2)
            return true;
        else
            return false;
    }


    static int roundnumber = 1;
    static int maxUseTime = 2;
    @Override
    public boolean maxRoundTimeJudge(int round){
        //最开始roundnumber=1,round=1,maxUseTime不需要重新赋值，到了round=2的时候，此时roundnumber仍然为1，
        //round != roundnumber,这时对maxUseTime重新赋值，并将maxUseTime变成2，等到round=3的时候才会重新赋值
        if (round != roundnumber){
            maxUseTime = 2;
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
    public int[] getNewDice(int dice) {
        int[] otherDice = new int[2];
        otherDice[0] = dice/2;
        otherDice[1] = dice - otherDice[0];
        return otherDice;
    }

}


