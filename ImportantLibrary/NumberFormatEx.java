package ImportantLibrary;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatEx {
    public static void main(String[] args) {
        // Locale.getDefault() sẽ trả về biến currentLocale
        // là khu vực mặc định của hệ thống máy ảo JVM
        Locale currentLocaledf = Locale.getDefault();

        // getDisplayLanguage() trả về tên ngôn ngữ của currentLocale
        // getDislayCountry() trả về tên quốc gia của currentLocale
        System.out.println(currentLocaledf.getDisplayLanguage());
        System.out.println(currentLocaledf.getDisplayCountry());

        // getLanguage() trả về mã ngôn ngữ của currentLocale
        // getCountry() trả về mã quốc gia của currentLocale
        System.out.println(currentLocaledf.getLanguage());
        System.out.println(currentLocaledf.getCountry());

        // getProperty() trả về chuỗi bao gồm các thông tin của hệ thống
        // user.country là quốc gia
        // user.language là ngôn ngữ
        System.out.println(System.getProperty("user.country"));
        System.out.println(System.getProperty("user.language"));

        // Dinh dang so------
        NumberFormat currentLocale = NumberFormat.getInstance();

        // định dạng số của khu vực mặc định của máy ảo JVM
        // sử dụng phương thức format()
        double doubleNumber = 10.08d;
        String str = currentLocale.format(doubleNumber);
        System.out.println("Số " + doubleNumber + " sau khi định dạng = " + str);

        // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của nước Anh
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);

        // đối với số có kiểu long được định dạng theo chuẩn của nước Anh
        // thì phần ngàn của số được phân cách bằng dấu phẩy
        long longNumber = 12345678L;
        String str1 = en.format(longNumber);
        System.out.println("Số " + longNumber + " sau khi định dạng EN = " + str1);

        // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn của Việt Nam
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(localeVN);

        // đối với số float được định dạng theo chuẩn của Việt am
        // thì phần thập phân của số được phân cách bằng dấu phẩy
        double doubleNumber1 = 10.17d;
        String str2 = vn.format(doubleNumber1);
        System.out.println("Số " + doubleNumber1 + " sau khi định dạng VN = " + str2);

        // dinh dang tien te
        double currency = 101.999f;

        // định dạng tiền tệ của khu vực mặc định của máy ảo JVM
        // khu vực mặc định này là nước Mỹ
        // nên đơn vị của tiền tệ sẽ là $
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        String str3 = currencyFormat.format(currency);
        System.out.println("Số " + currency + " sau khi định dạng mặc định = " + str3);
        System.out.println("Kiểu đơn vị tiền tệ của " + System.getProperty("user.country") +
        " là " + currencyFormat.getCurrency());

        long vnd = 10000000L;

        // tạo 1 NumberFormat để định dạng tiền tệ theo tiêu chuẩn của Việt Nam
        // đơn vị tiền tệ của Việt Nam là đồng
        //Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str4 = currencyVN.format(vnd);
        System.out.println("Số " + vnd + " sau khi định dạng VN = " + str4);
        System.out.println("Kiểu đơn vị tiền tệ của " + localeVN.getCountry()+
        " là " + currencyVN.getCurrency());
    }
}
