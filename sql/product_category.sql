CREATE table tb_product_category(
	product_category_id int auto_increment not null,
    product_category_name varchar(100) not null,
    priority int default 0,
    create_time datetime default null,
    shop_id int not null,
    primary key(product_category_id),
    foreign key(shop_id) references tb_shop (shop_id)
)ENGINE=InnoDB AUTO_INCREMENT=1;