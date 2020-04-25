public class Main {
    public static void main(String[] args) {

        Player CR7 = new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787,"ronaldo@hotmail.com");

        Player Messi = new Player("Lionel Andrés", "Messi", "Médio Ofensivo",
                32, 966545787,"messi@hotmail.com");

        Player Menor = new Player("André", "Andre Junior", "Médio Ofensivo",
                14, 966545787,"andre@hotmail.com");

        Club Equipa = new Club("SL Benfica", 1904, "benfica@benfica.com",
                "Estádio da Luz", "benfiquista", "Luis Felipe Vieira","Bruno Lage");

        Equipa.addPlayer(CR7);
        Equipa.addPlayer(Messi);
        Equipa.addPlayer(Menor);

        Equipa.printPlayers();

    }
}
