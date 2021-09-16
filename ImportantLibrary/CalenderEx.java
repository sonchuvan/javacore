package ImportantLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderEx {
    public static void main(String[] args) {
        // Tạo đối tượng Calendar mô tả thời điểm hiện tại
        // với Locale (khu vực) và TimeZone (múi giờ)
        // của máy tính đang chạy.
        Calendar cal = Calendar.getInstance();

        // import java.util.Date; để sử dụng Date
        // hiển thị ngày tháng năm giờ phút giây hiện tại của hệ thống
        // sử dụng phương thức getTime()
        // phương thức này sẽ trả về 1 đối tượng Date
        // lưu trữ thông tin ngày tháng năm giờ phút giây hiện tại của hệ thống
        Date date = cal.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        System.out.println("Định dạng dd/MM/yyyy: "+sdf.format(date));

        // hiển thị thời gian hiện tại
        System.out.println("Thời gian hiện tại của hệ thống là: " + date);
        // hiển thị ngày hiện tai
        // Calendar.DAY_OF_MONTH sẽ cho biết ngày hiện tại của tháng hiện tại
        // hàm get() sẽ trả về giá trị ngày hiện tại
        System.out.println("Ngày hiện tại là " + cal.get(Calendar.DAY_OF_MONTH));

        // hiển thị tháng hiện tại
        // sử dụng Calendar.MONTH
        // vì tháng trong Java sẽ chạy từ 0 đến 11
        // tức là nếu hiện giờ là tháng 7 thì chương trình sẽ hiển thị là tháng 6
        // vì vậy để hiển thị đúng thì ta sẽ cộng thêm tháng đó cho 1
        System.out.print("Tháng hiện tại là ");
        System.out.println(cal.get(Calendar.MONTH) + 1);

        // hiển thị năm hiện tại
        // Calendar.YEAR sẽ cho biết năm hiện tại
        System.out.println("Năm hiện tại là " + cal.get(Calendar.YEAR));

        // hiển thị giờ hiện tại
        // sự khác nhau giữa HOUR và HOUR_OF_DAY là
        // HOUR sẽ hiển thị theo khung giờ 12 giờ, ví dụ 11 giờ tối sẽ hiển thị là 11
        // còn HOUR_OF_DAY sẽ hiển thị theo khung giờ 23 giờ, ví dụ 11 giờ tối sẽ hiển
        // thị là 23
        System.out.println("Giờ hiện tại là " + cal.get(Calendar.HOUR));
        System.out.println("Giờ hiện tại là " + cal.get(Calendar.HOUR_OF_DAY));

        // hiển thị phút hiện tại
        // sử dụng Calendar.MINUTE
        System.out.println("Phút hiện tại là " + cal.get(Calendar.MINUTE));

        // hiển thị giây hiện tại
        // sử dụng Calendar.SECOND
        System.out.println("Giây hiện tại là " + cal.get(Calendar.SECOND));

        cal.set(Calendar.DATE, 20);
        cal.roll(Calendar.MONTH, 4);
        System.out.println(cal.getTime());  
    }
}
