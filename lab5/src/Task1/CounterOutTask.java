package Task1;

public class CounterOutTask implements Task{
    private static int counter;
    public void execute(){
        counter++;
        System.out.println(counter);
    }
}
