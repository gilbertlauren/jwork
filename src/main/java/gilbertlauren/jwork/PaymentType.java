package gilbertlauren.jwork;
/**
 * Merupakan file enum untuk PaymentType
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
public enum PaymentType
{
    /** Merupakan pilihan untuk PaymentType (Bank Payment) */
    BankPayment("Bank Payment"),
    /** Merupakan pilihan untuk PaymentType (E-Wallet Payment) */
    EwalletPayment("E-Wallet Payment");
    
    private String name;
    
    private PaymentType(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
