/*
SQLyog Ultimate v11.11 (32 bit)
MySQL - 5.6.23 : Database - boottest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`boottest` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `boottest`;

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `user_id` varchar(96) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `name` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `sex` int(1) DEFAULT NULL,
  `job` varchar(1500) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

insert  into `users`(`user_id`,`name`,`age`,`sex`,`job`) values ('1','xiaoming',12,1,'3'),('10','xiaoming',12,1,'学生'),('11','xiaoming',12,1,'ѧ��'),('11111','xiaoming',12,1,'4'),('12','xiaoming',12,1,'ѧ��3'),('13','xiaoming',12,1,'学生3'),('14','32',32,1,'的水电费水电费'),('2','xiaoming',12,1,'的'),('3','xiaoming',12,1,'4'),('333333','xiaoming',12,1,'4'),('4','xiaoming',12,1,'3'),('444444','xiaoming',12,1,'4'),('6','xiaoming',12,1,'水电费'),('7','xiaoming',12,1,'发'),('8','xiaoming',12,1,'是的'),('9','xiaoming',12,1,'二位');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
