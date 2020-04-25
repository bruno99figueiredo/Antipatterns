import org.junit.Test;

import java.lang.reflect.Field;

import static org.junit.Assert.assertEquals;

public class ClubTests {

    @Test
    public void getName_String(){
        Player player= new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787,"ronaldo@hotmail.com");

        assertEquals("Cristiano", player.getName());
        assertEquals("Avançado", player.getPosition());
    }

//SO PARA TESTAR O COMMIT
    @Test
    public void getName_Player_String(){
        Player player= new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787,"ronaldo@hotmail.com");

        assertEquals("Ronaldo", player.getName_player());
    }


    @Test
    public void getNamePlayer_Name_Age_Is2String_And_Integer(){
        Player player= new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787,"ronaldo@hotmail.com");

        assertEquals("Ronaldo->Cristiano->35", player.getName_player()+"->"+player.getName()+"->"+player.getAge());

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
        assertEquals((Integer)35, player.getAge());
    }


    @Test
    public void getEmail_String() throws NoSuchFieldException, IllegalAccessException{
        Player player = new Player("Cristiano", "Ronaldo", "Avançado",
                35, 966545787, "ronaldo@hotmail.com");

        Field field = player.getClass().getDeclaredField("email");
        field.setAccessible(true);

        assertEquals("ronaldo@hotmail.com", field.get(player));
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

        String name= club.getName();
        Integer year= club.getYear_foundation();
        String email= club.getEmail();
        String adept = club.getAdept();

        assertEquals((Integer)1904, year);
    }


    @Test
    public void getClub_Name(){
        Club club = new Club("SL Benfica", 1904, "benfica@benfica.com",
                "Estádio da Luz", "benfiquista", "Luis Felipe Vieira","Bruno Lage");

        assertEquals("SL Benfica", club.getName());
        assertEquals("Luis Felipe Vieira", club.getPresident());
    }


}
