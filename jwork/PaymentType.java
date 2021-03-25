
/**
 * Enumeration class PaymentType - write a description of the enum class here
 *
 * @author Gilbert Lauren
 * @version 25 Maret 2021
 */
public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("E-Wallet Payment");
    
    private final String name;
    
    private PaymentType(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
