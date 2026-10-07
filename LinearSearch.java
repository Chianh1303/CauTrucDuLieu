// Mã giả:
// Bước 1: Bắt đầu từ phần tử trái nhất của mảng và so sánh từng phần tử trong mảng với phần tử cần tìm
// Bước 2: Nếu phần tử nào trùng với phần tử cần tìm thì trả về chỉ số của phần tử đó trong mảng
// Bước 3: Nếu không có phần tử nào trùng thì trả về -1
// Cài đặt thuật toán bằng ngôn ngữ tùy chọn
// class LS
// {  
//      public static int search(int arr[], int x) 
//      { 
//          int n = arr.length; 
//          for(int i = 0; i < n; i++) 
//          { 
//              if(arr[i] == x) 
//                  return i; 
//          } 
//          return -1; 
//      } 
  
//      public static void main(String args[]) 
//      { 
//          int arr[] = { 2, 3, 4, 10, 40 };  
//          int x = 10; 
      
//          int result = search(arr, x); 
//          if(result == -1) 
//              System.out.print("Element is not present in array"); 
//          else
//              System.out.print("Element is present at index " + result); 
//      } 
// }


public class LinearSearch {
    public static int search(int arr[], int x) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void execute() {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        
        int result = search(arr, x);
        if(result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}