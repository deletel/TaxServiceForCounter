import java.math.BigDecimal;

public class VATaxType extends TaxType{
    @Override
    public double calculateTaxFor(double amount) {
        BigDecimal first = new BigDecimal(amount);
        BigDecimal second = BigDecimal.valueOf(0.18);

        BigDecimal sum = first.multiply(second);

        return sum.doubleValue();
    }
}
