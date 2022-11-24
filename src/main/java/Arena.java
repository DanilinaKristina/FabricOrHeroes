import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.SQLOutput;

@Getter
@Setter
@ToString
public class Arena {
    public Arena () {
    }
    public void fight (Fabric name1, Fabric name2){
        System.out.println("Битва между " + name1.getName() + " и " + name2.getName());
        System.out.println("Битва началась! " + name1.getName() + " кричит \n" );
        name1.namePower();
        System.out.println(name2.getName() + " кричит в ответ \n" );
        name2.namePower();
        if(name1.getPower() < name2.getPower() ) {
            System.out.println("\nВ битве победил " + name2.getName());
        } else {
            System.out.println("\nВ битве победил " + name1.getName());
        }

    }
}
