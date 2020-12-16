CREATE table tb_product_img(
	product_img_id int auto_increment not null,
    img_addr varchar(100) not null,
    img_desc varchar(100) not null,
    priority int default 0,
    create_time datetime default null,
    product_id int not null,
    primary key(product_img_id),
    foreign key(product_id) references tb_product (product_id)
)ENGINE=InnoDB AUTO_INCREMENT=1;