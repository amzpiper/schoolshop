 CREATE table tb_head_line(
	lineId int auto_increment not null,
    lineName varchar(128) not null,
    lineLink varchar(128) not null,
    lineImg varchar(128) not null,
    priority int not null,
    enableStatus int not null default 0 comment '0:可以用，1:不可用',
    create_time datetime default null,
    last_edit_time datetime default null,
    primary key(lineId)
)ENGINE=InnoDB AUTO_INCREMENT=1;