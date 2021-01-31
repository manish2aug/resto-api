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
        name = "recipe_ingredient",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogRecipeIngredientEntity {
    private Long id;
    private CatalogRecipeEntity recipeByRecipeId;
    private CatalogIngredientOptionEntity ingredientByIngredientId;
    private CatalogMeasurementUnitEntity measurementUnitByMeasurementUnitId;

    public CatalogRecipeIngredientEntity() {
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
            name = "ingredient_option_id",
            referencedColumnName = "id",
            nullable = false
    )
    public CatalogIngredientOptionEntity getIngredientByIngredientId() {
        return this.ingredientByIngredientId;
    }

    public void setIngredientByIngredientId(CatalogIngredientOptionEntity ingredientByIngredientId) {
        this.ingredientByIngredientId = ingredientByIngredientId;
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

    public String toString() {
        Long var10000 = this.getId();
        return "CatalogRecipeIngredientEntity(id=" + var10000 + ", recipeByRecipeId=" + this.getRecipeByRecipeId() + ", ingredientByIngredientId=" + this.getIngredientByIngredientId() + ", measurementUnitByMeasurementUnitId=" + this.getMeasurementUnitByMeasurementUnitId() + ")";
    }
}
