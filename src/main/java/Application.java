public class Application {
    public static void main(String[] args) {
        Fabric obj1 = new Fabric();
        obj1.setName("Бетмен");
        obj1.namePower();
        obj1.setPower(10);
        obj1.setType(Fabric.Type.DC);
        System.out.println(obj1);
        Fabric obj2 = new Fabric();
        obj2.setName("Супермен");
        obj2.namePower();
        obj2.setPower(10);
        obj2.setType(Fabric.Type.MARVEL);
        System.out.println(obj2);
        Fabric obj3 = new Fabric();
        obj3.setName("Халк");
        obj3.namePower();
        obj3.setPower(8);
        obj3.setType(Fabric.Type.DC);
        System.out.println(obj3);


    }
}
