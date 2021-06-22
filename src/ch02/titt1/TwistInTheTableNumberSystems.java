package ch02.titt1;

public class TwistInTheTableNumberSystems {
    public static void main(String[] args) {
        int baseDecimal = 267;
        int octalVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;
        System.out.println(baseDecimal + octalVal);
        System.out.println(hexVal + binVal);

        /*
        long var1 = 0_100_267_760; // correct, the underscore _ can be placed after the prefix 0, which is used to define an octal literal value
        long var2 = 0_x_4_13; // wrong, the underscore _ can't be placed after the prefix 0x or OX, which is used to define a hexadecimal literal value
        long var3 = 0b_x10_BA_75; // wrong, the underscore _ can't be placed after the prefix 0b or 0B, which is used to define a binary literal value
        long var4 = 0b_10000_10_11; // wrong, same reason above
        long var5 = 0xa10_AG_75; // wrong, same reason above
        long var6 = 0x1_0000_10; // correct
        long var7 = 100__12_12; // correct
         */
    }
}
