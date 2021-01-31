//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(
        name = "menu_item_item_tag",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogMenuItemItemTagEntity {
    private Long id;
    private CatalogMenuItemEntity menuItemByMenuItemId;
    private CatalogItemTagEntity itemTagByItemTagId;

    public CatalogMenuItemItemTagEntity() {
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @ManyToOne
    @JoinColumn(
            name = "item_tag_id",
            referencedColumnName = "id",
            nullable = false
    )
    public CatalogItemTagEntity getItemTagByItemTagId() {
        return this.itemTagByItemTagId;
    }

    public void setItemTagByItemTagId(CatalogItemTagEntity itemTagByItemTagId) {
        this.itemTagByItemTagId = itemTagByItemTagId;
    }
}
