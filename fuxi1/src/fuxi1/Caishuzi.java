package fuxi1;

import java.util.Random;
import java.util.Scanner;

public class Caishuzi {
    public static void main(String[] args) {
        //1.随机1-100号码之间
        Random r = new Random();
       int lcunknummber = r.nextInt(100)+1;

       //2.应该使用是循环
        Scanner sc = new Scanner(System.in);
        while (true){
            //使用用户输入数据
            System.out.println("请输入猜测的数据（1-100）：");
            int guessNumber = sc.nextInt();
            //3.判断猜测的号码于性欲
            if(guessNumber > lcunknummber){
                System.out.println("猜测的数字过大");
            } else if (guessNumber < lcunknummber){
                System.out.print("猜测的数字过小");
            }else {
                System.out.println("恭喜你猜对");
                break;
            }

        }


    }
}
