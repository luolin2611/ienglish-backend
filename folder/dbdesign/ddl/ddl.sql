DROP TABLE IF EXISTS `text`;
CREATE TABLE `text`
(
    `id`              INT AUTO_INCREMENT COMMENT 'id',
    `text_series_id`  VARCHAR(255) COMMENT '课程序列ID',
    `name_zh`         VARCHAR(255) COMMENT '课程名称(中)',
    `name_en`         VARCHAR(255) COMMENT '课程名称(英)',
    `audio_path`      VARCHAR(512) COMMENT '音频路径',
    `lrc_path`        VARCHAR(512) COMMENT '课文歌词路径',
    `text_path`       VARCHAR(512) COMMENT '课文路径',
    `text_cover_path` VARCHAR(512) COMMENT '课文封面',
    `create_by`       INT(10) COMMENT '创建人',
    `create_time`     DATETIME COMMENT '创建时间',
    `update_by`       INT(10) COMMENT '更新人',
    `update_time`     DATETIME COMMENT '更新时间',
    PRIMARY KEY (`id`)
) COMMENT = '课文表' CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


DROP TABLE IF EXISTS `text_series`;
CREATE TABLE `text_series`
(
    `id`             INT AUTO_INCREMENT COMMENT 'id',
    `series_name_zh` VARCHAR(255) COMMENT '序列中文(中)',
    `series_name_en` VARCHAR(255) COMMENT '序列名称(英)',
    `pdf_path`       VARCHAR(512) COMMENT '课本路径',
    `create_by`      INT(10) COMMENT '创建人',
    `create_time`    DATETIME COMMENT '创建时间',
    `update_by`      INT(10) COMMENT '更新人',
    `update_time`    DATETIME COMMENT '更新时间',
    PRIMARY KEY (`id`)
) COMMENT = '课本系列表' CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
