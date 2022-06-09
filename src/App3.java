public class App3 {

    public static void CSV파일만들기(TextToCsvFile ttc) {
        ttc.process("zipcode.txt", "zipcode3.csv");
    }

    public static void main(String[] args) {
        // TextToCsvFileAble ta = new TextToCsvFile();
        // ta.process("zipcode.txt", "zipcode2.csv");

        CSV파일만들기(new TextToCsvFile());
    };
}
