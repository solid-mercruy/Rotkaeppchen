public abstract class VerwunschenerWald {
    //Attribute:

    protected Position position;

    protected int damage = 0;

    //Constructor:
    public VerwunschenerWald(Position position){
        this.position = position;
    }

    //Getter:
    public Position getPosition(){
        return this.position;
    }

    public int getDamage(){
        return this.damage;
    }

    //Method
    public abstract String getName();
}
