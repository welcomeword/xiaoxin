package fuxi1;

import java.util.Random;

public class Rdaomlx {
    public static void  main(String[] args){
        //目标：学会使用java提供的随机数实体类Randaom
        //1.导包
        //2/创建随机数对象
        Random r = new Random();
        //netxIn
        for (int i=0;i<10 ;i++) {
            int data=r.nextInt(10);//0~9随机数
            System.out.println(data);
        }

        System.out.print("--------------------------");
        //1_10 ==> -1+
        int data=r.nextInt(10)+1;
        System.out.println(data);
        //3-17 ==> -3 ==>(0-14）+3
        int data1 = r.nextInt(15)+3;
        System.out.println(data1);

    }
}
