import java.util.ArrayList;

public class Club extends SAD_Club{

    private String name;
    private Integer year_foundation;
    private String email;
    private String Stadium;
    private String Adept;
    private String President;
    private String Tecnic;
    public ArrayList<Player> players = new ArrayList<Player>();

    public Club(String name, Integer year_foundation, String email, String stadium, String adept, String president, String tecnic) {
        this.name = name;
        this.year_foundation = year_foundation;
        this.email = email;
        Stadium = stadium;
        Adept = adept;
        President = president;
        Tecnic = tecnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getYear_foundation() {
        return year_foundation;
    }

    public void setYear_foundation(Integer year_foundation) {
        this.year_foundation = year_foundation;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getStadium() {
        return Stadium;
    }

    public void setStadium(String stadium) {
        Stadium = stadium;
    }


    public String getAdept() {
        return Adept;
    }

    public void setAdept(String adept) {
        Adept = adept;
    }


    public String getPresident() {
        return President;
    }

    public void setPresident(String president) {
        President = president;
    }

    public String getTecnic() {
        return Tecnic;
    }

    public void setTecnic(String tecnic) {
        Tecnic = tecnic;
    }

    public void addPlayer(Player player){
        if(player.getAge()>=16){
            this.players.add(player);
        }
    }

    public void printPlayers(){
        System.out.println("\nJogadores:");
        players.forEach(player -> System.out.println(player.getName_player()));
    }

    public String getSADName(){
        return ("SAD "+ this.name);
    }
}
