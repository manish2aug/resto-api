//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.persistence.entity;

import java.util.Collection;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(
        name = "ingredient_option",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogIngredientOptionEntity {
    private Long id;
    private String name;
    private String code;
    private String description;
    private Integer ingredientId;
    private Boolean isAllowedInFasting;
    private Integer innatePotencyId;
    private Boolean isAvailable;
    private Boolean isDefault;
    private CatalogIngredientEntity ingredientByIngredientId;
    private CatalogInnatePotencyEntity innatePotencyByInnatePotencyId;
    private CatalogNutritionValueEntity nutritionValueByNutritionValueId;
    private Collection<CatalogRecipeIngredientEntity> recipeIngredientsById;

    public CatalogIngredientOptionEntity() {
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
            name = "ingredient_id",
            nullable = false,
            insertable = false,
            updatable = false
    )
    public Integer getIngredientId() {
        return this.ingredientId;
    }

    public void setIngredientId(Integer ingredientId) {
        this.ingredientId = ingredientId;
    }

    @Basic
    @Column(
            name = "is_allowed_in_fasting",
            nullable = true
    )
    public Boolean getAllowedInFasting() {
        return this.isAllowedInFasting;
    }

    public void setAllowedInFasting(Boolean allowedInFasting) {
        this.isAllowedInFasting = allowedInFasting;
    }

    @Basic
    @Column(
            name = "innate_potency_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getInnatePotencyId() {
        return this.innatePotencyId;
    }

    public void setInnatePotencyId(Integer innatePotencyId) {
        this.innatePotencyId = innatePotencyId;
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

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CatalogIngredientOptionEntity that = (CatalogIngredientOptionEntity)o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name) && Objects.equals(this.code, that.code) && Objects.equals(this.description, that.description) && Objects.equals(this.ingredientId, that.ingredientId) && Objects.equals(this.isAllowedInFasting, that.isAllowedInFasting) && Objects.equals(this.innatePotencyId, that.innatePotencyId) && Objects.equals(this.isAvailable, that.isAvailable);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.code, this.description, this.ingredientId, this.isAllowedInFasting, this.innatePotencyId, this.isAvailable});
    }

    @ManyToOne
    @JoinColumn(
            name = "ingredient_id",
            referencedColumnName = "id",
            nullable = false
    )
    public CatalogIngredientEntity getIngredientByIngredientId() {
        return this.ingredientByIngredientId;
    }

    public void setIngredientByIngredientId(CatalogIngredientEntity ingredientByIngredientId) {
        this.ingredientByIngredientId = ingredientByIngredientId;
    }

    @ManyToOne
    @JoinColumn(
            name = "innate_potency_id",
            referencedColumnName = "id"
    )
    public CatalogInnatePotencyEntity getInnatePotencyByInnatePotencyId() {
        return this.innatePotencyByInnatePotencyId;
    }

    public void setInnatePotencyByInnatePotencyId(CatalogInnatePotencyEntity innatePotencyByInnatePotencyId) {
        this.innatePotencyByInnatePotencyId = innatePotencyByInnatePotencyId;
    }

    @Basic
    @Column(
            name = "is_default",
            nullable = false
    )
    public Boolean getDefault() {
        return this.isDefault;
    }

    public void setDefault(Boolean aDefault) {
        this.isDefault = aDefault;
    }

    @ManyToOne
    @JoinColumn(
            name = "nutrition_value_id",
            referencedColumnName = "id"
    )
    public CatalogNutritionValueEntity getNutritionValueByNutritionValueId() {
        return this.nutritionValueByNutritionValueId;
    }

    public void setNutritionValueByNutritionValueId(CatalogNutritionValueEntity nutritionValueByNutritionValueId) {
        this.nutritionValueByNutritionValueId = nutritionValueByNutritionValueId;
    }

    @OneToMany(
            mappedBy = "ingredientByIngredientId"
    )
    public Collection<CatalogRecipeIngredientEntity> getRecipeIngredientsById() {
        return this.recipeIngredientsById;
    }

    public void setRecipeIngredientsById(Collection<CatalogRecipeIngredientEntity> recipeIngredientsById) {
        this.recipeIngredientsById = recipeIngredientsById;
    }
}
