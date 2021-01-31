package in.co.restoapi.domains.catalog.controllers;

import in.co.restoapi.domains.catalog.representationmodel.CatalogRepresentationModel;
import in.co.restoapi.domains.catalog.representationmodel.MenuItemRepresentationModel;
import in.co.restoapi.domains.catalog.services.ICatalogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping({"/api/v1/catalog"})
@Transactional
public class CatalogController {
    private final Logger log = LoggerFactory.getLogger(CatalogController.class);
    private final ICatalogService catalogService;

    @Autowired
    public CatalogController(ICatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping
    public ResponseEntity<CollectionModel<CatalogRepresentationModel>> getCatalog() {
        return ResponseEntity.ok().body(this.catalogService.findAll());
    }

    @GetMapping(path = "/characters/page")
    Page<CatalogRepresentationModel> getPaginatedCatalog(Pageable pageable) {
        return catalogService.getPaginatedCatalog(pageable);
    }

    @GetMapping({"/{code}"})
    public ResponseEntity<MenuItemRepresentationModel> getCatalogByCode(
            @PathVariable("code") String code) {
        return ResponseEntity.ok().body(this.catalogService.findByCode(code));
    }


}