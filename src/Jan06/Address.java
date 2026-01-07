
package Jan06;


public class Address {
     private int code;
    private String area;

    // Constructor
    public Address(int code, String area) {
        this.code = code;
        this.area = area;
    }

    // Getters
    public int getCode() {
        return code;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Address [code=" + code + ", area=" + area + "]";
    }

}
