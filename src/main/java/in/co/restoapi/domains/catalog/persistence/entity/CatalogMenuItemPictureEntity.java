//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.persistence.entity;

import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(
        name = "menu_item_picture",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogMenuItemPictureEntity {
    private Long id;
    private String url;
    private Integer menuItemId;
    private CatalogMenuItemEntity menuItemByMenuItemId;

    public CatalogMenuItemPictureEntity() {
    }

    @Id
    @GeneratedValue
    @Column(
            name = "id",
            nullable = false
    )
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(
            name = "url",
            nullable = false,
            length = 500
    )
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(
            name = "menu_item_id",
            nullable = false,
            insertable = false,
            updatable = false
    )
    public Integer getMenuItemId() {
        return this.menuItemId;
    }

    public void setMenuItemId(Integer menuItemId) {
        this.menuItemId = menuItemId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CatalogMenuItemPictureEntity that = (CatalogMenuItemPictureEntity)o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.url, that.url) && Objects.equals(this.menuItemId, that.menuItemId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.url, this.menuItemId});
    }

    @ManyToOne
    @JoinColumn(
            name = "menu_item_id",
            referencedColumnName = "id",
            nullable = false
    )
    public CatalogMenuItemEntity getMenuItemByMenuItemId() {
        return this.menuItemByMenuItemId;
    }

    public void setMenuItemByMenuItemId(CatalogMenuItemEntity menuItemByMenuItemId) {
        this.menuItemByMenuItemId = menuItemByMenuItemId;
    }
}
