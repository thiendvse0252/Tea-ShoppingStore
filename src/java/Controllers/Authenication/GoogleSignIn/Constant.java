package Controllers.Authenication.GoogleSignIn;

public class Constant {

    public static String GOOGLE_CLIENT_ID = "485601135202-f3hqdo4qrbdkd1ql5qfv9jbot7ksjjrq.apps.googleusercontent.com";
    public static String GOOGLE_CLIENT_SECRET = "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";
    public static String GOOGLE_REDIRECT_URI = "http://localhost:8084/Tea-Shopping/GoogleSignInServlet";      //modify your servlet url
    public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
    public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";  
    public static String GOOGLE_GRANT_TYPE = "authorization_code";
}
