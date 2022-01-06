<%--
  Created by IntelliJ IDEA.
  User: garvitchaudhary
  Date: 13-12-2021
  Time: 05:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Login</title>
    <link rel="stylesheet" href="../resources/css/bootstrap.min.css">
    <script src="../resources/js/bootstrap.min.js"></script>
</head>

<body>
<div class="container">
    <div class="d-flex justify-content-center">
        <div class="login-form bg-light mt-4 p-4" style="width: 40%">
            <div class="d-flex justify-content-center">
                <h3>Welcome Back</h3><br>
            </div>
            <div class="d-flex justify-content-center">
                <h4><div style="display: ${loginStatus}; font-style: italic; color: red">${loginStatusInfo}</div></h4>
            </div>
            <form action="/" method="POST" class="row g-3">
                <div class="col-12">
                    <label style="font-size: larger">User ID ::</label>
                    <input class="form-control mt-2" type="text" name="username" placeholder="User ID">
                </div>
                <div class="col-12">
                    <label style="font-size: larger">Password ::</label>
                    <input class="form-control mt-2" type="password" name="password" placeholder="Password">
                </div>
                <div class="col-12">
                    <button type="submit" class="btn btn-dark float-end">Login</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>