#include<stdio.h>

void permuterValeur(int x, int y) {
	int tmp = x;
	x = y;
	y = tmp;
}

void permuterAdresse(int * x, int * y) {
	int tmp = *x;
	*x = *y;
	*y = tmp;
}

int main() {

	int x = 4, y = 6;
	
	printf("\nAvant, x = %d, y = %d", x, y);
//	permuterValeur(x, y);
	permuterAdresse(&x, &y);
	printf("\nApres, x = %d, y = %d", x, y);
	
}



