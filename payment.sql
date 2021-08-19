/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50735
 Source Host           : localhost:3306
 Source Schema         : springcloud

 Target Server Type    : MySQL
 Target Server Version : 50735
 File Encoding         : 65001

 Date: 19/08/2021 20:05:36
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for payment
-- ----------------------------
DROP TABLE IF EXISTS `payment`;
CREATE TABLE `payment`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `serial` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = COMPACT;

-- ----------------------------
-- Records of payment
-- ----------------------------
INSERT INTO `payment` VALUES (31, 'aaabbb01');
INSERT INTO `payment` VALUES (32, 'rawchen');
INSERT INTO `payment` VALUES (33, NULL);
INSERT INTO `payment` VALUES (34, 'test');
INSERT INTO `payment` VALUES (35, NULL);
INSERT INTO `payment` VALUES (36, 'test2');

SET FOREIGN_KEY_CHECKS = 1;
