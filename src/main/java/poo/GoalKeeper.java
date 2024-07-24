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
