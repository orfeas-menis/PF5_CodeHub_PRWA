<#import "/spring.ftl" as spring />
<!DOCTYPE html>
<html>

    <head>

        <title>Owners</title>
        <#include "partials/head.ftlh">

    </head>

    <body>

      <#include "partials/navbar.ftlh">

      <div class="container pt-4">
          <table class="table">
              <thead>
              <th>First Name</th>
              <th>Last name</th>
              <th>Vat</th>
              <th>E-mail</th>
              <th class="text-center">Edit</th>
              <th class="text-center">Remove</th>
              </thead>
              <tbody>

                 <#list users as user>
                      <tr>
                          <td>${user.firstName}</td>
                          <td>${user.lastName} </td>
                          <td>${user.vat}</td>
                          <td>${user.email}</td>
                          <td>
                                <li>
                                       <a href="/owner-edit">Edit</a>
                               </li>
                          </td>
                         <td>
                                <li>
                                       <a href="/owner-edit">Delete</a>
                               </li>
                          </td>
                      </tr>
                 </#list>

              </tbody>
          </table>

          <div id="remove" class="modal" tabindex="-1">
              <div class="modal-dialog">
                  <div class="modal-content">
                      <div class="modal-header">
                          <h5 class="modal-title">Confirm delete</h5>
                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                              <span aria-hidden="true" data-feather="x"></span>
                          </button>
                      </div>
                      <div class="modal-body">
                          Are you sure you want to delete this entry?
                      </div>
                      <div class="modal-footer">
                          <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                          <form data-action-url="/book-delete/" method="delete" class="modal-delete-action">
                              <buttton type="submit" class="btn btn-danger">Delete</buttton>
                          </form>
                      </div>
                  </div>
              </div>
          </div>
    </div>

      <#include "partials/scripts.ftlh">



    </body>

</html>