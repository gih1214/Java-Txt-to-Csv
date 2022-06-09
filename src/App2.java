// public class App2 extends TextToCsvFile {

// // 재사용하기 위한 재정의 (동적바인딩과 상관X)
// public int process(String readFilePath, String writeFilePath) {
// String data = readFile(readFilePath, "UTF-8");
// String data2 = changeCsv(data, "^");
// return writeFile(writeFilePath, "UTF-8", data2);
// }

// public static void main(String[] args) {
// App2 app2 = new App2();
// app2.readFile("hello.txt", "UTF-8");
// app2.process("", "");
// }
// }
