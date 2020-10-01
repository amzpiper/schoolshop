CREATE table tb_wechat_auth(
	wechat_auth_id int auto_increment not null,
    user_id int not null,
    open_id varchar(700) not null,
    create_time datetime default null,
    primary key(wechat_auth_id),unique key(open_id),
    foreign key(user_id) references tb_person_info (user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1;