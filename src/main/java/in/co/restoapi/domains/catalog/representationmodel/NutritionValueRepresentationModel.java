//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package in.co.restoapi.domains.catalog.representationmodel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import in.co.restoapi.domains.catalog.persistence.entity.CatalogNutritionValueEntity;
import java.math.BigDecimal;
import java.util.Objects;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@JsonRootName("actor")
@Relation(
		collectionRelation = "actors"
)
@JsonInclude(Include.NON_NULL)
public class NutritionValueRepresentationModel extends RepresentationModel<NutritionValueRepresentationModel> {
	String quantity;
	BigDecimal carb_percent;
	BigDecimal fat_percent;
	BigDecimal protein_percent;
	BigDecimal estimated_glycemic_load;
	BigDecimal amino_acid_score;
	BigDecimal calorie_kj;
	BigDecimal total_carbs_mg;
	BigDecimal fiber_mg;
	BigDecimal net_carbs_mg;
	BigDecimal sugar_mg;
	BigDecimal protein_mg;
	BigDecimal fat_mg;
	BigDecimal starch_mg;
	BigDecimal omega_3_fatty_acids_mg;
	String vitamin_info;
	String mineral_info;
	String medicinal_property;
	String dominating_dosh;
	String additional_info;

	public NutritionValueRepresentationModel(CatalogNutritionValueEntity entity) {
		if (Objects.nonNull(entity)) {
			this.additional_info = entity.getAdditionalInfo();
			this.quantity = String.join(" ", Integer.toUnsignedString(entity.getMeasurementAmount()), entity.getMeasurementUnitByMeasurementUnitId().getDescription());
			this.carb_percent = entity.getCarbPercent();
			this.fat_percent = entity.getFatPercent();
			this.protein_percent = entity.getProteinPercent();
			this.estimated_glycemic_load = entity.getEstimatedGlycemicLoad();
			this.amino_acid_score = entity.getAminoAcidScore();
			this.calorie_kj = entity.getCalorieKj();
			this.total_carbs_mg = entity.getTotalCarbsMg();
			this.fiber_mg = entity.getFiberMg();
			this.net_carbs_mg = entity.getNetCarbsMg();
			this.sugar_mg = entity.getSugarMg();
			this.protein_mg = entity.getProteinMg();
			this.fat_mg = entity.getFatMg();
			this.starch_mg = entity.getStarchMg();
			this.omega_3_fatty_acids_mg = entity.getOmega3FattyAcidsMg();
			this.vitamin_info = entity.getVitaminInfo();
			this.mineral_info = entity.getMineralInfo();
			this.medicinal_property = entity.getMedicinalProperty();
			this.dominating_dosh = entity.getDominatingDosh();
			this.additional_info = entity.getAdditionalInfo();
		}

	}

	public static NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder builder() {
		return new NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder();
	}

	public String getQuantity() {
		return this.quantity;
	}

	public BigDecimal getCarb_percent() {
		return this.carb_percent;
	}

	public BigDecimal getFat_percent() {
		return this.fat_percent;
	}

	public BigDecimal getProtein_percent() {
		return this.protein_percent;
	}

	public BigDecimal getEstimated_glycemic_load() {
		return this.estimated_glycemic_load;
	}

	public BigDecimal getAmino_acid_score() {
		return this.amino_acid_score;
	}

	public BigDecimal getCalorie_kj() {
		return this.calorie_kj;
	}

	public BigDecimal getTotal_carbs_mg() {
		return this.total_carbs_mg;
	}

	public BigDecimal getFiber_mg() {
		return this.fiber_mg;
	}

	public BigDecimal getNet_carbs_mg() {
		return this.net_carbs_mg;
	}

	public BigDecimal getSugar_mg() {
		return this.sugar_mg;
	}

	public BigDecimal getProtein_mg() {
		return this.protein_mg;
	}

	public BigDecimal getFat_mg() {
		return this.fat_mg;
	}

	public BigDecimal getStarch_mg() {
		return this.starch_mg;
	}

	public BigDecimal getOmega_3_fatty_acids_mg() {
		return this.omega_3_fatty_acids_mg;
	}

	public String getVitamin_info() {
		return this.vitamin_info;
	}

	public String getMineral_info() {
		return this.mineral_info;
	}

	public String getMedicinal_property() {
		return this.medicinal_property;
	}

	public String getDominating_dosh() {
		return this.dominating_dosh;
	}

	public String getAdditional_info() {
		return this.additional_info;
	}

	public void setQuantity(final String quantity) {
		this.quantity = quantity;
	}

	public void setCarb_percent(final BigDecimal carb_percent) {
		this.carb_percent = carb_percent;
	}

	public void setFat_percent(final BigDecimal fat_percent) {
		this.fat_percent = fat_percent;
	}

	public void setProtein_percent(final BigDecimal protein_percent) {
		this.protein_percent = protein_percent;
	}

	public void setEstimated_glycemic_load(final BigDecimal estimated_glycemic_load) {
		this.estimated_glycemic_load = estimated_glycemic_load;
	}

	public void setAmino_acid_score(final BigDecimal amino_acid_score) {
		this.amino_acid_score = amino_acid_score;
	}

	public void setCalorie_kj(final BigDecimal calorie_kj) {
		this.calorie_kj = calorie_kj;
	}

	public void setTotal_carbs_mg(final BigDecimal total_carbs_mg) {
		this.total_carbs_mg = total_carbs_mg;
	}

	public void setFiber_mg(final BigDecimal fiber_mg) {
		this.fiber_mg = fiber_mg;
	}

	public void setNet_carbs_mg(final BigDecimal net_carbs_mg) {
		this.net_carbs_mg = net_carbs_mg;
	}

	public void setSugar_mg(final BigDecimal sugar_mg) {
		this.sugar_mg = sugar_mg;
	}

	public void setProtein_mg(final BigDecimal protein_mg) {
		this.protein_mg = protein_mg;
	}

	public void setFat_mg(final BigDecimal fat_mg) {
		this.fat_mg = fat_mg;
	}

	public void setStarch_mg(final BigDecimal starch_mg) {
		this.starch_mg = starch_mg;
	}

	public void setOmega_3_fatty_acids_mg(final BigDecimal omega_3_fatty_acids_mg) {
		this.omega_3_fatty_acids_mg = omega_3_fatty_acids_mg;
	}

	public void setVitamin_info(final String vitamin_info) {
		this.vitamin_info = vitamin_info;
	}

	public void setMineral_info(final String mineral_info) {
		this.mineral_info = mineral_info;
	}

	public void setMedicinal_property(final String medicinal_property) {
		this.medicinal_property = medicinal_property;
	}

	public void setDominating_dosh(final String dominating_dosh) {
		this.dominating_dosh = dominating_dosh;
	}

	public void setAdditional_info(final String additional_info) {
		this.additional_info = additional_info;
	}

	public String toString() {
		String var10000 = this.getQuantity();
		return "NutritionValueRepresentationModel(quantity=" + var10000 + ", carb_percent=" + this.getCarb_percent() + ", fat_percent=" + this.getFat_percent() + ", protein_percent=" + this.getProtein_percent() + ", estimated_glycemic_load=" + this.getEstimated_glycemic_load() + ", amino_acid_score=" + this.getAmino_acid_score() + ", calorie_kj=" + this.getCalorie_kj() + ", total_carbs_mg=" + this.getTotal_carbs_mg() + ", fiber_mg=" + this.getFiber_mg() + ", net_carbs_mg=" + this.getNet_carbs_mg() + ", sugar_mg=" + this.getSugar_mg() + ", protein_mg=" + this.getProtein_mg() + ", fat_mg=" + this.getFat_mg() + ", starch_mg=" + this.getStarch_mg() + ", omega_3_fatty_acids_mg=" + this.getOmega_3_fatty_acids_mg() + ", vitamin_info=" + this.getVitamin_info() + ", mineral_info=" + this.getMineral_info() + ", medicinal_property=" + this.getMedicinal_property() + ", dominating_dosh=" + this.getDominating_dosh() + ", additional_info=" + this.getAdditional_info() + ")";
	}

	public NutritionValueRepresentationModel() {
	}

	public NutritionValueRepresentationModel(final String quantity, final BigDecimal carb_percent, final BigDecimal fat_percent, final BigDecimal protein_percent, final BigDecimal estimated_glycemic_load, final BigDecimal amino_acid_score, final BigDecimal calorie_kj, final BigDecimal total_carbs_mg, final BigDecimal fiber_mg, final BigDecimal net_carbs_mg, final BigDecimal sugar_mg, final BigDecimal protein_mg, final BigDecimal fat_mg, final BigDecimal starch_mg, final BigDecimal omega_3_fatty_acids_mg, final String vitamin_info, final String mineral_info, final String medicinal_property, final String dominating_dosh, final String additional_info) {
		this.quantity = quantity;
		this.carb_percent = carb_percent;
		this.fat_percent = fat_percent;
		this.protein_percent = protein_percent;
		this.estimated_glycemic_load = estimated_glycemic_load;
		this.amino_acid_score = amino_acid_score;
		this.calorie_kj = calorie_kj;
		this.total_carbs_mg = total_carbs_mg;
		this.fiber_mg = fiber_mg;
		this.net_carbs_mg = net_carbs_mg;
		this.sugar_mg = sugar_mg;
		this.protein_mg = protein_mg;
		this.fat_mg = fat_mg;
		this.starch_mg = starch_mg;
		this.omega_3_fatty_acids_mg = omega_3_fatty_acids_mg;
		this.vitamin_info = vitamin_info;
		this.mineral_info = mineral_info;
		this.medicinal_property = medicinal_property;
		this.dominating_dosh = dominating_dosh;
		this.additional_info = additional_info;
	}

	public boolean equals(final Object o) {
		if (o == this) {
			return true;
		} else if (!(o instanceof NutritionValueRepresentationModel)) {
			return false;
		} else {
			NutritionValueRepresentationModel other = (NutritionValueRepresentationModel)o;
			if (!other.canEqual(this)) {
				return false;
			} else {
				label251: {
					Object this$quantity = this.getQuantity();
					Object other$quantity = other.getQuantity();
					if (this$quantity == null) {
						if (other$quantity == null) {
							break label251;
						}
					} else if (this$quantity.equals(other$quantity)) {
						break label251;
					}

					return false;
				}

				Object this$carb_percent = this.getCarb_percent();
				Object other$carb_percent = other.getCarb_percent();
				if (this$carb_percent == null) {
					if (other$carb_percent != null) {
						return false;
					}
				} else if (!this$carb_percent.equals(other$carb_percent)) {
					return false;
				}

				Object this$fat_percent = this.getFat_percent();
				Object other$fat_percent = other.getFat_percent();
				if (this$fat_percent == null) {
					if (other$fat_percent != null) {
						return false;
					}
				} else if (!this$fat_percent.equals(other$fat_percent)) {
					return false;
				}

				label230: {
					Object this$protein_percent = this.getProtein_percent();
					Object other$protein_percent = other.getProtein_percent();
					if (this$protein_percent == null) {
						if (other$protein_percent == null) {
							break label230;
						}
					} else if (this$protein_percent.equals(other$protein_percent)) {
						break label230;
					}

					return false;
				}

				label223: {
					Object this$estimated_glycemic_load = this.getEstimated_glycemic_load();
					Object other$estimated_glycemic_load = other.getEstimated_glycemic_load();
					if (this$estimated_glycemic_load == null) {
						if (other$estimated_glycemic_load == null) {
							break label223;
						}
					} else if (this$estimated_glycemic_load.equals(other$estimated_glycemic_load)) {
						break label223;
					}

					return false;
				}

				label216: {
					Object this$amino_acid_score = this.getAmino_acid_score();
					Object other$amino_acid_score = other.getAmino_acid_score();
					if (this$amino_acid_score == null) {
						if (other$amino_acid_score == null) {
							break label216;
						}
					} else if (this$amino_acid_score.equals(other$amino_acid_score)) {
						break label216;
					}

					return false;
				}

				Object this$calorie_kj = this.getCalorie_kj();
				Object other$calorie_kj = other.getCalorie_kj();
				if (this$calorie_kj == null) {
					if (other$calorie_kj != null) {
						return false;
					}
				} else if (!this$calorie_kj.equals(other$calorie_kj)) {
					return false;
				}

				label202: {
					Object this$total_carbs_mg = this.getTotal_carbs_mg();
					Object other$total_carbs_mg = other.getTotal_carbs_mg();
					if (this$total_carbs_mg == null) {
						if (other$total_carbs_mg == null) {
							break label202;
						}
					} else if (this$total_carbs_mg.equals(other$total_carbs_mg)) {
						break label202;
					}

					return false;
				}

				Object this$fiber_mg = this.getFiber_mg();
				Object other$fiber_mg = other.getFiber_mg();
				if (this$fiber_mg == null) {
					if (other$fiber_mg != null) {
						return false;
					}
				} else if (!this$fiber_mg.equals(other$fiber_mg)) {
					return false;
				}

				label188: {
					Object this$net_carbs_mg = this.getNet_carbs_mg();
					Object other$net_carbs_mg = other.getNet_carbs_mg();
					if (this$net_carbs_mg == null) {
						if (other$net_carbs_mg == null) {
							break label188;
						}
					} else if (this$net_carbs_mg.equals(other$net_carbs_mg)) {
						break label188;
					}

					return false;
				}

				Object this$sugar_mg = this.getSugar_mg();
				Object other$sugar_mg = other.getSugar_mg();
				if (this$sugar_mg == null) {
					if (other$sugar_mg != null) {
						return false;
					}
				} else if (!this$sugar_mg.equals(other$sugar_mg)) {
					return false;
				}

				Object this$protein_mg = this.getProtein_mg();
				Object other$protein_mg = other.getProtein_mg();
				if (this$protein_mg == null) {
					if (other$protein_mg != null) {
						return false;
					}
				} else if (!this$protein_mg.equals(other$protein_mg)) {
					return false;
				}

				label167: {
					Object this$fat_mg = this.getFat_mg();
					Object other$fat_mg = other.getFat_mg();
					if (this$fat_mg == null) {
						if (other$fat_mg == null) {
							break label167;
						}
					} else if (this$fat_mg.equals(other$fat_mg)) {
						break label167;
					}

					return false;
				}

				label160: {
					Object this$starch_mg = this.getStarch_mg();
					Object other$starch_mg = other.getStarch_mg();
					if (this$starch_mg == null) {
						if (other$starch_mg == null) {
							break label160;
						}
					} else if (this$starch_mg.equals(other$starch_mg)) {
						break label160;
					}

					return false;
				}

				Object this$omega_3_fatty_acids_mg = this.getOmega_3_fatty_acids_mg();
				Object other$omega_3_fatty_acids_mg = other.getOmega_3_fatty_acids_mg();
				if (this$omega_3_fatty_acids_mg == null) {
					if (other$omega_3_fatty_acids_mg != null) {
						return false;
					}
				} else if (!this$omega_3_fatty_acids_mg.equals(other$omega_3_fatty_acids_mg)) {
					return false;
				}

				Object this$vitamin_info = this.getVitamin_info();
				Object other$vitamin_info = other.getVitamin_info();
				if (this$vitamin_info == null) {
					if (other$vitamin_info != null) {
						return false;
					}
				} else if (!this$vitamin_info.equals(other$vitamin_info)) {
					return false;
				}

				label139: {
					Object this$mineral_info = this.getMineral_info();
					Object other$mineral_info = other.getMineral_info();
					if (this$mineral_info == null) {
						if (other$mineral_info == null) {
							break label139;
						}
					} else if (this$mineral_info.equals(other$mineral_info)) {
						break label139;
					}

					return false;
				}

				Object this$medicinal_property = this.getMedicinal_property();
				Object other$medicinal_property = other.getMedicinal_property();
				if (this$medicinal_property == null) {
					if (other$medicinal_property != null) {
						return false;
					}
				} else if (!this$medicinal_property.equals(other$medicinal_property)) {
					return false;
				}

				Object this$dominating_dosh = this.getDominating_dosh();
				Object other$dominating_dosh = other.getDominating_dosh();
				if (this$dominating_dosh == null) {
					if (other$dominating_dosh != null) {
						return false;
					}
				} else if (!this$dominating_dosh.equals(other$dominating_dosh)) {
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
		return other instanceof NutritionValueRepresentationModel;
	}

	public static class NutritionValueRepresentationModelBuilder {
		private String quantity;
		private BigDecimal carb_percent;
		private BigDecimal fat_percent;
		private BigDecimal protein_percent;
		private BigDecimal estimated_glycemic_load;
		private BigDecimal amino_acid_score;
		private BigDecimal calorie_kj;
		private BigDecimal total_carbs_mg;
		private BigDecimal fiber_mg;
		private BigDecimal net_carbs_mg;
		private BigDecimal sugar_mg;
		private BigDecimal protein_mg;
		private BigDecimal fat_mg;
		private BigDecimal starch_mg;
		private BigDecimal omega_3_fatty_acids_mg;
		private String vitamin_info;
		private String mineral_info;
		private String medicinal_property;
		private String dominating_dosh;
		private String additional_info;

		NutritionValueRepresentationModelBuilder() {
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder quantity(final String quantity) {
			this.quantity = quantity;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder carb_percent(final BigDecimal carb_percent) {
			this.carb_percent = carb_percent;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder fat_percent(final BigDecimal fat_percent) {
			this.fat_percent = fat_percent;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder protein_percent(final BigDecimal protein_percent) {
			this.protein_percent = protein_percent;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder estimated_glycemic_load(final BigDecimal estimated_glycemic_load) {
			this.estimated_glycemic_load = estimated_glycemic_load;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder amino_acid_score(final BigDecimal amino_acid_score) {
			this.amino_acid_score = amino_acid_score;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder calorie_kj(final BigDecimal calorie_kj) {
			this.calorie_kj = calorie_kj;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder total_carbs_mg(final BigDecimal total_carbs_mg) {
			this.total_carbs_mg = total_carbs_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder fiber_mg(final BigDecimal fiber_mg) {
			this.fiber_mg = fiber_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder net_carbs_mg(final BigDecimal net_carbs_mg) {
			this.net_carbs_mg = net_carbs_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder sugar_mg(final BigDecimal sugar_mg) {
			this.sugar_mg = sugar_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder protein_mg(final BigDecimal protein_mg) {
			this.protein_mg = protein_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder fat_mg(final BigDecimal fat_mg) {
			this.fat_mg = fat_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder starch_mg(final BigDecimal starch_mg) {
			this.starch_mg = starch_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder omega_3_fatty_acids_mg(final BigDecimal omega_3_fatty_acids_mg) {
			this.omega_3_fatty_acids_mg = omega_3_fatty_acids_mg;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder vitamin_info(final String vitamin_info) {
			this.vitamin_info = vitamin_info;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder mineral_info(final String mineral_info) {
			this.mineral_info = mineral_info;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder medicinal_property(final String medicinal_property) {
			this.medicinal_property = medicinal_property;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder dominating_dosh(final String dominating_dosh) {
			this.dominating_dosh = dominating_dosh;
			return this;
		}

		public NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder additional_info(final String additional_info) {
			this.additional_info = additional_info;
			return this;
		}

		public NutritionValueRepresentationModel build() {
			return new NutritionValueRepresentationModel(this.quantity, this.carb_percent, this.fat_percent, this.protein_percent, this.estimated_glycemic_load, this.amino_acid_score, this.calorie_kj, this.total_carbs_mg, this.fiber_mg, this.net_carbs_mg, this.sugar_mg, this.protein_mg, this.fat_mg, this.starch_mg, this.omega_3_fatty_acids_mg, this.vitamin_info, this.mineral_info, this.medicinal_property, this.dominating_dosh, this.additional_info);
		}

		public String toString() {
			return "NutritionValueRepresentationModel.NutritionValueRepresentationModelBuilder(quantity=" + this.quantity + ", carb_percent=" + this.carb_percent + ", fat_percent=" + this.fat_percent + ", protein_percent=" + this.protein_percent + ", estimated_glycemic_load=" + this.estimated_glycemic_load + ", amino_acid_score=" + this.amino_acid_score + ", calorie_kj=" + this.calorie_kj + ", total_carbs_mg=" + this.total_carbs_mg + ", fiber_mg=" + this.fiber_mg + ", net_carbs_mg=" + this.net_carbs_mg + ", sugar_mg=" + this.sugar_mg + ", protein_mg=" + this.protein_mg + ", fat_mg=" + this.fat_mg + ", starch_mg=" + this.starch_mg + ", omega_3_fatty_acids_mg=" + this.omega_3_fatty_acids_mg + ", vitamin_info=" + this.vitamin_info + ", mineral_info=" + this.mineral_info + ", medicinal_property=" + this.medicinal_property + ", dominating_dosh=" + this.dominating_dosh + ", additional_info=" + this.additional_info + ")";
		}
	}
}
