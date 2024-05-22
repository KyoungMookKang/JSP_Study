package com.miniproject.product.model.dto;

public class ProductDto {

//    PRODUCT_NUM VARCHAR2(100) PRIMARY KEY,
//    CAR_NUM VARCHAR2(100) REFERENCES CARS(CAR_NUM),
//    PRODUCT_STATUS VARCHAR2(100),
//    PRODUCT_PRICE NUMBER NOT NULL,
//    PRODUCT_AVAILABLE NUMBER NOT NULL

    private String productNum;
    private  String carNum;
    private String productStatus;
    private int price;
    private int productAvailable;

    public String getProductNum() {
        return productNum;
    }

    public void setProductNum(String productNum) {
        this.productNum = productNum;
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }

    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProductAvailable() {
        return productAvailable;
    }

    public void setProductAvailable(int productAvailable) {
        this.productAvailable = productAvailable;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productNum='" + productNum + '\'' +
                ", carNum='" + carNum + '\'' +
                ", productStatus='" + productStatus + '\'' +
                ", price=" + price +
                ", productAvailable=" + productAvailable +
                '}';
    }
}
