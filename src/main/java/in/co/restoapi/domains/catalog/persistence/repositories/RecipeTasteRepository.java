//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.persistence.repositories;

import in.co.restoapi.domains.catalog.persistence.entity.CatalogRecipeTasteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeTasteRepository extends JpaRepository<CatalogRecipeTasteEntity, Long> {
}
