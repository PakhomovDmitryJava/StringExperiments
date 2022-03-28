import org.w3c.dom.Text;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text);


        int vasya1 = text.indexOf("Вася заработал");
        int vasya2 = text.indexOf("рублей");
        String str1 = text.substring(vasya1 + 14, vasya2).trim();

        int petya3 = text.indexOf("Петя -");
        int petya4 = text.indexOf("рубля");
        String str2 = text.substring(petya3 + 6, petya4).trim();

        int masha5 = text.indexOf("Маша - ");
        int masha6 = text.lastIndexOf("рублей");
        String str3 = text.substring(masha5 + 6, masha6).trim();

        int sum = Integer.parseInt(str1)+Integer.parseInt(str2)+Integer.parseInt(str3);
        System.out.println(sum);
    }
}