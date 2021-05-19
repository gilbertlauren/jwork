package gilbertlauren.jwork;
/**
 * Merupakan file class untuk Location
 * @author Gilbert Lauren
 * @version 18 Maret 2021
 */
public class Location /** inisiasi class */
{
    private String province, city, description; /** inisiasi variabel */
    /**
     * Constructor for objects of class Location
     * @param province provinsi dari location
     * @param city kota dari location
     * @param description deskripsi dari location
     */
    public Location(String province, String city, String description)
    {
        this.province = province;
        this.city = city;
        this.description = description;
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
     * method untuk print dari location
     * outputnya adalah nama provinsi
     */
    //public void printData(){
    //    System.out.println("Provinsi  :" + getProvince());
    //}
    public String toString() {
        return "Province = " + province +
               "\nCity = " + city +
               "\nDescription = " + description;
    }
}
