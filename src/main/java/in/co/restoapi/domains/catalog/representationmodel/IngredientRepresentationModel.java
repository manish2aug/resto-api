//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.representationmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogIngredientOptionEntity;
import java.util.Objects;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@JsonRootName("actor")
@Relation(
        collectionRelation = "actors"
)
@JsonInclude(Include.NON_NULL)
public class IngredientRepresentationModel extends RepresentationModel<IngredientRepresentationModel> {
    String name;
    String code;
    String description;
    boolean is_allowed_in_fasting;
    boolean is_default;
    InnatePotencyRepresentationModel innate_potency;
    NutritionValueRepresentationModel nutrition_value;

    public IngredientRepresentationModel(CatalogIngredientOptionEntity entity) {
        if (Objects.nonNull(entity)) {
            this.name = entity.getName();
            this.code = entity.getCode();
            this.description = entity.getDescription();
            this.is_allowed_in_fasting = entity.getAllowedInFasting();
            this.innate_potency = new InnatePotencyRepresentationModel(entity.getInnatePotencyByInnatePotencyId());
            this.nutrition_value = new NutritionValueRepresentationModel(entity.getNutritionValueByNutritionValueId());
        }

    }

    public static IngredientRepresentationModel.IngredientRepresentationModelBuilder builder() {
        return new IngredientRepresentationModel.IngredientRepresentationModelBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean is_allowed_in_fasting() {
        return this.is_allowed_in_fasting;
    }

    public boolean is_default() {
        return this.is_default;
    }

    public InnatePotencyRepresentationModel getInnate_potency() {
        return this.innate_potency;
    }

    public NutritionValueRepresentationModel getNutrition_value() {
        return this.nutrition_value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void set_allowed_in_fasting(final boolean is_allowed_in_fasting) {
        this.is_allowed_in_fasting = is_allowed_in_fasting;
    }

    public void set_default(final boolean is_default) {
        this.is_default = is_default;
    }

    public void setInnate_potency(final InnatePotencyRepresentationModel innate_potency) {
        this.innate_potency = innate_potency;
    }

    public void setNutrition_value(final NutritionValueRepresentationModel nutrition_value) {
        this.nutrition_value = nutrition_value;
    }

    public String toString() {
        String var10000 = this.getName();
        return "IngredientRepresentationModel(name=" + var10000 + ", code=" + this.getCode() + ", description=" + this.getDescription() + ", is_allowed_in_fasting=" + this.is_allowed_in_fasting() + ", is_default=" + this.is_default() + ", innate_potency=" + this.getInnate_potency() + ", nutrition_value=" + this.getNutrition_value() + ")";
    }

    public IngredientRepresentationModel() {
    }

    public IngredientRepresentationModel(final String name, final String code, final String description, final boolean is_allowed_in_fasting, final boolean is_default, final InnatePotencyRepresentationModel innate_potency, final NutritionValueRepresentationModel nutrition_value) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.is_allowed_in_fasting = is_allowed_in_fasting;
        this.is_default = is_default;
        this.innate_potency = innate_potency;
        this.nutrition_value = nutrition_value;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof IngredientRepresentationModel)) {
            return false;
        } else {
            IngredientRepresentationModel other = (IngredientRepresentationModel)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label79: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label79;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label79;
                    }

                    return false;
                }

                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                Object this$description = this.getDescription();
                Object other$description = other.getDescription();
                if (this$description == null) {
                    if (other$description != null) {
                        return false;
                    }
                } else if (!this$description.equals(other$description)) {
                    return false;
                }

                if (this.is_allowed_in_fasting() != other.is_allowed_in_fasting()) {
                    return false;
                } else if (this.is_default() != other.is_default()) {
                    return false;
                } else {
                    label55: {
                        Object this$innate_potency = this.getInnate_potency();
                        Object other$innate_potency = other.getInnate_potency();
                        if (this$innate_potency == null) {
                            if (other$innate_potency == null) {
                                break label55;
                            }
                        } else if (this$innate_potency.equals(other$innate_potency)) {
                            break label55;
                        }

                        return false;
                    }

                    Object this$nutrition_value = this.getNutrition_value();
                    Object other$nutrition_value = other.getNutrition_value();
                    if (this$nutrition_value == null) {
                        if (other$nutrition_value != null) {
                            return false;
                        }
                    } else if (!this$nutrition_value.equals(other$nutrition_value)) {
                        return false;
                    }

                    return true;
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof IngredientRepresentationModel;
    }

    public static class IngredientRepresentationModelBuilder {
        private String name;
        private String code;
        private String description;
        private boolean is_allowed_in_fasting;
        private boolean is_default;
        private InnatePotencyRepresentationModel innate_potency;
        private NutritionValueRepresentationModel nutrition_value;

        IngredientRepresentationModelBuilder() {
        }

        public IngredientRepresentationModel.IngredientRepresentationModelBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public IngredientRepresentationModel.IngredientRepresentationModelBuilder code(final String code) {
            this.code = code;
            return this;
        }

        public IngredientRepresentationModel.IngredientRepresentationModelBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public IngredientRepresentationModel.IngredientRepresentationModelBuilder is_allowed_in_fasting(final boolean is_allowed_in_fasting) {
            this.is_allowed_in_fasting = is_allowed_in_fasting;
            return this;
        }

        public IngredientRepresentationModel.IngredientRepresentationModelBuilder is_default(final boolean is_default) {
            this.is_default = is_default;
            return this;
        }

        public IngredientRepresentationModel.IngredientRepresentationModelBuilder innate_potency(final InnatePotencyRepresentationModel innate_potency) {
            this.innate_potency = innate_potency;
            return this;
        }

        public IngredientRepresentationModel.IngredientRepresentationModelBuilder nutrition_value(final NutritionValueRepresentationModel nutrition_value) {
            this.nutrition_value = nutrition_value;
            return this;
        }

        public IngredientRepresentationModel build() {
            return new IngredientRepresentationModel(this.name, this.code, this.description, this.is_allowed_in_fasting, this.is_default, this.innate_potency, this.nutrition_value);
        }

        public String toString() {
            return "IngredientRepresentationModel.IngredientRepresentationModelBuilder(name=" + this.name + ", code=" + this.code + ", description=" + this.description + ", is_allowed_in_fasting=" + this.is_allowed_in_fasting + ", is_default=" + this.is_default + ", innate_potency=" + this.innate_potency + ", nutrition_value=" + this.nutrition_value + ")";
        }
    }
}
