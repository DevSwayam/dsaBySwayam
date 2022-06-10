#include <bits/stdc++.h>
using namespace std;

int findMinDiff(int arr[],int x , int y){
    int j = 0;
    int min = INT_MAX; // max value of int 
    int min_diff ; // to take two values at a time 
    sort(arr,arr+x); // sorting the array with quick sort 
    if(x<y){ // if the array is over return -1 
        return -1;
    }
    for (int i = 0; i+y-1 < x; i++) // traverse whole array till 3rd element reach till end 
    {
        min_diff = arr[i+y-1] - arr[i]; // to find min diff 
        if(min_diff < min){ // to compare and store minimum value compared to last one 
            min = min_diff ;
        }
    }

return min ; // return minum value 
}
int main()
{
    int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                  40, 28, 42, 30, 44, 48, 43, 50 };
    int m = 7; // Number of students
    int n = sizeof(arr) / sizeof(arr[0]);
    cout << "Minimum difference is "
         << findMinDiff(arr, n, m);
    return 0;
}