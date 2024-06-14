-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 29 mai 2024 à 17:00
-- Version du serveur : 8.2.0
-- Version de PHP : 8.2.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `suivi_alpha`
--

-- --------------------------------------------------------

--
-- Structure de la table `rapport`
--

DROP TABLE IF EXISTS `rapport`;
CREATE TABLE IF NOT EXISTS `rapport` (
  `id` int NOT NULL AUTOINCREMENT,
  `statistique_id` int DEFAULT NULL,
  `interpretation` text,
  PRIMARY KEY (`id`),
  KEY `statistique_id` (`statistique_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `rapport`
--

INSERT INTO `rapport` (`id`, `statistique_id`, `interpretation`) VALUES
(1, 1, 'Bon travail!'),
(2, 2, 'Peut mieux faire.'),
(3, 3, 'Excellent!'),
(4, 4, 'Très bien.'),
(5, 5, 'À améliorer.');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
