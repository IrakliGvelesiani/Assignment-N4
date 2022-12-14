public class Product {

    private Long prodID;
    private String prodName;
    private Integer prodWeight;
    private Integer prodPrice;

    public Product() {
    }

    public Product(Long prodID, String prodName, Integer prodWeight, Integer prodPrice) {
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodWeight = prodWeight;
        this.prodPrice = prodPrice;
    }

    public Product(String prodName, Integer prodWeight, Integer prodPrice) {
        this.prodName = prodName;
        this.prodWeight = prodWeight;
        this.prodPrice = prodPrice;
    }

    public Long getId() {
        return prodID;
    }

    public void setId(Long prodID) {
        this.prodID = prodID;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public Integer getProdWeight() {
        return prodWeight;
    }

    public void setProdWeight(Integer prodWeight) {
        this.prodWeight = prodWeight;
    }

    public Integer getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(Integer prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "prodID=" + prodID +
                ", prodName='" + prodName + '\'' +
                ", prodWeight='" + prodWeight + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }

}