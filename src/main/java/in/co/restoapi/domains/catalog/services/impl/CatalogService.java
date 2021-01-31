//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.services.impl;

import in.co.restoapi.domains.catalog.modelassemblers.CatalogModelAssembler;
import in.co.restoapi.domains.catalog.modelassemblers.MenuItemModelAssembler;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogMenuItemEntity;
import in.co.restoapi.domains.catalog.persistence.repositories.MenuItemRepository;
import in.co.restoapi.domains.catalog.representationmodel.CatalogRepresentationModel;
import in.co.restoapi.domains.catalog.representationmodel.MenuItemRepresentationModel;
import in.co.restoapi.domains.catalog.services.ICatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CatalogService implements ICatalogService {

    private final Logger log = LoggerFactory.getLogger(CatalogService.class);
    private final MenuItemRepository menuItemRepository;
    private final CatalogModelAssembler catalogModelAssembler;
    private final MenuItemModelAssembler menuItemRepositoryAssembler;

    @Autowired
    public CatalogService(MenuItemRepository menuItemRepository, CatalogModelAssembler catalogModelAssembler, MenuItemModelAssembler menuItemRepositoryAssembler) {
        this.menuItemRepository = menuItemRepository;
        this.catalogModelAssembler = catalogModelAssembler;
        this.menuItemRepositoryAssembler = menuItemRepositoryAssembler;
    }

    public Page<CatalogMenuItemEntity> findPaginated(Pageable pageable) {
        return null;
    }

    public CollectionModel<CatalogRepresentationModel> findAll() {
        return this.catalogModelAssembler.toCollectionModel(this.menuItemRepository.findAll());
    }

    public MenuItemRepresentationModel findByCode(String code) {
        return menuItemRepository
                .findByCode(code)
                .map(a -> menuItemRepositoryAssembler.toModel(a))
                .orElse(null);
    }

    @Override
    public Page<CatalogRepresentationModel> getPaginatedCatalog(Pageable pageable) {
        return null;
    }
}
