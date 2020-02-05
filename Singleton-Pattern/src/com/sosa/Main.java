package com.sosa;

public class Main {

    public static void main(String[] args) {
      var pizza = Pizza.getInstance();
      pizza.Greetings();
    }

    public static class Pizza {
        private static Pizza singleInstance = null;
        private Pizza(){}
        public static Pizza getInstance(){
            if (singleInstance == null) return new Pizza();
            return singleInstance;
        }

        public void Greetings(){
            System.out.println("Hello World from Pizza!");
        }
    }
}
