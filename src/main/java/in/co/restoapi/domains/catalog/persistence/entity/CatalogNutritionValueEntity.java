//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.persistence.entity;

import java.math.BigDecimal;
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
        name = "nutrition_value",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogNutritionValueEntity {
    private Long id;
    private Integer ingredientOptionId;
    private Integer measurementUnitId;
    private Integer measurementAmount;
    private BigDecimal carbPercent;
    private BigDecimal fatPercent;
    private BigDecimal proteinPercent;
    private BigDecimal estimatedGlycemicLoad;
    private BigDecimal aminoAcidScore;
    private BigDecimal calorieKj;
    private BigDecimal totalCarbsMg;
    private BigDecimal fiberMg;
    private BigDecimal netCarbsMg;
    private BigDecimal sugarMg;
    private BigDecimal proteinMg;
    private BigDecimal fatMg;
    private BigDecimal starchMg;
    private BigDecimal omega3FattyAcidsMg;
    private String vitaminInfo;
    private String mineralInfo;
    private String medicinalProperty;
    private String dominatingDosh;
    private String additionalInfo;
    private CatalogMeasurementUnitEntity measurementUnitByMeasurementUnitId;
    private Collection<CatalogIngredientOptionEntity> ingredientOptionsById;

    public CatalogNutritionValueEntity() {
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
            nullable = false
    )
    public Integer getMeasurementAmount() {
        return this.measurementAmount;
    }

    public void setMeasurementAmount(Integer measurementAmount) {
        this.measurementAmount = measurementAmount;
    }

    @Basic
    @Column(
            name = "carb_percent",
            nullable = true,
            precision = 0
    )
    public BigDecimal getCarbPercent() {
        return this.carbPercent;
    }

    public void setCarbPercent(BigDecimal carbPercent) {
        this.carbPercent = carbPercent;
    }

    @Basic
    @Column(
            name = "fat_percent",
            nullable = true,
            precision = 0
    )
    public BigDecimal getFatPercent() {
        return this.fatPercent;
    }

    public void setFatPercent(BigDecimal fatPercent) {
        this.fatPercent = fatPercent;
    }

    @Basic
    @Column(
            name = "protein_percent",
            nullable = true,
            precision = 0
    )
    public BigDecimal getProteinPercent() {
        return this.proteinPercent;
    }

    public void setProteinPercent(BigDecimal proteinPercent) {
        this.proteinPercent = proteinPercent;
    }

    @Basic
    @Column(
            name = "estimated_glycemic_load",
            nullable = true,
            precision = 0
    )
    public BigDecimal getEstimatedGlycemicLoad() {
        return this.estimatedGlycemicLoad;
    }

    public void setEstimatedGlycemicLoad(BigDecimal estimatedGlycemicLoad) {
        this.estimatedGlycemicLoad = estimatedGlycemicLoad;
    }

    @Basic
    @Column(
            name = "amino_acid_score",
            nullable = true,
            precision = 0
    )
    public BigDecimal getAminoAcidScore() {
        return this.aminoAcidScore;
    }

    public void setAminoAcidScore(BigDecimal aminoAcidScore) {
        this.aminoAcidScore = aminoAcidScore;
    }

    @Basic
    @Column(
            name = "calorie_kj",
            nullable = true,
            precision = 0
    )
    public BigDecimal getCalorieKj() {
        return this.calorieKj;
    }

    public void setCalorieKj(BigDecimal calorieKj) {
        this.calorieKj = calorieKj;
    }

    @Basic
    @Column(
            name = "total_carbs_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getTotalCarbsMg() {
        return this.totalCarbsMg;
    }

    public void setTotalCarbsMg(BigDecimal totalCarbsMg) {
        this.totalCarbsMg = totalCarbsMg;
    }

    @Basic
    @Column(
            name = "fiber_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getFiberMg() {
        return this.fiberMg;
    }

    public void setFiberMg(BigDecimal fiberMg) {
        this.fiberMg = fiberMg;
    }

    @Basic
    @Column(
            name = "net_carbs_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getNetCarbsMg() {
        return this.netCarbsMg;
    }

    public void setNetCarbsMg(BigDecimal netCarbsMg) {
        this.netCarbsMg = netCarbsMg;
    }

    @Basic
    @Column(
            name = "sugar_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getSugarMg() {
        return this.sugarMg;
    }

    public void setSugarMg(BigDecimal sugarMg) {
        this.sugarMg = sugarMg;
    }

    @Basic
    @Column(
            name = "protein_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getProteinMg() {
        return this.proteinMg;
    }

    public void setProteinMg(BigDecimal proteinMg) {
        this.proteinMg = proteinMg;
    }

    @Basic
    @Column(
            name = "fat_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getFatMg() {
        return this.fatMg;
    }

    public void setFatMg(BigDecimal fatMg) {
        this.fatMg = fatMg;
    }

    @Basic
    @Column(
            name = "starch_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getStarchMg() {
        return this.starchMg;
    }

    public void setStarchMg(BigDecimal starchMg) {
        this.starchMg = starchMg;
    }

    @Basic
    @Column(
            name = "omega_3_fatty_acids_mg",
            nullable = true,
            precision = 0
    )
    public BigDecimal getOmega3FattyAcidsMg() {
        return this.omega3FattyAcidsMg;
    }

    public void setOmega3FattyAcidsMg(BigDecimal omega3FattyAcidsMg) {
        this.omega3FattyAcidsMg = omega3FattyAcidsMg;
    }

    @Basic
    @Column(
            name = "vitamin_info",
            nullable = true,
            length = 500
    )
    public String getVitaminInfo() {
        return this.vitaminInfo;
    }

    public void setVitaminInfo(String vitaminInfo) {
        this.vitaminInfo = vitaminInfo;
    }

    @Basic
    @Column(
            name = "mineral_info",
            nullable = true,
            length = 500
    )
    public String getMineralInfo() {
        return this.mineralInfo;
    }

    public void setMineralInfo(String mineralInfo) {
        this.mineralInfo = mineralInfo;
    }

    @Basic
    @Column(
            name = "medicinal_property",
            nullable = true,
            length = 200
    )
    public String getMedicinalProperty() {
        return this.medicinalProperty;
    }

    public void setMedicinalProperty(String medicinalProperty) {
        this.medicinalProperty = medicinalProperty;
    }

    @Basic
    @Column(
            name = "dominating_dosh",
            nullable = true,
            length = 200
    )
    public String getDominatingDosh() {
        return this.dominatingDosh;
    }

    public void setDominatingDosh(String dominatingDosh) {
        this.dominatingDosh = dominatingDosh;
    }

    @Basic
    @Column(
            name = "additional_info",
            nullable = false,
            length = 200
    )
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            CatalogNutritionValueEntity that = (CatalogNutritionValueEntity)o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.ingredientOptionId, that.ingredientOptionId) && Objects.equals(this.measurementUnitId, that.measurementUnitId) && Objects.equals(this.measurementAmount, that.measurementAmount) && Objects.equals(this.carbPercent, that.carbPercent) && Objects.equals(this.fatPercent, that.fatPercent) && Objects.equals(this.proteinPercent, that.proteinPercent) && Objects.equals(this.estimatedGlycemicLoad, that.estimatedGlycemicLoad) && Objects.equals(this.aminoAcidScore, that.aminoAcidScore) && Objects.equals(this.calorieKj, that.calorieKj) && Objects.equals(this.totalCarbsMg, that.totalCarbsMg) && Objects.equals(this.fiberMg, that.fiberMg) && Objects.equals(this.netCarbsMg, that.netCarbsMg) && Objects.equals(this.sugarMg, that.sugarMg) && Objects.equals(this.proteinMg, that.proteinMg) && Objects.equals(this.fatMg, that.fatMg) && Objects.equals(this.starchMg, that.starchMg) && Objects.equals(this.omega3FattyAcidsMg, that.omega3FattyAcidsMg) && Objects.equals(this.vitaminInfo, that.vitaminInfo) && Objects.equals(this.mineralInfo, that.mineralInfo) && Objects.equals(this.medicinalProperty, that.medicinalProperty) && Objects.equals(this.dominatingDosh, that.dominatingDosh) && Objects.equals(this.additionalInfo, that.additionalInfo);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.ingredientOptionId, this.measurementUnitId, this.measurementAmount, this.carbPercent, this.fatPercent, this.proteinPercent, this.estimatedGlycemicLoad, this.aminoAcidScore, this.calorieKj, this.totalCarbsMg, this.fiberMg, this.netCarbsMg, this.sugarMg, this.proteinMg, this.fatMg, this.starchMg, this.omega3FattyAcidsMg, this.vitaminInfo, this.mineralInfo, this.medicinalProperty, this.dominatingDosh, this.additionalInfo});
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

    @OneToMany(
            mappedBy = "nutritionValueByNutritionValueId"
    )
    public Collection<CatalogIngredientOptionEntity> getIngredientOptionsById() {
        return this.ingredientOptionsById;
    }

    public void setIngredientOptionsById(Collection<CatalogIngredientOptionEntity> ingredientOptionsById) {
        this.ingredientOptionsById = ingredientOptionsById;
    }
}
