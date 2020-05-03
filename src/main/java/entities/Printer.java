package entities;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "Printer")
@NamedNativeQuery(name = "findAllPrinter", query = "select * from Printer")
public class Printer implements Serializable {
    @Id
    private Integer code;
    @Column(length = 50)
    private String model;
    private Character color;
    @Column(length = 10)
    private String type;
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

    public Character getColor() {
        return color;
    }

    public void setColor(Character color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "code=" + code +
                ", model='" + model + '\'' +
                ", color=" + color +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
