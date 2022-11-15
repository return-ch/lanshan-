public abstract class Pet{
    String name,sex;
    public Pet(){
    }
    public Pet(String name,String sex){
        this.name=name;
        this.sex=sex;
    }
    abstract void eat();
    abstract void talk();
}