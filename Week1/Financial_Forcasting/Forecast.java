public class Forecast {

    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue; 
        }
        return (1 + growthRate) * predictFutureValue(currentValue, growthRate, years - 1);
    }
    public static void main(String[] args) {
        double currentValue = 50000; 
        double growthRate = 0.12;     
        int years = 3;

        double futureValue = predictFutureValue(currentValue, growthRate, years);
        System.out.printf("Predicted value after %d years: %.2f\n", years, futureValue);
    }
} 

// TIme Complexity
// The recursive method calls itself years times. So Time Complexity: O(n) where n = years.

// As we know we have limited Stack Space so for large 'n' it can lead to stack overflow as function calls are stored in stack memory. so we can use Memoization (Top-Down DP):
// Store already computed results in a array to avoid repeated calculations.

