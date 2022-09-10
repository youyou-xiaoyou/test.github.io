package Hello.Pojo;

public class Skill_Arm4 extends Skill{
    public Skill_Arm4() {
        name = "山河避暑经";
        des = "造成点数×15伤害，本回合内每次使用后伤害+10";
        label = 0;
    }
    /**
     * 骰子伤害判断
     */
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
        injure = dice*15 + useTimes*10;
        return injure;
    }
}
