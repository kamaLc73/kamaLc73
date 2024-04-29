#include <stdio.h>
#include <stdlib.h>

typedef struct date{
	int j , a , m;
}date;

void saisirDate1(date *d){
	
	printf("Entrer la date : ");
	scanf("%d  %d  %d",&d->j,&d->m,&d->a);
	
}

date saisirDate2(){
	
	date d ;
	saisirDate1(&d);
	return d;
}

void  afficherDate(date *d){
	printf("\t %d / %d / %d \n", d->j,d->m,d->a);
	
}

int compareDate(date d1, date d2){
	if( d1.a > d2.a ){
		return 1;
	}
		
	else if(d1.a < d2.a ){
		return -1;
	}
	
	else {
		if(d1.a == d2.a ){
			if( d1.m > d2.m ){
				return 1;
			}
		
			else if(d1.m < d2.m ){
				return -1;
			}
			else {
				if( d1.j > d2.j ){
					return 1;
				}
		
				else if(d1.j < d2.j ){
					return -1;
				}
				
				else {
					return 0;
				}		
				}
	   }                 	
	}
} 






int main() {	
	 
	date d1 ,d2;
	printf("Methode 1 : \n");
	printf("\n");
	saisirDate1(&d1);
	afficherDate(&d1);
	printf("\nMethode 2 : \n");
	printf("\n");
	d2 = saisirDate2();
	afficherDate(&d2);
	printf("\n Resultat comparaison : %d  ", compareDate(d1,d2));
	
	
	
	return 0;
}
