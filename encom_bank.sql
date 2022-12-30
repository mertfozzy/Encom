-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2022 at 06:19 AM
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
(7, 'Mert Altuntaş', '33593258862', '05435426330', 'What is your favorite object?', 'computer', '7890325', '2023'),
(8, 'Alperen Demirtürkoğlu', '54269795565', '53726549845', 'Where do you want to live?', 'rasathane', '1247998', '3509'),
(9, 'Mercan Gamze Altuntaş', '65989224652', '05466595565', 'What is your pet name?', 'scott', '6481002', '5209'),
(10, 'Kaan Çeliktaş', '89879231455', '05426326584', 'Where do you want to live?', 'London', '4728700', '3855'),
(11, 'Adem Onur Öztaş', '64846512314', '05421688794', 'Who is your favorite superhero?', 'Elon Musk', '6401960', '4744'),
(12, 'Berkay Narin', '47897563121', '05369854654', 'What is your favorite object?', 'langırt', '3359203', '4394'),
(13, 'Deniz Güneş', '54498465131', '05426498465', 'What is your pet name?', 'tekir', '4922471', '6568'),
(14, 'Özgecan Işık', '89865413131', '05389456616', 'Who is your favorite superhero?', 'Wonder Woman', '161755', '4344');

--
-- Triggers `kullanicilar`
--
DELIMITER $$
CREATE TRIGGER `bakiye_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanici_bakiye(kullanici_id,bakiye,musteri_no) VALUES(NEW.kullanici_id,0,NEW.musteri_no)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `bakiye_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanici_bakiye
WHERE kullanici_id = OLD.kullanici_id
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanici_faturalar(kullanici_id,elektrik,su,dogalgaz,internet) VALUES(
	NEW.kullanici_id,
    35 + RAND() * 465,
    35 + RAND() * 465,
    35 + RAND() * 465,
    35 + RAND() * 465
)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanici_faturalar
WHERE kullanici_id = OLD.kullanici_id
$$
DELIMITER ;

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

--
-- Dumping data for table `kullanici_bakiye`
--

INSERT INTO `kullanici_bakiye` (`id`, `kullanici_id`, `bakiye`, `musteri_no`) VALUES
(3, 7, '0.00', '7890325'),
(4, 8, '0.00', '1247998'),
(5, 9, '0.00', '6481002'),
(6, 10, '0.00', '4728700'),
(7, 11, '0.00', '6401960'),
(8, 12, '0.00', '3359203'),
(9, 13, '0.00', '4922471'),
(10, 14, '0.00', '161755');

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
-- Dumping data for table `kullanici_faturalar`
--

INSERT INTO `kullanici_faturalar` (`id`, `kullanici_id`, `elektrik`, `su`, `dogalgaz`, `internet`) VALUES
(2, 7, '47.41', '311.60', '450.77', '354.06'),
(3, 8, '475.85', '160.62', '270.55', '370.87'),
(4, 9, '294.24', '380.90', '56.79', '36.23'),
(5, 10, '285.92', '75.69', '415.67', '421.27'),
(6, 11, '356.82', '340.57', '132.40', '70.28'),
(7, 12, '427.69', '435.78', '395.80', '171.68'),
(8, 13, '75.53', '105.79', '267.36', '54.45'),
(9, 14, '213.58', '382.75', '307.99', '356.69');

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
  MODIFY `kullanici_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `kullanici_faturalar`
--
ALTER TABLE `kullanici_faturalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
