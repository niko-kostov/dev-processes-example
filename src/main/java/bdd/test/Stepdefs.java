package bdd.test;

import bdd.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Stepdefs {
    Calculator calculator = new Calculator();
    Integer number1;
    Integer number2;

    @Given("I have two integer numbers {int} {int}")
    public void i_have_two_given_numbers(Integer number1, Integer number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Then("I have a sum of the two numbers")
    public void i_have_sum_of_the_numbers() {
        assertEquals(15, calculator.add(number1, number2));
    }
}
