#include <iostream>
#include <cstring>
using namespace std;


    class etudiant {
        string nom;
        string prenom;
        float T[5];
    public:
        void saisie();
        void affichage();
        float moyenne();
        int admis();
        int exae_quo(etudiant );
    };


   void etudiant::saisie(){
       cout<<"donnez le nom : "<<endl;
       cin>>nom;
       cout<<"donnez le prenom : "<<endl;
       cin>>prenom;
       cout<<"donnez les notes : "<<endl;
       for(int i=0;i<5;i++){
        cin>>T[i];
       }
    }

  void etudiant::affichage(){
      cout<<"le nom de l'etudiant est "<<nom<<" et son prenom :"<<prenom<<endl;
            for(int i=0;i<5;i++){
                cout<<" note"<<i<<":"<<T[i]<<endl;
            }
  }

    float etudiant::moyenne(){
        float moy;
        for(int i=0;i<5;i++){
            moy+=T[i];
        }
        return moy/5;
    }

    int etudiant::admis(){
        float a= moyenne();
        if (a>10){
            return 1;
        }
        return 0;
    }


    int etudiant::exae_quo(etudiant e){
      return(moyenne()==e.moyenne());
    }


    class etudiant_en_maitrise : public etudiant{
        float note_memoire;
    public:
        void saisie();
        void affichage();
        int admis();
        int exae_quo(etudiant_en_maitrise e);
    };


    void etudiant_en_maitrise::saisie(){
        etudiant::saisie();
        cout<<"donnez la note du memoire : "<<endl;
        cin>>note_memoire;
    }


    void etudiant_en_maitrise::affichage(){
        etudiant::affichage();
        cout<<"la note du memoire est : "<<note_memoire<<endl;
    }

    int etudiant_en_maitrise::admis(){
        if(etudiant::admis()==1 && (note_memoire>=10)){
            return 1;
        }
        return 0;
    }

    int etudiant_en_maitrise::exae_quo(etudiant_en_maitrise e){
        if((etudiant::exae_quo(e)==1) && (note_memoire=e.note_memoire)){
            return 1;
    }
        return 0;
    }



int main(){
   /* etudiant e1;
    e1.saisie();
    e1.affichage();
    if((e1.admis())==1)
        cout<<"letudiant est admis"<<endl;
    else
       cout<<"letudiant n'est pas  admis"<<endl;

    etudiant e2;
    e2.saisie();
    e2.affichage();
    if((e2.admis())==1)
        cout<<"letudiant est admis"<<endl;
    else
       cout<<"letudiant n'est pas  admis"<<endl;

     if((e1.exae_quo(e2))==1)
        cout<<"les etudiants sont exae-quo"<<endl;
    else
       cout<<"les etudiant ne sont pas exae-quo"<<endl;
*/
    etudiant_en_maitrise e3;
    e3.saisie();
    e3.affichage();
    if((e3.admis())==1)
        cout<<"letudiant est admis"<<endl;
    else
       cout<<"letudiant n'est pas  admis"<<endl;

    etudiant_en_maitrise e4;
    e4.saisie();
    e4.affichage();
    if((e4.admis())==1)
        cout<<"l'etudiant est admis"<<endl;
    else
       cout<<"l'etudiant n'est pas  admis"<<endl;

    if((e3.exae_quo(e4))==1)
        cout<<"les etudiants sont exae-quo"<<endl;
    else
       cout<<"les etudiant ne sont pas exae-quo"<<endl;

return 0;
}
