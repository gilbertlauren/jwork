
/**
 * Merupakan file enum untuk InvoiceStatus
 * @author Gilbert Lauren
 * @version 27 Maret 2021
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
    
    private InvoiceStatus(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
