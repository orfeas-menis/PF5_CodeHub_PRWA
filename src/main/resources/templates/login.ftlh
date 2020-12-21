<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <#include "partials/head.ftlh">


    <title>Log In</title>

    <link href="/css/signin.css" rel="stylesheet">
</head>

<body class="text-center">
<form class="form-signin" action="/login" method="post">
    <img class="mb-4" src="https://www.flaticon.com/svg/static/icons/svg/971/971941.svg" alt="" width="72" height="72">
    <h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
    <label for="inputEmail" class="sr-only">Email address</label>
    <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus
           name="email">
    <label for="inputPassword" class="sr-only">Password</label>
    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required name="password">
    <#if RequestParameters.error?? > <p class="text-danger"> INVALID CREDENTIALS </p> </#if>
    <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    <p class="mt-5 mb-3 text-muted">&copy; 2020</p>
</form>
</body>
</html>