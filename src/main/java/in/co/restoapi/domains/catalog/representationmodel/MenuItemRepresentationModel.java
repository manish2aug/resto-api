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
public class MenuItemRepresentationModel extends RepresentationModel<MenuItemRepresentationModel> {
    String name;
    String code;
    String quantity;
    String price;
    String description;
    String cooking_method;
    String cooking_pot;
    String regional_influence;
    String consistency;
    String spiciness;
    String richness;
    String taste;
    String odor;
    List<IngredientRepresentationModel> ingredients;

    public static MenuItemRepresentationModel.MenuItemRepresentationModelBuilder builder() {
        return new MenuItemRepresentationModel.MenuItemRepresentationModelBuilder();
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

    public String getDescription() {
        return this.description;
    }

    public String getCooking_method() {
        return this.cooking_method;
    }

    public String getCooking_pot() {
        return this.cooking_pot;
    }

    public String getRegional_influence() {
        return this.regional_influence;
    }

    public String getConsistency() {
        return this.consistency;
    }

    public String getSpiciness() {
        return this.spiciness;
    }

    public String getRichness() {
        return this.richness;
    }

    public String getTaste() {
        return this.taste;
    }

    public String getOdor() {
        return this.odor;
    }

    public List<IngredientRepresentationModel> getIngredients() {
        return this.ingredients;
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

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setCooking_method(final String cooking_method) {
        this.cooking_method = cooking_method;
    }

    public void setCooking_pot(final String cooking_pot) {
        this.cooking_pot = cooking_pot;
    }

    public void setRegional_influence(final String regional_influence) {
        this.regional_influence = regional_influence;
    }

    public void setConsistency(final String consistency) {
        this.consistency = consistency;
    }

    public void setSpiciness(final String spiciness) {
        this.spiciness = spiciness;
    }

    public void setRichness(final String richness) {
        this.richness = richness;
    }

    public void setTaste(final String taste) {
        this.taste = taste;
    }

    public void setOdor(final String odor) {
        this.odor = odor;
    }

    public void setIngredients(final List<IngredientRepresentationModel> ingredients) {
        this.ingredients = ingredients;
    }

    public String toString() {
        String var10000 = this.getName();
        return "MenuItemRepresentationModel(name=" + var10000 + ", code=" + this.getCode() + ", quantity=" + this.getQuantity() + ", price=" + this.getPrice() + ", description=" + this.getDescription() + ", cooking_method=" + this.getCooking_method() + ", cooking_pot=" + this.getCooking_pot() + ", regional_influence=" + this.getRegional_influence() + ", consistency=" + this.getConsistency() + ", spiciness=" + this.getSpiciness() + ", richness=" + this.getRichness() + ", taste=" + this.getTaste() + ", odor=" + this.getOdor() + ", ingredients=" + this.getIngredients() + ")";
    }

    public MenuItemRepresentationModel() {
    }

    public MenuItemRepresentationModel(final String name, final String code, final String quantity, final String price, final String description, final String cooking_method, final String cooking_pot, final String regional_influence, final String consistency, final String spiciness, final String richness, final String taste, final String odor, final List<IngredientRepresentationModel> ingredients) {
        this.name = name;
        this.code = code;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.cooking_method = cooking_method;
        this.cooking_pot = cooking_pot;
        this.regional_influence = regional_influence;
        this.consistency = consistency;
        this.spiciness = spiciness;
        this.richness = richness;
        this.taste = taste;
        this.odor = odor;
        this.ingredients = ingredients;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof MenuItemRepresentationModel)) {
            return false;
        } else {
            MenuItemRepresentationModel other = (MenuItemRepresentationModel)o;
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

                label158: {
                    Object this$price = this.getPrice();
                    Object other$price = other.getPrice();
                    if (this$price == null) {
                        if (other$price == null) {
                            break label158;
                        }
                    } else if (this$price.equals(other$price)) {
                        break label158;
                    }

                    return false;
                }

                label151: {
                    Object this$description = this.getDescription();
                    Object other$description = other.getDescription();
                    if (this$description == null) {
                        if (other$description == null) {
                            break label151;
                        }
                    } else if (this$description.equals(other$description)) {
                        break label151;
                    }

                    return false;
                }

                Object this$cooking_method = this.getCooking_method();
                Object other$cooking_method = other.getCooking_method();
                if (this$cooking_method == null) {
                    if (other$cooking_method != null) {
                        return false;
                    }
                } else if (!this$cooking_method.equals(other$cooking_method)) {
                    return false;
                }

                label137: {
                    Object this$cooking_pot = this.getCooking_pot();
                    Object other$cooking_pot = other.getCooking_pot();
                    if (this$cooking_pot == null) {
                        if (other$cooking_pot == null) {
                            break label137;
                        }
                    } else if (this$cooking_pot.equals(other$cooking_pot)) {
                        break label137;
                    }

                    return false;
                }

                label130: {
                    Object this$regional_influence = this.getRegional_influence();
                    Object other$regional_influence = other.getRegional_influence();
                    if (this$regional_influence == null) {
                        if (other$regional_influence == null) {
                            break label130;
                        }
                    } else if (this$regional_influence.equals(other$regional_influence)) {
                        break label130;
                    }

                    return false;
                }

                Object this$consistency = this.getConsistency();
                Object other$consistency = other.getConsistency();
                if (this$consistency == null) {
                    if (other$consistency != null) {
                        return false;
                    }
                } else if (!this$consistency.equals(other$consistency)) {
                    return false;
                }

                Object this$spiciness = this.getSpiciness();
                Object other$spiciness = other.getSpiciness();
                if (this$spiciness == null) {
                    if (other$spiciness != null) {
                        return false;
                    }
                } else if (!this$spiciness.equals(other$spiciness)) {
                    return false;
                }

                label109: {
                    Object this$richness = this.getRichness();
                    Object other$richness = other.getRichness();
                    if (this$richness == null) {
                        if (other$richness == null) {
                            break label109;
                        }
                    } else if (this$richness.equals(other$richness)) {
                        break label109;
                    }

                    return false;
                }

                label102: {
                    Object this$taste = this.getTaste();
                    Object other$taste = other.getTaste();
                    if (this$taste == null) {
                        if (other$taste == null) {
                            break label102;
                        }
                    } else if (this$taste.equals(other$taste)) {
                        break label102;
                    }

                    return false;
                }

                Object this$odor = this.getOdor();
                Object other$odor = other.getOdor();
                if (this$odor == null) {
                    if (other$odor != null) {
                        return false;
                    }
                } else if (!this$odor.equals(other$odor)) {
                    return false;
                }

                Object this$ingredients = this.getIngredients();
                Object other$ingredients = other.getIngredients();
                if (this$ingredients == null) {
                    if (other$ingredients != null) {
                        return false;
                    }
                } else if (!this$ingredients.equals(other$ingredients)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MenuItemRepresentationModel;
    }

    public static class MenuItemRepresentationModelBuilder {
        private String name;
        private String code;
        private String quantity;
        private String price;
        private String description;
        private String cooking_method;
        private String cooking_pot;
        private String regional_influence;
        private String consistency;
        private String spiciness;
        private String richness;
        private String taste;
        private String odor;
        private List<IngredientRepresentationModel> ingredients;

        MenuItemRepresentationModelBuilder() {
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder code(final String code) {
            this.code = code;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder quantity(final String quantity) {
            this.quantity = quantity;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder price(final String price) {
            this.price = price;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder description(final String description) {
            this.description = description;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder cooking_method(final String cooking_method) {
            this.cooking_method = cooking_method;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder cooking_pot(final String cooking_pot) {
            this.cooking_pot = cooking_pot;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder regional_influence(final String regional_influence) {
            this.regional_influence = regional_influence;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder consistency(final String consistency) {
            this.consistency = consistency;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder spiciness(final String spiciness) {
            this.spiciness = spiciness;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder richness(final String richness) {
            this.richness = richness;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder taste(final String taste) {
            this.taste = taste;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder odor(final String odor) {
            this.odor = odor;
            return this;
        }

        public MenuItemRepresentationModel.MenuItemRepresentationModelBuilder ingredients(final List<IngredientRepresentationModel> ingredients) {
            this.ingredients = ingredients;
            return this;
        }

        public MenuItemRepresentationModel build() {
            return new MenuItemRepresentationModel(this.name, this.code, this.quantity, this.price, this.description, this.cooking_method, this.cooking_pot, this.regional_influence, this.consistency, this.spiciness, this.richness, this.taste, this.odor, this.ingredients);
        }

        public String toString() {
            return "MenuItemRepresentationModel.MenuItemRepresentationModelBuilder(name=" + this.name + ", code=" + this.code + ", quantity=" + this.quantity + ", price=" + this.price + ", description=" + this.description + ", cooking_method=" + this.cooking_method + ", cooking_pot=" + this.cooking_pot + ", regional_influence=" + this.regional_influence + ", consistency=" + this.consistency + ", spiciness=" + this.spiciness + ", richness=" + this.richness + ", taste=" + this.taste + ", odor=" + this.odor + ", ingredients=" + this.ingredients + ")";
        }
    }
}
