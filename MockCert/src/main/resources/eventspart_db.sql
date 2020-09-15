-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 15, 2020 at 06:48 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `eventspart_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `events`
--

CREATE TABLE `events` (
  `event_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `event_date` date NOT NULL,
  `venue` varchar(25) NOT NULL,
  `max_count` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `events`
--

INSERT INTO `events` (`event_id`, `name`, `event_date`, `venue`, `max_count`) VALUES
(1001, 'singing', '2020-05-05', 'Dallas', 100),
(1002, 'Dancing', '2020-05-05', 'DFW', 150),
(1003, 'painting', '2020-05-05', 'Houston', 20),
(1004, 'coding', '2020-05-05', 'Grapevine', 120),
(1005, 'DJ', '2020-05-05', 'Garland', 50),
(1006, 'karate', '2020-05-05', 'Mesquite', 75);

-- --------------------------------------------------------

--
-- Table structure for table `participant`
--

CREATE TABLE `participant` (
  `participant_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email_id` varchar(100) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `registration_date` date NOT NULL,
  `event_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `participant`
--

INSERT INTO `participant` (`participant_id`, `name`, `email_id`, `gender`, `registration_date`, `event_id`) VALUES
(40, 'Jack', 'jack@infy.com', 'M', '2020-06-12', 1001),
(41, 'Mack', 'mack@infy.com', 'M', '2020-06-12', 1002),
(42, 'Wil', 'wil@infy.com', 'M', '2020-06-13', 1001),
(43, 'John', 'john@infy.com', 'M', '2020-06-12', 1006),
(44, 'Warner', 'warner@infy.com', 'M', '2020-06-11', 1005),
(45, 'James', 'james@infy.com', 'M', '2020-06-14', 1005),
(46, 'Johny', 'johny@infy.com', 'M', '2020-06-13', 1004),
(47, 'peter', 'peter@infy.com', 'M', '2020-06-12', 1003),
(48, 'smith', 'smith@infy.com', 'M', '2020-06-12', 1006),
(49, 'Chris', 'chris@infy.com', 'M', '2020-06-14', 1004),
(50, 'Alice', 'alice@infy.com', 'M', '2020-06-13', 1005),
(51, 'Bethany', 'beth@infy.com', 'M', '2020-06-14', 1003),
(52, 'Allen', 'allen@infy.com', 'M', '2020-06-11', 1002);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`event_id`),
  ADD UNIQUE KEY `name` (`name`);

--
-- Indexes for table `participant`
--
ALTER TABLE `participant`
  ADD PRIMARY KEY (`participant_id`),
  ADD UNIQUE KEY `email_id` (`email_id`),
  ADD KEY `fs_event_participant_fk` (`event_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `participant`
--
ALTER TABLE `participant`
  MODIFY `participant_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=53;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `participant`
--
ALTER TABLE `participant`
  ADD CONSTRAINT `fs_event_participant_fk` FOREIGN KEY (`event_id`) REFERENCES `events` (`event_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
