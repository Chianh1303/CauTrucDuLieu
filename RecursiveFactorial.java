// Viết các bước thực hiện bằng mã giả

// Ta có thể định nghĩa đệ quy (quy nạp) n! như sau:
// 0! = 1 
// n! = n × (n - 1)!   với n> 0
// Ví dụ: 3! = 3 x 2! = 6 (vì 2! = 2)
// Cài đặt thuật toán bằng ngôn ngữ tùy chọn.
// // Source.cpp #include <iostream> 
// #include "Header.h" using namespace std; 
// int main() { 	
// int nInput; 	
// cout << "Enter n(integer): "; 	
// cin >> nInput; 	
// int nFactorial = tinhGiaiThua(nInput); 	
// cout << nFactorial << endl; 	
// return 0; 
// } //Sử dụng đệ quy 

// int tinhGiaiThuaDeQuy(int nInput) { 	
// if (nInput == 0) 	{ 		
// return 1; 	} 	
// return nInput * tinhGiaiThuaDeQuy(nInput - 1); 
// }




public class RecursiveFactorial {
    // Sử dụng đệ quy
    public static int tinhGiaiThuaDeQuy(int nInput) {
        if (nInput == 0) {
            return 1;
        }
        return nInput * tinhGiaiThuaDeQuy(nInput - 1);
    }

    public static void execute() {
        int nInput = 5; 
        int nFactorial = tinhGiaiThuaDeQuy(nInput);
        System.out.println("Factorial of " + nInput + " is: " + nFactorial);
    }
}