import java.util.Random;
import java.util.Scanner;
public class Fight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String Name = s.next();
        Hero hero = new Hero(Name);
        Soldier so = new Soldier();
        int i;
        for (i = 1; ; i++) {
            System.out.println("这是第" + i + "个回合");
            System.out.println(hero.name + "发起了攻击");
            if (so.miss < hero.ATK - so.DEF) {
                so.HP = so.HP - hero.ATK + so.DEF;
                int in = hero.ATK - so.DEF;//计算小兵收到的伤害//
                if (so.HP <= 0) {
                    System.out.println("小兵已死亡");
                    hero.exp = hero.exp + so.maxHP;
                    if (hero.exp >= 100) {
                        System.out.println("level up!");
                        hero.exp = hero.exp - 100;
                        hero.level = hero.level + 1;
                        hero.DEF = hero.DEF + 10;
                        hero.ATK = hero.ATK + 5;
                        hero.maxHP = hero.maxHP + 50;
                        hero.HP = hero.maxHP;
                    }
                    break;
                } else {
                    System.out.println("小兵受到了" + in + "点伤害");
                }
            } else {
                System.out.println("您甚至没破它的防");
            }
            System.out.println("小兵发起了攻击");
            Random ra = new Random();
            int x = ra.nextInt(20);
            if (x == 0) {
                System.out.println("奇迹！它打出致命一击");//这是一个小兵不屈的意志！神の一击！//
                System.out.println("沙特能win阿根廷，日本闪击德意志，还有什么不可能呢，没错，您被小兵秒了");
                break;
            } else {
                if (hero.miss <= so.ATK - hero.DEF) {
                    hero.HP= hero.HP+ hero.DEF- so.ATK;
                    int on= so.ATK- hero.DEF;//计算英雄收到的伤害//
                    if(hero.HP<=0){
                        System.out.println("胜败乃兵家常事，大侠请重新再来");
                        break;
                    }else{
                        System.out.println("您收到"+on+"点伤害");
                    }
                }
            }
        }
    }
}