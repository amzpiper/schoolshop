CREATE table tb_product(
	product_id int auto_increment not null,
    shop_id int default null,
    product_category_id int default null,
    product_name varchar(100) not null,
    product_desc varchar(2000) default null,
    img_addr varchar(2000) default null,
    normal_price varchar(100) default null,
    promotion_price varchar(100) default null,
	priority int not null default 0,
    create_time datetime default null,
    last_edit_time datetime default null,
    enable_stb_areatatus int not null default 0 comment '-1不可用，0下架，1在前端系统展示',
    primary key(product_id),
    foreign key(shop_id) references tb_shop (shop_id),
    foreign key(product_category_id) references tb_product_category (product_category_id)
)ENGINE=InnoDB AUTO_INCREMENT=1;