package gilbertlauren.jwork;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration class InvoiceStatus - Consists of Invoice status ongoing, finished, and cancelled
 *
 * @author Gilbert Lauren
 * @version 3/27/2021
 */
public enum InvoiceStatus
{
    /** Merupakan pilihan untuk JobCategory (Web Developer) */
    OnGoing("On Going"), 
    /** Merupakan pilihan untuk JobCategory (Front End) */
    Finished("Finished"),
    /** Merupakan pilihan untuk JobCategory (Back End) */
    Cancelled("Cancelled");
    
    private String name;
    /**
     * Constructor of InvoiceStatus enum
     *
     * @param name name of enum elemen
     */
    private InvoiceStatus(String name) {
        this.name = name;
    }
    /**
     * Returns the name of InvoiceStatus enum in String
     *
     * @return String returns the name of InvoiceStatus
     */
    public String toString() {
        return name;
    }
    private static final Map<String, InvoiceStatus> BY_LABEL = new HashMap<>();

    static {
        for (InvoiceStatus invoiceStatus : values()) {
            BY_LABEL.put(invoiceStatus.name, invoiceStatus);
        }
    }

    public static InvoiceStatus valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
}
