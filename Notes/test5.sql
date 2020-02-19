/*
 Navicat Premium Data Transfer

 Source Server         : MYSQL-MAC
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : test5

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 19/02/2020 10:37:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `category_type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of category
-- ----------------------------
BEGIN;
INSERT INTO `category` VALUES (1, 'Foodgrains,Oil,Masala');
INSERT INTO `category` VALUES (2, 'Dairy, Bakery and Snacks');
INSERT INTO `category` VALUES (3, 'Beverages');
INSERT INTO `category` VALUES (4, 'Beauty and Hygiene');
INSERT INTO `category` VALUES (5, 'Cleaning');
INSERT INTO `category` VALUES (6, 'Electonics');
INSERT INTO `category` VALUES (7, 'Mobiles');
INSERT INTO `category` VALUES (8, 'Cloths');
INSERT INTO `category` VALUES (9, 'Vegetables');
INSERT INTO `category` VALUES (10, 'Baby care');
INSERT INTO `category` VALUES (11, 'Stationery');
COMMIT;

-- ----------------------------
-- Table structure for communication
-- ----------------------------
DROP TABLE IF EXISTS `communication`;
CREATE TABLE `communication` (
  `address_id` int(11) NOT NULL,
  `addr_line1` varchar(255) DEFAULT NULL,
  `addr_line2` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `hno` varchar(255) DEFAULT NULL,
  `land_mark` varchar(255) DEFAULT NULL,
  `mobile_number` bigint(20) NOT NULL,
  `pincode` int(11) NOT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of communication
-- ----------------------------
BEGIN;
INSERT INTO `communication` VALUES (1, 'First Street', 'Shanthi Nagar', 'Hyderabad', '10-10', 'MG road', 9876563465, 409765, 'TN');
INSERT INTO `communication` VALUES (2, 'Second Main Road', 'Pragathi Apartments', 'Kolkata', '76-32/2', 'New Town', 8765437654, 876543, 'WB');
INSERT INTO `communication` VALUES (3, 'James Street', 'Second Main road', 'Pune', '87-21/4', 'SP road', 8765453245, 876545, 'MH');
INSERT INTO `communication` VALUES (4, 'Sriram Nagar Colony', 'balaji Nagar', 'Secunderabad', '10-10/1', 'Near main busstop', 7654237659, 500086, 'TS');
COMMIT;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `user_id` varchar(255) NOT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `email_address` varchar(255) DEFAULT NULL,
  `mobile_number` mediumtext,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of customer
-- ----------------------------
BEGIN;
INSERT INTO `customer` VALUES ('user1', 'Praveen', 'user1@abc.com', '7093882336');
INSERT INTO `customer` VALUES ('user2', 'James', 'user2@abc.com', '6532876534');
INSERT INTO `customer` VALUES ('user3', 'Ozvitha', 'user3@abc.com', '8754342387');
INSERT INTO `customer` VALUES ('user4', 'Navneeth', 'user4@abc.com', '9876354323');
INSERT INTO `customer` VALUES ('user5', 'Maya', 'user5@abc.com', '7643876754');
COMMIT;

-- ----------------------------
-- Table structure for delivery_address
-- ----------------------------
DROP TABLE IF EXISTS `delivery_address`;
CREATE TABLE `delivery_address` (
  `user_id` varchar(255) NOT NULL,
  `address_id` int(11) NOT NULL,
  UNIQUE KEY `UK_7hpdm1y6rngkgi0ht2k6yail` (`address_id`),
  KEY `delivery_address_ibfk_1` (`user_id`),
  CONSTRAINT `delivery_address_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `customer` (`user_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `delivery_address_ibfk_2` FOREIGN KEY (`address_id`) REFERENCES `communication` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of delivery_address
-- ----------------------------
BEGIN;
INSERT INTO `delivery_address` VALUES ('user1', 1);
INSERT INTO `delivery_address` VALUES ('user1', 2);
INSERT INTO `delivery_address` VALUES ('user2', 3);
INSERT INTO `delivery_address` VALUES ('user4', 4);
COMMIT;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of hibernate_sequence
-- ----------------------------
BEGIN;
INSERT INTO `hibernate_sequence` VALUES (1);
COMMIT;

-- ----------------------------
-- Table structure for images
-- ----------------------------
DROP TABLE IF EXISTS `images`;
CREATE TABLE `images` (
  `image_id` int(11) NOT NULL,
  `image_path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`image_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of images
-- ----------------------------
BEGIN;
INSERT INTO `images` VALUES (10, 'laptop1.jpeg');
INSERT INTO `images` VALUES (11, 'laptop2.jpeg');
INSERT INTO `images` VALUES (12, 'laptop3.jpeg');
INSERT INTO `images` VALUES (13, 'laptop4.jpeg');
INSERT INTO `images` VALUES (14, 'laptop5.jpeg');
INSERT INTO `images` VALUES (15, 'laptop6.jpeg');
INSERT INTO `images` VALUES (16, 'laptop7.jpeg');
INSERT INTO `images` VALUES (17, 'laptop8.jpeg');
INSERT INTO `images` VALUES (18, 'laptop9.jpeg');
INSERT INTO `images` VALUES (19, 'laptop10.jpeg');
COMMIT;

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `amount` double NOT NULL,
  `date` datetime DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  `address_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  KEY `address_id` (`address_id`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `customer` (`user_id`),
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`address_id`) REFERENCES `communication` (`address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of orders
-- ----------------------------
BEGIN;
INSERT INTO `orders` VALUES (1, 1500, '2020-02-04 13:12:37', 'user1', 1);
INSERT INTO `orders` VALUES (2, 2500, '2020-02-10 13:13:19', 'user1', 1);
INSERT INTO `orders` VALUES (3, 10000, '2020-02-02 13:13:37', 'user2', 2);
INSERT INTO `orders` VALUES (4, 90, '2020-02-12 07:51:43', 'user1', 3);
INSERT INTO `orders` VALUES (5, 10000, '2020-02-12 09:07:14', 'user4', 2);
INSERT INTO `orders` VALUES (6, 1000000, '2020-02-12 09:08:16', 'user2', 1);
INSERT INTO `orders` VALUES (7, 1000000, '2020-02-12 09:33:41', 'user1', 2);
INSERT INTO `orders` VALUES (8, 50000, '2020-02-12 15:24:07', 'user2', 1);
INSERT INTO `orders` VALUES (9, 230000, '2020-02-12 22:35:28', 'user2', 3);
COMMIT;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` int(11) NOT NULL,
  `date` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `category_id` int(11) DEFAULT NULL,
  `brand_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FK1mtsbur82frn64de7balymq9s` (`category_id`),
  CONSTRAINT `FK1mtsbur82frn64de7balymq9s` FOREIGN KEY (`category_id`) REFERENCES `category` (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product
-- ----------------------------
BEGIN;
INSERT INTO `product` VALUES (1, '2020-02-11', 'Sony Remote Controller', 'sony-remote.jpeg', 'Sony Remore Controller', 3500, 6, 'Sony');
INSERT INTO `product` VALUES (2, '2020-02-15', 'Apple Mac Book Pro with Intel I7', 'mac-lap.jpeg', 'Mac Book Pro', 250000, 6, 'Apple');
INSERT INTO `product` VALUES (3, '2020-02-02', 'Red Ink', 'red-pen.jpeg', 'Pen', 35, 11, 'Renalts');
INSERT INTO `product` VALUES (4, '2020-01-17', '100 Pages White Note Book', 'notebook.jpeg', 'Note Book', 86, 11, 'Nandi');
INSERT INTO `product` VALUES (5, '2020-02-17', 'Samsung Sa=mart Mobile', 'samsung-mobile.jpeg', 'Mobile', 65000, 7, 'Samsung');
COMMIT;

-- ----------------------------
-- Table structure for product_images
-- ----------------------------
DROP TABLE IF EXISTS `product_images`;
CREATE TABLE `product_images` (
  `product_id` int(11) NOT NULL,
  `image_id` int(11) NOT NULL,
  UNIQUE KEY `UK_faiw41ddc6nywa21m1nodqvy5` (`image_id`),
  KEY `FKi8jnqq05sk5nkma3pfp3ylqrt` (`product_id`),
  CONSTRAINT `FK1j9bvqvvdudsd1ydm4fr0y3bk` FOREIGN KEY (`image_id`) REFERENCES `images` (`image_id`),
  CONSTRAINT `FKi8jnqq05sk5nkma3pfp3ylqrt` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of product_images
-- ----------------------------
BEGIN;
INSERT INTO `product_images` VALUES (1, 10);
INSERT INTO `product_images` VALUES (1, 11);
INSERT INTO `product_images` VALUES (1, 12);
INSERT INTO `product_images` VALUES (1, 13);
INSERT INTO `product_images` VALUES (1, 14);
INSERT INTO `product_images` VALUES (1, 15);
INSERT INTO `product_images` VALUES (1, 16);
INSERT INTO `product_images` VALUES (1, 17);
INSERT INTO `product_images` VALUES (1, 18);
INSERT INTO `product_images` VALUES (1, 19);
COMMIT;

-- ----------------------------
-- Table structure for review
-- ----------------------------
DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
  `id` int(11) NOT NULL,
  `author` varchar(255) DEFAULT NULL,
  `body` varchar(255) DEFAULT NULL,
  `stars` int(11) NOT NULL,
  `product_id` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKiyof1sindb9qiqr9o8npj8klt` (`product_id`),
  CONSTRAINT `FKiyof1sindb9qiqr9o8npj8klt` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of review
-- ----------------------------
BEGIN;
INSERT INTO `review` VALUES (1024, 'user1', 'Very Good laptop', 5, 2, '2020-02-02');
INSERT INTO `review` VALUES (1025, 'user3', 'Display issues', 2, 3, '2020-02-01');
INSERT INTO `review` VALUES (1026, 'user1', 'Great Pen', 5, 4, '2019-11-19');
INSERT INTO `review` VALUES (1027, 'user1', 'Note Book  is very short', 3, 5, '2020-01-18');
INSERT INTO `review` VALUES (1028, 'user2', 'Nice Laptop', 5, 2, '2020-02-16');
INSERT INTO `review` VALUES (1029, 'user3', 'Heating issues', 3, 2, '2020-02-10');
INSERT INTO `review` VALUES (1030, 'user2', 'Nice Phone', 5, 3, '2020-01-04');
INSERT INTO `review` VALUES (1031, 'user1', 'Changing from 2 starts to 1 star after 6 months usage. Very bad quality', 1, 1, '2020-02-17');
COMMIT;

-- ----------------------------
-- Table structure for user_details
-- ----------------------------
DROP TABLE IF EXISTS `user_details`;
CREATE TABLE `user_details` (
  `user_id` varchar(255) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_role` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user_details
-- ----------------------------
BEGIN;
INSERT INTO `user_details` VALUES ('admin', 'admin', 'admin');
INSERT INTO `user_details` VALUES ('user1', 'user1', 'user');
INSERT INTO `user_details` VALUES ('user2', 'user2', 'user');
INSERT INTO `user_details` VALUES ('user3', 'user3', 'user');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
