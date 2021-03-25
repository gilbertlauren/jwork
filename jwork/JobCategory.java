
/**
 * Enumeration class JobCategory - write a description of the enum class here
 *
 * @author Gilbert Lauren
 * @version 25 Maret 2021
 */
public enum JobCategory
{
    WebDeveloper("Web Developer"), 
    FrontEnd("Front End"), 
    BackEnd("Back End"), 
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");
    
    private final String name;
    
    private JobCategory(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}
