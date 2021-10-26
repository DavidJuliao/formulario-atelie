create table public.tb_cli(
     id serial not null ,
     nom varchar not null,
     ema varchar  not null,
     tel varchar  not null,
     men text  not null,
     tip_con varchar  not null,
     hor_ate varchar  not null,
     constraint tb_cli_id primary key(id)
);