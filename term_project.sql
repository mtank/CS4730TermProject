-- MySQL dump 10.13  Distrib 5.6.19, for osx10.7 (i386)
--
-- Host: localhost    Database: term_project
-- ------------------------------------------------------
-- Server version	5.6.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `blocks`
--

DROP TABLE IF EXISTS `blocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `blocks` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `meta_name` varchar(50) DEFAULT NULL,
  `pic_url` varchar(50) NOT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB AUTO_INCREMENT=161 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `blocks`
--

LOCK TABLES `blocks` WRITE;
/*!40000 ALTER TABLE `blocks` DISABLE KEYS */;
INSERT INTO `blocks` VALUES (1,'Activator Rail','activator_rail','./web/images/Sprites/Activator_Rail.png'),(2,'Anvil','anvil','./web/images/Sprites/Anvil.png'),(3,'Beacon','beacon','./web/images/Sprites/Beacon.png'),(4,'Bedrock','bedrock','./web/images/Sprites/Bedrock.png'),(5,'Birch','log:2','./web/images/Sprites/Birch.png'),(6,'Birch Sapling','sapling:2','./web/images/Sprites/Birch_Sapling.png'),(7,'Block of Coal','coal_block','./web/images/Sprites/Block_of_Coal.png'),(8,'Block of Diamond','diamond_block','./web/images/Sprites/Block_of_Diamond.png'),(9,'Block of Emerald','emerald_block','./web/images/Sprites/Block_of_Emerald.png'),(10,'Block of Gold','gold_block','./web/images/Sprites/Block_of_Gold.png'),(11,'Block of Iron','iron_block','./web/images/Sprites/Block_of_Iron.png'),(12,'Block of Quartz','quartz_block:2','./web/images/Sprites/Block_of_Quartz.png'),(13,'Block of Redstone','redstone_block','./web/images/Sprites/Block_of_Redstone.png'),(14,'Bookshelf','bookshelf','./web/images/Sprites/Bookshelf.png'),(15,'Brewing Stand','brewing_stand','./web/images/Sprites/Brewing_Stand.png'),(16,'Bricks','brick_block','./web/images/Sprites/Bricks.png'),(17,'Mushroom (Brown)','brown_mushroom','./web/images/Sprites/Brown_Mushroom.png'),(18,'Cactus','cactus','./web/images/Sprites/Cactus.png'),(19,'Cake','cake','./web/images/Sprites/Cake.png'),(20,'Carpet (Black)','carpet:15','./web/images/Sprites/Carpet_Black.png'),(21,'Carpet (Blue)','carpet:11','./web/images/Sprites/Carpet_Blue.png'),(22,'Carpet (Brown)','carpet:12','./web/images/Sprites/Carpet_Brown.png'),(23,'Carpet (Cyan)','carpet:9','./web/images/Sprites/Carpet_Cyan.png'),(24,'Carpet (Dark Grey)','carpet:7','./web/images/Sprites/Carpet_Dark_Grey.png'),(25,'Carpet (Green)','carpet:13','./web/images/Sprites/Carpet_Green.png'),(26,'Carpet (Grey)','carpet:8','./web/images/Sprites/Carpet_Grey.png'),(27,'Carpet (Light Blue)','carpet:3','./web/images/Sprites/Carpet_Light_Blue.png'),(28,'Carpet (Lime)','carpet:5','./web/images/Sprites/Carpet_Lime.png'),(29,'Carpet (Magenta)','carpet:2','./web/images/Sprites/Carpet_Magenta.png'),(30,'Carpet (Orange)','carpet:1','./web/images/Sprites/Carpet_Orange.png'),(31,'Carpet (Pink)','carpet:6','./web/images/Sprites/Carpet_Pink.png'),(32,'Carpet (Red)','carpet:14','./web/images/Sprites/Carpet_Red.png'),(33,'Carpet (White)','carpet','./web/images/Sprites/Carpet_White.png'),(34,'Carpet (Yellow)','carpet:4','./web/images/Sprites/Carpet_Yellow.png'),(35,'Cauldron','cauldron','./web/images/Sprites/Cauldron.png'),(36,'Chest','chest','./web/images/Sprites/Chest.png'),(37,'Clay','clay','./web/images/Sprites/Clay.png'),(38,'Coal_Ore','coal_ore','./web/images/Sprites/Coal_Ore.png'),(39,'Cobblestone','cobblestone','./web/images/Sprites/Cobblestone.png'),(40,'Cobweb','web','./web/images/Sprites/Cobweb.png'),(41,'Command Block','command_block','./web/images/Sprites/Command_Block.png'),(42,'Crafting Table','crafting_table','./web/images/Sprites/Crafting_Table.png'),(43,'Dandelion','yellow_flower','./web/images/Sprites/Dandelion.png'),(44,'Dark Oak','log2:1','./web/images/Sprites/Dark_Oak.png'),(45,'Dark Oak Planks','planks:5','./web/images/Sprites/Dark_Oak_Planks.png'),(46,'Daylight Sensor','daylight_detector','./web/images/Sprites/Daylight_Sensor.png'),(47,'Dead Bush','deadbush','./web/images/Sprites/Dead_Bush.png'),(48,'Detector Rail','detector_rail','./web/images/Sprites/Detector_Rail.png'),(49,'Diamond Ore','diamond_ore','./web/images/Sprites/Diamond_Ore.png'),(50,'Dispenser','dispenser','./web/images/Sprites/Dispenser.png'),(51,'Dragon Egg','dragon_egg','./web/images/Sprites/Dragon_Egg.png'),(52,'Dropper','dropper','./web/images/Sprites/Dropper.png'),(53,'Emerald Ore','emerald_ore','./web/images/Sprites/Emerald_Ore.png'),(54,'Enchantment Table','enchanting_table','./web/images/Sprites/Enchantment_Table.png'),(55,'End Portal','end_portal','./web/images/Sprites/End_Portal.png'),(56,'End Portal Frame','end_portal_frame','./web/images/Sprites/End_Portal_Frame.png'),(57,'End Stone','end_stone','./web/images/Sprites/End_Stone.png'),(58,'Ender Chest','ender_chest','./web/images/Sprites/Ender_Chest.png'),(59,'Farmland','farmland','./web/images/Sprites/Farmland.png'),(60,'Fence','fence','./web/images/Sprites/Fence.png'),(61,'Fence Gate','fence_gate','./web/images/Sprites/Fence_Gate.png'),(62,'Fern','tallgrass:2','./web/images/Sprites/Fern.png'),(63,'Fire','fire','./web/images/Sprites/Fire.png'),(64,'Furnace','furnace','./web/images/Sprites/Furnace.png'),(65,'Glass','glass','./web/images/Sprites/Glass.png'),(66,'Glowstone','glowstone','./web/images/Sprites/Glowstone.png'),(67,'Gold Ore','gold_ore','./web/images/Sprites/Gold_Ore.png'),(68,'Grass','grass','./web/images/Sprites/Grass.png'),(69,'Gravel','gravel','./web/images/Sprites/Gravel.png'),(70,'Hardened Clay','hardened_clay','./web/images/Sprites/Hardened_Clay.png'),(71,'Hay Bale','hay_block','./web/images/Sprites/Hay Bale.png'),(72,'Hopper','hopper','./web/images/Sprites/Hopper.png'),(73,'Huge Mushroom (Brown)','brown_mushroom_block','./web/images/Sprites/Huge_Brown_Mushroom.png'),(74,'Huge Mushroom (Red)','red_muchroom_block','./web/images/Sprites/Huge_Red_Mushroom.png'),(75,'Ice','ice','./web/images/Sprites/Ice.png'),(76,'Iron Bars','iron_bars','./web/images/Sprites/Iron_Bars.png'),(77,'Iron Door','iron_door','./web/images/Sprites/Iron_Door.png'),(78,'Iron Ore','iron_ore','./web/images/Sprites/Iron_Ore.png'),(79,'Jack-O-Lantern','lit_pumpkin','./web/images/Sprites/Jack-O-Lantern.png'),(80,'Jukebox','jukebox','./web/images/Sprites/Jukebox.png'),(81,'Jungle Planks','planks:3','./web/images/Sprites/Jungle_Planks.png'),(82,'Jungle Sapling','sapling:3','./web/images/Sprites/Jungle_Sapling.png'),(83,'Ladder','ladder','./web/images/Sprites/Ladder.png'),(84,'Lapis Lazuli Block','lapis_block','./web/images/Sprites/Lapis_Lazuli_Block.png'),(85,'Lapis Lazuli Ore','lapis_ore','./web/images/Sprites/Lapis_Lazuli_Ore.png'),(86,'Lava','lava','./web/images/Sprites/Lava.png'),(87,'Leaves','leaves:2','./web/images/Sprites/Leaves_1.png'),(88,'Leaves','leaves','./web/images/Sprites/Leaves_2.png'),(89,'Leaves','leaves:3','./web/images/Sprites/Leaves_3.png'),(90,'Lily Pad','waterlily','./web/images/Sprites/Lily_Pad.png'),(91,'Melon','melon_block','./web/images/Sprites/Melon.png'),(92,'Monster Spawner','mob_spawner','./web/images/Sprites/Monster_Spawner.png'),(93,'Moss Stone','mossy_cobblestone','./web/images/Sprites/Moss_Stone.png'),(94,'Mycelium','mycelium','./web/images/Sprites/Mycelium.png'),(95,'Nether Brick','nether_brick','./web/images/Sprites/Nether_Brick.png'),(96,'Nether Brick Fence','nether_brick_fence','./web/images/Sprites/Nether_Brick_Fence.png'),(97,'Nether Portal','portal','./web/images/Sprites/Nether_Portal.png'),(98,'Nether Quartz Ore','quartz','./web/images/Sprites/Nether_Quartz_Ore.png'),(99,'Nether Wart','nether_wart','./web/images/Sprites/Nether_Wart.png'),(100,'Netherrack','netherrack','./web/images/Sprites/Netherrack.png'),(101,'Note Block','noteblock','./web/images/Sprites/Note_Block.png'),(102,'Oak','log','./web/images/Sprites/Oak.png'),(103,'Oak Planks','planks','./web/images/Sprites/Oak_Planks.png'),(104,'Oak Saplings','sapling','./web/images/Sprites/Oak_Sapling.png'),(105,'Obsidian','obsidian','./web/images/Sprites/Obsidian.png'),(106,'Piston','piston','./web/images/Sprites/Piston.png'),(107,'Powered Rail','golden_rail','./web/images/Sprites/Powered_Rail.png'),(108,'Pumpkin','pumpkin','./web/images/Sprites/Pumpkin.png'),(109,'Rail','rail','./web/images/Sprites/Rail.png'),(110,'Mushroom (Red)','red_mushroom','./web/images/Sprites/Red_Mushroom.png'),(111,'Redstone Lamp','redstone_lamp','./web/images/Sprites/Redstone_Lamp.png'),(112,'Redstone Ore','redstone_ore','./web/images/Sprites/Redstone_Ore.png'),(113,'Sand','sand','./web/images/Sprites/Sand.png'),(114,'Chiseled Sandstone','sandstone:1','./web/images/Sprites/Sandstone_2.png'),(115,'Smooth Sandstone','sandstone:2','./web/images/Sprites/Sandstone_3.png'),(116,'Snow','snow','./web/images/Sprites/Snow.png'),(117,'Soul Sand','soul_sand','./web/images/Sprites/Soul_Sand.png'),(118,'Sponge','sponge','./web/images/Sprites/Sponge.png'),(119,'Spruce','log:1','./web/images/Sprites/Spruce.png'),(120,'Spruce Planks','planks:1','./web/images/Sprites/Spruce_Planks.png'),(121,'Spruce Sapling','sapling:1','./web/images/Sprites/Spruce_Sapling.png'),(122,'Stairs (Birch Planks)','birch_stairs','./web/images/Sprites/Stairs_Birch_Planks.png'),(123,'Stairs (Bricks)','brick_stairs','./web/images/Sprites/Stairs_Bricks.png'),(124,'Stairs (Cobblestone)','stone_stairs','./web/images/Sprites/Stairs_Cobblestone.png'),(125,'Stairs (Dark Oak Planks)','dark_oak_stairs','./web/images/Sprites/Stairs_Dark_Oak_Planks.png'),(126,'Stairs (Nether Brick)','nether_brick_stairs','./web/images/Sprites/Stairs_Nether_Brick.png'),(127,'Stairs (Oak Planks)','oak_stiars','./web/images/Sprites/Stairs_Oak_Planks.png'),(128,'Stairs (Sandtsone)','sandstone_stairs','./web/images/Sprites/Stairs_Sandstone.png'),(129,'Stairs (Spruce Planks)','spruce_stiars','./web/images/Sprites/Stairs_Spruce_Planks.png'),(130,'Stairs (Stone Brick)','stone_brick_stairs','./web/images/Sprites/Stairs_Stone_Brick.png'),(131,'Sticky Piston','sticky_piston','./web/images/Sprites/Sticky_Piston.png'),(132,'Stone','stone','./web/images/Sprites/Stone.png'),(133,'Stone Brick','stonebrick','./web/images/Sprites/Stone_Brick_1.png'),(134,'Mossy Stone Brick','stonebrick:1','./web/images/Sprites/Stone_Brick_2.png'),(135,'Cracked Stone Brick','stonebrick:2','./web/images/Sprites/Stone_Brick_3.png'),(136,'Chiseled Stone Brick','stonebrick:3','./web/images/Sprites/Stone_Brick_4.png'),(137,'Sugar Cane','reeds','./web/images/Sprites/Sugar_Cane.png'),(138,'TNT','tnt','./web/images/Sprites/TNT.png'),(139,'Tall Glass','tallgrass:1','./web/images/Sprites/Tall_Grass.png'),(140,'Trapdoor','trapdoor','./web/images/Sprites/Trapdoor.png'),(141,'Trapped Chest','trapped_chest','./web/images/Sprites/Trapped_Chest.png'),(142,'Vines','vine','./web/images/Sprites/Vines.png'),(143,'Water','water','./web/images/Sprites/Water.png'),(144,'Wooden Door','wooden_door','./web/images/Sprites/Wooden_Door.png'),(145,'Wool (Black)','wool:15','./web/images/Sprites/Wool_Black.png'),(146,'Wool (Blue)','wool:11','./web/images/Sprites/Wool_Blue.png'),(147,'Wool (Brown)','wool:12','./web/images/Sprites/Wool_Brown.png'),(148,'Wool (Cyan)','wool:9','./web/images/Sprites/Wool_Cyan.png'),(149,'Wool (Grey)','wool:7','./web/images/Sprites/Wool_Dark_Grey.png'),(150,'Wool (Green)','wool:13','./web/images/Sprites/Wool_Green.png'),(151,'Wool (Light Grey)','wool:8','./web/images/Sprites/Wool_Grey.png'),(152,'Wool (Light Blue)','wool:3','./web/images/Sprites/Wool_Light_Blue.png'),(153,'Wool (Lime)','wool:5','./web/images/Sprites/Wool_Lime.png'),(154,'Wool (Magenta)','wool:2','./web/images/Sprites/Wool_Magenta.png'),(155,'Wool (Orange)','wool:1','./web/images/Sprites/Wool_Orange.png'),(156,'Wool (Pink)','wool:6','./web/images/Sprites/Wool_Pink.png'),(157,'Wool (Red)','wool:14','./web/images/Sprites/Wool_Red.png'),(158,'Wool (White)','wool','./web/images/Sprites/Wool_White.png'),(159,'Wool (Yellow)','wool:4','./web/images/Sprites/Wool_Yellow.png'),(160,'Dirt','dirt','./web/images/Sprites/Dirt.png');
/*!40000 ALTER TABLE `blocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `floor_blocks`
--

DROP TABLE IF EXISTS `floor_blocks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `floor_blocks` (
  `fid` int(11) NOT NULL,
  `bid` int(11) NOT NULL,
  `x` int(11) DEFAULT NULL,
  `y` int(11) DEFAULT NULL,
  PRIMARY KEY (`fid`,`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `floor_blocks`
--

LOCK TABLES `floor_blocks` WRITE;
/*!40000 ALTER TABLE `floor_blocks` DISABLE KEYS */;
/*!40000 ALTER TABLE `floor_blocks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `floors`
--

DROP TABLE IF EXISTS `floors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `floors` (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) NOT NULL,
  `floor_num` int(11) NOT NULL,
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `floors`
--

LOCK TABLES `floors` WRITE;
/*!40000 ALTER TABLE `floors` DISABLE KEYS */;
/*!40000 ALTER TABLE `floors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schematics`
--

DROP TABLE IF EXISTS `schematics`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schematics` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `owner_uid` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `size` int(11) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schematics`
--

LOCK TABLES `schematics` WRITE;
/*!40000 ALTER TABLE `schematics` DISABLE KEYS */;
/*!40000 ALTER TABLE `schematics` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tags`
--

DROP TABLE IF EXISTS `tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tags` (
  `tid` int(11) NOT NULL AUTO_INCREMENT,
  `sid` int(11) NOT NULL,
  `value` varchar(50) NOT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tags`
--

LOCK TABLES `tags` WRITE;
/*!40000 ALTER TABLE `tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `last_access` datetime DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-07-28 18:45:00
