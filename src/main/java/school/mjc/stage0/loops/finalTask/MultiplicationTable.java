package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int answer = 0;
        for(int i = 1; i <= 10; i++){
            answer=numberTableToPrint*i;
            System.out.println(i+" "+"x"+" "+numberTableToPrint+" "+"="+" "+answer);
        }
    }
}
