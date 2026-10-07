// Mã giả:
// Bước 1: Kiểm tra nếu phần tử đầu tiên đã được sắp xếp. trả về 1
// Bước 2: Lấy phần tử kế tiếp
// Bước 3: So sánh với tất cả phần tử trong danh sách con đã qua sắp xếp
// Bước 4: Dịch chuyển tất cả phần tử trong danh sách con mà lớn hơn giá trị để được sắp xếp
// Bước 5: Chèn giá trị đó
// Bước 6: Lặp lại cho tới khi danh sách được sắp xếp
//
// Bắt đầu hàm insertionSort( A : mảng phần tử )
//    int holePosition
//    int valueToInsert
//    for i = 1 tới length(A) thực hiện:
//       valueToInsert = A[i]
//       holePosition = i
//       while holePosition > 0 và A[holePosition-1] > valueToInsert thực hiện:
//          A[holePosition] = A[holePosition-1]
//          holePosition = holePosition - 1
//       A[holePosition] = valueToInsert
//    kết thúc for
// Kết thúc hàm

import java.util.Arrays;

public class InsertionSort {
    public static void execute() {
        int[] A = {12, 11, 13, 5, 6};
        System.out.println("Mảng ban đầu: " + Arrays.toString(A));
        
        int length = A.length;
        for(int i = 1; i < length; i++) {
            int valueToInsert = A[i];
            int holePosition = i;
            
            while(holePosition > 0 && A[holePosition - 1] > valueToInsert) {
                A[holePosition] = A[holePosition - 1];
                holePosition = holePosition - 1;
            }
            A[holePosition] = valueToInsert;
        }
        
        System.out.println("Mảng sau khi sắp xếp chèn: " + Arrays.toString(A));
    }
}