public class Application {

    public static void main(String[] args) {
        Fabric betman = new Fabric("Бетмен", 10, Fabric.Type.DC);
        Fabric superman = new Fabric("Супермен", 9, Fabric.Type.MARVEL);
        Fabric aquamen = new Fabric("Аквамен", 7, Fabric.Type.MARVEL);
        Fabric halk = new Fabric("Халк", 8, Fabric.Type.DC);
        Fabric spider = new Fabric("Человек - паук", 5, Fabric.Type.DC);
        Fabric rossomaha = new Fabric("Россомаха", 9, Fabric.Type.DC);
        betman.namePower();
        superman.namePower();
        aquamen.namePower();
        halk.namePower();
        spider.namePower();
        rossomaha.namePower();
        Arena boi1 = new Arena();
        boi1.fight(betman, spider);
        Arena boi2 = new Arena();
        boi2.fight(halk,rossomaha);
        Arena boi3 = new Arena();
        boi3.fight(superman, betman);
    }
}
