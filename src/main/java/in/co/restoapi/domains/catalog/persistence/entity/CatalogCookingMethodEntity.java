package in.co.restoapi.domains.catalog.persistence.entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@Table(name = "cooking_method", schema = "catalog", catalog = "resto_db")
public class CatalogCookingMethodEntity {
    private Long id;
    private String name;
    private String code;
    private String description;
    private String additionalInfo;
//    private Collection<CatalogRecipeEntity> recipesById;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "code", nullable = false, length = 10)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "description", nullable = false, length = 100)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "additional_info", nullable = false, length = 200)
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


//    @OneToMany(mappedBy = "cookingMethodByCockingMethodId")
//    public Collection<CatalogRecipeEntity> getRecipesById() {
//        return this.recipesById;
//    }
//
//    public void setRecipesById(Collection<CatalogRecipeEntity> recipesById) {
//        this.recipesById = recipesById;
//    }
}
