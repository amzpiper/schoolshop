CREATE table tb_person_info(
	user_id int auto_increment not null,
    name varchar(32) not null,
    profileImg varchar(1024) default null,
    email varchar(1024) default null,
    gender varchar(2) default null,
    enable_status int not null default 0 comment'0:禁止使用商城,1:允许使用商城',
    user_type int not null default 1 comment'1:顾客,2:店家,3:超级管理员',
    create_time datetime default null,
    last_edit_time datetime default null,
    primary key(user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1;