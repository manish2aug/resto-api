//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.persistence.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(
        name = "menu_item",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogMenuItemEntity {
    private Long id;
    private String name;
    private String code;
    private String description;
    private BigInteger basePrice;
    private Integer menuCourseId;
    private Integer recipeId;
    private Integer measurementUnitId;
    private Integer measurementAmount;
    private Boolean isServedAlone;
    private Boolean isAvailable;
    private Boolean isComplementary;
    private Integer complementaryWithItemId;
    private CatalogMenuCourseEntity menuCourseByMenuCourseId;
    private CatalogRecipeEntity recipeByRecipeId;
    private CatalogMeasurementUnitEntity measurementUnitByMeasurementUnitId;
    private CatalogMenuItemEntity menuItemByComplementaryWithItemId;
    private Collection<CatalogMenuItemEntity> menuItemsById;
    private Collection<CatalogMenuItemTagEntity> menuItemItemTagsById;
    private Collection<CatalogMenuItemPictureEntity> menuItemPicturesById;

    public CatalogMenuItemEntity() {
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
            name = "name",
            nullable = false,
            length = 50
    )
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(
            name = "code",
            nullable = false,
            length = 20
    )
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(
            name = "description",
            nullable = false,
            length = 100
    )
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(
            name = "base_price",
            nullable = true,
            precision = 0
    )
    public BigInteger getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(BigInteger basePrice) {
        this.basePrice = basePrice;
    }

    @Basic
    @Column(
            name = "menu_course_id",
            nullable = false,
            insertable = false,
            updatable = false
    )
    public Integer getMenuCourseId() {
        return this.menuCourseId;
    }

    public void setMenuCourseId(Integer menuCourseId) {
        this.menuCourseId = menuCourseId;
    }

    @Basic
    @Column(
            name = "recipe_id",
            nullable = false,
            insertable = false,
            updatable = false
    )
    public Integer getRecipeId() {
        return this.recipeId;
    }

    public void setRecipeId(Integer recipeId) {
        this.recipeId = recipeId;
    }

    @Basic
    @Column(
            name = "measurement_unit_id",
            nullable = false,
            insertable = false,
            updatable = false
    )
    public Integer getMeasurementUnitId() {
        return this.measurementUnitId;
    }

    public void setMeasurementUnitId(Integer measurementUnitId) {
        this.measurementUnitId = measurementUnitId;
    }

    @Basic
    @Column(
            name = "measurement_amount",
            nullable = false,
            insertable = false,
            updatable = false
    )
    public Integer getMeasurementAmount() {
        return this.measurementAmount;
    }

    public void setMeasurementAmount(Integer measurementAmount) {
        this.measurementAmount = measurementAmount;
    }

    @Basic
    @Column(
            name = "is_served_alone",
            nullable = false
    )
    public Boolean getServedAlone() {
        return this.isServedAlone;
    }

    public void setServedAlone(Boolean servedAlone) {
        this.isServedAlone = servedAlone;
    }

    @Basic
    @Column(
            name = "is_available",
            nullable = true
    )
    public Boolean getAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(Boolean available) {
        this.isAvailable = available;
    }

    @Basic
    @Column(
            name = "is_complementary",
            nullable = true
    )
    public Boolean getComplementary() {
        return this.isComplementary;
    }

    public void setComplementary(Boolean complementary) {
        this.isComplementary = complementary;
    }

    @Basic
    @Column(
            name = "complementary_with_item_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getComplementaryWithItemId() {
        return this.complementaryWithItemId;
    }

    public void setComplementaryWithItemId(Integer complementaryWithItemId) {
        this.complementaryWithItemId = complementaryWithItemId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CatalogMenuItemEntity that = (CatalogMenuItemEntity) o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name) && Objects.equals(this.code, that.code) && Objects.equals(this.description, that.description) && Objects.equals(this.basePrice, that.basePrice) && Objects.equals(this.menuCourseId, that.menuCourseId) && Objects.equals(this.recipeId, that.recipeId) && Objects.equals(this.measurementUnitId, that.measurementUnitId) && Objects.equals(this.measurementAmount, that.measurementAmount) && Objects.equals(this.isServedAlone, that.isServedAlone) && Objects.equals(this.isAvailable, that.isAvailable) && Objects.equals(this.isComplementary, that.isComplementary) && Objects.equals(this.complementaryWithItemId, that.complementaryWithItemId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.code, this.description, this.basePrice, this.menuCourseId, this.recipeId, this.measurementUnitId, this.measurementAmount, this.isServedAlone, this.isAvailable, this.isComplementary, this.complementaryWithItemId});
    }

    @ManyToOne
    @JoinColumn(
            name = "menu_course_id",
            referencedColumnName = "id",
            nullable = false
    )
    public CatalogMenuCourseEntity getMenuCourseByMenuCourseId() {
        return this.menuCourseByMenuCourseId;
    }

    public void setMenuCourseByMenuCourseId(CatalogMenuCourseEntity menuCourseByMenuCourseId) {
        this.menuCourseByMenuCourseId = menuCourseByMenuCourseId;
    }

    @ManyToOne
    @JoinColumn(
            name = "recipe_id",
            referencedColumnName = "id",
            nullable = false
    )
    public CatalogRecipeEntity getRecipeByRecipeId() {
        return this.recipeByRecipeId;
    }

    public void setRecipeByRecipeId(CatalogRecipeEntity recipeByRecipeId) {
        this.recipeByRecipeId = recipeByRecipeId;
    }

    @ManyToOne
    @JoinColumn(
            name = "measurement_unit_id",
            referencedColumnName = "id",
            nullable = false
    )
    public CatalogMeasurementUnitEntity getMeasurementUnitByMeasurementUnitId() {
        return this.measurementUnitByMeasurementUnitId;
    }

    public void setMeasurementUnitByMeasurementUnitId(CatalogMeasurementUnitEntity measurementUnitByMeasurementUnitId) {
        this.measurementUnitByMeasurementUnitId = measurementUnitByMeasurementUnitId;
    }

    @ManyToOne
    @JoinColumn(
            name = "complementary_with_item_id",
            referencedColumnName = "id"
    )
    public CatalogMenuItemEntity getMenuItemByComplementaryWithItemId() {
        return this.menuItemByComplementaryWithItemId;
    }

    public void setMenuItemByComplementaryWithItemId(CatalogMenuItemEntity menuItemByComplementaryWithItemId) {
        this.menuItemByComplementaryWithItemId = menuItemByComplementaryWithItemId;
    }

    @OneToMany(
            mappedBy = "menuItemByComplementaryWithItemId"
    )
    public Collection<CatalogMenuItemEntity> getMenuItemsById() {
        return this.menuItemsById;
    }

    public void setMenuItemsById(Collection<CatalogMenuItemEntity> menuItemsById) {
        this.menuItemsById = menuItemsById;
    }

    @OneToMany(
            mappedBy = "menuItemByMenuItemId"
    )
    public Collection<CatalogMenuItemTagEntity> getMenuItemItemTagsById() {
        return this.menuItemItemTagsById;
    }

    public void setMenuItemItemTagsById(Collection<CatalogMenuItemTagEntity> menuItemItemTagsById) {
        this.menuItemItemTagsById = menuItemItemTagsById;
    }

    @OneToMany(
            mappedBy = "menuItemByMenuItemId"
    )
    public Collection<CatalogMenuItemPictureEntity> getMenuItemPicturesById() {
        return this.menuItemPicturesById;
    }

    public void setMenuItemPicturesById(Collection<CatalogMenuItemPictureEntity> menuItemPicturesById) {
        this.menuItemPicturesById = menuItemPicturesById;
    }
}
