package Queue;

import java.util.ArrayList;

/**
 * Created by TianFeng on 2018/11/17.
 */
public class Queue {

    ArrayList list = new ArrayList();

    public void MyQueue(int num){
        this.list = new ArrayList(num);
    }

    public void FreeMyQueue(){
        this.list.clear();
    }

    public void push(Object e){
        this.list.add(e);
    }

    public Object pop(){
        Object out=0;
        if (this.list.isEmpty()){
            System.out.println("队列此时为空，无法进行pop...");
        }
        else {
            out = this.list.get(0);
            this.list.remove(0);
        }
        return out;
    }

    public Object top(){
        Object out = 0;
        if (this.list.isEmpty()){
            System.out.println("此队列为空，无队首元素...");
        }
        else {
            out = this.list.get(0);
        }
        return  out;
    }

    public int count(){
        return this.list.size();
    }

    public ArrayList getList() {
        return list;
    }
}
