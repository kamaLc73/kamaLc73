#ifdef HAVE_CONFIG_H
#include <config.h>
#endif

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void permute        (char *lettre, char *lettrebis);   
void remise_en_ordre(char *chaine);                   
int  check          (char *ch);                       


int main(int argc, char *argv[])
{
    char *ch = NULL;
    ch = (char*) malloc(1000 * sizeof (char));
    
    if (ch == NULL) {
        fprintf(stderr, "Memory allocation failed\n");
        return EXIT_FAILURE;
    }
    
    printf("Enter a string: ");
    if (fgets(ch, 1000, stdin) == NULL) {
        fprintf(stderr, "Error reading input\n");
        free(ch);
        return EXIT_FAILURE;
    }
    
    remise_en_ordre(ch);
    
    free(ch);
    return EXIT_SUCCESS;
}


void   permute(char *lettre, char *lettrebis)
{
  char temp;
  temp = *lettre;
  *lettre = *lettrebis;
  *lettrebis = temp;
}

void  remise_en_ordre(char *ch)
{
  int i;

  for (i = 1; i < strlen(ch); i++)
  {
    if (ch[i - 1] >= ch[i])
      permute(&ch[i], &ch[i - 1]);

    if ((i == strlen(ch) - 1) && (check(ch) == 1))
      i = 0;
  }

  printf("%s", ch);
}

int   check(char *ch)
{
  int j;

  for (j = 1; j < strlen(ch); j++)
  {
    if (ch[j - 1] > ch[j])
      return EXIT_FAILURE;
  }
  return EXIT_SUCCESS;
}


