import java.util.Arrays;

public class Calculator {
    public static final double RATE_FOR_PRICE_ABOVE_TEN_AND_BELOW_HUNDRED = 0.8d;
    public static final double RATE_FOR_PRICE_ABOVE_HUNDRED = 0.75d;
    public static final double ACTUAL_PRICE_BELOW_TEN = 0d;
    public double calculate(String[] inputs) {

        double totalPrice = Arrays.asList(inputs).stream()
                .map((goods) -> {
                    double goodsPrice = Double.parseDouble(goods.replaceAll("[^\\d.]", ""));
                    return calculateActualPrice(goodsPrice);})
                .reduce((sum, cost) -> sum + cost)
                .get();
        return roundToTwoDecimal(totalPrice);
    }

    private Double calculateActualPrice(double goodsPrice) {
        if (goodsPrice <= 10d) {
            return ACTUAL_PRICE_BELOW_TEN;
        } else if (goodsPrice > 10d && goodsPrice <= 100d) {
            return goodsPrice * RATE_FOR_PRICE_ABOVE_TEN_AND_BELOW_HUNDRED;
        } else {
            return goodsPrice * RATE_FOR_PRICE_ABOVE_HUNDRED;
        }
    }


    private double roundToTwoDecimal(double number) {
        return (double) Math.round(number * 100) / 100;
    }
}
