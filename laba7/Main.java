import static java.lang.System.out;
// import laba7.*;

public class Main {
    public static void main(String[] args){
   
        // Settings s1 = new Settings();
        // Settings s2 = new Settings();

        // s1.put("AAA", 1);   s2.put("AAA", 1);
        // s1.put("BBB", 1);   s2.put("BBB", 1);
        // s1.put("CCC", 2);   s2.put("CCC", 2);
        // s1.put("AAA", 0);   s2.put("AAA", 0);



        // out.println(s1);
        // out.println(s2);

        // if(s1.equals(s2)){
        //     out.println(1);
        // }

        Settings set2 = new Settings();
        Settings set3 =  new Settings();

        // set2.loadFromTextFile("in1.txt");  
        try {
            set2.loadFromTextFile("in1.txt");
            set2.put("AAA", 1);
            out.println("set2");

            out.println(set2);
            set2.put("qwerty", 912);
            out.println("set2");

            out.println(set2);
            set2.saveToTextFile("out1.txt");
            set2.saveToBinaryFile("out2");

            set3.loadFromBinaryFile("out2");
            out.println();
            out.println("set3");

            out.println(set3);

            set3.delete("qwerty");
            out.println("set3");

            out.println(set3);

        } catch (Exception e) {
            e.printStackTrace();
        }

        // out.println(set2);
        // set2.put("qwerty", 912);
        // out.println(set2);
        // set2.saveToTextFile("out1.txt");
        // set2.saveToBinaryFile("out2");

        // set3.loadFromBinaryFile("out2");
        // out.println();

        // out.println(set3);

        // set3.delete("qwerty");

        // out.println(set3);

        // Library lib = Library.loadFromTextFile("in1.txt");
        // out.println(lib);
        // out.println(lib.findName("ASDw"));
   }
}
