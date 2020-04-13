package singleResponsibilityPrinciple.negtice;

import java.io.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AppTest {
    public static void main(String[] args) throws Exception {
        // 统计字符
        Reader in = new FileReader(
                "C:\\Users\\90595\\OneDrive\\桌面\\个人\\DesignPattern\\src\\singleResponsibilityPrinciple\\negtice\\1.txt");
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

        String[] strs = sb.toString().split("[^a-zA-Z]+");
        System.out.println(strs);

    }
}
