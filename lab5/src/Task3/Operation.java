package Task3;

public class Operation implements Minus, Plus, Div, Mult {

    private float value;

    public Operation(float value) {
        this.value = value;
    }

    public float getNumber(){
        return value;
    }

    @Override
    public float div(float div) {
        if(div == 0) {
            System.out.println("Division by zero is not possible");
            return 0;
        }
        value = value / div;
        return value;
    }

    @Override
    public float minus(float minus) {
        value = value - minus;
        return value;
    }

    @Override
    public float mult(float mult) {
        value = value * mult;
        return value;
    }

    @Override
    public float plus(float plus) {
        value = value + plus;
        return value;
    }
}
