package Hello.Pojo;

public class Skill12 extends Skill {
    public Skill12() {
        name = "寸劲·开天";
        des = "造成15点伤害，本回合每使用过一个骰子伤害额外+15";
        label = 0;
    }

    static int useTimes = 0;
    static int roundnumber = 1;
    @Override
    public int getInjure(int dice,int round,Boss boss){
        if (round!=roundnumber ){
            useTimes = 0;
            roundnumber = round;
        }
        useTimes +=1;
        int injure;
        injure = 15 + useTimes*15;
        return injure;
    }
}