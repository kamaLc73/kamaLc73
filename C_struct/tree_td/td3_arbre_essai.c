#include <stdio.h>
#include <stdlib.h>

typedef enum {
    false = 0,
    true = 1
} bool;

typedef struct ArbreBinaire {
	int valeur ;
	struct ArbreBinaire* gauche;
    struct ArbreBinaire* droite;	
}ArbreBinaire;

ArbreBinaire* creerElement(int valeur) {
    ArbreBinaire* nouvelElement = (ArbreBinaire*)malloc(sizeof(ArbreBinaire));
    nouvelElement->valeur = valeur;
    nouvelElement->gauche = NULL;
    nouvelElement->droite = NULL;
    return nouvelElement;
}

ArbreBinaire* insererElement(ArbreBinaire* racine, int valeur) {
    if (racine == NULL) {
        return creerElement(valeur);
    }

    if (valeur < racine->valeur) {
        racine->gauche = insererElement(racine->gauche, valeur);
    } else if (valeur > racine->valeur) {
        racine->droite = insererElement(racine->droite, valeur);
    }

    return racine;
}

ArbreBinaire* creerArbre(int sequence[], int taille) {
    ArbreBinaire* racine = NULL;
    for (int i = 0; i < taille; i++) {
        racine = insererElement(racine, sequence[i]);
    }
    return racine;
}

void afficherEnOrdreCroissant(ArbreBinaire* racine) {
    if (racine == NULL) {
        return;
    }
    afficherEnOrdreCroissant(racine->gauche);
    printf("%d ", racine->valeur);
    afficherEnOrdreCroissant(racine->droite);
}

void afficherDecroissant(ArbreBinaire* racine) {
    if (racine == NULL) {
        return;
    }
    afficherDecroissant(racine->droite);
    printf("%d ", racine->valeur);
    afficherDecroissant(racine->gauche);
}

// Fonction pour calculer le nombre de n�uds de l'arbre
int nbElements(ArbreBinaire* racine) {
    if (racine == NULL) {
        return 0;
    }
    return 1 + nbElements(racine->gauche) + nbElements(racine->droite);
}

// Fonction pour calculer le nombre de feuilles de l'arbre
int nbFeuilles(ArbreBinaire* racine) {
    if (racine == NULL) {
        return 0;
    }
    if (racine->gauche == NULL && racine->droite == NULL) {
        return 1;
    }
    return nbFeuilles(racine->gauche) + nbFeuilles(racine->droite);
}

// Fonction pour afficher les feuilles de l'arbre en ordre croissant
void afficherFeuilles(ArbreBinaire* racine) {
    if (racine == NULL) {
        return;
    }
    if (racine->gauche == NULL && racine->droite == NULL) {
        printf("%d ", racine->valeur);
    }
    afficherFeuilles(racine->gauche);
    afficherFeuilles(racine->droite);
}

// Fonction pour calculer la profondeur de l'arbre
int calculerProfondeur(ArbreBinaire* racine) {
    if (racine == NULL) {
        return 0;
    }
    int profondeurGauche = calculerProfondeur(racine->gauche);
    int profondeurDroite = calculerProfondeur(racine->droite);
    return 1 + (profondeurGauche > profondeurDroite ? profondeurGauche : profondeurDroite);
}

// Fonction bool�enne pour chercher un �l�ment dans l'arbre
bool chercherElement(ArbreBinaire* racine, int valeur) {
    if (racine == NULL) {
        return false;
    }
    if (racine->valeur == valeur) {
        return true;
    }
    if (valeur < racine->valeur) {
        return chercherElement(racine->gauche, valeur);
    } else {
        return chercherElement(racine->droite, valeur);
    }
}

// Fonction pour trouver la valeur minimale dans l'arbre
ArbreBinaire* minValeurNoeud(ArbreBinaire* noeud) {
    ArbreBinaire* courant = noeud;
    while (courant->gauche != NULL) {
        courant = courant->gauche;
    }
    return courant;
}

// Fonction pour supprimer un �l�ment de l'arbre
ArbreBinaire* supprimerElement(ArbreBinaire* racine, int valeur) {
    if (racine == NULL) {
        return racine;
    }

    if (valeur < racine->valeur) {
        racine->gauche = supprimerElement(racine->gauche, valeur);
    } else if (valeur > racine->valeur) {
        racine->droite = supprimerElement(racine->droite, valeur);
    } else {
        if (racine->gauche == NULL) {
            ArbreBinaire* temp = racine->droite;
            free(racine);
            return temp;
        } else if (racine->droite == NULL) {
            ArbreBinaire* temp = racine->gauche;
            free(racine);
            return temp;
        }

        ArbreBinaire* temp = minValeurNoeud(racine->droite);
        racine->valeur = temp->valeur;
        racine->droite = supprimerElement(racine->droite, temp->valeur);
    }

    return racine;
}

/*// Fonction pour enregistrer l'arbre dans un fichier
void enregistrerArbreFichier(FILE* fichier, ArbreBinaire* racine) {
    if (racine == NULL) {
        return;
    }
    fprintf(fichier, "%d\n", racine->valeur);
    enregistrerArbreFichier(fichier, racine->gauche);
    enregistrerArbreFichier(fichier, racine->droite);
}

// Fonction pour initialiser un arbre � partir du contenu d'un fichier
ArbreBinaire* initialiserArbreFichier(FILE* fichier) {
    int valeur;
    ArbreBinaire* racine = NULL;
    while (fscanf(fichier, "%d", &valeur) != EOF) {
        racine = insererElement(racine, valeur);
    }
    return racine;
}*/

int menu() {
    int choix;
    printf("Menu:\n");
    printf("1. Creer un arbre a partir de la sequence\n");
    printf("2. Afficher l'arbre en ordre croissant\n");
    printf("3. Afficher l'arbre en ordre d�croissant\n");
    printf("4. Nombre de noeuds dans l'arbre\n");
    printf("5. Nombre de feuilles dans l'arbre\n");
    printf("6. Afficher les feuilles de l'arbre en ordre croissant\n");
    printf("7. Calculer la profondeur de l'arbre\n");
    printf("8. Rechercher un element dans l'arbre\n");
    printf("9. Supprimer un element de l'arbre\n");
    printf("10. Quitter\n");
    printf("Choix: ");
    scanf("%d", &choix);
    return choix;
}





int main(){

ArbreBinaire* arbre = NULL;
	int taille ;
	printf("Entrer la taille de la sequence : ");scanf("%d",&taille);
    int sequence[taille] ;
    printf("Entrer les elements de la sequence : ");
    for(int i = 0 ; i<taille ; i++){
		scanf("%d",sequence+i);
	}
    
    int choix;
    do {
        choix = menu();
        switch (choix) {
            case 1:
                arbre = creerArbre(sequence, taille);
                printf("Arbre cree a partir de la szquence.\n");
                break;
            case 2:
                printf("Arbre en ordre croissant: ");
                afficherEnOrdreCroissant(arbre);
                printf("\n");
                break;
            case 3:
                printf("Arbre en ordre dzcroissant: ");
                afficherDecroissant(arbre);
                printf("\n");
                break;
            case 4:
                printf("Nombre de noeuds dans l'arbre : %d\n", nbElements(arbre));
                break;
            case 5:
                printf("Nombre de feuilles dans l'arbre : %d\n", nbFeuilles(arbre));
                break;
            case 6:
                printf("Feuilles de l'arbre en ordre croissant: ");
                afficherFeuilles(arbre);
                printf("\n");
                break;
            case 7:
                printf("Profondeur de l'arbre : %d\n", calculerProfondeur(arbre));
                break;
            case 8:
                int valeurRecherchee;
                printf("Entrez la valeur a rechercher : ");
                scanf("%d", &valeurRecherchee);
                if (chercherElement(arbre, valeurRecherchee)) {
                    printf("La valeur %d a ete trouvee dans l'arbre.\n", valeurRecherchee);
                } else {
                    printf("La valeur %d n'a pas ete trouvee dans l'arbre.\n", valeurRecherchee);
                }
                break;
            case 9:
                int valeurASupprimer;
                printf("Entrez la valeur a supprimer : ");
                scanf("%d", &valeurASupprimer);
                arbre = supprimerElement(arbre, valeurASupprimer);
                break;
            case 10:
                printf("Au revoir!\n");
                break;
            default:
                printf("Choix invalide. Reessayez.\n");
        }
    } while (choix != 10);

    return 0;
}
