#include <stdio.h>
#include <stdlib.h>

typedef struct patient {
	char nom[20];
	char prenom[20];
	int age;
}patient;

typedef struct file {
	patient * T;
	int deb, fin, taille;
}file;

void saisirPatient (patient * p) {
	printf("\nEntrez le nom : ");
	scanf("%s", p->nom);
	printf("Entrez le prenom : ");
	scanf("%s", p->prenom);
	printf("Entrez l'age : ");
	scanf("%d", &p->age);
}

void afficherPatient(patient p) {
	printf("\nPatient[%s-%s-%d]", p.nom, p.prenom, p.age);
}

void init(file * f, int taille) {
	if(f == NULL)
		return;
	f->T = (patient * )malloc(sizeof(patient) * taille);
	f->deb = 0;
	f->fin = 0;
	f->taille = taille;
}

int testerVide(file f) {
	if(f.deb == f.fin)
		return 1;
	else
		return 0;
}

int testerPleine(file f) {
	if(f.deb == (f.fin + 1) % f.taille)
		return 1;
	else
		return 0;
}

void etendre(file * f, int nvTaille) {
	if(f == NULL)
		return ;
	patient * nvT = (patient *)malloc(sizeof(patient) * (f->taille + nvTaille));
	int j = 0;
	for( int i = f->deb; i != f->fin; ++i % f->taille) {
		nvT[j++] = f->T[i];
	}
	f->deb = 0;
	f->fin = j;
	f->taille = f->taille + nvTaille;
	f->T = nvT;
}

void enfiler(file * f, patient p) {
	if(f == NULL)
		return ;
	if(testerPleine(*f))
		etendre(f, 10);
	f->T[f->fin++] = p;
    f->fin %= f->taille;
}

void afficherFile(file f) {
	if(testerVide(f))
		printf("\nListe vide !!\n");
	else {
		printf("\n Debut : %d", f.deb);
		printf("\n Fin : %d", f.fin);
		printf("\n Taille : %d", f.taille);
		printf("\n Les patients de la file sont : ");
		for( int i = f.deb; i != f.fin; ++i % f.taille) {
			afficherPatient(f.T[i]);
		}
	}
}

void defiler(file * f) {
	if(f == NULL||testerVide(*f))
		return ;
	f->deb ++;
	f->deb %=f->taille;
}

void vider(file *f){
    for(int i = f->deb ;i != f->fin ;++i % f->taille){
        defiler(f);
    }
}

int nbrePatients(file f) {
	int cp = 0;
	for(int i = f.deb; i != f.fin; ++i % f.taille) {
		cp++;
	}
	return cp;
}
void sauvegarderFileFichier(file *f) {

    FILE *fichier = fopen("monFichierText.txt", "w");
    if (fichier == NULL) {
        printf("Erreur lors de l'ouverture du fichier.\n");
        return ;
    }
    else{
        for(int i = f->deb;i != f->fin; ++i % f->taille ){
            fprintf(fichier, "%s %s %d\n", f->T[i].nom, f->T[i].prenom, f->T[i].age);
        }
        fclose(fichier);
    }

}
void initialiserFileFichier(file *f) {
    FILE *fichier = fopen("monFichierText1.txt", "r");

    if (fichier == NULL) {
        printf("Fichier non trouvé. La file sera initialement vide.\n");
        init(&f,10);
        return;
    }
    patient p;
    while (fscanf(fichier,"%s %s %d\n", p.nom,p.prenom,&p.age) == 3) {
        printf("%s - %s - %d",*p.nom,*p.prenom,p.age);
        enfiler(f, p);
    }
    fclose(fichier);
}




int main() {

	file f;

	//init(&f, 3);
	//afficherFile(f);

	//patient p1,p2,p3;

	//saisirPatient(&p1);enfiler(&f,p1);afficherFile(f);
	//saisirPatient(&p2);enfiler(&f,p2);afficherFile(f);
	//saisirPatient(&p3);enfiler(&f,p3);afficherFile(f);

    //sauvegarderFileFichier(&f);

    //vider(&f);

    //afficherFile(f);
    initialiserFileFichier(&f);
    afficherFile(f);

	/*enfiler(&f, p);
	afficherFile(f);
	enfiler(&f, p);
	afficherFile(f);
	enfiler(&f, p);
	afficherFile(f);
	defiler(&f);
	afficherFile(f);
	defiler(&f);
	afficherFile(f);
	defiler(&f);
	afficherFile(f);
	nbrePatients(f);*/

return 0;
}
