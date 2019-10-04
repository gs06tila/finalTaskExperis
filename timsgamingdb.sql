-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Oct 04, 2019 at 09:05 AM
-- Server version: 5.7.24
-- PHP Version: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `timsgamingdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `characters`
--

CREATE TABLE `characters` (
  `id` int(11) NOT NULL,
  `level` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `class_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `characters`
--

INSERT INTO `characters` (`id`, `level`, `name`, `class_id`, `user_id`) VALUES
(1, 99, 'Gymshark', 1, 1),
(2, 30, 'blasterman', 2, 1),
(3, 999, 'LevelMaster', 4, 4),
(4, 88, 'Man1', 3, 5),
(5, 54, 'Coolguy', 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `class_role`
--

CREATE TABLE `class_role` (
  `class_id` int(11) NOT NULL,
  `abilities` varchar(255) DEFAULT NULL,
  `class_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `class_role`
--

INSERT INTO `class_role` (`class_id`, `abilities`, `class_name`) VALUES
(1, 'BubbleAttack', 'FisherMan'),
(2, 'FireBlast', 'FireMan'),
(3, 'MagnumFire', 'PoliceMan'),
(4, 'MushroomAttack', 'SuperMario');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `password`, `user_name`) VALUES
(1, 'Knutsson', 'Tim'),
(2, 'password123', 'Powerpuff'),
(3, 'BatMan', 'Superman'),
(4, 'knut123', 'Joker'),
(5, 'sad,,tmj', 'timtim');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `characters`
--
ALTER TABLE `characters`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK1wkibedrnmuavtoyv2i0qofcc` (`class_id`),
  ADD KEY `FK1pdgldxg62dv3qdexxv2q1box` (`user_id`);

--
-- Indexes for table `class_role`
--
ALTER TABLE `class_role`
  ADD PRIMARY KEY (`class_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `characters`
--
ALTER TABLE `characters`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `class_role`
--
ALTER TABLE `class_role`
  MODIFY `class_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
