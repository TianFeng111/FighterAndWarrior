package Rational;

/**
 * Created by Admin on 2018/11/7.
 */
public class Rational {
    public void plus(int a1,int a2,int a3,int a4){  //两分数相加方法，输入四个整数值分别为num1的分子分母以及num2的分子分母
        Num num1 = new Num();
        Num num2 = new Num();
        Num num3 = new Num();
        num1.setNum(a1,a2);
        num2.setNum(a3,a4);
        int m = a2,n = a4;
        int t = m % n;
        while(t != 0){
            m = n;
            n = t;
            t = m % n;
        }
        int l = a2 * a4 / n;
        {
            num3.setNum(((l/a2)*a1)+((l/a4)*a3),l);
        }
        System.out.println(a1+"/"+a2+"+"+a3+"/"+a4+"="+num3.getN1()+"/"+num3.getN2());
    }

    public void multiplication(int a1,int a2,int a3,int a4){
        Num num4 = new Num();
        Num num5 = new Num();
        num4.setNum(a1,a2);
        num5.setNum(a3,a4);
        System.out.println(a1+"/"+a2+"*"+a3+"/"+a4+"="+a1*a3+"/"+a2*a4);
    }

    public void isEqualTo(int a1,int a2,int a3,int a4){
        Num num6 = new Num();
        Num num7 = new Num();
        if (a2==0 && a4==0){
            System.out.println("分母不能为0!");
        }
        num6.setNum(a1,a2);
        num7.setNum(a3,a4);
        if (a1/a2==a3/a4){
            System.out.println(a1+"/"+a2+" is equal to "+a3+"/"+a4);
        }
        else {
            System.out.println(a1+"/"+a2+" is not equal to "+a3+"/"+a4);
        }
    }



}
