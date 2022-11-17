import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class Fabric {
    private String name;
    private int power;
    enum Type {MARVEL, DC }
    private Type type;



   public void namePower () {
        if (name.equals("Бетмен")){
            System.out.println("Моя сила - это деньги");
        } else if (name.equals("Супермен")){
            System.out.println("Я могу все!");
        } else if (name.equals("Аквамен")){
            System.out.println("Я как рыба в воде");
        } else if (name.equals("Халк")){
            System.out.println("Я крушить все !");
        } else if (name.equals("Человек-паук")) {
           System.out.println("Я паук. У меня есть чутье");
        } else if (name.equals("Россомаха")) {
            System.out.println("Я непобедим");
        }
   }

}
