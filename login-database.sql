-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2022 at 01:04 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `login-database`
--

-- --------------------------------------------------------

--
-- Table structure for table `all_orders`
--

CREATE TABLE `all_orders` (
  `Order_ID` varchar(40) NOT NULL,
  `Date` varchar(40) NOT NULL,
  `Customer_ID` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `all_orders`
--

INSERT INTO `all_orders` (`Order_ID`, `Date`, `Customer_ID`) VALUES
('001', '22-04-2022', 'Demo'),
('2', '2', 'Customer ID'),
('3', '3', 'Customer ID'),
('4', '4', 'Customer ID'),
('5', '5', 'Demo'),
('6', '6', 'Demo'),
('7', '7', '002'),
('8', '8', '002'),
('9', '9', '18101712'),
('10', '10', '005');

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `ID` varchar(40) NOT NULL,
  `Category` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`ID`, `Category`) VALUES
('IDA001', 'Oil'),
('IDA001', 'Oil_Demo'),
('', ''),
('002', 'demo'),
('03', 'test'),
('004', 'cse310');

-- --------------------------------------------------------

--
-- Table structure for table `customerpage`
--

CREATE TABLE `customerpage` (
  `ID` varchar(40) NOT NULL,
  `First_Name` varchar(30) NOT NULL,
  `Last_Name` varchar(20) NOT NULL,
  `Contact` varchar(40) NOT NULL,
  `Email` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customerpage`
--

INSERT INTO `customerpage` (`ID`, `First_Name`, `Last_Name`, `Contact`, `Email`) VALUES
('Demo', 'Sarowar ', 'Jahan', '01521583359', 'sarowar.saurav27@gmail.com'),
('002', 'Demo', 'Test', '01711976014', 's@gmail.com'),
('18101712', 'Sarowar', 'Jahan', '01027381', 's@gmail.com'),
('1234', 'xyz', 'abc', '46235', 'a@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `loginpage`
--

CREATE TABLE `loginpage` (
  `full_name` varchar(30) NOT NULL,
  `last_name` varchar(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(30) NOT NULL,
  `confirm_password` varchar(30) NOT NULL,
  `contact` varchar(30) NOT NULL,
  `address` varchar(40) NOT NULL,
  `type` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loginpage`
--

INSERT INTO `loginpage` (`full_name`, `last_name`, `username`, `password`, `confirm_password`, `contact`, `address`, `type`) VALUES
('Saurav', 'Jahan', 'sau01521', '1234', '1234', '01521583359', '43/24/b', ''),
('admin', 'test', 'admin', '1234', '1234', '01711976014', 'Mohakhali', 'admin'),
('user', 'test', 'user', '1234', '1234', '01917959601', 'BracU', 'user');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `id` varchar(40) NOT NULL,
  `name` varchar(50) NOT NULL,
  `quantity` varchar(40) NOT NULL,
  `price` varchar(40) NOT NULL,
  `description` varchar(30) NOT NULL,
  `category` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `name`, `quantity`, `price`, `description`, `category`) VALUES
('IDP001', 'Fresh', '100', '160', 'Imported', 'Oil'),
('002', 'Rupchada', '200', '158', 'Imported', 'Oil'),
('003', 'Soap', '200', '25', '#63', 'test'),
('005', 'xyz', '100', '10', 'cvsdh', 'cse310');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
