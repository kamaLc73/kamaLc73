#include<stdio.h>
#include<stdlib.h>

typedef struct noeud {
	int val;
	noeud * suiv;
};

noeud * creerNoeud(int val) {
	noeud * nv = (noeud *)malloc(sizeof(noeud));
	nv->val = val;
	nv->suiv = NULL;
	return nv;
}

noeud * creerListe() {
	int n, val;
	noeud * rac;
	noeud * parc;
	noeud * nv;
	printf("Entrez le nbre d'elements : ");
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		printf("Entrez un nbre : ");
		scanf("%d", &val);
		nv = creerNoeud(val);
		if(i == 0) {
			rac = nv;
			parc = nv;
		} else {
			parc->suiv = nv;
			parc = parc->suiv;
		}
	}
	return rac;
}

void afficherListe(noeud * rac) {
	if(rac == NULL)	
		printf("\nListe vide !!\n");
	else {
		noeud * parc = rac;
		printf("\nLes elements de la liste sont : \n");
		while(parc != NULL) {
			printf("%d\t", parc->val);
			parc = parc->suiv;
		}
	}
}

void afficherListeRecursive(noeud * rac) {
	if(rac != NULL){
		printf("%d\t", rac->val);
		afficherListeRecursive(rac->suiv);
	}
}

void afficherListeInverse(noeud * rac) {
	if(rac != NULL){
		afficherListeInverse(rac->suiv);
		printf("%d\t", rac->val);
	}
}

void ajouterDebut(noeud ** rac, int val) {
	if(*rac == NULL)
		*rac = creerNoeud(val);
	else {
		noeud * nv = creerNoeud(val);
		nv->suiv = *rac;
		*rac = nv;
	}
}

void ajouterFin(noeud ** rac, int val) {
	if(*rac == NULL)
		*rac = creerNoeud(val);
	else {
		noeud * parc = *rac;
		while(parc->suiv != NULL) {
			parc = parc->suiv;
		}
		parc->suiv = creerNoeud(val);
	}	
}

void supprimerDebut(noeud ** rac) {
	if(*rac == NULL)
		return ;
	else if((*rac)->suiv == NULL) {
		free(*rac);
		*rac = NULL;
	}
	else {
		noeud * tmp = *rac;
		*rac = (*rac)->suiv;
		free(tmp);
	}
}

void supprimerFin(noeud ** rac) {
	if(*rac == NULL)
		return;
	else if((*rac)->suiv == NULL) {
		free(*rac);
		*rac = NULL;
	}
	else {
		noeud * parc = *rac;
		while(parc->suiv->suiv != NULL) {
			parc = parc->suiv;
		}
		noeud * tmp = parc->suiv;
		free(tmp);
		parc->suiv = NULL;
	}
}

int main() {
	noeud * rac = NULL;
/*
	afficherListe(rac);
	rac = creerListe();
//	afficherListe(rac);
	printf("\nLes elements de la liste sont : \n");
	afficherListeRecursive(rac);
	printf("\nLes elements de la liste en inverse sont : \n");
	afficherListeInverse(rac);
*/
//	ajouterDebut(&rac, 1);
//	ajouterDebut(&rac, 2);
//	ajouterDebut(&rac, 3);
	ajouterFin(&rac, 1);
	ajouterFin(&rac, 2);
	ajouterFin(&rac, 3);
	afficherListe(rac);
//	supprimerDebut(&rac);
	supprimerFin(&rac);
	afficherListe(rac);
//	supprimerDebut(&rac);
	supprimerFin(&rac);
	afficherListe(rac);
//	supprimerDebut(&rac);
	supprimerFin(&rac);
	afficherListe(rac);

}

