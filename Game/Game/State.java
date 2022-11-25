abstract class State {
    int HP,DEF,ATK,miss,maxHP;
    public State(){
    }
    public State(int HP,int DEF,int ATK,int miss,int maxHP){
        this.HP=HP;
        this.ATK=ATK;
        this.DEF=DEF;
        this.miss=miss;
        this.maxHP=maxHP;
    }
}
