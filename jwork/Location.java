
/**
 * Merupakan file class untuk Location
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Location
{
    private String province, city, description, born;
    /**
     * Constructor for objects of class Location
     * @param province
     * @param city
     * @param description
     */
    public Location(String province, String city, String description, String born)
    {
        this.province = province;
        this.city = city;
        this.description = description;
        this.born = born;
    }
    /**
     * merupakan getter province dari location
     * @return province
     */
    public String getProvince(){
        return province;
    }
    /**
     * merupakan getter city dari location
     * @return city
     */
    public String getCity(){
        return city;
    }
    /**
     * merupakan getter deskripsi dari location
     * @return province
     */
    public String getDescription(){
        return description;
    }
    public String getBorn(){
        return born;
    }
    /**
     * merupakan setter province dari location
     * @param province
     */
    public void setProvince(String province){
        this.province = province;
    }
    /**
     * merupakan setter dari location
     * @param city
     */
    public void setCity(String city){
        this.city = city;
    }
    /**
     * merupakan setter description dari location
     * @param description
     */
    public void setDescription(String description){
        this.description = description;
    }
    public void setBorn(String born){
        this.born = born;
    }
    public void printData(){
    // Menampilkan perintah print dari provinsi
        System.out.println("Provinsi  :" + getProvince());
    }
}
