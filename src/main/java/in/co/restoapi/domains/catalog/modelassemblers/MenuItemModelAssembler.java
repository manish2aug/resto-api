package in.co.restoapi.domains.catalog.modelassemblers;

import in.co.restoapi.domains.catalog.controllers.CatalogController;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogIngredientOptionEntity;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogMenuItemEntity;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogRecipeEntity;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogRecipeIngredientEntity;
import in.co.restoapi.domains.catalog.representationmodel.IngredientRepresentationModel;
import in.co.restoapi.domains.catalog.representationmodel.MenuItemRepresentationModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class MenuItemModelAssembler extends RepresentationModelAssemblerSupport<CatalogMenuItemEntity, MenuItemRepresentationModel> {
    public MenuItemModelAssembler() {
        super(CatalogController.class, MenuItemRepresentationModel.class);
    }

    public MenuItemRepresentationModel toModel(CatalogMenuItemEntity entity) {
        MenuItemRepresentationModel model = (MenuItemRepresentationModel) this.instantiateModel(entity);
        model.add(WebMvcLinkBuilder.linkTo(((CatalogController) WebMvcLinkBuilder.methodOn(CatalogController.class, new Object[0])).getCatalogByCode(entity.getCode())).withSelfRel());
        this.copyProperties(entity, model);
        return model;
    }

    private void copyProperties(CatalogMenuItemEntity entity, MenuItemRepresentationModel model) {
        model.setName(entity.getName());
        model.setCode(entity.getCode());
        model.setQuantity(String.join(" ", Integer.toUnsignedString(entity.getMeasurementAmount()), entity.getMeasurementUnitByMeasurementUnitId().getName()));
        model.setDescription(entity.getDescription());
        CatalogRecipeEntity catalogRecipeEntity = entity.getRecipeByRecipeId();
        model.setConsistency(catalogRecipeEntity.getRecipeConsistencyByConsistencyId().getDescription());
        model.setCooking_method(catalogRecipeEntity.getCookingMethodByCockingMethodId().getDescription());
        model.setCooking_pot(catalogRecipeEntity.getCookingPotByCockingPotId().getDescription());
        Collection<CatalogRecipeIngredientEntity> recipeIngredientsById = catalogRecipeEntity.getRecipeIngredientsById();
        System.out.println("recipe join size: " + recipeIngredientsById.size());
        model.setIngredients(this.getIngredients(recipeIngredientsById));
    }

    private List<IngredientRepresentationModel> getIngredients(Collection<CatalogRecipeIngredientEntity> recipeIngredientsById) {
        List<IngredientRepresentationModel> ingredientRepresentationModels = new ArrayList();

        recipeIngredientsById
                .stream()
                .map(CatalogRecipeIngredientEntity::getIngredientByIngredientId)
                .filter(CatalogIngredientOptionEntity::getDefault)
                .forEach(b -> ingredientRepresentationModels.add(new IngredientRepresentationModel(b)));
        return ingredientRepresentationModels;
    }
}
