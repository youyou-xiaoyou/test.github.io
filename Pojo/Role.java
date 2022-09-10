package Hello.Pojo;



public class Role {
    /**
     *
     * 负责人：小杜
     * 功能：建立角色类，给予相关属性
     */
   private String name;
   private int blood;
    private String des;
    public Role(String name, int blood,String des) {
        this.name = name;
        this.blood = blood;
        this.des = des;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return name+": 血量" + blood +"\n"+des;
    }
}
