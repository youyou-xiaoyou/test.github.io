package Hello.service;

import Hello.Pojo.Boss;

/**
 *
 */
public class BossInit {
    /**
     * 负责人：小志
     * 参数：无
     * @return boss数组
     * 功能：初始化boss列表，返回boss集合
     */
    public static Boss[] BossStart(){
        Boss aBoss = new Boss("工蜂过劳者", 200);
        Boss bBoss = new Boss("漏电过劳者", 300);
        Boss cBoss = new Boss("友情客串-无相之风", 400);
        Boss dBoss = new Boss("友情客串-无相之岩", 600);
        Boss eBoss = new Boss("究极史莱姆", 700);
        Boss fBoss = new Boss("侵蚀之律者", 1000);
        Boss[] bosses = new Boss[10];
        bosses[1] = aBoss;
        bosses[2] = bBoss;
        bosses[3] = cBoss;
        bosses[4] = dBoss;
        bosses[5] = eBoss;
        bosses[6] = fBoss;
        return bosses;
    }

    /**
     * 负责人：小志
     * @param index
     * @param bosses
     * @return boss对象
     * 功能：根据传入的数来获取指定的boss对象
     */
    public static Boss getBoss(int index,Boss[] bosses){
        return bosses[index];
    }
}
