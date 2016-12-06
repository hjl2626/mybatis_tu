package com.java.model.domain;

public class Basket {
    /**
    
     */
    private Long id;

    /**
    商品ID
     */
    private Long itemId;

    /**
    用户ID
     */
    private Long userId;

    /**
    商品库存ID
     */
    private Long itemSkuId;

    /**
    商品名称
     */
    private String itemName;

    /**
    商品数量
     */
    private Integer count;

    /**
    单价，以分为单位
     */
    private Integer price;

    /**
    
     */
    private Long appendDate;

    public Long getId() {
        return id;
    }

    public Basket setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getItemId() {
        return itemId;
    }

    public Basket setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Basket setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getItemSkuId() {
        return itemSkuId;
    }

    public Basket setItemSkuId(Long itemSkuId) {
        this.itemSkuId = itemSkuId;
        return this;
    }

    public String getItemName() {
        return itemName;
    }

    public Basket setItemName(String itemName) {
        this.itemName = itemName;
        return this;
    }

    public Integer getCount() {
        return count;
    }

    public Basket setCount(Integer count) {
        this.count = count;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public Basket setPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Long getAppendDate() {
        return appendDate;
    }

    public Basket setAppendDate(Long appendDate) {
        this.appendDate = appendDate;
        return this;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "id=" + id +
                ", itemId=" + itemId +
                ", userId=" + userId +
                ", itemSkuId=" + itemSkuId +
                ", itemName='" + itemName + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", appendDate=" + appendDate +
                '}';
    }
}