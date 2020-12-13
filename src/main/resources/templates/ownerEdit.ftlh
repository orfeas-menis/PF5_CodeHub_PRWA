<#import "/spring.ftl" as spring />
<DOCTYPE! html>
<html>

    <head>

        <title>Owners</title>
        <#include "/partials/head.ftlh">

    </head>

    <body>

       <#include "/partials/navbar.ftlh">

      <div class="container pt-4">
          <table class="table">
              <thead>
                      <th>First Name</th>
                      <th>Last name</th>
                      <th>E-mail</th>
                      <th class="text-center">Edit</th>
                      <th class="text-center">Remove</th>
              </thead>
              <tbody>

                      <#list users as user>
                            <tr>
                                 <form method="post" action="/owner-edit">
                                       <td><input  type="text" name="firstName"  value="${user.firstName}"/></td>
                                       <td> <input  type="text" name="lastName"  value="${user.lastName}"/>
                                       </td>

                                       <td><input  type="text" name="email"  value="${user.email}"/></td>
                                       <td>
                                       <input type="submit" name="test" value="Edit"/>
                                       </td>
                                 </form>
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

      <#include "/partials/scripts.ftlh">



    </body>

</html>