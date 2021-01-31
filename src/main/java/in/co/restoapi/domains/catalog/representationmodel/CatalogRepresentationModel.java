//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.representationmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@JsonRootName("catalogs")
@Relation(
        collectionRelation = "catalog"
)
@JsonInclude(Include.NON_NULL)
@Data
public class CatalogRepresentationModel extends RepresentationModel<CatalogRepresentationModel> {
    String description;
    String code;
    String quantity;
    String price;
    boolean isServedAlone;
    boolean isAvailable;
    boolean isComplementary;
    List<String> tags;
    List<String> pictureUrls;
}
