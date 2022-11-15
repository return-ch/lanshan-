public class Dog extends Pet{
    String color;

    public Dog(){
    }
    public Dog(String color,String name,String sex){
        this.color=color;
        this.name=name;
        this.sex=sex;
    }

    @Override
    void eat() {
        System.out.println("狗狗在吃东西呢");
    }

    @Override
    void talk() {
        System.out.println("汪汪");
    }
    void play(){
        System.out.println("小狗狗在玩骨头");
    }
}
