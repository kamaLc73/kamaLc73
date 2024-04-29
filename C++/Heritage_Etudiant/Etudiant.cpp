#include <iostream>
#include <string>
#include "Etudiant.h"

using namespace std;

void Etudiant::saisie()
{
    cout<< "Nom de l'etudiant : ";
    cin>> this->nom;
    cout<< "Prenom de l'etudiant : ";
    cin>> this->prenom;
    cout<< "Saisie des notes (3 notes au total) :\n";
    for (int i = 0; i < 3; ++i) 
    {
        cout<< "Note " << i + 1 << " : ";
        cin>> this->tabnotes[i];
    }		
};

void Etudiant::affichage()
{
    cout << this->nom << " " << this->prenom << endl;	
};

float Etudiant::moyenne()
{
    int sum = 0;
    for (int i = 0; i < 3; i++) 
    {
        sum = sum + this->tabnotes[i];
    }
    return sum/ 3.0;	
}; 


int Etudiant::admis() 
{
    if (Etudiant::moyenne() > 10.0) 
        return 1;
    else 
        return 0;  
};

int Etudiant::exae_quo(Etudiant E) 
{
    if (E.moyenne() == moyenne()) 
        return 1;
    else 
        return 0;
};

