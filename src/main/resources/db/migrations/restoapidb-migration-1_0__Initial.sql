-- DDL scripts
create table catalog.menu_course
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.item_tag
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.measurement_unit
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.ingredient
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.cooking_method
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);
create table catalog.cooking_pot
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);
create table catalog.regional_influence
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);
create table catalog.recipe_consistency
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);
create table catalog.recipe_spiciness
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.recipe_richness
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.innate_potency
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.recipe_taste
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.recipe_odor
(
    id              serial primary key,
    name            varchar(50)  not null,
    code            varchar(20)  not null unique,
    description     varchar(100) not null,
    additional_info varchar(200) not null
);

create table catalog.nutrition_value
(
    id                      serial primary key,
    measurement_unit_id     integer      not null references catalog.measurement_unit (id),
    measurement_amount      integer      not null,
    carb_percent            numeric,
    fat_percent             numeric,
    protein_percent         numeric,
    estimated_glycemic_load numeric,
    amino_acid_score        numeric,
    calorie_kj              numeric,
    total_carbs_mg          numeric,
    fiber_mg                numeric,
    net_carbs_mg            numeric,
    sugar_mg                numeric,
    protein_mg              numeric,
    fat_mg                  numeric,
    starch_mg               numeric,
    omega_3_fatty_acids_mg  numeric,
    vitamin_info            varchar(500),
    mineral_info            varchar(500),
    medicinal_property      varchar(200),
    dominating_dosh         varchar(200),
    additional_info         varchar(200) not null
);

create table catalog.ingredient_option
(
    id                    serial primary key,
    name                  varchar(50)  not null,
    code                  varchar(20)  not null unique,
    description           varchar(100) not null,
    ingredient_id         integer      not null references catalog.ingredient (id),
    is_allowed_in_fasting boolean               default false,
    innate_potency_id     integer      not null references catalog.innate_potency (id),
    nutrition_value_id    integer references catalog.nutrition_value (id),
    is_available          boolean               default true,
    is_default            boolean      not null default false
);

create table catalog.recipe
(
    id                    serial primary key,
    code                  varchar(20)  not null unique,
    description           varchar(100) not null,
    instructions          varchar(500),
    cocking_method_id     integer references catalog.cooking_method (id),
    cocking_pot_id        integer references catalog.cooking_pot (id),
    regional_influence_id integer references catalog.regional_influence (id),
    consistency_id        integer references catalog.recipe_consistency (id),
    spiciness_id          integer references catalog.recipe_spiciness (id),
    richness_id           integer references catalog.recipe_richness (id),
    taste_id              integer references catalog.recipe_taste (id),
    odor_id               integer references catalog.recipe_odor (id)
);

create table catalog.menu_item
(
    id                         serial primary key,
    name                       varchar(50)  not null,
    code                       varchar(20)  not null unique,
    description                varchar(100) not null,
    base_price                 numeric,
    menu_course_id             integer      not null references catalog.menu_course (id),
    recipe_id                  integer      not null references catalog.recipe (id),
    measurement_unit_id        integer      not null references catalog.measurement_unit (id),
    measurement_amount         integer      not null,
    is_served_alone            boolean      not null,
    is_available               boolean default true,
    is_complementary           boolean default false,
    complementary_with_item_id integer references catalog.menu_item (id)
);

create table catalog.menu_item_picture
(
    id           serial primary key,
    url          varchar(500) not null,
    menu_item_id integer      not null references catalog.menu_item (id)
);

create table catalog.recipe_ingredient
(
    id                   serial primary key,
    recipe_id            integer not null references catalog.recipe (id),
    ingredient_option_id integer not null references catalog.ingredient_option (id),
    measurement_unit_id  integer not null references catalog.measurement_unit (id),
    measurement_amount   numeric not null
);

create table catalog.menu_item_item_tag
(
    id           serial primary key,
    menu_item_id integer not null references catalog.menu_item (id),
    item_tag_id  integer not null references catalog.item_tag (id)
);


-- DML scripts
INSERT INTO catalog.menu_course (name, code, description, additional_info)
VALUES ('starter', 'aptz', 'Starters', 'Delicious food items to enhance your apatite');
INSERT INTO catalog.menu_course (name, code, description, additional_info)
VALUES ('bread', 'brd', 'Breads', 'A wide variety of flatbreads and crêpes, an integral part of Indian cuisine');
INSERT INTO catalog.menu_course (name, code, description, additional_info)
VALUES ('main', 'main', 'Main course', 'Main course');
INSERT INTO catalog.menu_course (name, code, description, additional_info)
VALUES ('side', 'side', 'Side dishes', 'Addition optional items to add with main course');
INSERT INTO catalog.menu_course (name, code, description, additional_info)
VALUES ('dessert', 'dsrt', 'Dessert', 'Something sweet to end with');


INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('breakfast', 'bf', 'Break-fast', 'Items suitable for breakfast time according to their nature & calorie');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('lunch', 'lt', 'Lunch', 'Items suitable for lunch time according to their nature & calorie');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('dinner', 'dt', 'Dinner', 'Items suitable for dinner time according to their nature & calorie');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('fasting', 'ff', 'Allowed in fasting', 'Items consumable in fasting');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('keto', 'ket', 'Ketto', 'Items falls under keto categoty');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('low_cal', 'lcf', 'Low calorie food', 'Items having small amount of calories');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('high_fiber', 'hf', 'Fiber rich food', 'Items having high amount of fibre');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('vegan', 'vegan', 'Vegan', 'Food prepared with vegan items, excludes dairy products');
INSERT INTO catalog.item_tag (name, code, description, additional_info)
VALUES ('zero_oil', 'oil0', 'Zero oil', 'Food prepared with no oil at all, ood for heart');

INSERT INTO catalog.measurement_unit("name", code, description, additional_info)
VALUES ('pieces', 'pcs', 'pcs', 'Measured in pieces');
INSERT INTO catalog.measurement_unit("name", code, description, additional_info)
VALUES ('gram', 'gm', 'gm', 'Measured in pieces weight');
INSERT INTO catalog.measurement_unit("name", code, description, additional_info)
VALUES ('ml', 'ml', 'ml', 'Measured in volume');
INSERT INTO catalog.measurement_unit("name", code, description, additional_info)
VALUES ('box', 'bx', 'punnet', 'Measured in punnet');

INSERT INTO catalog.ingredient ("name", code, description, additional_info)
VALUES ('bread', 'brd', 'Bread', 'A bread piece');
INSERT INTO catalog.ingredient ("name", code, description, additional_info)
VALUES ('potato', 'pot', 'Potato', 'Potato vegetable');
INSERT INTO catalog.ingredient ("name", code, description, additional_info)
VALUES ('pea', 'gp', 'Green peas', 'Green pea vegetable');

INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('slow', 'sc', 'Slow cooking', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('boiling|simmering|poaching', 'bsp', 'Boiling',
        'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('grilling|broiling', 'gb', 'Grilling', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('microwaving', 'mw', 'Microwaving', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('roasting|baking', 'rb', 'Roasting|Baking', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('sautéing|stir-frying', 'ssf', 'Stir frying',
        'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('shallow-frying', 'sf', 'Shallow frying', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('deep-frying', 'df', 'Deep frying', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('steaming', 'stm', 'Steaming', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('open', 'oc', 'Uncovered cooking', 'A process of cooking on low flames to sustain nutrition of food');
INSERT INTO catalog.cooking_method ("name", code, description, additional_info)
VALUES ('airfry', 'eairfry', 'Air frying', 'A process of cooking using electric aur fryer');

INSERT INTO catalog.cooking_pot ("name", code, description, additional_info)
VALUES ('kansa', 'km', 'Kansa metal',
        'Kansa is an alloy of 78% copper and 22% tin both heated together up to 700 centigrade to form pure bronze');
INSERT INTO catalog.cooking_pot ("name", code, description, additional_info)
VALUES ('copper', 'cprm', 'Copper metal', 'Pots are made of copper metal');
INSERT INTO catalog.cooking_pot ("name", code, description, additional_info)
VALUES ('iron', 'cim', 'Cast iron metal', 'Pots are made of iron metal');
INSERT INTO catalog.cooking_pot ("name", code, description, additional_info)
VALUES ('clay', 'clp', 'Clay', 'Pots are made of clay metal');
INSERT INTO catalog.cooking_pot ("name", code, description, additional_info)
VALUES ('bronze', 'bm', 'Bronze metal', 'Pots are made of copper metal');
INSERT INTO catalog.cooking_pot ("name", code, description, additional_info)
VALUES ('glass', 'gp', 'Glass', 'Pots are made of copper metal');

INSERT INTO catalog.regional_influence ("name", code, description, additional_info)
VALUES ('si', 'sif', 'South indian flavor', 'Use curry leaves and bit spicy');
INSERT INTO catalog.regional_influence ("name", code, description, additional_info)
VALUES ('ni', 'nif', 'North indian flavor', 'North indian influence');
INSERT INTO catalog.regional_influence ("name", code, description, additional_info)
VALUES ('ei', 'eif', 'East indian flavor', 'North indian influence');

INSERT INTO catalog.recipe_consistency ("name", code, description, additional_info)
VALUES ('dry', 'dc', 'Dry', 'Dry consistency');
INSERT INTO catalog.recipe_consistency ("name", code, description, additional_info)
VALUES ('thick', 'tcc', 'Thick creamy', 'thick creamy consistency');
INSERT INTO catalog.recipe_consistency ("name", code, description, additional_info)
VALUES ('thin', 'rc', 'Runny', 'Runny consistency');
INSERT INTO catalog.recipe_consistency ("name", code, description, additional_info)
VALUES ('juicy', 'jc', 'Juicy', 'A middle option of thick and runny consistency');

INSERT INTO catalog.recipe_spiciness ("name", code, description, additional_info)
VALUES ('mild', 'jms', 'Just mild', 'Combination of spices to  maintain almost no hotness in food');
INSERT INTO catalog.recipe_spiciness ("name", code, description, additional_info)
VALUES ('medium', 'mhs', 'Medium hot', 'Combination of spices to  maintain medium no hotness in food');
INSERT INTO catalog.recipe_spiciness ("name", code, description, additional_info)
VALUES ('hot', 'hs', 'Hot', 'Combination of spices to enrich food with hotness');
INSERT INTO catalog.recipe_spiciness ("name", code, description, additional_info)
VALUES ('xhot', 'ehs', 'Extra hot', 'Extra hot, for some exception people who can bear');

INSERT INTO catalog.recipe_richness ("name", code, description, additional_info)
VALUES ('satvik', 'rstvkf', 'Satvik food',
        'Proportionate usage of spices and oils as per satvik definition suitable for students, easy going people');
INSERT INTO catalog.recipe_richness ("name", code, description, additional_info)
VALUES ('standard', 'rstndf', 'Standard food', 'Standard usage of spices and oils suitable for normally active people');
INSERT INTO catalog.recipe_richness ("name", code, description, additional_info)
VALUES ('royal', 'rrylf', 'Royal food', 'A royal usage of spices and fats for people who knows how to burn calories');

INSERT INTO catalog.innate_potency("name", code, description, additional_info)
VALUES ('hot', 'hot', 'Hot', 'Beneficial in cold season\weather');
INSERT INTO catalog.innate_potency("name", code, description, additional_info)
VALUES ('cold', 'cld', 'Cold', 'Beneficial in hot season\weather');
INSERT INTO catalog.innate_potency("name", code, description, additional_info)
VALUES ('unknown', 'unkn', 'Unknown', 'Not documented');

INSERT INTO catalog.recipe_taste ("name", code, description, additional_info)
VALUES ('sweet', 'tsw', 'A sweet taste', 'oily,unctuous,cold,heavy');
INSERT INTO catalog.recipe_taste ("name", code, description, additional_info)
VALUES ('sour', 'tsu', 'A sour taste', 'oily,unctuous,hot,heavy');
INSERT INTO catalog.recipe_taste ("name", code, description, additional_info)
VALUES ('salt', 'tslt', 'A salty taste', 'oily,unctuous,hot,heavy');
INSERT INTO catalog.recipe_taste ("name", code, description, additional_info)
VALUES ('pungent', 'tpun', 'A pungent taste', 'dry,hot,light');
INSERT INTO catalog.recipe_taste ("name", code, description, additional_info)
VALUES ('bitter', 'tbut', 'A bitter taste', 'dry,cold,light');
INSERT INTO catalog.recipe_taste ("name", code, description, additional_info)
VALUES ('astringent', 'tasngt', 'A bitter taste', 'dry,cold,light');
INSERT INTO catalog.recipe_taste ("name", code, description, additional_info)
VALUES ('umami', 'tsav', 'A savory taste', 'dry,cold,light');


INSERT INTO catalog.recipe_odor ("name", code, description, additional_info)
VALUES ('sweet', 'rosw', 'A sweet odor',
        'pleasing and easy on the palate, it can go from genteel and nice, to delightful and attractive, tends to be satisfying, enjoyable and rewarding, might be sugary, probably fresh, pure and appealing');
INSERT INTO catalog.recipe_odor ("name", code, description, additional_info)
VALUES ('fruity', 'rofrt', 'A fruity odor',
        'A pleasant aroma with influence of fruits freshness, sweetness and sourness');
INSERT INTO catalog.recipe_odor ("name", code, description, additional_info)
VALUES ('minty', 'romnt', 'A minty odor', 'A pleasant aroma with influence of dominating use of mint');
INSERT INTO catalog.recipe_odor ("name", code, description, additional_info)
VALUES ('lemon', 'rolmn', 'A lemon odor', 'A pleasant aroma with influence of clear sourness over other odors');
INSERT INTO catalog.recipe_odor ("name", code, description, additional_info)
VALUES ('pungent', 'ropun', 'A pungent odor',
        'A strong aroma, spicy, hot, heady, overpowering, sharp or bitter, but certainly not bland');
INSERT INTO catalog.recipe_odor ("name", code, description, additional_info)
VALUES ('fresh', 'rofrsh', 'A fresh odor',
        'clean, clear, cool, refreshing, sweet and new, crisp as newly picked fruit or vegetables, warm as newly baked bread hot from the oven, - the smell does not feel insalubrious, moldy, stale or worse');
INSERT INTO catalog.recipe_odor ("name", code, description, additional_info)
VALUES ('savory', 'rosav', 'A fresh odor', 'spicy, pungent, flavorsome, and aromatic, salty but not sweet');

INSERT INTO catalog.nutrition_value(measurement_unit_id, measurement_amount,
                                    carb_percent, fat_percent, protein_percent, estimated_glycemic_load,
                                    amino_acid_score, calorie_kj, total_carbs_mg, fiber_mg, net_carbs_mg, sugar_mg,
                                    protein_mg, fat_mg, starch_mg, omega_3_fatty_acids_mg, vitamin_info, mineral_info,
                                    medicinal_property, dominating_dosh, additional_info)
VALUES (2, 100, 93, 1, 6, 9, 109, 364, 20100, 1800, 18300, 900, 1900, 100, 0, 10,
        'A=3.0IU|C=13.0mg|K=2.1mcg|Thiamin=0.1mg|Niacin=1.4mg|B6=0.3mg|Folate=10.0mcg|Pantothenic Acid=0.5mg|Choline=13.5mg|Betaine=0.2mg',
        'Calcium=5.0mg|Iron=0.3mg|Magnesium=22.0mg|Phosphorus=44.0mg|Potassium=379mg|Sodium=4.0mg|Zinc=0.3mg|Copper=0.2mg|Manganese=0.1mg|Selenium=0.3mcg|Fluoride=49.4mcg',
        '', '', '');
INSERT INTO catalog.nutrition_value(measurement_unit_id, measurement_amount,
                                    carb_percent, fat_percent, protein_percent, estimated_glycemic_load,
                                    amino_acid_score, calorie_kj, total_carbs_mg, fiber_mg, net_carbs_mg, sugar_mg,
                                    protein_mg, fat_mg, starch_mg, omega_3_fatty_acids_mg, vitamin_info, mineral_info,
                                    medicinal_property, dominating_dosh, additional_info)
VALUES (2, 100, 93, 1, 6, 9, 110, 360, 20000, 1800, 18200, 900, 1700, 100, 0, 10,
        'A=3.0IU|C=7.4mg|K=2.1mcg|Thiamin=0.1mg|Niacin=1.3mg|B6=0.3mg|Folate=9.0mcg|Pantothenic Acid=0.5mg|Choline=13.2mg|Betaine=0.2mg',
        'Calcium=8.0mg|Iron=0.3mg|Magnesium=20.0mg|Phosphorus=40.0mg|Potassium=328mg|Sodium=5.0mg|Zinc=0.3mg|Copper=0.2mg|Manganese=0.1mg|Selenium=0.3mcg',
        '', '', '');
INSERT INTO catalog.nutrition_value(measurement_unit_id, measurement_amount,
                                    carb_percent, fat_percent, protein_percent, estimated_glycemic_load,
                                    amino_acid_score, calorie_kj, total_carbs_mg, fiber_mg, net_carbs_mg, sugar_mg,
                                    protein_mg, fat_mg, starch_mg, omega_3_fatty_acids_mg, vitamin_info, mineral_info,
                                    medicinal_property, dominating_dosh, additional_info)
VALUES (2, 100, 73, 4, 23, 5, 84, 339, 14500, 5100, 9400, 5700, 5400, 400, 0, 35,
        'A=765IU|C=40.0mg|E (Alpha Tocopherol)=0.1mg|K=24.8mcg|Thiamin=0.3mg|Riboflavin=0.1mg|Niacin=2.1mg|B=60.2mg|Folate=65.0mcg|B=120.0mcg|Pantothenic Acid=0.1mg|Choline=28.4mg|Betaine=0.2mg',
        'Calcium=25.0mg|Iron=1.5mg|Magnesium=33.0mg|Phosphorus=108mg|Potassium=244mg|Sodium=5.0mg|Zinc=1.2mg|Copper=0.2mg|Manganese=0.4mg|Selenium=1.8mcg',
        '', '', '');


INSERT INTO catalog.ingredient_option ("name", code, description, ingredient_id, innate_potency_id, nutrition_value_id,
                                       is_allowed_in_fasting)
VALUES ('white_bread', 'wbrd', 'White bread', 1, 3, null, false);
INSERT INTO catalog.ingredient_option ("name", code, description, ingredient_id, innate_potency_id, nutrition_value_id,
                                       is_allowed_in_fasting, is_default)
VALUES ('brown_bread', 'bbrd', 'Brown bread', 1, 3, null, false, true);
INSERT INTO catalog.ingredient_option ("name", code, description, ingredient_id, innate_potency_id, nutrition_value_id,
                                       is_allowed_in_fasting)
VALUES ('whole_grain_bread', 'wgbrd', 'Whole grain bread', 1, 3, null, false);
INSERT INTO catalog.ingredient_option ("name", code, description, ingredient_id, innate_potency_id, nutrition_value_id,
                                       is_allowed_in_fasting, is_default)
VALUES ('peeled_boiled_potato', 'bpp', 'Boiled potato (without skin)', 2, 1, 2, true, true);
INSERT INTO catalog.ingredient_option ("name", code, description, ingredient_id, innate_potency_id, nutrition_value_id,
                                       is_allowed_in_fasting)
VALUES ('skin_boiled_potato', 'bsp', 'Boiled potato (with skin)', 2, 1, null, true);
INSERT INTO catalog.ingredient_option ("name", code, description, ingredient_id, innate_potency_id, nutrition_value_id,
                                       is_allowed_in_fasting)
VALUES ('raw_pea', 'rpvg', 'Raw pea', 2, 2, 3, false);


INSERT INTO catalog.recipe(code, description, instructions, cocking_method_id, cocking_pot_id, regional_influence_id,
                           consistency_id, spiciness_id, richness_id, taste_id, odor_id)
VALUES ('miswch01rr01', 'Recommended sandwich recipe', 'Mix the ingredients, fill with stuffing and grill', 3, 3, 2, 1,
        2, 2, 3, 7);

INSERT INTO catalog.menu_item("name", code, description, base_price, menu_course_id, recipe_id, measurement_unit_id,
                              measurement_amount, is_served_alone, is_complementary, complementary_with_item_id)
VALUES ('sandwich', 'miswch01', 'Sandwich', 10, 4, 1, 1, 2, true, false, null);

INSERT INTO "catalog".menu_item_picture(url, menu_item_id)
VALUES ('https://pixabay.com/photos/bread-sandwich-food-plate-table-1867208', 1);

INSERT INTO catalog.recipe_ingredient (recipe_id, ingredient_option_id, measurement_unit_id, measurement_amount)
VALUES (1, 2, 1, 2);
INSERT INTO catalog.recipe_ingredient (recipe_id, ingredient_option_id, measurement_unit_id, measurement_amount)
VALUES (1, 4, 2, 100);

INSERT INTO "catalog".menu_item_item_tag(menu_item_id, item_tag_id)
VALUES (1, 1);
INSERT INTO "catalog".menu_item_item_tag(menu_item_id, item_tag_id)
VALUES (1, 8);

-- Marketing schema objects
create table marketing.discount
(
    id                         serial primary key,
    name                       varchar(50)  not null,
    code                       varchar(20)  not null unique,
    description                varchar(100) not null,
    is_universal               boolean default false,
    complementary_with_item_id integer references catalog.menu_item (id)
);

