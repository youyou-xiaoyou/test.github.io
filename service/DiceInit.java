package Hello.service;


import java.util.ArrayList;

public class DiceInit {
    /**
     * 负责人：酋长
     * 参数：无
     *
     * @return 色子数组
     * 功能：返回随机获得的三个色子
     */
    public static ArrayList<Integer> getDice() {
        ArrayList<Integer> dices = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            int dice = (int) (Math.random() * (6 - 1 + 1)) + 1;
            dices.add(dice);
        }
        return dices;
    }

    }

