import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class ClubTests {

    @Test
    public void getName_String(){
        Player player= new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787,"ronaldo@hotmail.com");

        assertEquals("Cristiano", player.getName());


        //Free ride Anti Pattern
    }


    @Test
    public void getName_Player_String(){
        Player player= new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787,"ronaldo@hotmail.com");

        assertEquals("Ronaldo", player.getName_player());
    }


    @Test
    public void getAge_Integer(){
        Player player= new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787,"ronaldo@hotmail.com");

        assertEquals((Integer)35, player.getAge());

        //Second class citizen Anti Pattern
    }


    @Test
    public void getPhone_Integer() {
        Player player = new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787, "ronaldo@hotmail.com");

        assertEquals((Integer) 966545787, player.getNr_phone());
    }


    @Test
    public void getPosition_String() {
        Player player = new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787, "ronaldo@hotmail.com");

        assertEquals("Avançado", player.getPosition());


        //Free ride Anti Pattern - CHECK
    }


    @Test
    public void getEmail_String() throws NoSuchFieldException, IllegalAccessException{
        Player player = new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787, "ronaldo@hotmail.com");



        assertEquals("ronaldo@hotmail.com", player.getEmail());

        //Anal probe Anti Pattern - CHECK
    }


    @Test
    public void players_GetAll() {
        Player player = new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787, "ronaldo@hotmail.com");

        Club club = new Club("SL Benfica", 1904, "benfica@benfica.com",
                "Estádio da Luz", "benfiquista", "Luis Felipe Vieira","Bruno Lage");

        club.addPlayer(player);

        club.players.forEach(player1 -> {
            if(player.equals("Ronaldo") ==false){
                return;
            }

            assertEquals("Ronaldo", player.getName_player());
        });

    }


    @Test
    public void getClub_Year_Foundation(){
        Club club = new Club("SL Benfica", 1904, "benfica@benfica.com",
                "Estádio da Luz", "benfiquista", "Luis Felipe Vieira","Bruno Lage");


        Integer year= club.getYear_foundation();


        assertEquals((Integer)1904, year);

        //Nitpicker Anti Pattern - CHECK
    }


    @Test
    public void getClub_Name(){
        Club club = new Club("SL Benfica", 1904, "benfica@benfica.com",
                "Estádio da Luz", "benfiquista", "Luis Felipe Vieira","Bruno Lage");

        assertEquals("SL Benfica", club.getName());


        //Second class citizen Anti Pattern - CHECK
    }

}
