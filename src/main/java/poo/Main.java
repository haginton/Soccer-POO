package poo;

public class Main {
    public static void main(String[] args) {
        PlayerSoccer player1 = new PlayerSoccer(
                "Juan",
                "Delantero",
                "Colombia",
                "Soccer FC",
                10,
                90,
                75,
                40
        );

        //PlayerSoccer player2 = new PlayerSoccer();

        /*System.out.println("player1.fullName = " + player1.getFullName());
        player1.setFullName("Carlos");
        System.out.println("player1.fullName = " + player1.getFullName());
        System.out.println(player1.getNationality());
        player1.setNationality("Ecuador");
        System.out.println(player1.getNationality());
        player1.setNationality("Perú");
        System.out.println(player1.getNationality());
        player1.patearBalon();

        System.out.println(player1);*/
        GoalKeeper arquero1 = new GoalKeeper(1,
                "equipo", "C",
                "arquero",
                "Juan",
                90,
                99
        );
        System.out.println(player1);
        player1.calentamiento();
        System.out.println(arquero1);
        arquero1.calentamiento();

    }
}
