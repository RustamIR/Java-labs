package laba5;
import static java.lang.System.out;
// import laba5.SparseMatrix;
// import laba5.UsualMatrix;
import laba5.*;


public class Main {
    public static void main(String args[]) {

        UsualMatrix um = new UsualMatrix(200, 200);
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                um.setElement(i, j, i + 1);
            }
        }

        SparseMatrix spm = new SparseMatrix(200, 200);
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                spm.setElement(i, j, i + 1);
            }
        }
        out.println("SparseMatrix.equals(UsualMatrix)");

        out.println(um.equals(spm));

        UsualMatrix um2 = new UsualMatrix(200, 200);
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 1; j++) {
                um2.setElement(i, j, i + 1);
            }
        }
        out.println("\nProduct UsualMatrix with SparseMatrix:");

        // out.println("\nCreate SparseMatrix 200x200");
        SparseMatrix spm2 = new SparseMatrix(200, 200);

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 1; j++) {
                spm2.setElement(i, j, i + 1);
            }
        }
        out.println("SparseMatrix.equals(UsualMatrix)");

        out.println((um.product(um2)).equals(spm.product(spm2)));

    }

}