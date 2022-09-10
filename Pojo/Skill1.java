package Hello.Pojo;

public class Skill1 extends Skill {
    public Skill1() {
        name = "伤害·热沙排球";
        des = "造成点数×15伤害(点数最小为5)";
        label = 0;
    }

    @Override
    public boolean judgeDice(int dice) {
        if (dice >= 5)
            return true;
        else
            return false;
    }

    @Override
    public int getInjure(int dice,int round,Boss boss){
        int injure;
        injure = dice*15;
        return injure;
    }

}

