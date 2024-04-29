#include <stdio.h>
#include <stdlib.h>

typedef struct point {
	int x;
	int y;
};

void saisirPoint(point * p) {
	printf("\nEntrez le x : ");
	scanf("%d", &p->x);
	printf("Entrez le y : ");
	scanf("%d", &p->y);
}

void afficherPoint(point p) {
	printf("\nPoint[%d, %d]", p.x, p.y);
}

void saisirTabPoint(point * T, int n) {
	for(int i = 0; i < n; i++) {
		saisirPoint(T+i);
	}
}
void afficherTabPoint(point * T, int n) {
	printf("\nLes elements du tableau sont : \n");
	for(int i = 0; i < n; i++) {
		afficherPoint(*(T+i));
	}
}
int main() {	
/*	point p1;
	saisirPoint(&p1);	
	afficherPoint(p1);
*/
/*	point * p2;
	p2 = (point *)malloc(sizeof(point));
	saisirPoint(p2);
	afficherPoint(*p2);
*/
//	Tableau Statique
//	point T[3];

//	Tableau Dynamique
	point * T;
	T = (point *)malloc(sizeof(point) * 3);

	saisirTabPoint(T, 3);
	afficherTabPoint(T, 3);

}



