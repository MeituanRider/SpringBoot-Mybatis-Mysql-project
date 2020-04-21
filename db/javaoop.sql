/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 6.0.11-alpha-community : Database - springboot
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`springboot` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `springboot`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `country` varchar(20) NOT NULL,
  `statu` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`email`,`country`,`statu`) values 
(1,'root','root','1918308849@qq.com','Japen',1),
(2,'admin','admin','2342344@qq.com','China',1),
(3,'yan','yan','2351235@qq.com','USA',0),
(4,'Guest','guestguest','234532@qq.com','US',0),
(5,'test','test','32t5235@qq.com','Asia',0),
(6,'goodss','goodss','1234234@qq.com','Germiny',0),
(10,'a1918308849','adsfasdf','a1934542235@gmail.com','China',0),
(11,'Username','Password','12412@qq.com','China',0),
(13,'admnistrator','test','11324234234@qq.com','China',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
