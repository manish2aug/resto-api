//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.representationmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@JsonRootName("actor")
@Relation(
        collectionRelation = "actors"
)
@JsonInclude(Include.NON_NULL)
public class CatalogRepresentationModel extends RepresentationModel<CatalogRepresentationModel> {
    String name;
    String code;
    String quantity;
    String price;
    boolean isServedAlone;
    boolean isAvailable;
    boolean isComplementary;
    List<String> tags;

    public static CatalogRepresentationModel.CatalogRepresentationModelBuilder builder() {
        return new CatalogRepresentationModel.CatalogRepresentationModelBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getQuantity() {
        return this.quantity;
    }

    public String getPrice() {
        return this.price;
    }

    public boolean isServedAlone() {
        return this.isServedAlone;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public boolean isComplementary() {
        return this.isComplementary;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setQuantity(final String quantity) {
        this.quantity = quantity;
    }

    public void setPrice(final String price) {
        this.price = price;
    }

    public void setServedAlone(final boolean isServedAlone) {
        this.isServedAlone = isServedAlone;
    }

    public void setAvailable(final boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setComplementary(final boolean isComplementary) {
        this.isComplementary = isComplementary;
    }

    public void setTags(final List<String> tags) {
        this.tags = tags;
    }

    public String toString() {
        String var10000 = this.getName();
        return "CatalogRepresentationModel(name=" + var10000 + ", code=" + this.getCode() + ", quantity=" + this.getQuantity() + ", price=" + this.getPrice() + ", isServedAlone=" + this.isServedAlone() + ", isAvailable=" + this.isAvailable() + ", isComplementary=" + this.isComplementary() + ", tags=" + this.getTags() + ")";
    }

    public CatalogRepresentationModel() {
    }

    public CatalogRepresentationModel(final String name, final String code, final String quantity, final String price, final boolean isServedAlone, final boolean isAvailable, final boolean isComplementary, final List<String> tags) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        this.isServedAlone = isServedAlone;
        this.isAvailable = isAvailable;
        this.isComplementary = isComplementary;
        this.tags = tags;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CatalogRepresentationModel)) {
            return false;
        } else {
            CatalogRepresentationModel other = (CatalogRepresentationModel)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
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

                Object this$quantity = this.getQuantity();
                Object other$quantity = other.getQuantity();
                if (this$quantity == null) {
                    if (other$quantity != null) {
                        return false;
                    }
                } else if (!this$quantity.equals(other$quantity)) {
                    return false;
                }

                label62: {
                    Object this$price = this.getPrice();
                    Object other$price = other.getPrice();
                    if (this$price == null) {
                        if (other$price == null) {
                            break label62;
                        }
                    } else if (this$price.equals(other$price)) {
                        break label62;
                    }

                    return false;
                }

                if (this.isServedAlone() != other.isServedAlone()) {
                    return false;
                } else if (this.isAvailable() != other.isAvailable()) {
                    return false;
                } else if (this.isComplementary() != other.isComplementary()) {
                    return false;
                } else {
                    Object this$tags = this.getTags();
                    Object other$tags = other.getTags();
                    if (this$tags == null) {
                        if (other$tags != null) {
                            return false;
                        }
                    } else if (!this$tags.equals(other$tags)) {
                        return false;
                    }

                    return true;
                }
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CatalogRepresentationModel;
    }

    public static class CatalogRepresentationModelBuilder {
        private String name;
        private String code;
        private String quantity;
        private String price;
        private boolean isServedAlone;
        private boolean isAvailable;
        private boolean isComplementary;
        private List<String> tags;

        CatalogRepresentationModelBuilder() {
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder code(final String code) {
            this.code = code;
            return this;
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder quantity(final String quantity) {
            this.quantity = quantity;
            return this;
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder price(final String price) {
            this.price = price;
            return this;
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder isServedAlone(final boolean isServedAlone) {
            this.isServedAlone = isServedAlone;
            return this;
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder isAvailable(final boolean isAvailable) {
            this.isAvailable = isAvailable;
            return this;
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder isComplementary(final boolean isComplementary) {
            this.isComplementary = isComplementary;
            return this;
        }

        public CatalogRepresentationModel.CatalogRepresentationModelBuilder tags(final List<String> tags) {
            this.tags = tags;
            return this;
        }

        public CatalogRepresentationModel build() {
            return new CatalogRepresentationModel(this.name, this.code, this.quantity, this.price, this.isServedAlone, this.isAvailable, this.isComplementary, this.tags);
        }

        public String toString() {
            return "CatalogRepresentationModel.CatalogRepresentationModelBuilder(name=" + this.name + ", code=" + this.code + ", quantity=" + this.quantity + ", price=" + this.price + ", isServedAlone=" + this.isServedAlone + ", isAvailable=" + this.isAvailable + ", isComplementary=" + this.isComplementary + ", tags=" + this.tags + ")";
        }
    }
}
