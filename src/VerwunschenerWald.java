public abstract class VerwunschenerWald {
    //Attribute:

    protected Position position;
    protected int damage = 0;

    protected Position nextStep;
    protected int shortestPath = -1;
    protected boolean visited = false;

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

    public Position getNextStep() { return nextStep; }
    public int getShortestPath() { return shortestPath; }
    public boolean isVisited() { return visited; }

    //Setters:
    public void setNextStep(Position nextStep) { this.nextStep = nextStep; }
    public void setShortestPath(int shortestPath) { this.shortestPath = shortestPath; }
    public void setVisited(boolean visited) { this.visited = visited; }

    //Method
    public abstract String getName();
}
