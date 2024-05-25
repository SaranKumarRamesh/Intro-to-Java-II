package objectCubeCount;

public class TestCounter {
    public static void main(String[]args){
        Counter clock = new Counter();
        clock.increaseCounter();
        clock.increaseCounter();
        System.out.println(clock.toString());

        clock.resetCount();

        clock.increaseCounter();
        clock.increaseCounter();
        clock.increaseCounter();
        clock.increaseCounter();
        clock.decreaseCounter();
        System.out.println(clock.toString());

        for (int i = 0; i < 60; i++){
            clock.increaseCounter();
            System.out.println(clock.toString());
        }
    }
}
