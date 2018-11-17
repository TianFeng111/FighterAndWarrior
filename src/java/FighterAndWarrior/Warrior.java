package FighterAndWarrior;

import FighterAndWarrior.Fighter;

/**
 * Created by TianFeng on 2018/11/17.
 */
public class Warrior extends Fighter {
    public String name;
    public String fighterName;

    public Warrior(String name,Fighter fighter){
        this.name = name;
        fighterName = fighter.getName();
    }

    public void hello(){
        System.out.println(name+" is a stronger warrior then "+fighterName+".");
        System.out.println(fighterName+" is gone.");
        System.out.println(name+" is gone.");
    }


}
