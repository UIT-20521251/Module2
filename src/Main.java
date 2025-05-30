import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableScraper {

    public static void main(String[] args) {
        // Thiết lập đường dẫn tới ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/path/to/chromedriver.exe");

        // Khởi chạy trình duyệt Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // Truy cập trang web
            driver.get("https://example.com"); // Thay URL thật vào đây

            // Tìm tất cả bảng trong trang
            List<WebElement> tables = driver.findElements(By.tagName("table"));

            if (tables.isEmpty()) {
                System.out.println("⚠️ Không tìm thấy bảng nào.");
            }

            int tableIndex = 1;
            for (WebElement table : tables) {
                System.out.println("📋 Bảng #" + tableIndex++);
                List<WebElement> rows = table.findElements(By.tagName("tr"));
                for (WebElement row : rows) {
                    List<WebElement> cells = row.findElements(By.xpath("th|td"));
                    for (WebElement cell : cells) {
                        System.out.print(cell.getText() + "\t");
                    }
                    System.out.println();
                }
                System.out.println("--------------------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng trình duyệt
            driver.quit();
        }
    }
}