package Task1;

import java.util.Random;

public class RandomOutTask implements Task{


    private int number;
    private static Random rnd = new Random(12345);

    public RandomOutTask(){
        number = rnd.nextInt();
    }

    public void execute(){
        System.out.println(number);
    }
}

