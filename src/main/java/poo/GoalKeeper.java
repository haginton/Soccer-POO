package poo;

public class GoalKeeper extends Player {


    private int levelJump;
    private int levelReflexes;

    public GoalKeeper(int numberTShirt, String actualTeam, String nationality, String position, String fullName, int levelJump, int levelReflexes) {
        super(numberTShirt, actualTeam, nationality, position, fullName);
        this.levelJump = levelJump;
        this.levelReflexes = levelReflexes;
    }

    public int getLevelJump() {
        return levelJump;
    }

    public void setLevelJump(int levelJump) {
        this.levelJump = levelJump;
    }

    public int getLevelReflexes() {
        return levelReflexes;
    }

    public void setLevelReflexes(int levelReflexes) {
        this.levelReflexes = levelReflexes;
    }

    public void metodoDelArquero(){
        System.out.println("Soy un metodo que solo puede ser ejecutado desde una instancia arquero");
    }

    //Polimorfismo Dinámico, ocurre en tiempo de ejecución
    @Override
    public void calentamiento() {
        System.out.println("calentando arquero");
    }

    @Override
    public String toString() {
        return super.toString()+ " {GoalKeeper{" +
                "levelJump=" + levelJump +
                ", levelReflexes=" + levelReflexes +
                '}'+'}';
    }
}
