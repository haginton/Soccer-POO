package poo;

public abstract class Player {

    private String fullName;
    private String position;
    private String nationality;
    private String actualTeam;
    private int numberTShirt;
    private int changeNationality;

    public Player(int numberTShirt, String actualTeam, String nationality, String position, String fullName) {
        this.numberTShirt = numberTShirt;
        this.actualTeam = actualTeam;
        this.nationality = nationality;
        this.position = position;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
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

    @Override
    public String toString() {
        return "Player{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", nationality='" + nationality + '\'' +
                ", actualTeam='" + actualTeam + '\'' +
                ", numberTShirt=" + numberTShirt +
                ", changeNationality=" + changeNationality +
                '}';
    }
}
