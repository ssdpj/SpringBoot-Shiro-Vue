CREATE TABLE `task` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `taskNo` varchar(20) NOT NULL COMMENT '任务编号',
  `type` int(4) NOT NULL COMMENT '类型',
  `taskName` varchar(32) NOT NULL COMMENT '任务名称',
  `taskDesc` varchar(128) DEFAULT NULL COMMENT '描述',
  `imgUrl` text COMMENT '图片地址',
  `startDate` datetime DEFAULT NULL COMMENT '开始时间',
  `endDate` datetime DEFAULT NULL COMMENT '结束时间',
  `crtTime` datetime NOT NULL COMMENT '创建时间',
  `updateTime` datetime NOT NULL COMMENT '更新时间',
  `creator` int(16) NOT NULL COMMENT '创建者',
  `seller` varchar(16) DEFAULT NULL COMMENT '销售',
  `executor` varchar(16) DEFAULT NULL COMMENT '执行人',
  `status` int(4) NOT NULL COMMENT '状态',
  `config` text COMMENT '配置',
  `parentId` bigint(20) DEFAULT '0' COMMENT '父任务id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8