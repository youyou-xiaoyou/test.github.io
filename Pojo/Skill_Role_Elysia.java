package Hello.Pojo;

public class Skill_Role_Elysia extends Skill{
    public Skill_Role_Elysia() {
        name = "少女的特权";
        des = "将当前骰子点数+1(每回合限用3次)";
        label = 2;
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
    public int[] getNewDice(int dice) {
        int[] otherDice = new int[1];
        if (dice!=6){
            dice+=1;
        }
        otherDice[0]=dice;
        return otherDice;
    }



}
