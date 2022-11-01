# Java Web Application 

A shopping web app which sells tea, Web users can view and search for the tea, add to cart and check out. The admin can manage the products in the store, manage user accounts <br>
Description:<br>
• Team Size: 2 <br>
• My role: back-end<br>
• Techs: JavaEE, JSP/Servlet, SQL Server, JDBC - MVC2 model
• CRUD functionalities, login(database and google account), log out, check the captcha, add to cart, check out, payment(not complete yet).

Note:

- I deleted the key in the web folder. If you need to run it, please register for a new key.

## 1.reCaptcha 

- Google reCaptcha Link: https://www.google.com/recaptcha/admin

### Error:

- None action parameter

  Form this code

input type="submit" name="action" value="Login" 

      To this one

 input value="Login" name="action" hidden="" "\n"
 input type="submit" value="Submit"

## 2.Payment (not recommend)

- This module is not implemented because it has no chance to run in the
  production mode. If you want to deploy to production mode,
  you have to provide them your Business No, tax receipts, and so on. Moreover, running a risky app is never the best choice for a payment method.

- The Ugly : https://www.youtube.com/watch?v=9O8WPgeg-g4

## 3.Login Google 

- Register Google Key: https://console.cloud.google.com/apis/dashboard
- Create Oauth Client ID: https://console.cloud.google.com/apis/credentials/oauthclient and put url of GoogleSignInServlet in Authorized redirect URIs
- Google Login Token and GoogleSignInServlet url are put in Controllers.Authenication.GoogleSignIn/Constant
- Must not change properties in GoogleDTO.java to get all account's information
Note:

- to get a full profile of user, please change to scope to "scope=email%20profile%20openid"

## 4.Log4j (not recommend)

- This module is not implemented because I can not fully control the property file, which needs to make this package run. (Netbeans Noob)


Note:

- I deleted the key in the demo folder. If you need to run it, please register for a new key.

#### Contact me if you have any problems

# Please give me a star if this project helps your assignment

## Everything that you found at https://github.com/thiendvse0252 is totally free. 
## © 2022 thien.dv | facebook.com/thiendvse
