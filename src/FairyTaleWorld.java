import java.util.Random;

public class FairyTaleWorld {
    //Attributes:
    private int x;      //This attribute describes the width of the forest (area the x-coordinates)
    private int y;      //This attribute describes the height of the forest (area the y-coordinates)
    private VerwunschenerWald[][] map;      // Keeping this attribute the current map of the
        //forest, on which the positions of all hazards, Trees and figures are recorded
    private Grandma grandma;
    private Rotkaeppchen rotkaeppchen;
    //Getters:
    public VerwunschenerWald[][] getMap(){ return map;}
    public Rotkaeppchen getRotkaeppchen(){ return rotkaeppchen;}
    public Grandma getGrandma(){return grandma;}

    //Constructor:
    public FairyTaleWorld(int x, int y, int dangerNumber, int treeNumber) {
        this.x = x;
        this.y = y;
        map = new VerwunschenerWald[y][x];
        rotkaeppchen = new Rotkaeppchen(new Position(0, 0));
        AddToMap(rotkaeppchen);
        grandma = new Grandma(new Position(getRandInt(x-8, x-1), getRandInt(y-8, y-1)));
        AddToMap(grandma);
        for (int i = 0; i < treeNumber; i++){
            Position position = getRandPos();
            Tree aTree = new Tree(position);
            AddToMap(aTree);
        }
    }

    private void AddToMap(VerwunschenerWald entity){
        Position position = entity.position;
        map[position.getY()][position.getX()] = entity;
    }

    private int getRandInt(int min, int max){
        Random random = new Random();
        return random.ints(min, max).findFirst().getAsInt();
    }

    private Position getRandPos() {
        Position position;
        while (true) {
             position = new Position(getRandInt(0, x), getRandInt(0, y));
            if (map[position.getY()][position.getX()] == null) {
                break;
            }
        }
        return position;
    }
}
