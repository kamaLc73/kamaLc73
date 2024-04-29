#include <stdio.h>
#include <stdlib.h>

void remplirTab(int * T, int n) {
	for(int i = 0; i < n; i++) {
		printf("Entrez un nbre : ");
		scanf("%d", T+i);
	}
}

void afficherTab(int * T, int n) {
	printf("\nLes elements du tableau sont : \n");
	for(int i = 0; i < n; i++) {
		printf("%d\t", *(T+i));
	}
}

int max1(int * T, int n) {
	int m = *T;
	for(int i = 1; i < n; i++) {
		if(*(T+i) > m)
			m = *(T+i);
	}
	return m;
}

int max2(int * T, int n) {
	int m = *T;
	int indice = 0;
	for(int i = 1; i < n; i++) {
		if(*(T+i) > m) {
			m = *(T+i);
			indice = i;
		}
	}
	return indice;
}

int * max3(int * T, int n) {
	return T+ max2(T, n);
}

void max4(int * T, int n, int * m) {
	*m = *T;
	for(int i = 1; i < n; i++) {
		if(*(T+i) > *m)
			*m = *(T+i);
	}
}

int main() {
	int T[4];	
	
	remplirTab(T, 4);
	afficherTab(T, 4);
	
	printf("\n max1 : %d", max1(T, 4));	
	printf("\n max2 : %d", *(T+max2(T, 4)));	
	printf("\n max3 : %d", *max3(T, 4));	
	int m;
	max4(T, 4, &m);
	printf("\n max4 : %d", m);	
	
}


