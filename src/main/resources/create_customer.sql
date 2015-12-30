-- Table: customer DB POSTGRES

-- DROP TABLE customer;

CREATE TABLE customer
(
  id integer NOT NULL,
  addr character varying(255),
  city character varying(255),
  name character varying(255),
  state character varying(255),
  zip character varying(255),
  CONSTRAINT customer_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE customer
  OWNER TO sampledb_user;
