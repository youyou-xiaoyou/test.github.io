package Hello.views;

import Hello.Pojo.Arm;
import Hello.service.ArmInit;
import Hello.service.RoleInit;

public class printArm {
    /**
     * 负责人：王明
     * @param index
     * @param arms
     * 功能：根据传入的数据打印武器信息
     */
    public static void printArm(int index, Arm[] arms){
        Arm arm = ArmInit.getArm(index,arms);
        System.out.println("\033[33;1m" + arm + "\033[5m");

    }
}
