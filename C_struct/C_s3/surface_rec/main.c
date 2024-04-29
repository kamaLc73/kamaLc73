#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <conio.h> // For getch()


int main()
{
    float a , b , surf;
    printf("Entrer la longueur a du rectangle : ");
    scanf("%f",&a);
    printf("Entrer la largeur b du rectangle : ");
    scanf("%f",&b);
    surf = a*b ;
    printf("La surface du rectangle est : %.2f",surf);
    getch();
    return 0;
}
