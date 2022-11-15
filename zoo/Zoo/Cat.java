public class Cat extends Dog{
    int weight;
    public Cat(){
    }
    public Cat(int weight,String name,String color){
        this.color=color;
        this.weight=weight;
        this.name=name;
    }
    void talk(){
        System.out.println("喵喵");
    }
    void eat(){
        System.out.println("小猫在吃鱼");
    }
    void play(){
        System.out.println("小猫被揉的很舒服呢");
    }
    void call(){
        System.out.println("小猫在呼唤它的饲主呢");
    }
}
