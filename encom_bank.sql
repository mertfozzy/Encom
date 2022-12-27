-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2022 at 06:41 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `encom_bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `kullanici_id` int(11) NOT NULL,
  `ad_soyad` varchar(50) NOT NULL,
  `tc_no` varchar(11) NOT NULL,
  `tel_no` varchar(11) NOT NULL,
  `guvenlik_sorusu` varchar(75) NOT NULL,
  `guvenlik_cevap` varchar(75) NOT NULL,
  `musteri_no` varchar(20) NOT NULL,
  `sifre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Dumping data for table `kullanicilar`
--

INSERT INTO `kullanicilar` (`kullanici_id`, `ad_soyad`, `tc_no`, `tel_no`, `guvenlik_sorusu`, `guvenlik_cevap`, `musteri_no`, `sifre`) VALUES
(1, 'Mert Altuntaş', '33593258862', '05435426330', 'Who is your favorite superhero?', 'Superman', '6789745', '6800'),
(2, 'Mercan Gamze Altuntaş', '54574560040', '05452054452', 'Where do you want to live?', 'cekmekoy', '8857868', '8186'),
(3, 'Alperen Demirtürkoğlu', '21213234345', '54765374882', 'Where do you want to live?', 'RASATHANE', '7300594', '1162');

-- --------------------------------------------------------

--
-- Table structure for table `kullanici_bakiye`
--

CREATE TABLE `kullanici_bakiye` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `bakiye` decimal(10,2) NOT NULL,
  `musteri_no` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `kullanici_faturalar`
--

CREATE TABLE `kullanici_faturalar` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `elektrik` decimal(10,2) NOT NULL,
  `su` decimal(10,2) NOT NULL,
  `dogalgaz` decimal(10,2) NOT NULL,
  `internet` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_turkish_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`kullanici_id`),
  ADD UNIQUE KEY `tc_no` (`tc_no`),
  ADD UNIQUE KEY `musteri_no` (`musteri_no`);

--
-- Indexes for table `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kullanici_id` (`kullanici_id`),
  ADD UNIQUE KEY `musteri_no` (`musteri_no`);

--
-- Indexes for table `kullanici_faturalar`
--
ALTER TABLE `kullanici_faturalar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kullanici_id` (`kullanici_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `kullanici_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `kullanici_faturalar`
--
ALTER TABLE `kullanici_faturalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
