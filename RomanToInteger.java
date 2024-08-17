public class RomanToInteger {

        public static int value(char i)
        {
            if (i == 'I')
            {
                return 1;
            }
            if (i == 'V')
            {
                return 5;
            }
            if (i == 'X')
            {
                return 10;
            }
            if (i == 'L')
            {
                return 50;
            }
            if (i == 'C')
            {
                return 100;
            }
            if (i == 'D')
            {
                return 500;
            }
            if (i == 'M')
            {
                return 1000;
            }
            else return 0;
        }
    public static int romanToInt(String s) {
        int result=0;
        for (int i = 0; i < s.length(); i++)
        {
            result = result + value(s.charAt(i));
        }

        return result;
    }


    public static void main(String[] args) {
            System.out.println(romanToInt("MCMXCIV"));

    }
    }

