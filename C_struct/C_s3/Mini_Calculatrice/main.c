#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{



    printf(" Voici une mini calculatrice : \n ");
    printf("[Press any key to continue .]\n");
    getch();
    char op ;
    float x , y, max ;
    printf("Entrer l'operation desire parmi : +,-,*,/,p(pow),s(sqrt),c(ceil),f(floor),l(ln),n(nature),m(max) -->  ");
    scanf("%c",&op);
    switch (op) {
        case '+':
        printf(" Entrer le nombre le premier nombre  : ");
        scanf("%f",&x);
        printf(" Entrer le nombre le deuxieme nombre : ");
        scanf("%f",&y);
        printf(" Le resultat de x + y est  %.2f",x+y);
        break;
        case '-' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Entrer le nombre y : ");
        scanf("%f",&y);
        printf(" Le resultat de x - y est  %.2f",x-y);
        break;
        case '*' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Entrer le nombre y : ");
        scanf("%f",&y);
        printf(" Le resultat de x * y est  %.2f",x*y);
        break;
        case '/' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Entrer le nombre y : ");
        scanf("%f",&y);
        printf(" Le resultat de x / y est  %.2f",x/y);
        break;
        case 'p' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Entrer le nombre y : ");
        scanf("%f",&y);
        printf(" Le resultat de pow(x , y) est  %.2f ",pow(x,y));
        break;
        case 's' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Le resultat de sqrt(x) est  %.2f ",sqrt(x));
        break;
        case 'c' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Le resultat de ceil(x) est  %.2f ",ceil(x));
        break;
        case 'f' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Le resultat de floor(x) est  %.2f ",floor(x));
        break;
        case 'l' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Le resultat de ln(x) est  %.2f ",log(x));
        break;
        case 'n':
        printf(" Entrer le nombre : ");
        scanf("%f",&x);
        if ( x < 0 )
        printf(" Ce nombre est negatif ! \n ");
        else if ( x > 0 )
        printf(" Ce nombre est positif ! \n ");
        else
        printf(" Ce nombre est nul ! \n ");
        break;
        case 'm' :
        printf(" Entrer le nombre x : ");
        scanf("%f",&x);
        printf(" Entrer le nombre y : ");
        scanf("%f",&y);
        max = x ;
        if ( y > max )
        max = y ;
        printf(" Le maximum entre les deux nombre est : %.2f \n ",max);
        break;
        default :
        printf(" Erreur \n ");
                }
    getch();
    return 0;
}
