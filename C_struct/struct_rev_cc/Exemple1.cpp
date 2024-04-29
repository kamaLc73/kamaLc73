#include<stdio.h>
#include<stdlib.h>

void remplirTab(int * T, int n) {
	int i;
	for (i = 0; i < n; i++) {
		printf("Entrez un nbre : ");
		scanf("%d", &T[i]);
	}	
}

void afficherTab(int * T, int n) {
	int i;
	for (i = 0; i < n; i++) {
		printf("%d\t", T[i]);
	}	
}

int sommeTab(int * T, int n) {
	int i, som = 0;
	for (i = 0; i < n; i++) {
		som = som + T[i];
	}
	return som;
}

float moyenneTab(int * T, int n) {
	return (float) sommeTab(T, n) / n;
}


int main() {
//	int Tab[4];

	int * Tab;
	Tab = (int *)malloc(sizeof(int) * 4);
	
	remplirTab(Tab, 4);
	afficherTab(Tab, 4);
	printf("\n la somme est : %d", sommeTab(Tab, 4));
	printf("\n la moyenne est : %f", moyenneTab(Tab, 4));
		
}



