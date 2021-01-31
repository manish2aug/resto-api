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
        name = "recipe",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogRecipeEntity {
    private Long id;
    private String code;
    private String description;
    private String instructions;
    private Integer cockingMethodId;
    private Integer cockingPotId;
    private Integer regionalInfluenceId;
    private Integer consistencyId;
    private Integer spicinessId;
    private Integer richnessId;
    private Integer tasteId;
    private Integer odorId;
    private CatalogCookingMethodEntity cookingMethodByCockingMethodId;
    private CatalogCookingPotEntity cookingPotByCockingPotId;
    private CatalogRegionalInfluenceEntity regionalInfluenceByRegionalInfluenceId;
    private CatalogRecipeConsistencyEntity recipeConsistencyByConsistencyId;
    private CatalogRecipeSpicinessEntity recipeSpicinessBySpicinessId;
    private CatalogRecipeRichnessEntity recipeRichnessByRichnessId;
    private CatalogRecipeTasteEntity recipeTasteByTasteId;
    private CatalogRecipeOdorEntity recipeOdorByOdorId;
    private Collection<CatalogRecipeIngredientEntity> recipeIngredientsById;

    public CatalogRecipeEntity() {
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
            name = "instructions",
            nullable = true,
            length = 500
    )
    public String getInstructions() {
        return this.instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Basic
    @Column(
            name = "cocking_method_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getCockingMethodId() {
        return this.cockingMethodId;
    }

    public void setCockingMethodId(Integer cockingMethodId) {
        this.cockingMethodId = cockingMethodId;
    }

    @Basic
    @Column(
            name = "cocking_pot_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getCockingPotId() {
        return this.cockingPotId;
    }

    public void setCockingPotId(Integer cockingPotId) {
        this.cockingPotId = cockingPotId;
    }

    @Basic
    @Column(
            name = "regional_influence_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getRegionalInfluenceId() {
        return this.regionalInfluenceId;
    }

    public void setRegionalInfluenceId(Integer regionalInfluenceId) {
        this.regionalInfluenceId = regionalInfluenceId;
    }

    @Basic
    @Column(
            name = "consistency_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getConsistencyId() {
        return this.consistencyId;
    }

    public void setConsistencyId(Integer consistencyId) {
        this.consistencyId = consistencyId;
    }

    @Basic
    @Column(
            name = "spiciness_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getSpicinessId() {
        return this.spicinessId;
    }

    public void setSpicinessId(Integer spicinessId) {
        this.spicinessId = spicinessId;
    }

    @Basic
    @Column(
            name = "richness_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getRichnessId() {
        return this.richnessId;
    }

    public void setRichnessId(Integer richnessId) {
        this.richnessId = richnessId;
    }

    @Basic
    @Column(
            name = "taste_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getTasteId() {
        return this.tasteId;
    }

    public void setTasteId(Integer tasteId) {
        this.tasteId = tasteId;
    }

    @Basic
    @Column(
            name = "odor_id",
            nullable = true,
            insertable = false,
            updatable = false
    )
    public Integer getOdorId() {
        return this.odorId;
    }

    public void setOdorId(Integer odorId) {
        this.odorId = odorId;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CatalogRecipeEntity that = (CatalogRecipeEntity)o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.code, that.code) && Objects.equals(this.description, that.description) && Objects.equals(this.instructions, that.instructions) && Objects.equals(this.cockingMethodId, that.cockingMethodId) && Objects.equals(this.cockingPotId, that.cockingPotId) && Objects.equals(this.regionalInfluenceId, that.regionalInfluenceId) && Objects.equals(this.consistencyId, that.consistencyId) && Objects.equals(this.spicinessId, that.spicinessId) && Objects.equals(this.richnessId, that.richnessId) && Objects.equals(this.tasteId, that.tasteId) && Objects.equals(this.odorId, that.odorId);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.code, this.description, this.instructions, this.cockingMethodId, this.cockingPotId, this.regionalInfluenceId, this.consistencyId, this.spicinessId, this.richnessId, this.tasteId, this.odorId});
    }

    @ManyToOne
    @JoinColumn(
            name = "cocking_method_id",
            referencedColumnName = "id"
    )
    public CatalogCookingMethodEntity getCookingMethodByCockingMethodId() {
        return this.cookingMethodByCockingMethodId;
    }

    public void setCookingMethodByCockingMethodId(CatalogCookingMethodEntity cookingMethodByCockingMethodId) {
        this.cookingMethodByCockingMethodId = cookingMethodByCockingMethodId;
    }

    @ManyToOne
    @JoinColumn(
            name = "cocking_pot_id",
            referencedColumnName = "id"
    )
    public CatalogCookingPotEntity getCookingPotByCockingPotId() {
        return this.cookingPotByCockingPotId;
    }

    public void setCookingPotByCockingPotId(CatalogCookingPotEntity cookingPotByCockingPotId) {
        this.cookingPotByCockingPotId = cookingPotByCockingPotId;
    }

    @ManyToOne
    @JoinColumn(
            name = "regional_influence_id",
            referencedColumnName = "id"
    )
    public CatalogRegionalInfluenceEntity getRegionalInfluenceByRegionalInfluenceId() {
        return this.regionalInfluenceByRegionalInfluenceId;
    }

    public void setRegionalInfluenceByRegionalInfluenceId(CatalogRegionalInfluenceEntity regionalInfluenceByRegionalInfluenceId) {
        this.regionalInfluenceByRegionalInfluenceId = regionalInfluenceByRegionalInfluenceId;
    }

    @ManyToOne
    @JoinColumn(
            name = "consistency_id",
            referencedColumnName = "id"
    )
    public CatalogRecipeConsistencyEntity getRecipeConsistencyByConsistencyId() {
        return this.recipeConsistencyByConsistencyId;
    }

    public void setRecipeConsistencyByConsistencyId(CatalogRecipeConsistencyEntity recipeConsistencyByConsistencyId) {
        this.recipeConsistencyByConsistencyId = recipeConsistencyByConsistencyId;
    }

    @ManyToOne
    @JoinColumn(
            name = "spiciness_id",
            referencedColumnName = "id"
    )
    public CatalogRecipeSpicinessEntity getRecipeSpicinessBySpicinessId() {
        return this.recipeSpicinessBySpicinessId;
    }

    public void setRecipeSpicinessBySpicinessId(CatalogRecipeSpicinessEntity recipeSpicinessBySpicinessId) {
        this.recipeSpicinessBySpicinessId = recipeSpicinessBySpicinessId;
    }

    @ManyToOne
    @JoinColumn(
            name = "richness_id",
            referencedColumnName = "id"
    )
    public CatalogRecipeRichnessEntity getRecipeRichnessByRichnessId() {
        return this.recipeRichnessByRichnessId;
    }

    public void setRecipeRichnessByRichnessId(CatalogRecipeRichnessEntity recipeRichnessByRichnessId) {
        this.recipeRichnessByRichnessId = recipeRichnessByRichnessId;
    }

    @ManyToOne
    @JoinColumn(
            name = "taste_id",
            referencedColumnName = "id"
    )
    public CatalogRecipeTasteEntity getRecipeTasteByTasteId() {
        return this.recipeTasteByTasteId;
    }

    public void setRecipeTasteByTasteId(CatalogRecipeTasteEntity recipeTasteByTasteId) {
        this.recipeTasteByTasteId = recipeTasteByTasteId;
    }

    @ManyToOne
    @JoinColumn(
            name = "odor_id",
            referencedColumnName = "id"
    )
    public CatalogRecipeOdorEntity getRecipeOdorByOdorId() {
        return this.recipeOdorByOdorId;
    }

    public void setRecipeOdorByOdorId(CatalogRecipeOdorEntity recipeOdorByOdorId) {
        this.recipeOdorByOdorId = recipeOdorByOdorId;
    }

    @OneToMany(
            mappedBy = "recipeByRecipeId"
    )
    public Collection<CatalogRecipeIngredientEntity> getRecipeIngredientsById() {
        return this.recipeIngredientsById;
    }

    public void setRecipeIngredientsById(Collection<CatalogRecipeIngredientEntity> recipeIngredientsById) {
        this.recipeIngredientsById = recipeIngredientsById;
    }
}
