package demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String province = "上海";

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                '}';
    }

}
