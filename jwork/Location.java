
/**
 * Merupakan file class untuk Location
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Location /** inisiasi class */
{
    private String province, city, description, born; /** inisiasi variabel */
    /**
     * Constructor for objects of class Location
     * @param province provinsi dari location
     * @param city kota dari location
     * @param description deskripsi dari location
     * @param born tempat lahir dari lokasi
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
     * @return description
     */
    public String getDescription(){
        return description;
    }
    /**
     * merupakan getter tempat lahir dari location
     * @return born
     */
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
    /**
     * merupakan setter born dari location
     * @param born
     */
    public void setBorn(String born){
        this.born = born;
    }
    /**
     * method untuk print dari location
     * outputnya adalah nama provinsi
     */
    public void printData(){
        System.out.println("Provinsi  :" + getProvince());
    }
}
