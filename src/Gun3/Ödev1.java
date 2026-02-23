package Gun3;

public class Ödev1 {
    public static void main(String[] args) {
        System.out.println("-----Q1-----");
        System.out.print("1");
        System.out.println("2");
        System.out.print("3");
        System.out.println("4");

        System.out.println("-----Q2-----");
        System.out.println("Hello");
        System.out.print("World");
        System.out.print("!");

        System.out.println();
        System.out.println("-----Q3-----");
        System.out.print("Java ");
        System.out.print("is ");
        System.out.println("fun");
        System.out.println("Right?");

        System.out.println("-----Q4-----");
        System.out.println("Line1\nLine2\nLine3");


        System.out.println("-----Q5-----");
        System.out.println("A\t\tB\tC");

        System.out.println("-----Q6-----");
        System.out.println("Dosya: \"report.pdf\"");
        System.out.println("Klasör: C:\\Temp\\Logs");

        System.out.println("-----Q7-----");
        System.out.println("He said: \"Stop!\"");
        // String içerisinde direkt olarak tırnak kullanımı yapılamaz \" iley yazılması gerekir yoksa hata alırız.

        System.out.println("-----Q8-----");
        System.out.printf("Toplam=%d", 80);
        System.out.printf(" Puan=%d", 20);

        System.out.println();
        System.out.println("-----Q9-----");
        System.out.printf("Pi=%.3f%n", 3.14159);
        System.out.printf("Pi=%.1f", 3.14159);

        System.out.println();
        System.out.println("-----Q10-----");
        System.out.printf("[%8d]%n", 42);
        System.out.printf("[%-8d]%n", 42);
        System.out.printf("[%8s]", "Hi");

        System.out.println();
        System.out.println("-----Q11-----");
        int a = 11;
        int b = 4;
        System.out.println(a / b);
        System.out.println(a / (double)b);

        System.out.println();
        System.out.println("-----Q12-----");
        System.out.println("X" + 5 + 6);
        System.out.println("X" + (5 * 6));
        System.out.println(5 + 6 + "X");


        System.out.println();
        System.out.println("-----Q13-----");
        int x = 20;
        double y = 6;
        System.out.println(x / y);
        System.out.println((double)(x / (int)y));



        System.out.println();
        System.out.println("-----Q14-----");
        double d = 7.99;
        System.out.println((int)d);
        System.out.println((int)(d * 10));

        System.out.println();
        System.out.println("-----Q15-----");
        char ch = 'D';
        System.out.println(ch + 3);
        System.out.println((char)(ch + 3));

        System.out.println();
        System.out.println("-----Q16-----");
        int n = 48;
        char c = (char)n;
        System.out.println(c);
        System.out.println(c + 1);

        System.out.println();
        System.out.println("-----Q17-----");
        int g = 29;
        int f = 6;
        System.out.println(g % f);
        System.out.println(f % g);

        System.out.println();
        System.out.println("-----Q18-----");
        double r = 29;
        double hh = 6;
        System.out.println(r % hh);
        System.out.println(10.5 % 4);


        System.out.println();
        System.out.println("-----Q19-----");
        int aaa = 9;
        double bbb = 4;
        System.out.println((int)(aaa / bbb));
        System.out.println((int)aaa / bbb);

        System.out.println();
        System.out.println("-----Q20-----");
        String s = "007";
        int xx = Integer.parseInt(s);
        System.out.println(xx + 5);
        System.out.println(s + 5);

        System.out.println();
        System.out.println("-----Q21-----");
        String t = "Automation";
        System.out.println(t.length());

        System.out.println();
        System.out.println("-----Q22-----");
        String tt = "Automation";
        System.out.println(tt.charAt(0));
        System.out.println(tt.charAt(4));


        System.out.println();
        System.out.println("-----Q23-----");
        String ttt = "QA";
        //System.out.println(ttt.charAt(2));
        // Index 2 out of bounds for length 2

        System.out.println();
        System.out.println("-----Q24-----");
        String aq = "Test";
        String bq = "test";
        System.out.println(aq.equals(bq));
        System.out.println(aq.equalsIgnoreCase(bq));


        System.out.println();
        System.out.println("-----Q25-----");
        String sq = "Playwright";
        System.out.println(sq.substring(4));
        System.out.println(sq.substring(0, 4));
        System.out.println(sq.substring(2, 7));

        System.out.println();
        System.out.println("-----Q26-----");
        String se = "Playwright";
        String ad = "Hello";
        String bd = "Java";
        System.out.println(ad.concat(" ").concat(bd));
        System.out.println(ad + "-" + bd);


        System.out.println();
        System.out.println("-----Q27-----");
        String sz = "Java is powerful";
        System.out.println(sz.contains("is"));
        System.out.println(sz.contains("Power"));

        System.out.println();
        System.out.println("-----Q28-----");
        String file = "Invoice_2026.PDF";
        System.out.println(file.startsWith("Inv"));
        System.out.println(file.endsWith(".PDF"));
        System.out.println(file.endsWith(".pdf"));

        System.out.println();
        System.out.println("-----Q29-----");
        String sf = "banana";
        System.out.println(sf.indexOf("a"));
        System.out.println(sf.lastIndexOf("a"));
        System.out.println(sf.indexOf("na"));


        System.out.println();
        System.out.println("-----Q30-----");
        String text = " ID: AB-123-CD ";
        System.out.println(text.trim());
        System.out.println(text.replace("-", "_"));
        System.out.println(text.replaceAll("\\D", ""));
        System.out.println(" ".isBlank());
        System.out.println(" ".isEmpty());

    }
}
