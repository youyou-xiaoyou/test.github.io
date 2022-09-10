package Hello.Pojo;

public class Skill_Arm1 extends Skill{
    public Skill_Arm1() {
        name = "豪华防嗮套装";
        des = "造成点数×10伤害(每回合限制使用3次)";
        label = 0;
    }



    //这段代码只能等到整合之后才能测试
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
    public int getInjure(int dice,int round,Boss boss){
        int injure;
        injure = dice*10;
        return injure;
    }
}
