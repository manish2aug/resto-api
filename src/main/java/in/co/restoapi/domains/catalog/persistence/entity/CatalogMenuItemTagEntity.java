package in.co.restoapi.domains.catalog.persistence.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "menu_item_tag", schema = "catalog", catalog = "resto_db")
public class CatalogMenuItemTagEntity {

    @Id
    @GeneratedValue
    Long id;

    @ManyToOne
    @JoinColumn(name = "menu_item_id", referencedColumnName = "id", nullable = false)
    CatalogMenuItemEntity menuItemByMenuItemId;

    @ManyToOne
    @JoinColumn(name = "item_tag_id", referencedColumnName = "id", nullable = false)
    CatalogItemTagEntity itemTagByItemTagId;

}
