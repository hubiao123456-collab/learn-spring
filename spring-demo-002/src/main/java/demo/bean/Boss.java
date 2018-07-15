package demo.bean;

public class Boss {

    private Car car;
    private Office office;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                ", office=" + office +
                '}';
    }

}
