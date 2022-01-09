CREATE TABLE public.pokemon
(
    id SERIAL PRIMARY KEY,
    name VARCHAR NOT NULL,
    type1 VARCHAR NOT NULL,
    type2 VARCHAR,
    hp INTEGER NOT NULL,
    attack INTEGER NOT NULL,
    defense INTEGER NOT NULL,
    sp_attack INTEGER NOT NULL,
    sp_defense INTEGER NOT NULL,
    speed INTEGER NOT NULL,
    generation SMALLINT NOT NULL,
    total INTEGER NOT NULL,
    legendary BOOL NOT NULL
);

CREATE INDEX IF NOT EXISTS pokemon_name_idx ON public.pokemon(name);
CREATE INDEX IF NOT EXISTS pokemon_type1_idx ON public.pokemon(type1);
CREATE INDEX IF NOT EXISTS pokemon_generation_idx ON public.pokemon(generation);
CREATE INDEX IF NOT EXISTS pokemon_legendary_idx ON public.pokemon(legendary);