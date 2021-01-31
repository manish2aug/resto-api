package in.co.restoapi.domains.catalog.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "recipe_ingredient", schema = "catalog", catalog = "resto_db")
public class CatalogRecipeIngredientEntity {

    private Long id;
    private CatalogRecipeEntity recipeByRecipeId;
    private CatalogIngredientOptionEntity ingredientByIngredientId;
    private CatalogMeasurementUnitEntity measurementUnitByMeasurementUnitId;
    private boolean isIngredientReplaceable;

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
    @JoinColumn(name = "recipe_id", referencedColumnName = "id", nullable = false)
    public CatalogRecipeEntity getRecipeByRecipeId() {
        return this.recipeByRecipeId;
    }

    public void setRecipeByRecipeId(CatalogRecipeEntity recipeByRecipeId) {
        this.recipeByRecipeId = recipeByRecipeId;
    }

    @ManyToOne
    @JoinColumn(name = "ingredient_option_id", referencedColumnName = "id", nullable = false)
    public CatalogIngredientOptionEntity getIngredientByIngredientId() {
        return this.ingredientByIngredientId;
    }

    public void setIngredientByIngredientId(CatalogIngredientOptionEntity ingredientByIngredientId) {
        this.ingredientByIngredientId = ingredientByIngredientId;
    }

    @ManyToOne
    @JoinColumn(name = "measurement_unit_id", referencedColumnName = "id", nullable = false)
    public CatalogMeasurementUnitEntity getMeasurementUnitByMeasurementUnitId() {
        return this.measurementUnitByMeasurementUnitId;
    }

    public void setMeasurementUnitByMeasurementUnitId(CatalogMeasurementUnitEntity measurementUnitByMeasurementUnitId) {
        this.measurementUnitByMeasurementUnitId = measurementUnitByMeasurementUnitId;
    }

}
