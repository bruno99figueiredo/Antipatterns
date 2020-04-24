
public class Player extends Person{
    private String name;
    private String name_player;
    private String position;
    private Integer age;
    private String nr_phone;
    private String email;

    public Player(String name, String name_player, String position, Integer age, String nr_phone, String email) {
        this.name = name;
        this.name_player = name_player;
        this.position = position;
        this.age = age;
        this.nr_phone = "+351"+nr_phone;
        this.email = email.split("@")[0].concat("@gmail.com");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName_player() {
        return name_player;
    }

    public void setName_player(String name_player) {
        this.name_player = name_player;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getNr_phone() {
        return nr_phone;
    }

    public void setNr_phone(String nr_phone) {
        this.nr_phone = nr_phone;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamePlayer_Name_Age(){
        return (this.name_player+"->"+this.name+"->").concat(Integer.toString(this.age));
    }

}
