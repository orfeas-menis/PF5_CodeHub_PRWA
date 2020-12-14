<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

    <head>

        <title>Repairs</title>
        <#include "/partials/head.ftlh">


    </head>

    <body>

        <#include "/partials/navbar.ftlh">
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



             <#include "/partials/scripts.ftlh">

    </body>




</html><!DOCTYPE html>
<html>

    <head>
         <meta charset="UTF-8"/>
         <title>User's Home Page</title>
         <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    </head>

    <body>
         <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <form class="form-inline my-2 my-lg-0">
                  <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                  <button  class="btn btn-danger" type="submit">Log Out</button>
                </form>
             </div>
            </nav>
    </body>

</html>