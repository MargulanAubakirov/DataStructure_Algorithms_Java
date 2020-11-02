package KForce;

public class Customer {
    private String firstname;
    private String lastname;
    private String city;
    private int CONTRCNT;

    public Customer(String firstname, String lastname, String city, int CONTRCNT) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.city = city;
        this.CONTRCNT = CONTRCNT;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCONTRCNT() {
        return CONTRCNT;
    }

    public void setCONTRCNT(int CONTRCNT) {
        this.CONTRCNT = CONTRCNT;
    }
}
