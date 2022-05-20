/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author ramo4853
 */
public class Location {
  private final int location_id;
  private String address;
  private String postal_code;
  private String city;
  private String province;
  private int country_id;


    public Location(int location_id, String address, String postal_code, String city, String province, int country_id) {
        this.location_id = location_id;
        this.address = address;
        this.postal_code = postal_code;
        this.city = city;
        this.province = province;
        this.country_id = country_id;
    }

    public Location(int location_id) {
        this.location_id = location_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.location_id != other.location_id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {// mejorar
        return  "La calle " + location_id + " esta en la dirección " + address + " con código postal " + postal_code + " en la ciudad " + city + ", provincia de " + province + " en el país número " + country_id + "\n";
    }
    
  
  
}
