package poo;

public class PlayerSoccer {

    //atributos

    //Encapsulamiento
    private String fullName;
    private String position;
    private String nationality;
    private String actualTeam;
    private int numberTShirt;
    private int changeNationality;

    //metodo constructor
    //modificador - ambito - retorno - nombre - parametros(firma metodo)
    public PlayerSoccer(){ //primer metodo en ejecutarse

    }

    public PlayerSoccer(String fullName, String position, String nationality, String actualTeam, int numberTShirt) {
        this.fullName = fullName;
        this.position = position;
        this.nationality = nationality;
        this.actualTeam = actualTeam;
        this.numberTShirt = numberTShirt;
    }

    //Metodos

    // 1. metodos Get y Set

    public String getFullName(){ //obtener
        return this.fullName;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (changeNationality >= 1){
            System.out.println("Only one change of nationality is allowed");
        }else {
            this.nationality = nationality;
            changeNationality++;
        }
    }

    public String getActualTeam() {
        return actualTeam;
    }

    public void setActualTeam(String actualTeam) {
        this.actualTeam = actualTeam;
    }

    public int getNumberTShirt() {
        return numberTShirt;
    }

    public void setNumberTShirt(int numberTShirt) {
        this.numberTShirt = numberTShirt;
    }

    // 2. metodos propios

    public void patearBalon(){
        System.out.println("El judador " + this.fullName + " ha pateado el balon");
    }

}
