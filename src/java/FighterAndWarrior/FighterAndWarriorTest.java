package FighterAndWarrior;

/**
 * Created by TianFeng on 2018/11/17.
 */
public class FighterAndWarriorTest {

    public static void main(String[] args) {

        Fighter[] objs = new Fighter[2];
        objs[0] = new Fighter("Harry");
        Warrior Stallone = new Warrior("Stallone",objs[0]);
        objs[1] = Stallone;
        System.out.println("==Test class family==");
        for (int i=0;i<2;i++){
            objs[i].outTitle();
            System.out.println("----"+(i+1)+"----");
            objs[i].hello();
        }
    }
}
