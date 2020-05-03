package entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Product")
@NamedNativeQuery(name = "findAllProduct", query = "select * from Product")
public class Product implements Serializable {
    @Column(length = 10)
    private String maker;
    @Id
    @Column(length = 50)
    private String model;
    @Column(length = 50)
    private String type;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
