CREATE table tb_shop_category(
	shop_category_id int auto_increment not null,
    shop_category_name varchar(100) not null default '',
    shop_category_desc varchar(1000) default '',
    shop_category_img varchar(2000) default null,
	priority int not null default 0,
    create_time datetime default null,
    last_edit_time datetime default null,
	parent_id int default null,
    primary key(shop_category_id),
    foreign key(parent_id) references tb_shop_category (shop_category_id)
)ENGINE=InnoDB AUTO_INCREMENT=1;