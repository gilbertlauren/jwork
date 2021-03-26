
/**
 * Merupakan file enum untuk JobCategory
 * @author Gilbert Lauren
 * @version 26 Maret 2021
 */
public enum JobCategory
{
    /** Merupakan pilihan untuk JobCategory (Web Developer) */
    WebDeveloper("Web Developer"), 
    /** Merupakan pilihan untuk JobCategory (Front End) */
    FrontEnd("Front End"),
    /** Merupakan pilihan untuk JobCategory (Back End) */
    BackEnd("Back End"),
    /** Merupakan pilihan untuk JobCategory (UI) */
    UI("UI"),
    /** Merupakan pilihan untuk JobCategory (UX) */
    UX("UX"),
    /** Merupakan pilihan untuk JobCategory (Devops) */
    Devops("Devops"),
    /** Merupakan pilihan untuk JobCategory (Data Scientist) */
    DataScientist("Data Scientist"),
    /** Merupakan pilihan untuk JobCategory (Data Analyst) */
    DataAnalyst("Data Analyst"); 
    
    private String name;
    
    private JobCategory(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
