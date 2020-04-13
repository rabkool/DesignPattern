package singleResponsibilityPrinciple.positive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class AppTest {

    private static String loadFlie(String path) throws Exception {
        // 统计字符
        Reader in = new FileReader(path);

        // 读一行
        BufferedReader br = new BufferedReader(in);

        // 行
        String line = null;

        // 缓冲区 积攒数据
        StringBuilder sb = new StringBuilder("");

        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append(" ");
        }

        br.close();

        return sb.toString();
    }

    private static String[] getWords(String str) {
        return str.toString().split("[^a-zA-Z]+");
    }

    public static void main(String[] args) throws Exception {

        String str = loadFlie(
                "C:\\Users\\90595\\OneDrive\\桌面\\个人\\DesignPattern\\src\\singleResponsibilityPrinciple\\negtice\\1.txt");

        String[] strs = getWords(str);

        System.out.println(Arrays.toString(strs));
    }
}
