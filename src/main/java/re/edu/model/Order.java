package re.edu.model;

import java.util.Date;

public class Order {
    private String id;
    private String product;
    private double total;
    private Date date;

    public Order(String id, String product, double total, Date date) {
        this.id = id;
        this.product = product;
        this.total = total;
        this.date = date;
    }

    public String getId() { return id; }
    public String getProduct() { return product; }
    public double getTotal() { return total; }
    public Date getDate() { return date; }
}