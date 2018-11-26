package classrecord;

import java.io.*;

public class ClassRecord {

    public static BufferedReader gg = new BufferedReader(new InputStreamReader(System.in));

    public static int count = 10;

    public static String ID[] = new String[count];
    public static String fname[] = new String[count];
    public static String mname[] = new String[count];
    public static String lname[] = new String[count];
    public static int CSSM[] = new int[count];
    public static int CSSF[] = new int[count];
    public static int LSM[] = new int[count];
    public static int LSF[] = new int[count];
    public static int examM[] = new int[count];
    public static int examF[] = new int[count];

    public static double MGrade[] = new double[count];
    public static double FGrade[] = new double[count];

    public static int MGRADE[] = new int[count];
    public static int FGRADE[] = new int[count];

    public static int Average[] = new int[count];
    public static String Remarks[] = new String[count];

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < count; i++) {
            System.out.println("------------STUDENT  " + (i + 1) + "----------");
            System.out.print("Enter Student ID num: ");
            ID[i] = gg.readLine();
            System.out.print("Enter First name: ");
            fname[i] = gg.readLine();
            System.out.print("Enter Middle initial: ");
            mname[i] = gg.readLine();
            System.out.print("Enter Last  name: ");
            lname[i] = gg.readLine();

            //Midterms
            boolean input = true;
            do {
                System.out.print("Enter Midterms CSS: ");
                CSSM[i] = Integer.parseInt(gg.readLine());
//                CSSM[i] = Double.parseDouble(gg.readLine());
                if (CSSM[i] > 100 || CSSM[i] < 0) {
                    System.err.println("Invalid input. Try again.");
                    input = false;
                } else {
                    break;
                }
            } while (input == false);

            input = true;
            do {
                System.out.print("Enter Midterms Lab Score: ");
                LSM[i] = Integer.parseInt(gg.readLine());
//                LSM[i] = Double.parseDouble(gg.readLine());
                if (LSM[i] > 100 || LSM[i] < 0) {
                    System.err.println("Invalid input. Try again.");
                    input = false;
                } else {
                    break;
                }
            } while (input == false);

            input = true;
            do {
                System.out.print("Enter Midterms Exam Score: ");
                examM[i] = Integer.parseInt(gg.readLine());
//                examM[i] = Double.parseDouble(gg.readLine());
                if (examM[i] > 100 || examM[i] < 0) {
                    System.err.println("Invalid input. Try again.");
                    input = false;
                } else {
                    break;
                }
            } while (input == false);

            //Finals
            input = true;
            do {
                System.out.print("Enter Finals CSS: ");
                CSSF[i] = Integer.parseInt(gg.readLine());
//                CSSF[i] = Double.parseDouble(gg.readLine());
                if (CSSF[i] > 100 || CSSF[i] < 0) {
                    System.err.println("Invalid input. Try again.");
                    input = false;
                } else {
                    break;
                }
            } while (input == false);

            input = true;
            do {
                System.out.print("Enter Finals Lab Score: ");
                LSF[i] = Integer.parseInt(gg.readLine());
//                LSF[i] = Double.parseDouble(gg.readLine());
                if (LSF[i] > 100 || LSF[i] < 0) {
                    System.err.println("Invalid input. Try again.");
                    input = false;
                } else {
                    break;
                }
            } while (input == false);

            input = true;
            do {
                System.out.print("Enter Finals Exam Score: ");
                examF[i] = Integer.parseInt(gg.readLine());
//                examF[i] = Double.parseDouble(gg.readLine());
                if (examF[i] > 100 || examF[i] < 0) {
                    System.err.println("Invalid input. Try again.");
                    input = false;
                } else {
                    break;
                }
            } while (input == false);
            System.out.println();
        }

        for (int i = 0; i < count; i++) {
            MGrade[i] = ((CSSM[i] * 0.33) + (LSM[i] * 0.33) + (examM[i] * 0.34));
            FGrade[i] = ((CSSF[i] * 0.33) + (LSF[i] * 0.33) + (examF[i] * 0.34));

            MGRADE[i] = convert(MGrade[i]);
            FGRADE[i] = convert(FGrade[i]);

            Average[i] = (int) Math.round((MGrade[i] / 2) + (FGrade[i] / 2));
            if (Average[i] >= 75) {
                Remarks[i] = "PASSED";
            } else {
                Remarks[i] = "FAILED";
            }
        }
        System.out.println();
        Show();
    }

    public static void Show() throws Exception {
        System.out.printf("%80s", ".-= CLASS RECORDS =-.\n");
        System.out.println(" __________________________________________________________________________________________________________________________________________________________");
        System.out.print("                                                               =MIDTERMS=             =FINALS=               =GRADES=");
        System.out.println();
        System.out.printf("%10s%33s%19s%7s%7s%9s%6s%6s%15s%10s%12s%12s", "ID Number", "NAME (Last,First,Initial)", "CSS", "Lab", "Exam", "CSS", "Lab", "Exam", "Midterms", "Finals", "Average", "Remarks");
        System.out.println();

        for (int i = 0; i < count; i++) {
            System.out.printf("%10s%33s%19s%7s%7s%9s%6s%6s%12s%10s%12s%15s", ID[i], lname[i] + ", " + fname[i] + "  " + mname[i], CSSM[i], LSM[i], examM[i], CSSF[i], LSF[i], examF[i], MGRADE[i], FGRADE[i], Average[i], Remarks[i]);
            System.out.println();
        }

        Specific();
    }

    public static void Specific() throws Exception {
        System.out.print("\n\nEnter Specific Id number: ");
        String spID = gg.readLine();

        for (int i = 1; i <= ID.length; i++) {
            if (spID.equals(ID[i - 1])) {
                System.out.println("\n__________________________________");
                System.out.println("  name :  " + fname[i - 1] + " " + mname[i - 1] + " " + lname[i - 1]);
                System.out.println("____________=Score=_______________");
                System.out.println();
                System.out.printf("%15s", "[Midterms]");
                System.out.printf("%15s", "[Finals]");
                System.out.println();
                System.out.print("CSS:");
                System.out.printf("%8d%15d", CSSM[i - 1], CSSF[i - 1]);
                System.out.println();
                System.out.print("Lab:");
                System.out.printf("%8d%15d", LSM[i - 1], LSF[i - 1]);
                System.out.println();
                System.out.print("Exam:");
                System.out.printf("%7d%15d", examM[i - 1], examF[i - 1]);
                System.out.println();
                System.out.println("____________=Grades=______________");
                System.out.printf("%15s%15s", "[Midterms]", "[Finals]");
                System.out.println();
                System.out.printf("%12d%15d", MGRADE[i - 1], FGRADE[i - 1]);
                System.out.println();
                System.out.println("__________________________________");
                System.out.println("Average: " + Average[i - 1] + "      '" + Remarks[i - 1] + "'");
                System.out.println("__________________________________");
            } else {
                System.err.println("ID dont Exist");
                Specific();
            }
        }
        Confirm();
    }

    public static void Confirm() throws Exception {
        try {
            System.out.println("\nWould you like to try again?[yes/no]");
            String yn = gg.readLine();
            if (yn.equals("yes")) {
                Specific();
            } else if (yn.equals("no")) {
                System.out.println("GOOD BYE");
                System.exit(0);
            } else {
                System.err.println("Invalid Input");
                Confirm();
            }
        } catch (Exception e) {
            System.err.println("Invalid Input");
            Confirm();
        }
    }

    static int convert(double g) {
        int Average = 1;
        if (g < 7 && g >= 0) {
            Average = 70;
        } else if (g < 19) {
            Average = 71;
        } else if (g < 31) {
            Average = 72;
        } else if (g < 43) {
            Average = 73;
        } else if (g < 50) {
            Average = 74;
        } else if (g < 51.5) {
            Average = 75;
        } else if (g < 53) {
            Average = 76;
        } else if (g < 55) {
            Average = 77;
        } else if (g < 57) {
            Average = 78;
        } else if (g < 59) {
            Average = 79;
        } else if (g < 61) {
            Average = 80;
        } else if (g < 63) {
            Average = 81;
        } else if (g < 65) {
            Average = 82;
        } else if (g < 67) {
            Average = 83;
        } else if (g < 69) {
            Average = 84;
        } else if (g < 71) {
            Average = 85;
        } else if (g < 73) {
            Average = 86;
        } else if (g < 75) {
            Average = 87;
        } else if (g < 77) {
            Average = 88;
        } else if (g < 79) {
            Average = 89;
        } else if (g < 81) {
            Average = 90;
        } else if (g < 83) {
            Average = 91;
        } else if (g < 85) {
            Average = 92;
        } else if (g < 87) {
            Average = 93;
        } else if (g < 89) {
            Average = 94;
        } else if (g < 91) {
            Average = 95;
        } else if (g < 93) {
            Average = 96;
        } else if (g < 95) {
            Average = 97;
        } else if (g < 97) {
            Average = 98;
        } else {
            Average = 99;
        }
        return Average;
    }

}
