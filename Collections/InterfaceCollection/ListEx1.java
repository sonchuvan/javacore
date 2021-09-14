package Collections.InterfaceCollection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // khai báo List Interface có tên là listString
        // kiểu dữ liệu là String
        List<String> listString = new LinkedList<String>();
                 
        // khai báo một Iterator
        Iterator<String> iterator = null;
                 
        // thêm các phần tử
        listString.add("One");
        listString.add("Two");
        listString.add("Three");
        listString.add("Four");
     
        System.out.println("Các phần tử có trong listString là: ");
                 
        // Lấy ra đối tượng iterator để truy cập vào các phần tử của tập hợp.
        // Đối tượng iterator này chỉ chứa các String.
        // Lúc này iterator sẽ trỏ vào 
        // chỉ số trước chỉ số của phần tử đầu tiên trong listString
        iterator = listString.iterator();
             
        // Kiểm tra xem Iterator còn phần tử tiếp theo hay không?
        // Nếu có thì sẽ di chuyển vị trí mà iterator
        // đang trỏ vào sang vị trí của phần tử kế tiếp
        // và hiển thị phần tử đó ra
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
