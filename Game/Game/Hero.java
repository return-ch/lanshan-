public class Hero extends State{
    String name;
    int level,exp,maxHP;
    public Hero(String name) {
        this.name=name;
        maxHP=HP;
        level=1;
        exp=0;
        miss=5;
        HP = 100;
        DEF = 10;
        ATK = 20;
    }
}
