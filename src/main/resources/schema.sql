CREATE TABLE IF NOT EXISTS public.auto_part_types
(
  id integer NOT NULL,
  name text COLLATE pg_catalog."default" NOT NULL,
  CONSTRAINT auto_part_types_pkey PRIMARY KEY (id)
);

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.auto_part_types OWNER to postgres;

CREATE TABLE IF NOT EXISTS public.auto_parts
(
  id integer NOT NULL,
  auto_part_type_id integer NOT NULL,
  CONSTRAINT auto_parts_pkey PRIMARY KEY (id),
  CONSTRAINT auto_parts_auto_part_type_id_fkey FOREIGN KEY (auto_part_type_id)
    REFERENCES public.auto_part_types (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.auto_parts OWNER to postgres;

INSERT INTO auto_part_types (id, name) VALUES (1, 'Engine');
INSERT INTO auto_parts (id, auto_part_type_id) VALUES (1, 1);
