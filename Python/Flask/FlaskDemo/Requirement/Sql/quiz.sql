-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mer. 29 mai 2024 à 17:01
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
-- Structure de la table `quiz`
--

DROP TABLE IF EXISTS `quiz`;
CREATE TABLE IF NOT EXISTS `quiz` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `date` date DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `difficulte` varchar(255) DEFAULT NULL,
  `duree` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `quiz`
--

INSERT INTO `quiz` (`id`, `title`, `date`, `type`, `difficulte`, `duree`) VALUES
(1, 'Quiz 1', '2024-05-20', 'Test', 'Difficile', 60),
(2, 'Quiz 2', '2024-05-21', 'Examen', 'Moyen', 45),
(3, 'Quiz 3', '2024-05-22', 'Test', 'Facile', 30),
(4, 'Quiz 4', '2024-05-23', 'Examen', 'Difficile', 75),
(5, 'Quiz 5', '2024-05-24', 'Test', 'Moyen', 45),
(6, 'Quiz Facile D\Alphabetistion1', '2024-05-29', NULL, 'Facile', NULL);

COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
