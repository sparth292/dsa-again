#include <iostream>

using namespace std;

int main() {
    int n = 6;
    for(int i = 1 ; i < n ; i++){
       for(int j = 1 ; j < n ; j++){
              if(n-i-1>=j){
               cout << j;
              }
              else{
                  cout << " ";
              }
       }
       cout << "\n";
    }
    return 0;
}