package net.kemitix.itunes.medialibrary.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "category", uniqueConstraints = @UniqueConstraint(columnNames = {"category"}))
public class Category implements Serializable {

    @Column(name = "category", table = "category", nullable = false, length = 2000000000)
    @Basic
    private String category;

    @Column(name = "category_id", table = "category")
    @Id
    private Integer categoryId;
}
