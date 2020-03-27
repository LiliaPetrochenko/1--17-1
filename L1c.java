public class L1c {
 
    public static void main(String[] args) {
        int indexFirest = 0;
        int indexSecond = 0;
        String[] strArray = {"0)sdfd", "1)sdfbgdsfbn", "2)sfgdf", "3)adfbdfbb", "4)sdvasd", "5)sdvdfbbbbb"};
        try 
		{
            indexFirest = Integer.parseInt(args[0]);
            indexSecond = Integer.parseInt(args[1]);
        }
	catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("один из введеных параметров или оба, не введены!");
            System.exit(1);
        }

        try 
	{
            String tmpStr = strArray[indexFirest];
            strArray[indexFirest] = strArray[indexSecond];
            strArray[indexSecond] = tmpStr;
        } 
	catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("один из введеных параметров больше/меньше размеров массива!");
            System.exit(1);
        }

        for (String elemArr : strArray)
            System.out.println(elemArr);
    }
}
