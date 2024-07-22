package poo;

public class PlayerSoccer extends Player{

    //atributos

    //Encapsulamiento

    private int levelAttack;
    private int levelMedium;
    private int levelDefending;


    //metodo constructor
    //modificador - ambito - retorno - nombre - parametros(firma metodo)

    public PlayerSoccer(String fullName, String position, String nationality, String actualTeam, int numberTShirt, int levelAttack, int levelMedium, int levelDefending) {
        super(numberTShirt, actualTeam, nationality, position, fullName);

        this.levelAttack = levelAttack;
        this.levelMedium = levelMedium;
        this.levelDefending = levelDefending;
    }


    //Metodos

    // 1. metodos Get y Set

    public int getLevelAttack() {
        return levelAttack;
    }

    public void setLevelAttack(int levelAttack) {
        this.levelAttack = levelAttack;
    }

    public int getLevelMedium() {
        return levelMedium;
    }

    public void setLevelMedium(int levelMedium) {
        this.levelMedium = levelMedium;
    }

    public int getLevelDefending() {
        return levelDefending;
    }

    public void setLevelDefending(int levelDefending) {
        this.levelDefending = levelDefending;
    }

    // 2. metodos propios

    public void patearBalon(){
        System.out.println("El judador " + super.getFullName() + " ha pateado el balon");
    }

    @Override
    public void calentamiento() {
        System.out.println("El jugador " + super.getFullName() + " Realiza calentamieto de campo");
    }

    @Override
    public String toString() {
        return super.toString() + "{ PlayerSoccer{" +
                "levelAttack=" + levelAttack +
                ", levelMedium=" + levelMedium +
                ", levelDefending=" + levelDefending +
                '}' + '}';
    }
}
