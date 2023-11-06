import java.util.Scanner;
public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";

        do{
            System.out.println("\n" + prompt + ": ");
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Input is not an integer: " + trash);
            }
        }while(!done);

        return retVal;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Input is not an integer: " + trash);
            }

        }while(!done);

        return retVal;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int high, int low)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print(prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("retVal: " + retVal + " does not fit the low/high parameters. Try Again");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Input is not an integer: " + trash);
            }
        }while(!done);

        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double high, double low)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do{
            System.out.print(prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("retVal: " + retVal + " does not fit the low/high parameters. Try Again");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Input is not an Double: " + trash);
            }
        }while(!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retBoolean = false;
        boolean done = false;
        String retString = "";
        do{
            System.out.print("\n" + prompt + "? [Y/N] ");
            if (pipe.hasNext())
            {
                retString = pipe.nextLine().toUpperCase();
                pipe.nextLine();
                if (retString.equals("Y") || retString.equals("N"))
                {
                    if(retString.equals("Y"))
                    {
                        retBoolean = true;
                    }
                    else
                    {
                        retBoolean = false;
                    }
                    done = true;
                }
                else
                {
                    System.out.println("Input is not a Y/N. Try Again");
                }

            }

        }while(!done);

        return retBoolean;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;
        do {
            System.out.print(prompt + ": ");
            value = pipe.nextLine();
            if(value.matches(regExPattern))
            {
                gotAValue = true;
            }
            else
            {
                System.out.println("\nInvalid input: " + value);
            }
        }while(!gotAValue);

        return value;
    }

    public static void prettyHeader(String msg)
    {
        //Top
        for (int x = 0; x <= 60; x++)
        {
            System.out.print("*");
        }
        //Middle
        System.out.println();
        int msgLength = msg.length();
        int totalLength = 54 - msgLength;
        int spaceLength = totalLength / 2;
        System.out.print("***");
        for (int x = 0; x <= spaceLength; x++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int x = 0; x <= spaceLength; x++)
        {
            System.out.print(" ");
        }
        System.out.print("***");
        System.out.println();
        //Bottom
        for (int x = 0; x <= 60; x++)
        {
            System.out.print("*");
        }

    }



}
