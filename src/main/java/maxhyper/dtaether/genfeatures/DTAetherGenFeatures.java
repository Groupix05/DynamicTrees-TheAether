package maxhyper.dtaether.genfeatures;

import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.systems.genfeature.GenFeature;
import maxhyper.dtaether.DynamicTreesAether;

public class DTAetherGenFeatures {

    public static final GenFeature ALTERNATIVE_BRANCH = new AlternativeBranchGenFeature(DynamicTreesAether.location("alt_branch"));
    public static final GenFeature SEASONAL_CONDITION = new SeasonalConditionGenFeature(DynamicTreesAether.location("seasonal_condition"));
    public static final GenFeature HOLIDAY_DECORATION = new HolidayDecorationGenFeature(DynamicTreesAether.location("holiday_decoration"));
    public static final GenFeature NEGATIVE_BIOME_PREDICATE = new NegativeBiomePredicateGenFeature(DynamicTreesAether.location("negative_biome_predicate"));
    public static final GenFeature HANGER_VINES = new HangerVinesGenFeature(DynamicTreesAether.location("hanger_vines"));
    public static final GenFeature LEAF_PILE = new LeafPileGenFeature(DynamicTreesAether.location("leaf_pile"));
    public static final GenFeature PETALS = new PetalsGenFeature(DynamicTreesAether.location("petals"));

    public static void register(final Registry<GenFeature> registry) {
        registry.registerAll(ALTERNATIVE_BRANCH, SEASONAL_CONDITION, HOLIDAY_DECORATION,
                NEGATIVE_BIOME_PREDICATE, HANGER_VINES, LEAF_PILE, PETALS
        );
    }

}
