public class Rotkaeppchen extends VerwunschenerWald{
    private int health = 100;

    //Constructor:
    public Rotkaeppchen(Position position){
        super(position);
    }

    //Methods of movement. In these methods, the Position
    //position be adjusted:
     public void goHigh() {
        this.position.setY(this.position.getY() - 1);
     }
     public void goDown(){
         this.position.setY(this.position.getY() + 1);
     }
     public void goLeft(){
         this.position.setX(this.position.getX() - 1);
     }
     public void goRight() {
         this.position.setX(this.position.getX() + 1);
     }

     public void healthDecrease(int value){
        if (this.health > value){
            this.health = this.health - value;
        } else this.health = 0;
     }

    public boolean isStillAlive(){
        return health>0;
    }

    public String getName(){
        return "R";
    }


}
