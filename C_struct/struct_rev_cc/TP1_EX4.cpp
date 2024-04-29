#include<stdio.h>
#include<stdlib.h>
#include<string.h>

typedef struct person {
	char * nom;
	int age;
}person;

void saisirPerson(person * p) {
	p->nom = (char *)malloc(sizeof(char) * 30);
	printf("Entrez le nom : ");
	scanf("%s", p->nom);
	printf("Entrez l'age : ");
	scanf("%d", &p->age);	
}

void afficherPerson(person p) {
	printf("\nPerson[%s, %d]", p.nom, p.age);
}

void saisirTabPerson(person * T, int n) {
	for(int i = 0; i < n; i++) {
		saisirPerson(T+i);
	}
}

void saisirTabAdressPerson(person ** T, int n) {
	for(int i = 0; i < n; i++) {
		saisirPerson(*(T+i));
	}
}

void afficherTabPerson(person * T, int n) {
	for(int i = 0; i < n; i++) {
		afficherPerson(*(T+i));
	}
}

void afficherTabAdressPerson(person ** T, int n) {
	for(int i = 0; i < n; i++) {
		afficherPerson(**(T+i));
	}
}

void classerTabPerson(person * T, int n) {
	int trier = 0;
	while(trier != 1) {
		trier = 1;
		for(int i = 0; i < n-1; i++) {
			if((*(T+i)).age < (*(T+i+1)).age) {		// ou bien if (T[i].age < T[i+1].age)
				trier = 0;
				person p = *(T+i);
				*(T+i) = *(T+i+1);
				*(T+i+1) = p;
			}
		}
	}	
}

void classerTabAdressPerson(person ** T, int n) {
	int trier = 0;
	while(trier != 1) {
		trier = 1;
		for(int i = 0; i < n-1; i++) {
			if((*(T+i))->age < (*(T+i+1))->age) {		// ou bien if (T[i]->age < T[i+1]->age)
				trier = 0;
				person * p = *(T+i);
				*(T+i) = *(T+i+1);
				*(T+i+1) = p;
			}
		}
	}	
}

int main() {

	person fs1[3];	
	saisirTabPerson(fs1, 3);
	afficherTabPerson(fs1, 3);
	classerTabPerson(fs1, 3);
	afficherTabPerson(fs1, 3);

	person * fd1;
	fd1 = (person *)malloc(3 * sizeof(person));	
	saisirTabPerson(fd1, 3);
	afficherTabPerson(fd1, 3);
	classerTabPerson(fd1, 3);
	afficherTabPerson(fd1, 3);

	person * fs2[3];
	for(int i = 0; i < 3; i++) {
		fs2[i] = (person *)malloc(sizeof(person));
	}
	saisirTabAdressPerson(fs2, 3);
	afficherTabAdressPerson(fs2, 3);
	classerTabAdressPerson(fs2, 3);
	afficherTabAdressPerson(fs2, 3);

	person ** fd2;
	fd2 = (person **)malloc(3 * sizeof(person *));
	for(int i = 0; i < 3; i++) {
		fd2[i] = (person *)malloc(sizeof(person));
	}
	saisirTabAdressPerson(fd2, 3);
	afficherTabAdressPerson(fd2, 3);
	classerTabAdressPerson(fd2, 3);
	afficherTabAdressPerson(fd2, 3);
		
}


