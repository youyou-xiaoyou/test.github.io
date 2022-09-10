package Hello.Pojo;


public class Boss {
    /**
     * 负责人：小志
     * 建立boss属性，给予相关属性
     */
    private String name;
    private int blood;
    private double initBlood;

    public Boss(String name, int blood) {
        this.name = name;
        this.blood = blood;
        initBlood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public double getBloodPercent(double blood) {return blood / initBlood;}

    public int attack() {return 50;}

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", blood=" + blood +
                '}';
    }


}
