package gilbertlauren.jwork;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration class JobCategory - Consits of job types within JWork
 * Web Developer, Front End, Back End, UI, UX, Devops, Data Scientist, Data Analyst
 *
 * @author Gilbert Lauren
 * @version 03/26/2021
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
    /**
     * Constructor of JobCategory enum
     *
     * @param name name of enum elemen
     */
    private JobCategory(String name) {
        this.name = name;
    }
    /**
     * Returns the name of JobCategory enum in String
     *
     * @return String returns the name of JobCategory
     */
    public String toString() {
        return name;
    }

    private static final Map<String, JobCategory> BY_LABEL = new HashMap<>();

    static {
        for (JobCategory category : values()) {
            BY_LABEL.put(category.name, category);
        }
    }

    public static JobCategory valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }
}
