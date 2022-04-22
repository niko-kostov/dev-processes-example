package bdd;

public class Calculator {
    public Integer add(Integer number1, Integer number2) {
        if (number1 == null || number2 == null)
            throw new NullPointerException("Null values are not accepted as parameters for this method.");

        return number1 + number2;
    }

}
