<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html lang="en">
<head>
    <#include "partials/head.ftlh">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css">
    <title>Create User</title>
</head>

<body>

<#include "partials/navbar.ftlh">

<div class="container-fluid">
    <div class="row">
        <main role="main" class="ml-sm-auto col-lg-12 pt-3 px-4">
            <div class="row">
                <div class="col-md-12 order-md-1">
                    <#include "forms/userCreateForm.ftlh">
                </div>
            </div>
        </main>
    </div>
</div>

<#include "partials/scripts.ftlh">
<script src="/js/main.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
</body>
</html>

