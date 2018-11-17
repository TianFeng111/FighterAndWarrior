package FighterAndWarrior;

/**
 * Created by TianFeng on 2018/11/17.
 */
public class Fighter {
    public String name;

    public Fighter(){
    }

    public Fighter(String name){
        this.name=name;
    }

    public void outTitle(){
        System.out.println("We are fighters.");
    }

    public void hello(){
        System.out.println(name+" is a fighter.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
