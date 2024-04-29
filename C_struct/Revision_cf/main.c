#include<stdio.h>
#include<stdlib.h>


typedef struct noeud {
	int data;
	struct noeud * fg;
	struct noeud * fd;
}noeud;

noeud * creerNoeud(int data) {
	noeud * nv = (noeud *)malloc(sizeof(noeud));
	nv->data = data;
	nv->fg = nv->fd = NULL;
	return nv;
}

void insererNoeud(noeud ** rac, noeud * nv) {
	if(*rac == NULL)
		*rac = nv;
	else if(nv->data < (*rac)->data) {
		//gauche
		insererNoeud(&((*rac)->fg), nv);
	} else if(nv->data > (*rac)->data) {
		//droite
		insererNoeud(&((*rac)->fd), nv);
	} else {
		return;
	}
}

noeud * creerArbre() {
	int n, data;
	noeud * rac = NULL;
	noeud * nv;
	printf("Entrez le nbre d'elements : ");
	scanf("%d", &n);
	for (int i = 0; i < n; i++){
		printf("Entrez un nbre : ");
		scanf("%d", &data);
		nv = creerNoeud(data);
		insererNoeud(&rac, nv);
	}
	return rac;
}


void afficherArbreCroissant(noeud * rac) {
	if(rac != NULL) {
		afficherArbreCroissant(rac->fg);
		printf("%d\t", rac->data);
		afficherArbreCroissant(rac->fd);
	}
}

void afficherArbreDecroissant(noeud * rac) {
	if(rac != NULL) {
		afficherArbreDecroissant(rac->fd);
		printf("%d\t", rac->data);
		afficherArbreDecroissant(rac->fg);
	}
}

int taille(noeud * rac) {
	if(rac == NULL)
		return 0;
	else
		return 1 + taille(rac->fg) + taille(rac->fd);
}

int max2(int x, int y) {
	return x > y ? x : y;
}

int hauteur(noeud * rac) {
	if(rac == NULL)
		return 0;
	else
		return 1 + max2(hauteur(rac->fg), hauteur(rac->fd));
}

int main() {
	noeud * rac = NULL;
	rac = creerArbre();
	printf("\nAfficherArbreCroissant : \n");
	afficherArbreCroissant(rac);
	printf("\nAfficherArbreDecroissant : \n");
	afficherArbreDecroissant(rac);
	printf("\nTaille : %d\n", taille(rac));
	printf("\nHauteur : %d\n", hauteur(rac));

	return 0;
}











