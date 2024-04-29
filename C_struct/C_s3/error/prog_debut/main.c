#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <math.h>
int main()
{
  int age = 18 ;
  double gpa = 9.85 ;
  char grade  = 'A';
  char extension ='+';
  int favnum = 2520;
  char phrase[] = "Jack";
  printf(" Hello world\n");
  printf(" %s is going to the beach\n",phrase);
  printf(" %d is the age of %s\n", age ,phrase);
  printf(" %s got good marks in his exams\n",phrase);
  printf(" %c is the grade of %s\n",grade,phrase);
  printf(" %s is %d now and he got %c%c in his exams and %.2f in his GPA . \n",phrase,age,grade, extension,gpa);
  printf(" My favorite %s is %d and %.2f \n","number",favnum,2.5648*0.65385);
  printf(" le resultat de 8.65/78.23*0.23 est : %.2f\n",8.65/78.23*0.23);
  printf(" People are so crazy that they start a war for nothing\n");
  printf(" pow(2,5) =  %.2f \n",pow(2,5));
  printf(" sqrt(81) = %.2f \n",sqrt(81));
  printf(" ceil(326.848955) = %.2f \n",ceil(326.848955));
  printf(" floor(325.114525) = %.2f \n", floor(325.114525));
  /*this is for comment, its does not appear in c program for a example make a comment for notes or explanation or something else */
  const int num = 5 ;
  printf(" %d\n",num);
  /*A constant can not be modified in the next lines if we tried to change it we refer to it in const int or int const */
  char i;
  for (i=0;i<=2;i++){
    printf(" ERROR404_YOU_HAVE_BEEN_HACKED\n",i);
  };
  bool admis ;
  float x , a , b;
  printf (" Veuillez entrez une valeur pour  x :  ");
  scanf("%f",&x);
  printf (" Veuillez entrez une valeur pour  a :  ");
  scanf("%f" ,&a);
  printf (" Veuillez entrez une valeur pour  b :  ");
  scanf("%f" ,&b);
  printf(" Le resultat de ((a-b)/(a+b))*x est : %.2f\n" ,((a-b)/(a+b))*x);
  double  pi = 3.14 ;
  float r , s , p ;
  printf (" Voici un programme qui calcule la surface d'un cercle.\n");
  printf(" Veuillez entrer le rayon du cercle : ");
  scanf("%f",&r);
  do
  {
    printf(" Entrer un nombre positif : ");
    scanf("%f",&r);
  }
  while ( r < 0 );
  if ( r > 0 )  
  {
    s = pi*pow(r,2);
    p = 2*pi*r ;
    printf(" La surface du cercle est : %.2f \n ",s);
    printf("Le perimetre du cercle est : %.2f \n",p);
  }
  float c, d  ;
  printf(" entrer le devidende : ");
  scanf("%f",&d);
  printf(" entrer le diviseur : ");
  scanf("%f",&c);
  if ( c!=0 )
  {
    printf(" division par 0 est impossible veuillez entrer un autre nombre .");
    scanf("%f",&c);
  }
  else
  {
    printf(" le resultat de la division de c/d est : %.2f",c/d);
  }
  int a , b , max ;
  printf("Entrer la valeur de a : ");
  scanf("%d",&a);
  printf("Entrer la valeur de b : ");
  scanf("%d",&b);
  max = a  ;
  if ( b > max )
  {
    max = b ;
  }
  printf("Le maximum est : %d \n ",max);
  return 0;
}
