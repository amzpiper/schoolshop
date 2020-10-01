CREATE table tb_local_auth(
	local_auth_id int auto_increment not null,
    user_id int not null,
    username varchar(128) not null,
    password varchar(128) not null,
    create_time datetime default null,
    last_edit_time datetime default null,
    primary key(local_auth_id),unique key(username),
    foreign key(user_id) references tb_person_info (user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1;