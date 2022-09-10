package Hello.Pojo;

import java.io.Serializable;


public class User implements Serializable {
    private static final long serialVisionUiD = 24L;

    /**
     * 负责人：老麦
     * 功能：建立用户类，给予相关属性
     */
    private String name;
    private String password;
    private double usedTime;

    public User() {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(double usedTime) {
        this.usedTime = usedTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", usedTime=" + usedTime +
                '}';
    }
}
