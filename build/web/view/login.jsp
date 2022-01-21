<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="../asset/style/login.css" rel="stylesheet" type="text/css"/>
<style>
    body {
        background-image: url('../asset/image/login_background.jpg');
        background-repeat: no-repeat;
<<<<<<< Updated upstream
        background-position-y: 55%;
        background-size: 100%;
        /*background-color: #E5E5E5;*/
=======
        position: relative;
        background-size: 1560px 894px;
>>>>>>> Stashed changes
    }
</style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="icon" href="../asset/image/favicon.png" type="image/png" sizes="16x16">
    </head>
    <body>
        <div class="limiter">
<<<<<<< Updated upstream
            <form action="login" method="POST">
=======
            <form action="login" method="POST" class="limiter">
>>>>>>> Stashed changes
                <div class="logo-group">
                    <div class="car">
                        <img src="../asset/image/icon_car.png" alt="LogoIcon"/>
                    </div>
                    <div class="insurance-card">
                        <img src="../asset/image/InsuranceCard.png" alt="LogoTitle"/>
                    </div>
<<<<<<< Updated upstream
=======
                </div>
                <div class="username">
                    <input class="input100" id="u" type="email" name="user" placeholder="Email" required/>
                    <label for="u"><img src="../asset/image/user_1.png" alt="UserIcon"/></label>
                </div>
                <div class="password">
                    <input class="input100" id="p" type="password" name="pass" pattern="[a-zA-Z0-9@]+" placeholder="Password" required>
                    <label for="p"><img src="../asset/image/password_1.png" alt="PassIcon"/></label>
>>>>>>> Stashed changes
                </div>

                <div class="username"><input class="input100" type="email" name="user" placeholder="Email" required/></div>
                <div class="img-user"><img src="../asset/image/user_1.png" alt="UserIcon"/></div>


                <div class="password"><input class="input100" type="password" name="pass" pattern="[a-zA-Z0-9@]+" placeholder="Password" required></div>
                <div class="img-pass"><img src="../asset/image/password_1.png" alt="PassIcon"/></div>

                <div class="remember">
                    <label for="check"><input type="checkbox" id="check" name="remember">
                        <span class="checkmark"></span><span>Remember Me?</span>
                    </label>
                </div>

                <div class="logbutton">
                    <input type="submit" name="log" value="LOGIN">
                </div>

                <div class="forgot-sign">
                    <div class="forgot"><a href="#">Forgot Password?</a></div>
                    <div class="sign"><a href="#">Sign Up</a></div>
                </div>

                <div class="quick-log">
                    <div class="google">
                        <img src="../asset/image/gg_icon.png" alt=""/>
                        <input type="button" name="gg" value="Google">
                    </div>

                </div>
            </form>
        </div>
    </body>