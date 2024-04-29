#include <iostream>
#include <string>
#include "Etudiant_en_Maitrise.h"

using namespace std;

void Etudiant_en_Maitrise::saisie() 
{
	Etudiant::saisie();
	cout<<"Note Memoire :"<<endl;
	cin>>this->note_memoire; 	
}

void Etudiant_en_Maitrise::affichage() 
{
	Etudiant::affichage();
	cout<<"Note Memoire : "<<this->note_memoire<<endl;
}

float Etudiant_en_Maitrise::moyenne() 
{
	;
	return Etudiant::moyenne() + (this->note_memoire/3.0);	
}

int Etudiant_en_Maitrise::admis()
{
	if(Etudiant::admis()==1 && this->note_memoire == 1)
		return 1;
	else 
		return 0;  	
}	
