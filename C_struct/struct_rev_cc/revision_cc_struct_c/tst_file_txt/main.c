#include <stdio.h>
#include <stdlib.h>


int main() {
	FILE * f_IN;
	char c[]= "file_text_been_modified_by_me " ;
	f_IN = fopen("tst0txt.txt","r+");
	if((f_IN = fopen("tst0txt.txt", "r+")) == NULL) {
		printf("Impossible d ouvrir le fichier \n");
	}

	fprintf(f_IN, "%s",c);

	fclose(f_IN);
	
	
	
	return 0;
}
