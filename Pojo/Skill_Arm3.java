package Hello.Pojo;

public class Skill_Arm3 extends Skill{
    public Skill_Arm3() {
        name = "沙滩排球";
        des = "造成20点伤害(可以重复使用)";
        label = 0;
    }
    /**
     * 骰子伤害判断
     */
    @Override
    public int getInjure(int dice,int round,Boss boss){
        int injure;
        injure = 20;
        return injure;
    }
}
