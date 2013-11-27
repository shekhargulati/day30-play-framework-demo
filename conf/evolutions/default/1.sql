# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table story (
  id                        varchar(255) not null,
  url                       varchar(255),
  fullname                  varchar(255),
  submitted_on              timestamp,
  title                     varchar(255),
  text                      varchar(255),
  image                     varchar(255),
  constraint pk_story primary key (id))
;

create sequence story_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists story;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists story_seq;

