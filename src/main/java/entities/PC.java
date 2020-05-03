package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name="PC")
@NamedNativeQuery(name = "findAllPC", query = "select * from PC")
public class PC implements Serializable {
    @Id
    private Integer code;
    @Column(length = 50)
    private String model;
    private Short speed;
    private Short ram;
    private Float hd;
    @Column(length = 50)
    private String cd;
    private BigDecimal price;

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

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", ram=" + ram +
                ", hd=" + hd +
                ", cd='" + cd + '\'' +
                ", price=" + price +
                '}';
    }
}
