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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(
        name = "recipe_spiciness",
        schema = "catalog",
        catalog = "resto_db"
)
public class CatalogRecipeSpicinessEntity {
    private Long id;
    private String name;
    private String code;
    private String description;
    private String additionalInfo;
    private Collection<CatalogRecipeEntity> recipesById;

    public CatalogRecipeSpicinessEntity() {
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
            length = 10
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
            CatalogRecipeSpicinessEntity that = (CatalogRecipeSpicinessEntity)o;
            return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name) && Objects.equals(this.code, that.code) && Objects.equals(this.description, that.description) && Objects.equals(this.additionalInfo, that.additionalInfo);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, this.name, this.code, this.description, this.additionalInfo});
    }

    @OneToMany(
            mappedBy = "recipeSpicinessBySpicinessId"
    )
    public Collection<CatalogRecipeEntity> getRecipesById() {
        return this.recipesById;
    }

    public void setRecipesById(Collection<CatalogRecipeEntity> recipesById) {
        this.recipesById = recipesById;
    }
}
