package in.co.restoapi.domains.catalog.modelassemblers;

import in.co.restoapi.domains.catalog.controllers.CatalogController;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogMenuItemEntity;
import in.co.restoapi.domains.catalog.representationmodel.CatalogRepresentationModel;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class CatalogModelAssembler
        extends RepresentationModelAssemblerSupport<CatalogMenuItemEntity, CatalogRepresentationModel> {

    public CatalogModelAssembler() {
        super(CatalogController.class, CatalogRepresentationModel.class);
    }

    public CatalogRepresentationModel toModel(CatalogMenuItemEntity entity) {
        CatalogRepresentationModel albumModel = this.instantiateModel(entity);
        albumModel.add(
                WebMvcLinkBuilder.linkTo(
                        WebMvcLinkBuilder.methodOn(CatalogController.class, new Object[0])
                                .getCatalogByCode(entity.getCode())).withSelfRel());
        this.copyProperties(entity, albumModel);
        return albumModel;
    }

    @Override
    public CollectionModel<CatalogRepresentationModel> toCollectionModel(Iterable<? extends CatalogMenuItemEntity> entities) {
        CollectionModel<CatalogRepresentationModel> actorModels = super.toCollectionModel(entities);
        actorModels.add(
                WebMvcLinkBuilder.linkTo(
                        WebMvcLinkBuilder.methodOn(CatalogController.class)
                                .getCatalog()).withSelfRel());

        return actorModels;
    }

    private void copyProperties(CatalogMenuItemEntity entity, CatalogRepresentationModel albumModel) {
        albumModel.setAvailable(entity.getAvailable());
        albumModel.setServedAlone(entity.getServedAlone());
        albumModel.setComplementary(entity.getComplementary());
        albumModel.setPictureUrls(entity.getMenuItemPicturesById().stream().map(a -> a.getUrl()).collect(Collectors.toList()));
        albumModel.setTags(
                entity.getMenuItemItemTagsById()
                        .stream().map((a) -> a.getItemTagByItemTagId().getName()).collect(Collectors.toList()));
        albumModel.setDescription(entity.getDescription());
        albumModel.setCode(entity.getCode());
        albumModel.setQuantity(
                String.join(" ", Integer.toUnsignedString(entity.getMeasurementAmount()),
                        entity.getMeasurementUnitByMeasurementUnitId().getName()));
    }
}