package util;

public class Contant {
    public static final String OPT_FAIL_MSG = "系统错误，请联系管理员！";

    public static final String LOGIN_USER_SESSION = "USER"; // 登录用户SESSION

    public static final String VERIFY_SESSION = "VERIFY_SESSION"; // 验证码SESSION

    // 上传文件的文件夹
    public static final String CATEGORY_UPLOAD = "/upload/category"; // 商品类目上传的文件夹

    public static final String BRAND_UPLOAD = "/upload/brand"; // 品牌LOGO上传的文件夹

    public static final String ARTICLE_UPLOAD = "/upload/article"; // 文章上传的文件夹

    public static final String TITLEPAGE_UPLOAD = "/upload/titlepage"; // 封面上传的文件夹

    public static final String ACTIVITY_UPLOAD = "/upload/activity"; // 活动封面上传的文件夹

    public static final String SUBJECT_UPLOAD = "/upload/subject"; // 课程封面，视频，语音等上传的文件夹

    public static final String CROWDFUNDING_UPLOAD = "/upload/crowdfunding"; // 众筹上传的文件夹

    public static final String PRODUCT_UPLOAD = "/upload/product"; // 商品上传的文件夹

    // 订单状态
    public static final int ORDER_WAIT_PAY = 1; // 待付款

    public static final int ORDER_WAIT_SHIPPING = 2; // 待发货

    public static final int ORDER_WAIT_RECEIVING = 3; // 待收货

    public static final int ORDER_FINISHED = 4; // 交易完成

    public static final int ORDER_CLOSED = 5; // 订单关闭

    public static final int NO_PAY_DELETE = 6; // 未付款删除

    public static final int PAY_DELETE = 7; // 付款删除


    //手机验证码
    public static final String ACCOUNT_SID_YUN = "10685c8270c2836fea79bff2f51c0485";//用户id       10685c8270c2836fea79bff2f51c0485

    public static final String AUTH_TOKEN_YUN = "92ab39ed780d53fbf695d82d747734d3";//鉴权秘钥       92ab39ed780d53fbf695d82d747734d3

    public static final String BASE_URL_YUN = "https://open.ucpaas.com/ol";//请求地址         https://open.ucpaas.com/ol


    //秒滴科技
    /**
     * url前半部分
     */
    public static final String BASE_URL = "https://api.miaodiyun.com/20150822";//https://api.miaodiyun.com/20150822

    /**
     * 开发者注册后系统自动生成的账号，可在官网登录后查看
     */
    public static final String ACCOUNT_SID = "8d42bc44629b496286cd289cc36317be";//8d42bc44629b496286cd289cc36317be

    /**
     * 开发者注册后系统自动生成的TOKEN，可在官网登录后查看
     */
    public static final String AUTH_TOKEN = "211f903011dc454dac921247e657541f";//211f903011dc454dac921247e657541f

    /**
     * 响应数据类型, JSON或XML
     */
    public static final String RESP_DATA_TYPE = "json";

}