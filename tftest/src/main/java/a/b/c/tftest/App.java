package a.b.c.tftest;

import a.b.c.tftest.model.Account;
//import cn.edu.nuc.test.User;

/** 
* 
* @author : knowliu
* @date ：Mar 19, 2022 6:13:07 PM 
*/
public class App {
    public static void main(String[] args) {
        testCompileTime();
    }
    public static void testCompileTime() {
        Account account = new Account();
        System.out.println("==================");
        account.pay(10);
        account.pay(50);
        System.out.println("==================");
        
        
//        User user = new User();
//        user.pay(10);
    }
}

