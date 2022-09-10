package Hello.Pojo;


public class Skill {
    /**
     * 负责人：小幽
     * 功能：技能相关属性
     * 武器技能，人物技能
     * 额外技能
     */

    //改为protected，以便子类访问
    protected String name;
    protected String des;
    protected int dice;
    public int label;
    //0表示这是个伤害技能，1表示这是个回复血量技能，2表示这是个与骰子相关的技能
    // 3表示同时有伤害和获得骰子

    //默认构造器
    public Skill() {
    }

    //判断骰子大小是否符合技能要求
    public boolean judgeDice(int dice) {
        return true;
    }

    //判断使用次数是否达到限制
    public boolean maxRoundTimeJudge(int round) {
        return true;
    }

    //这里的getInjure针对伤害类技能返回一个伤害值
    public int getInjure(int dice, int round, Boss boss) {
        return 0;
    }

    //这里的getNewDice用来处理骰子相关技能
    public int[] getNewDice(int dice) {
        return null;
    }

    //回复血量
    public void addBlood(int dice, Role role) {
    }


    public String getName() {
        return name;
    }


    public String getDes() {
        return des;
    }


    @Override
    public String toString() {
        return name + "\t" + des;
    }
}

