package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="category",uniqueConstraints=@UniqueConstraint(columnNames={"category"}))
public class Category implements Serializable {

    @Column(name="category",table="category",nullable=false,length=2000000000)
    @Basic
    private String category;
    @Column(name="category_id",table="category")
    @Id
    private Integer categoryId;

    public Category() {

    }
   
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
   
    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
}
