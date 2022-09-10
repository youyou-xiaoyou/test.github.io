package Hello.Pojo;

import java.util.Random;

public class Skill2 extends Skill {
    public Skill2() {
        name = "骰子·偷天换日";
        des = "获得1个4-5点的骰子(点数最大为2)";
        label = 2;
    }

    @Override
    public boolean judgeDice(int dice) {
        if (dice <= 2)
            return true;
        else
            return false;
    }

    /**
     * 获得骰子技能
     */
    @Override
    public int[] getNewDice(int dice) {
        int[] otherDice = new int[1];
        otherDice[0] = (int)(Math.random()*(5-4+1)+4);
        return otherDice;
    }

}