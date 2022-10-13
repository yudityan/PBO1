/* Ini adalah comment di c++
yang termasuk comment lebih dari 1 baris*/
// INI COMMENT HANYA BISA 1 BARIS
#include<iostream>
using namespace std;

int main(){
	int pilih, umur;
	string nama;
	
	cout<<"Masukkan nama anda : ";
	getline(cin, nama);
	cout<<"Masukkan umur anda : ";
	cin>>umur;
	
	if(umur >= 17){
		cout<<"Selamat! Anda dapat membuat KTP\n\n";
	}
	else
	{
		cout<<"Tunggu sebentar lagi ya dek\n\n";
	}
	
	int i = 0;
	while (i < 2){
		cout<<"Ini contoh perulangan menggunakan while"<<endl;
		i++;
	}
	cout<<endl;
	int j = 0;
    do {												
        cout << "Contoh Perulangan do while" << endl;
    j++;
    }
    
    while (j < 2);
    char y[6]={'d', 'a', 'y', 'a', 'n', 's'};
    cout << "Array 1D" << endl;
    for(int i=0; i<6; i++){								
        cout << "index ke-" << i << " = " << y[i] << endl;	
    }
    
    int x[3][2] = {{07,20}, {05,03}, {03,03}};
     cout << endl << endl << "Array 2D" << endl;		
    for(int i=0;i<3;i++){
		for(int j=0;j<2;j++){
			cout << x[i][j] << "\t";
		}
		cout << endl;
	}
}

