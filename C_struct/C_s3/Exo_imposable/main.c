#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <stdbool.h>


int main()
{ /*s : sexe , a : age */
    char s ;
    int a ;
    printf(" entrer votre sexe ( H , F ) :");
    scanf("%c",&s);
    printf(" entrer votre age :");
    scanf("%d",&a);
    bool c1 , c2 ;
    c1 = ( s == 'H' && a >= 20 );
    c2 = ( s == 'F' && a >=18 && a <= 35 );
    if ( c1 || c2 )
      printf("L'habitant est imposable .");
    else
      printf("L'habitant est non imposable .");
    

    return 0;
}
