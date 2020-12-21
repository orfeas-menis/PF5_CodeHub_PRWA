<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

    <head>

        <title>Repairs</title>
        <#include "partials/head.ftlh">


    </head>

    <body>


    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav justify-content-between w-25">

            </ul>
          </div>
           <form class="form-inline my-2 my-lg-0" action="/logout">
                    <button  class="btn btn-danger" type="submit">Log Out</button>
           </form>
        </nav>





            <div class="container pt-4">
                      <table class="table">
                          <thead>
                          <th>Category</th>
                          <th>City</th>
                          <th>Street</th>
                          <th>Number</th>
                          <th>Cost</th>
                          <th>Status</th>
                          <th>Date</th>
                          </thead>
                          <tbody>

                             <#list repairs as repair>
                                  <tr>
                                      <td>${repair.category}</td>
                                      <td>${repair.city} </td>
                                      <td>${repair.street}</td>
                                      <td>${repair.streetNumber}</td>
                                      <td>${repair.cost}</td>
                                      <td>${repair.status}</td>
                                      <td>${repair.dateTime}</td>
                                  </tr>
                             </#list>

                          </tbody>
                      </table>



        <#include "partials/scripts.ftlh">

    </body>

</html>