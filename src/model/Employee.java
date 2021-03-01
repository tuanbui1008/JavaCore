package model;

public class Employee extends Person {
    private float hsl;
    private String divsion;



    public Employee() {
    }

    public Employee(String fullName, String address, float hsl, String divsion) {
        super(fullName, address);
        this.hsl = hsl;
        this.divsion = divsion;
    }

    public Employee(float hsl, String divsion) {
        this.hsl = hsl;
        this.divsion = divsion;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public String getDivsion() {
        return divsion;
    }

    public void setDivsion(String divsion) {
        this.divsion = divsion;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hsl=" + hsl +
                ", divsion='" + divsion + '\'' +
                "} " + super.toString();
    }
}
