/*
 Navicat Premium Data Transfer

 Source Server         : local_link
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : movie

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 19/02/2020 16:55:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
BEGIN;
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);
INSERT INTO `hibernate_sequence` VALUES (1);
COMMIT;

-- ----------------------------
-- Table structure for t_cinema
-- ----------------------------
DROP TABLE IF EXISTS `t_cinema`;
CREATE TABLE `t_cinema` (
  `id` int(11) NOT NULL,
  `location` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `ting` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_cinema
-- ----------------------------
BEGIN;
INSERT INTO `t_cinema` VALUES (1, '玄武区红山路88号长发广场5楼', '幸福蓝海IMAX影城（常发广场店）', '1、2、3、4、5');
INSERT INTO `t_cinema` VALUES (2, '玄武区阳光路3号楼', '珠影CC达美影城（太阳宫）', '1、2、3');
COMMIT;

-- ----------------------------
-- Table structure for t_comment
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(11) NOT NULL,
  `content` varchar(255) DEFAULT NULL,
  `show_movies_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `post_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKf2jbagvuh83si3soj524fi1jy` (`show_movies_id`),
  KEY `FKtamaoacctq4qpko6bvtv0ke1p` (`user_id`),
  CONSTRAINT `FKf2jbagvuh83si3soj524fi1jy` FOREIGN KEY (`show_movies_id`) REFERENCES `t_show` (`id`),
  CONSTRAINT `FKtamaoacctq4qpko6bvtv0ke1p` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_comment
-- ----------------------------
BEGIN;
INSERT INTO `t_comment` VALUES (1, '哇！好酷', 1, 1, '2020-02-17 13:33:56.000000');
COMMIT;

-- ----------------------------
-- Table structure for t_movie
-- ----------------------------
DROP TABLE IF EXISTS `t_movie`;
CREATE TABLE `t_movie` (
  `id` int(11) NOT NULL,
  `movie_intel_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `actors` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `duration` varchar(255) DEFAULT NULL,
  `pic` varchar(255) DEFAULT NULL,
  `release_time` datetime(6) DEFAULT NULL,
  `score` double DEFAULT NULL,
  `show_time` datetime(6) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `want_see` bigint(20) DEFAULT NULL,
  `show_movies_id` int(11) DEFAULT NULL,
  `movie_img` varchar(255) DEFAULT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc338r323jee1mtbptafv54p3g` (`show_movies_id`),
  CONSTRAINT `FKc338r323jee1mtbptafv54p3g` FOREIGN KEY (`show_movies_id`) REFERENCES `t_show` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_movie
-- ----------------------------
BEGIN;
INSERT INTO `t_movie` VALUES (1, 'Dying To Survive', '徐峥 周一围 王传君 谭卓', '一位不速之客的意外到访，打破了神油店老板程勇的平凡人生，他从一个交不起房租的男性保健品商贩，一跃成为印度仿制药“格列宁”的独家代理商。收获巨额利润的他，生活剧烈变化，被病患们冠以“药神”的称号。但是，一场关于救赎的拉锯战也在波涛暗涌中慢慢展开。', '文牧野', '中国大陆', '117', '/image/yaoshen1.jpg', '2020-02-11 15:07:14.000000', 9.6, '2020-02-06 15:07:31.000000', '剧情/喜剧', 123, 1, '/image/yaoshen.jpg', '我不是药神');
INSERT INTO `t_movie` VALUES (2, 'Skyscraper', '道恩·强森 内芙·坎贝尔', '在香港市中心，世界上最高、结构最复杂的摩天大楼遭到破坏，危机一触即发。威尔·索耶（道恩·强森 饰）的妻子萨拉（内芙·坎贝尔 饰）和孩子们在98层被劫为人质，直接暴露在火线上。威尔，这位战争英雄、前联邦调查局救援队员，作为大楼的安保顾问，却被诬陷纵火和谋杀。他必须奋力营救家人，为自己洗脱罪名，关乎生死存亡的高空任务就此展开。', '罗森·马歇尔·瑟伯', '美国', '102', '/image/motian1.jpg', '2020-02-19 16:02:21.000000', 8.9, '2020-02-05 16:02:26.000000', '动作/冒险/剧情', 344, 2, '/image/motian.jpg', '摩天营救');
INSERT INTO `t_movie` VALUES (3, 'The Wind Guardians', '路知行 阎萌萌 褚珺 边江', '数千年前，上古四大凶兽为祸人间，被上古侠岚用秘术“风语咒”封印，如今四大凶兽之一“饕餮”即将在千年的沉寂后复苏，然而“风语咒”秘术却早已失传。双目失明但乐观开朗的少年郎明与母亲相依为命，母子二人平日里插科打诨，感情至深。虽然父亲多年前失踪，但郎明始终铭记着父亲传授给自己的一句秘诀，那是传说中的失传秘术“风语咒”…… ', '刘阔', '中国大陆', '105', '/image/fenyu1.jpg', '2020-02-18 16:06:18.000000', 8.8, '2020-02-20 17:03:44.000000', '动画/冒险/奇幻', 45, 3, '/image/fenyu.jpg', '风语咒');
INSERT INTO `t_movie` VALUES (4, 'The Meg', '杰森·斯坦森 李冰冰', '一项由中国主导的国际科研项目正在马里亚纳海沟深处进行，却突遭未知生物攻击，科研人员被困海底。前美国海军陆战队深海潜水专家乔纳斯·泰勒（杰森·斯坦森饰）受命前往营救，再度遭遇数年前曾在深海给自己留下终身难以磨灭记忆的史前生物巨齿鲨。乔纳斯联手科研项目中的中国女科学家张苏茵（李冰冰饰）成功营救了被困人员，但营救行动却发生了一系列意外，当史前巨兽巨齿鲨逃离深海，众人将面临一场史无前例的灾难危机。', '乔·德特杜巴', '美国', '115', '/image/jusha1.jpg', '2020-02-18 11:20:41.000000', 9.4, '2020-02-27 17:04:01.000000', '动作/冒险/剧情', 321, 4, '/image/jusha.jpg', '巨齿鲨');
COMMIT;

-- ----------------------------
-- Table structure for t_movie_has_seen_users
-- ----------------------------
DROP TABLE IF EXISTS `t_movie_has_seen_users`;
CREATE TABLE `t_movie_has_seen_users` (
  `has_seen_id` int(11) NOT NULL,
  `has_seen_users_id` int(11) NOT NULL,
  KEY `FKtcdn02n2auyod4rdwyv6oprgu` (`has_seen_users_id`),
  KEY `FKden4klnaugoteyek0g0ol4uen` (`has_seen_id`),
  CONSTRAINT `FKden4klnaugoteyek0g0ol4uen` FOREIGN KEY (`has_seen_id`) REFERENCES `t_movie` (`id`),
  CONSTRAINT `FKtcdn02n2auyod4rdwyv6oprgu` FOREIGN KEY (`has_seen_users_id`) REFERENCES `t_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_movie_has_seen_users
-- ----------------------------
BEGIN;
INSERT INTO `t_movie_has_seen_users` VALUES (1, 1);
INSERT INTO `t_movie_has_seen_users` VALUES (2, 1);
COMMIT;

-- ----------------------------
-- Table structure for t_movie_want_see_users
-- ----------------------------
DROP TABLE IF EXISTS `t_movie_want_see_users`;
CREATE TABLE `t_movie_want_see_users` (
  `want_see_id` int(11) NOT NULL,
  `want_see_users_id` int(11) NOT NULL,
  KEY `FK5be5bojlpq5liyrddmbhphhfp` (`want_see_users_id`),
  KEY `FKatd5ha6vf7ki2w3h8dk2niyex` (`want_see_id`),
  CONSTRAINT `FK5be5bojlpq5liyrddmbhphhfp` FOREIGN KEY (`want_see_users_id`) REFERENCES `t_user` (`id`),
  CONSTRAINT `FKatd5ha6vf7ki2w3h8dk2niyex` FOREIGN KEY (`want_see_id`) REFERENCES `t_movie` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_movie_want_see_users
-- ----------------------------
BEGIN;
INSERT INTO `t_movie_want_see_users` VALUES (3, 1);
COMMIT;

-- ----------------------------
-- Table structure for t_show
-- ----------------------------
DROP TABLE IF EXISTS `t_show`;
CREATE TABLE `t_show` (
  `id` int(11) NOT NULL,
  `price` varchar(255) DEFAULT NULL,
  `time` varchar(255) DEFAULT NULL,
  `cinema_id` int(11) DEFAULT NULL,
  `movie_id` int(11) NOT NULL,
  `version` varchar(255) DEFAULT NULL,
  `show_ting` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKw248g17hg18jwacijlgyhatx` (`cinema_id`),
  KEY `FKaifcr8sfbwxk6wq6as4crvojg` (`movie_id`),
  CONSTRAINT `FKaifcr8sfbwxk6wq6as4crvojg` FOREIGN KEY (`movie_id`) REFERENCES `t_movie` (`id`),
  CONSTRAINT `FKw248g17hg18jwacijlgyhatx` FOREIGN KEY (`cinema_id`) REFERENCES `t_cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_show
-- ----------------------------
BEGIN;
INSERT INTO `t_show` VALUES (1, '15', '', 1, 1, '原版3D', '1');
INSERT INTO `t_show` VALUES (2, '20', '434232', 1, 2, '原版3D', '2');
INSERT INTO `t_show` VALUES (3, '13', '23232', 1, 3, '国语2D', '3');
INSERT INTO `t_show` VALUES (4, '20', '1321321', 1, 4, '原版2D', '4');
COMMIT;

-- ----------------------------
-- Table structure for t_show_cinemas
-- ----------------------------
DROP TABLE IF EXISTS `t_show_cinemas`;
CREATE TABLE `t_show_cinemas` (
  `show_movies_id` int(11) NOT NULL,
  `cinemas_id` int(11) NOT NULL,
  KEY `FKhuf5px74jvt9itelhpejy8owe` (`cinemas_id`),
  KEY `FKclgl1rpxc8ql3lh2giykcyu6f` (`show_movies_id`),
  CONSTRAINT `FKclgl1rpxc8ql3lh2giykcyu6f` FOREIGN KEY (`show_movies_id`) REFERENCES `t_show` (`id`),
  CONSTRAINT `FKhuf5px74jvt9itelhpejy8owe` FOREIGN KEY (`cinemas_id`) REFERENCES `t_cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_show_cinemas
-- ----------------------------
BEGIN;
INSERT INTO `t_show_cinemas` VALUES (1, 1);
INSERT INTO `t_show_cinemas` VALUES (2, 1);
INSERT INTO `t_show_cinemas` VALUES (3, 1);
INSERT INTO `t_show_cinemas` VALUES (4, 1);
INSERT INTO `t_show_cinemas` VALUES (1, 2);
COMMIT;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL,
  `img` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_3oxjtwmmv402td4jd4v9ys3d2` (`img`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
BEGIN;
INSERT INTO `t_user` VALUES (1, '/image/wei.jpg', '202cb962ac59075b964b07152d234b70', '188533', 'user');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
