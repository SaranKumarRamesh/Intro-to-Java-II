package objectCubeCount;

public class TestCube {
    public static void main(String[]args){
        Cube ice = new Cube(2,2,1);
        Cube sugar = new Cube(1,1,1);

        System.out.println("Ice Info: ");
        System.out.println(ice.toString());

        ice.setHeight(3);
        System.out.println(ice);

        System.out.println("Sugar Info: ");
        System.out.println(sugar);

    }
}
