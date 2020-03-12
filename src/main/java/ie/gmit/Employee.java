//sean Kelly
//G00347737@gmit.ie
//12/3/20
package ie.gmit;

public class Employee {
    private String title;
    private String name;
    private String PPS;
    private String phone;
    private String eType;
    private String age;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPPS(String PPS) {
        this.PPS = PPS;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Employee(String title, String name, String PPS, String phone, String eType, String age) {
        this.title = title;
        this.name = name;
        this.PPS = PPS;
        this.phone = phone;
        this.eType = eType;
        this.age = age;
    }

}


