<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

<head>

    <title>Search</title>
    <#include "partials/head.ftlh">

</head>

<body>

<#include "partials/navbar.ftlh">

<table class="table">
    <thead>
    <th>First Name</th>
    <th>Last name</th>
    <th>E-mail</th>

    </thead>
    <tbody>


    <tr>
        <td>${user.firstName}</td>
        <td>${user.lastName} </td>
        <td>${user.email}</td>

    </tr>


    </tbody>
</table>


<#include "partials/scripts.ftlh">
</body>


</html>