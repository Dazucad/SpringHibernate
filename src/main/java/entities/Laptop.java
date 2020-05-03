package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="Laptop")
@NamedNativeQuery(name = "findAllLaptop", query = "select * from Laptop")
public class Laptop implements Serializable {
    @Id
    private Integer code;
    @Column(length = 50)

    private String model;
    private Short speed;
    private Short ram;
    private Float hd;
    private BigDecimal price;
    private Byte screen;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Short getSpeed() {
        return speed;
    }

    public void setSpeed(Short speed) {
        this.speed = speed;
    }

    public Short getRam() {
        return ram;
    }

    public void setRam(Short ram) {
        this.ram = ram;
    }

    public Float getHd() {
        return hd;
    }

    public void setHd(Float hd) {
        this.hd = hd;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getScreen() {
        return screen;
    }

    public void setScreen(Byte screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", ram=" + ram +
                ", hd=" + hd +
                ", price=" + price +
                ", screen=" + screen +
                '}';
    }
}
