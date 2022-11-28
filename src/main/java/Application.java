import lombok.ToString;

@ToString

public class Application {

    public static void main(String[] args) {
        Fabric hero = new Fabric();
        Hero hero1 = new Hero(hero.createHero(args[0]),10, Hero.Type.DC);
        Hero hero2 = new Hero(hero.createHero(args[1]), 8, Hero.Type.MARVEL);
        Hero hero3 = new Hero(hero.createHero(args[2]), 9, Hero.Type.MARVEL);
        Hero hero4 = new Hero(hero.createHero(args[3]),5, Hero.Type.DC);
        Hero hero5 = new Hero(hero.createHero(args[4]), 4, Hero.Type.MARVEL);
        Hero hero6 = new Hero(hero.createHero(args[5]),7, Hero.Type.DC);
        Arena boi1 = new Arena();
        boi1.fight(hero1,hero2);
        boi1.fight(hero4,hero6);
        boi1.fight(hero3,hero4);
    }
}

