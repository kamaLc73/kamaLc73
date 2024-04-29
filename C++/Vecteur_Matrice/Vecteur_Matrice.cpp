#include <iostream>
using namespace std;
class matrice;


class vecteur{
	int V[3];
	public:
		vecteur(int v1[3]);
		vecteur();
		void afficher();
		friend vecteur produit(matrice , vecteur );
};
 
vecteur::vecteur(){
	for(int i = 0;i<3;i++){
		V[i]=0;
	}
}

vecteur::vecteur(int v1[3]){
	for(int i=0; i<3;i++){
		V[i] = v1[i] ;
	}
}

void vecteur::afficher(){
	cout<<"("<<V[0]<<","<<V[1]<<","<<V[2]<<")"<<endl;
}


//++++++++++++++++++++++++++++++
class matrice{
	int M[3][3];
	public :
		matrice(int M1[3][3]);
		friend vecteur produit(matrice , vecteur );	
};

matrice::matrice(int M1[3][3]){
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			M[i][j] = M1[i][j];
		}
	}	
}
//+++++++++++++++++++++++++++++
vecteur produit (matrice m,vecteur v){
	vecteur vect ;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		vect.V[i] += m.M[j][i] * v.V[j];
		}
	}
	return vect;
}
int main() {

	int matList[3][3] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    matrice mat(matList);

    int vectList[3] = {2, 3, 4};
    vecteur vec(vectList);

    cout << "Vecteur : ";
    vec.afficher();

    vecteur resultat = produit(mat, vec);

    cout << "Resultat du produit : ";
    
    resultat.afficher();

    return 0;
}


