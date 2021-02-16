public class Position {

    //Attributes:
    private int x;
    private int y;

    //Constructor:
    public Position (int x, int y){
        this.x = x;
        this.y = y;
    }

    //Getter methods:
    public int getX (){
        return x;
    }
    public int getY (){
        return y;
    }

    //Setter:
    public void setX (int x){
        this.x = x;
    }
    public void setY (int y){
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if (o instanceof Position)
            return (((Position) o).x == this.x) & ((Position) o).y == this.y;
        return false;
    }
}
