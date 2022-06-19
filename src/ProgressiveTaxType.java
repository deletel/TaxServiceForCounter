import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        BigDecimal first = new BigDecimal(amount);
        BigDecimal second = (amount > 100000) ? BigDecimal.valueOf(0.15) : BigDecimal.valueOf(0.1);

        BigDecimal sum = first.multiply(second);

        return sum.doubleValue();

        //return ((amount > 100000) ? amount * 15 / 100 : amount * 10 / 100);
    }
}
