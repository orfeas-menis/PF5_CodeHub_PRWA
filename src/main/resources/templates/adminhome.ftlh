<!DOCTYPE html>
<html>

    <head>

        <title>Admin's Home Page</title>
        <#include "partials/head.ftlh">


    </head>

    <body>

        <#include "partials/navbar.ftlh">

 <div class="container pt-4">
                      <table class="table">
                          <thead>
                          <th>Category</th>
                          <th>City</th>
                          <th>Cost</th>
                          <th>status</th>
                          <th>street</th>
                          </thead>
                          <tbody>

                             <#list repairs as repair>
                                  <tr>
                                      <td>${repair.category}</td>
                                      <td>${repair.city} </td>
                                      <td>${repair.cost}</td>
                                      <td>${repair.status}</td>
                                     <td>${repair.street}</td>
                                  </tr>
                             </#list>

                          </tbody>
                      </table>







        <#include "partials/scripts.ftlh">
    </body>




</html>