package cn.edu.nuc.test;
/** 
* 
* @author : knowliu
* @date ：Mar 19, 2022 6:05:24 PM 
*/
public class User {
    public int balance = 20;

    public boolean pay(int amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

}
