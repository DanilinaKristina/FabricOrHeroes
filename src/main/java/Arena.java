import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.SQLOutput;

@Getter
@Setter
@ToString
public class Arena {
    public void fight (Hero name1, Hero name2){
        System.out.println("Битва между " + name1.getName() + " и " + name2.getName());
        System.out.println("Битва началась! " + name1.getName() + " кричит \n" );
        name1.namePower();
        System.out.println(name2.getName() + " кричит в ответ \n" );
        name2.namePower();
        int i = (int) Math.floor(Math.random() * 101);
        if( i <= 85){
            if(name1.getPower() < name2.getPower() ) {
                System.out.println("\nВ битве победил " + name2.getName());
            } else {
                System.out.println("\nВ битве победил " + name1.getName());
            }
        } else {
            if(name1.getPower() < name2.getPower() ) {
                System.out.println("\nВмешался случай! Жизнь преподнесла сюрприз. Победил " + name1.getName());
            } else {
                System.out.println("\nВмешался случай! Жизнь преподнесла сюрприз. Победил " + name2.getName());
            }
        }



    }
}
