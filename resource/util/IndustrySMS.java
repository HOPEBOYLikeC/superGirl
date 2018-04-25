package util;

import com.alibaba.fastjson.JSONObject;

import java.net.URLEncoder;


/**
 * 验证码通知短信接口
 * 
 * @ClassName: IndustrySMS
 * @Description: 验证码通知短信接口
 *
 */
public class IndustrySMS extends FastJsonUtil
{
	private static String ranNum = RandUtil.getRandNum();
	private static String operation = "/industrySMS/sendSMS";

	private static String accountSid = Contant.ACCOUNT_SID;
	private static String smsContent = "【星名媛】验证码："+ranNum+"，如非本人操作，请忽略。";

	/**
	 * 验证码通知短信
	 */
	public static String execute(String to)
	{

		JSONObject jsonObject = new JSONObject();
		String tmpSmsContent = null;
	    try{
	      tmpSmsContent = URLEncoder.encode(smsContent, "UTF-8");
	    }catch(Exception e){
	      
	    }
	    String url = Contant.BASE_URL + operation;
	    String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + tmpSmsContent
	        + HttpUtil.createCommonParam();

	    // 提交请求
	    String result = HttpUtil.post(url, body);
	    System.out.println("result:" + System.lineSeparator() + result);
	    jsonObject.put("result",result);
	    jsonObject.put("radomNum",ranNum);
	    return tojsonString(jsonObject);
	}

}
