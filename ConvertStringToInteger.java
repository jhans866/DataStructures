public class ConvertStringToInteger {
    public static void  convertString(String input)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<input.length();i++)
        {
            if(Character.isLetter(input.charAt(i)))
            {
                System.out.println("its letter"+input.charAt(i));
            }
            else
            {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        //System.out.println(Integer.parseInt("234"));
        String str = "2hjh34";
        convertString(str);
    }
}
