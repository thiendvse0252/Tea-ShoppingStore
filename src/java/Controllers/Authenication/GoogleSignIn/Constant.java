
package Controllers.Authenication.GoogleSignIn;

public class Constant {
    public static String GOOGLE_CLIENT_ID = "GOOGLE_CLIENT_KEY";
	public static String GOOGLE_CLIENT_SECRET = "GOOGLE_SECRET_KEY";
	public static String GOOGLE_REDIRECT_URI = "http://localhost:8084/Tea-Shopping/GoogleSignInServlet";  //modify your servlet url
	public static String GOOGLE_LINK_GET_TOKEN = "https://accounts.google.com/o/oauth2/token";
	public static String GOOGLE_LINK_GET_USER_INFO = "https://www.googleapis.com/oauth2/v1/userinfo?access_token=";
	public static String GOOGLE_GRANT_TYPE = "authorization_code";
}
