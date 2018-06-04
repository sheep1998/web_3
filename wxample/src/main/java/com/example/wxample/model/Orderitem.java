package com.example.wxample.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Orderitem {
    private int orderitemid;
    private Integer orderid;
    private Integer bookid;
    private Integer num;
    private Integer price;

    @Id
    @Column(name = "orderitemid")
    public int getOrderitemid() {
        return orderitemid;
    }

    public void setOrderitemid(int orderitemid) {
        this.orderitemid = orderitemid;
    }

    @Basic
    @Column(name = "orderid")
    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "bookid")
    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    @Basic
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orderitem orderitem = (Orderitem) o;
        return orderitemid == orderitem.orderitemid &&
                Objects.equals(orderid, orderitem.orderid) &&
                Objects.equals(bookid, orderitem.bookid) &&
                Objects.equals(num, orderitem.num) &&
                Objects.equals(price, orderitem.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(orderitemid, orderid, bookid, num, price);
    }
}
