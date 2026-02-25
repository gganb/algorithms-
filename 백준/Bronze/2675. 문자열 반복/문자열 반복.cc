#include <iostream>

using namespace std;

int main(){
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    int T, R;
    cin >> T;

    string s;

    while(T--){
        cin >> R >> s;

        for(int i = 0; i < s.length(); i++){
            for(int j = 0; j < R; j++){
                cout << s[i];
            }
        }
        cout << '\n';
    }
   
    return 0;
}