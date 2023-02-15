package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        long num = numberToPrint;
        for(int i = 1; i<power; i++){
            num=num*numberToPrint;
        }
        System.out.println(num);
    }
}
