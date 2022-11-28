import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero {
    private String name;
    private int power;
    enum Type {MARVEL, DC }
    private Type type;
    public Hero (String name, int power, Type type){
        this.name =name;
        this.power = power;
        this.type = type;
    }
    public Hero () {

    }
    public void namePower () {
        if (name.equals("Бетмен")) {
            System.out.println(" Я Бетмен! Моя сила - это деньги");
        } else if (name.equals("Супермен")) {
            System.out.println("Я Супермен. Я могу все!");
        } else if (name.equals("Аквамен")) {
            System.out.println("Я Аквамен. Я как рыба в воде");
        } else if (name.equals("Халк")) {
            System.out.println("Я Халк! Я крушить все !");
        } else if (name.equals("Человек - паук")) {
            System.out.println("Я человек - паук ! У меня есть суперчутье");
        } else if (name.equals("Россомаха")) {
            System.out.println("Я Россомаха ! У меня есть когти");
        }
    }
}
