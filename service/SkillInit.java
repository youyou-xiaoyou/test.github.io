package Hello.service;

import Hello.Pojo.*;

public class SkillInit {
    /**
     * 负责人：小幽
     * 参数：无
     *
     * @return 技能列表
     * 功能：初始化技能列表，并返回
     */
    //创建一个skillNUmber
    public static int skillNumber = 2;

    public Skill[] SkillStart(int index1, int index2) {
        Skill[] skills = new Skill[5];


        if (index1 == 0) {
            Skill_Role_Elysia skill_role_elysia = new Skill_Role_Elysia();
            skills[0] =skill_role_elysia;


        } else {
            Skill_Role_FuHua skill_role_fuHua = new Skill_Role_FuHua();
            skills[0] = skill_role_fuHua;


        }


        switch (index2) {
            case 0:
                //if(选择了武器1)
                Skill_Arm1 skill_arm1 = new Skill_Arm1();
                skills[1] = skill_arm1;
                break;
            case 1:
                //if(选择武器2)
                Skill_Arm2 skill_arm2 = new Skill_Arm2();
                skills[1] = skill_arm2;
                break;

            case 2:
                //if(选择武器3)
                Skill_Arm3 skill_arm3 = new Skill_Arm3();
                skills[1] = skill_arm3;
                break;

            case 3:
                //if(选择武器4)
                Skill_Arm4 skill_arm4 = new Skill_Arm4();
                skills[1] = skill_arm4;
                break;

        }
        return skills;

    }


    public static Skill[] newSkill() {
        Skill[] newSkill = new Skill[13];
        Skill1 skill1 = new Skill1();
        Skill2 skill2 = new Skill2();
        Skill3 skill3 = new Skill3();
        Skill4 skill4 = new Skill4();
        Skill5 skill5 = new Skill5();
        Skill6 skill6 = new Skill6();
        Skill7 skill7 = new Skill7();
        Skill8 skill8 = new Skill8();
        Skill9 skill9 = new Skill9();
        Skill10 skill10 = new Skill10();
        Skill11 skill11 = new Skill11();
        Skill12 skill12 = new Skill12();
        Skill13 skill13 = new Skill13();
        newSkill[0] = skill1;
        newSkill[1] = skill2;
        newSkill[2] = skill3;
        newSkill[3] = skill4;
        newSkill[4] = skill5;
        newSkill[5] = skill6;
        newSkill[6] = skill7;
        newSkill[7] = skill8;
        newSkill[8] = skill9;
        newSkill[9] = skill10;
        newSkill[10] = skill11;
        newSkill[11] = skill12;
        newSkill[12] = skill13;

        return newSkill;

    }

    public static Skill[] getNewSkill(Skill[] newSkill){
        Skill[] getNewSkill = new Skill[3];
        for (int i = 0; i < 3; i++) {
            int n = (int)(Math.random()*(newSkill.length));
            getNewSkill[i] = newSkill[n];
        }
        return getNewSkill;
    }


    /*
    根据传入的index从skills[]中选择对应的技能并返回具体某一个skill对象
     */
    public static Skill getSKill(int index, Skill[] skills) {
        return skills[index];
    }

}
