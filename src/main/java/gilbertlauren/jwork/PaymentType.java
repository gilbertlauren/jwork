package gilbertlauren.jwork;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration class PaymentType - consists of payment type in JWork
 * Supports Bank Payment and E-Wallet payment
 *
 * @author Gilbert Lauren
 * @version 03/26/2021
 */
public enum PaymentType
{
    /** Merupakan pilihan untuk PaymentType (Bank Payment) */
    BankPayment("Bank Payment"),
    /** Merupakan pilihan untuk PaymentType (E-Wallet Payment) */
    EwalletPayment("E-Wallet Payment");
    
    private String name;
    /**
     * Constructor of PaymentType enum
     *
     * @param name name of enum elemen
     */
    private PaymentType(String name) {
        this.name = name;
    }
    /**
     * Returns the name of PaymentType enum in String
     *
     * @return String returns the name of PaymentType
     */
    public String toString() {
        return name;
    }

    private static final Map<String, PaymentType> BY_LABEL = new HashMap<>();

    static {
        for (PaymentType paymentType : values()) {
            BY_LABEL.put(paymentType.name, paymentType);
        }
    }

    public static PaymentType valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
}
