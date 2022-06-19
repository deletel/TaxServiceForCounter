import java.math.BigDecimal;

public class IncomeTaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        BigDecimal first = new BigDecimal(amount);
        BigDecimal second = BigDecimal.valueOf(0.13);

        BigDecimal sum = first.multiply(second);

        return sum.doubleValue();

    }
}
