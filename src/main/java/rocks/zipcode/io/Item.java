package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    private Long idNumber;
    private String name;
    private Double price;
    public Item() {
        this(0L, "", 0.01);
    }

    public Item(Long id, String name, Double price) {
        idNumber = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {

        return idNumber;
    }

    public void setId(Long id) {
        idNumber = id;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
