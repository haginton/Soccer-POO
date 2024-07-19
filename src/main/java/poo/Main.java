package poo;

public class Main {
    public static void main(String[] args) {
        PlayerSoccer player1 = new PlayerSoccer(
                "Juan",
                "Delantero",
                "Colombia",
                "Soccer FC",
                10
        );
        System.out.println("player1.fullName = " + player1.getFullName());
        player1.setFullName("Carlos");
        System.out.println("player1.fullName = " + player1.getFullName());
        System.out.println(player1.getNationality());
        player1.setNationality("Ecuador");
        System.out.println(player1.getNationality());
        player1.setNationality("Perú");
        System.out.println(player1.getNationality());
        player1.patearBalon();
    }
}
