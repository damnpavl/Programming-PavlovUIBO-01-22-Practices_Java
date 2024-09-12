package pavlov.uibo0122;

public class TestAuthor {
    public static void main(String[] args) {
        Author Gregory = new Author("Gregor miles", "gregorymiles@icloud.com", 'm');
        System.out.println(Gregory);
        Gregory.setEmail("gregory_1_miles@icloud.com");
        System.out.println(Gregory);
        }
    }
