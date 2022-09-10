package Hello.Pojo;



public class Arm {
    /**
     * 负责人：小孙
     * 功能：建立武器属性，给予相关属性
     */
    private String name;
    private String des;

    public Arm(String name, String des) {
        this.name = name;
        this.des = des;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return
                 name +":  "+ des ;

    }
}
