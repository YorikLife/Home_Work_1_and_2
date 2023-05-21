package Home_Work3.runners;

import Home_Work3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic expression = new CalculatorWithCounterClassic();
        expression.incrementCountOperation();
        System.out.println("Результат выражения : " + expression.sum(4.1, expression.sum(expression.multiply(15, 7), expression.exponential(expression.divide(28,5),2 ))));//140.45999999999998
        System.out.println("Количество раз использования калькулятора : " + expression.getCountOperation());
    }
}
