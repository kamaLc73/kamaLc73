#include <stdio.h>
#include <stdlib.h>

typedef struct date {
	int j;
	int m;
	int a;
};

void saisirDate1(date * d) {
	printf("Entrez le jour : ");
	scanf("%d", &d->j);
	printf("Entrez le mois : ");
	scanf("%d", &d->m);
	printf("Entrez l'annee : ");
	scanf("%d", &d->a);
}

void afficherDate(date d) {
	printf("\nDate[%d - %d - %d]", d.j, d.m, d.a);
}

date saisirDate2() {
	date d;
	printf("Entrez le jour : ");
	scanf("%d", &d.j);
	printf("Entrez le mois : ");
	scanf("%d", &d.m);
	printf("Entrez l'annee : ");
	scanf("%d", &d.a);
	return d;
}

int comparerDates(date d1, date d2) {
	if(d1.a > d2.a)
		return 1;
	else if (d1.a < d2.a)
		return -1;
	else if(d1.m > d2.m)
		return 1;
	else if (d1.m < d2.m)
		return -1;
	else if(d1.j > d2.j)
		return 1;
	else if (d1.j < d2.j)
		return -1;
	else
		return 0;
}


int main() {
	date d1;
	date d2;
	
	saisirDate1(&d1);
	d2 = saisirDate2();	
	
	afficherDate(d1);
	afficherDate(d2);
	
	printf("\n comparer : %d", comparerDates(d1, d2));
}

