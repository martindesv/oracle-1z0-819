package chapter8.java;

public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        Capybara capybara = (Capybara)rodent; // ClassCastException. Can be fixed if Rodent extends Capybara

        if(rodent instanceof Capybara) {
            Capybara capybara2 = (Capybara)rodent;
        }
    }
}