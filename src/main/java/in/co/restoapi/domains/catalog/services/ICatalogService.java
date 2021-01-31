//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.services;

import in.co.restoapi.domains.catalog.persistence.entity.CatalogMenuItemEntity;
import in.co.restoapi.domains.catalog.representationmodel.CatalogRepresentationModel;
import in.co.restoapi.domains.catalog.representationmodel.MenuItemRepresentationModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.CollectionModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface ICatalogService {
    Page<CatalogMenuItemEntity> findPaginated(Pageable pageable);

    CollectionModel<CatalogRepresentationModel> findAll();

    MenuItemRepresentationModel findByCode(String code);
}
