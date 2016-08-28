import java.nio.file.PathMatcher;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lmq on 16-6-9.
 */
public class RegularUtils
{
    public static void main(String[] args)
    {
        String Rex = "1[3|4|5|7|8][0-9]\\d{8}";
        String str = "我的手机号码:13959953009.";

        System.out.println("正则表达式:"+Rex);
        System.out.println("字符串:"+str);

        Pattern patter = Pattern.compile(Rex);
        Matcher matcher = patter.matcher(str);
        if (matcher.find())
        {
            System.out.println("匹配字符串:"+matcher.group(0));
            System.out.println("隐藏手机号码中间5位:"+str.replaceAll("(1[3|4|5|7|8][0-9])\\d{5}(\\d{3})","$1****$2"));
        }else
        {
            System.out.println("没有内容可匹配");
        }
    }

    /**
     * 查询字符串中是否有手机号码，有就返回手机号码
     * @return 返回手机号码
     * */
    private static String findPhoneNumber(String str)
    {
        String Rex = "1[3|4|5|7|8][0-9]\\d{8}";

//        System.out.println("正则表达式:"+Rex);
//        System.out.println("字符串:"+str);

        Pattern patter = Pattern.compile(Rex);
        Matcher matcher = patter.matcher(str);
        if (matcher.find())
        {
            return matcher.group(0);
        }
        return null;
    }

    /**
     * 检查是否含有手机号，有就隐藏手机号码中间5位
     * */
    private static void encryptPhoneNumber(String str)
    {
        String Rex = "1[3|4|5|7|8][0-9]\\d{8}";

        System.out.println("正则表达式:"+Rex);
        System.out.println("字符串:"+str);

        Pattern patter = Pattern.compile(Rex);
        Matcher matcher = patter.matcher(str);
        if (matcher.find())
        {
            System.out.println("匹配字符串:"+matcher.group(0));
            System.out.println("隐藏手机号码中间5位:"+str.replaceAll("(1[3|4|5|7|8][0-9])\\d{5}(\\d{3})","$1****$2"));
        }else
        {
            System.out.println("没有内容可匹配");
        }
    }
}
