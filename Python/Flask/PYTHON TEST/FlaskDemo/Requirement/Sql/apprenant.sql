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
-- Structure de la table `apprenant`
--

DROP TABLE IF EXISTS `apprenant`;
CREATE TABLE IF NOT EXISTS `apprenant` (
  `id` int NOT NULL AUTOINCREMENT,
  `nom` varchar(255) NOT NULL,
  `prenom` varchar(255) NOT NULL,
  `age` int DEFAULT NULL,
  `classe_sociale` varchar(255) DEFAULT NULL,
  `milieu` varchar(255) DEFAULT NULL,
  `niveau_initial` varchar(255) DEFAULT NULL,
  `sexe` varchar(10) DEFAULT NULL,
  `methodeApprentissage` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_username` (`username`(250))
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Déchargement des données de la table `apprenant`
--

INSERT INTO `apprenant` (`id`, `nom`, `prenom`, `age`, `classe_sociale`, `milieu`, `niveau_initial`, `sexe`, `methodeApprentissage`, `username`) VALUES
(1, 'Doe', 'John', 25, 'Classe A', 'Urbain', 'Intermédiaire', 'M', 'Visuelle', 'johndoe25'),
(2, 'Smith', 'Alice', 30, 'Classe B', 'Rural', 'Débutant', 'F', 'Auditive', 'alicesmith30'),
(3, 'Brown', 'David', 28, 'Classe C', 'Urbain', 'Avancé', 'M', 'Kinesthésique', 'davidbrown28'),
(4, 'Taylor', 'Emma', 35, 'Classe D', 'Rural', 'Intermédiaire', 'F', 'Visuelle', 'emmataylor35\n'),
(5, 'Johnson', 'Michael', 27, 'Classe E', 'Urbain', 'Débutant', 'M', 'Auditive', 'michaeljohnson27');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
