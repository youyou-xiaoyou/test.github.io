package Hello.Pojo;

public class Skill7 extends Skill{
    public Skill7() {
        name = "伤害·椰子飞弹";
        des = "造成80点伤害(累计6)";
        label = 0;
    }

    /**
     * 骰子伤害判断
     */
    static int countPlus = 0;
    @Override
    public int getInjure(int dice,int round,Boss boss){

        countPlus+=dice;
        if (countPlus>=6){
            countPlus = 0;
            return 80;
        }else {
            System.out.println("已累计"+countPlus);
            return 0;
        }

    }
}
