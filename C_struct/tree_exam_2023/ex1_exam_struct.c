#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

typedef struct arbre{
    int valeur;
    struct arbre * fg;
    struct arbre * fd;

}arbre;


arbre * creerArbre(int valeur, arbre *fg, arbre *fd){
    arbre *a = (arbre *) malloc(sizeof(arbre));
    if(a!=NULL){
    a->valeur = valeur ;
    a->fd = fd ;
    a->fg = fg ;
    }
    return a;
}

void detruireArbre(arbre *a){
    if (a != NULL) {
        detruireArbre(a->fg);
        detruireArbre(a->fd);
        free(a);
    }
}

int nbrDeNoeud(arbre *a){
    if(a!= NULL){
        return 1 + nbrDeNoeud(a->fd) + nbrDeNoeud(a->fg);
    }
    else
        return 0;
}


void afficherArbreCroissant(arbre *a){
    if(a!= NULL){
      afficherArbreCroissant(a->fg);
      printf("%d",a->valeur);
      afficherArbreCroissant(a->fd);
    }
    else
        return;
}

void afficherArbre2(arbre* a) {
    if (a == NULL) {
        printf("_");
    } else {
        printf("{");
        afficherArbre2(a->fg);
        printf(",%d,", a->valeur);
        afficherArbre2(a->fd);
        printf("}");
    }
}


arbre *inserer(arbre *a,int valeur){
    if(a==NULL)
        return creerArbre(valeur,NULL,NULL);
    else if(valeur < a->valeur)
        a->fg = inserer(a->fg,valeur);
    else
        a->fd = inserer(a->fd,valeur);
    return a;
}


arbre *trouverNoeud(arbre *a,int valeur){
    if(a == NULL || a->valeur == valeur)
        return a;
    if(valeur < a->valeur)
        return trouverNoeud(a->fg,valeur);
    else if(valeur > a->valeur)
        return trouverNoeud(a->fd,valeur);
    else return NULL;

}

int comparer(arbre* a1,arbre* a2) {
    if (a1 == NULL && a2 == NULL) {
        return 0;
    }
    else if (a1 == NULL && a2 != NULL || a2 == NULL && a1 != NULL) {
        return 1;
    }
    else if (a1->valeur != a2->valeur) {
        return 1;
    }
    else {
        if (comparer(a1->fg, a2->fg) == 1)
            return 1;
        else comparer(a1->fd, a2->fd);
    }
}


int verifierAux(arbre* a, int min, int max) {
    if (a == NULL) {
        return 1;
    }
    if (a->valeur < min || a->valeur > max) {
        return 0;
    }
    return verifierAux(a->fg, min, a->valeur - 1) &&
           verifierAux(a->fd, a->valeur + 1, max);
}

int verifier(arbre* a) {
    return verifierAux(a, INT_MIN, INT_MAX);
}

int remplirTableauAvecArbre(arbre* a, int tab[], int pos) {
    if (a != NULL) {
        pos = remplirTableauAvecArbre(a->fg, tab, pos);
        tab[pos++] = a->valeur;
        pos = remplirTableauAvecArbre(a->fd, tab, pos);
    }
    return pos;
}

void trierTableauAvecArbre(int tab[], int taille) {
    arbre* a = NULL ;
    for (int i = 0; i < taille; i++) {
        inserer(a, tab[i]);
    }
    remplirTableauAvecArbre(a, tab, 0);
    detruireArbre(a);
}

int main() {

    arbre *racine1 = creerArbre(5,NULL,NULL);

    inserer(racine1, 4);
    inserer(racine1, 3);
    inserer(racine1, 6);
    inserer(racine1, 7);


    arbre *racine2 = creerArbre(5,NULL,NULL);

    inserer(racine2, 4);
    inserer(racine2, 1);
    inserer(racine2, 6);
    inserer(racine2, 100);


    verifier(racine1);


    //printf("%d",comparer(racine1,racine2));











    //printf("Nombre de noeud : %d \n",nbrDeNoeud(racine1));
    //printf("Arbre en ordre croissant : ");
    //afficherArbreCroissant(racine1);
    //printf("\n");
    //printf("Arbre formate : ");
    //afficherArbre2(racine1);
    //printf("\n");
    //printf("%d",trouverNoeud(racine,7));
    //printf("%d",trouverNoeud(racine1,1));

    return 0;
}
