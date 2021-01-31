//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.representationmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogInnatePotencyEntity;
import java.util.Objects;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@JsonRootName("actor")
@Relation(
        collectionRelation = "actors"
)
@JsonInclude(Include.NON_NULL)
public class InnatePotencyRepresentationModel extends RepresentationModel<InnatePotencyRepresentationModel> {
    String name;
    String code;
    String description;
    String additional_info;

    public InnatePotencyRepresentationModel(CatalogInnatePotencyEntity entity) {
        if (Objects.nonNull(entity)) {
            this.name = entity.getName();
            this.code = entity.getCode();
            this.description = entity.getDescription();
            this.additional_info = entity.getAdditionalInfo();
        }

    }

    public static InnatePotencyRepresentationModel.InnatePotencyRepresentationModelBuilder builder() {
        return new InnatePotencyRepresentationModel.InnatePotencyRepresentationModelBuilder();
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

    public String getAdditional_info() {
        return this.additional_info;
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

    public void setAdditional_info(final String additional_info) {
        this.additional_info = additional_info;
    }

    public String toString() {
        String var10000 = this.getName();
        return "InnatePotencyRepresentationModel(name=" + var10000 + ", code=" + this.getCode() + ", description=" + this.getDescription() + ", additional_info=" + this.getAdditional_info() + ")";
    }

    public InnatePotencyRepresentationModel() {
    }

    public InnatePotencyRepresentationModel(final String name, final String code, final String description, final String additional_info) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.additional_info = additional_info;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof InnatePotencyRepresentationModel)) {
            return false;
        } else {
            InnatePotencyRepresentationModel other = (InnatePotencyRepresentationModel)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label59: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label59;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label59;
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

                Object this$additional_info = this.getAdditional_info();
                Object other$additional_info = other.getAdditional_info();
                if (this$additional_info == null) {
                    if (other$additional_info != null) {
                        return false;
                    }
                } else if (!this$additional_info.equals(other$additional_info)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof InnatePotencyRepresentationModel;
    }

    public static class InnatePotencyRepresentationModelBuilder {
        private String name;
        private String code;
        private String description;
        private String additional_info;

        InnatePotencyRepresentationModelBuilder() {
        }

        public InnatePotencyRepresentationModel.InnatePotencyRepresentationModelBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public InnatePotencyRepresentationModel.InnatePotencyRepresentationModelBuilder code(final String code) {
            this.code = code;
            return this;
        }

        public InnatePotencyRepresentationModel.InnatePotencyRepresentationModelBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public InnatePotencyRepresentationModel.InnatePotencyRepresentationModelBuilder additional_info(final String additional_info) {
            this.additional_info = additional_info;
            return this;
        }

        public InnatePotencyRepresentationModel build() {
            return new InnatePotencyRepresentationModel(this.name, this.code, this.description, this.additional_info);
        }

        public String toString() {
            return "InnatePotencyRepresentationModel.InnatePotencyRepresentationModelBuilder(name=" + this.name + ", code=" + this.code + ", description=" + this.description + ", additional_info=" + this.additional_info + ")";
        }
    }
}
