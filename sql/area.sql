CREATE table tb_area(
	id int auto_increment not null,
    areaName varchar(200) not null,
    priority int not null default 0,
    createTime datetime default null,
    lastEditTime datetime default null,
    primary key(id),
    unique key(areaName)
)ENGINE=InnoDB AUTO_INCREMENT=1;