# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                        bigint auto_increment not null,
  user_id                   bigint,
  Post_thread_id            bigint,
  Library_meta_Id           bigint,
  constraint pk_book primary key (id))
;

create table library_meta (
  id                        bigint auto_increment not null,
  user_id                   bigint,
  name                      varchar(255),
  detail                    varchar(255),
  constraint pk_library_meta primary key (id))
;

create table matrix (
  primary_id                bigint,
  secondary_id              bigint)
;

create table my_data (
  seq_id                    bigint auto_increment not null,
  userid                    bigint,
  Post_thread_id            bigint,
  constraint pk_my_data primary key (seq_id))
;

create table opinion (
  id                        bigint auto_increment not null,
  value                     varchar(255),
  timestamp                 varchar(255),
  User_UserId               bigint,
  OpinionDetails_Id         bigint,
  constraint pk_opinion primary key (id))
;

create table opinion_details (
  id                        bigint auto_increment not null,
  subject                   varchar(255),
  visibility                varchar(255),
  category                  varchar(255),
  location                  varchar(255),
  timestamp                 varchar(255),
  media                     varchar(255),
  User_UserId               bigint,
  constraint pk_opinion_details primary key (id))
;

create table post_thread (
  id                        bigint auto_increment not null,
  header                    varchar(255),
  excerpt                   varchar(255),
  image_loc                 varchar(255),
  author                    varchar(255),
  interest                  varchar(255),
  content                   longtext,
  User_UserId               bigint,
  constraint pk_post_thread primary key (id))
;

create table project (
  id                        bigint auto_increment not null,
  title                     varchar(255),
  tagline                   varchar(255),
  constraint pk_project primary key (id))
;

create table user (
  user_id                   bigint auto_increment not null,
  name                      varchar(255),
  username                  varchar(255),
  password                  varchar(255),
  interest                  varchar(255),
  constraint pk_user primary key (user_id))
;

alter table book add constraint fk_book_thread_1 foreign key (Post_thread_id) references post_thread (id) on delete restrict on update restrict;
create index ix_book_thread_1 on book (Post_thread_id);
alter table book add constraint fk_book_shelf_Id_2 foreign key (Library_meta_Id) references library_meta (id) on delete restrict on update restrict;
create index ix_book_shelf_Id_2 on book (Library_meta_Id);
alter table my_data add constraint fk_my_data_thread_3 foreign key (Post_thread_id) references post_thread (id) on delete restrict on update restrict;
create index ix_my_data_thread_3 on my_data (Post_thread_id);
alter table opinion add constraint fk_opinion_user_4 foreign key (User_UserId) references user (user_id) on delete restrict on update restrict;
create index ix_opinion_user_4 on opinion (User_UserId);
alter table opinion add constraint fk_opinion_opiniondetails_5 foreign key (OpinionDetails_Id) references opinion_details (id) on delete restrict on update restrict;
create index ix_opinion_opiniondetails_5 on opinion (OpinionDetails_Id);
alter table opinion_details add constraint fk_opinion_details_user_6 foreign key (User_UserId) references user (user_id) on delete restrict on update restrict;
create index ix_opinion_details_user_6 on opinion_details (User_UserId);
alter table post_thread add constraint fk_post_thread_user_7 foreign key (User_UserId) references user (user_id) on delete restrict on update restrict;
create index ix_post_thread_user_7 on post_thread (User_UserId);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table book;

drop table library_meta;

drop table matrix;

drop table my_data;

drop table opinion;

drop table opinion_details;

drop table post_thread;

drop table project;

drop table user;

SET FOREIGN_KEY_CHECKS=1;

