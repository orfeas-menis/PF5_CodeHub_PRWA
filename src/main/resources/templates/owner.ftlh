<DOCTYPE! html>
<html>

    <head>
        <meta charset="UTF-8"/>
        <title>Owners</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
                  integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    </head>

    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">

          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
              <li class="nav-item active">
                <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Create</a>
              </li>
              <li class="nav-item">
                          <a class="nav-link" href="#">Update</a>
              </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
              <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
              <button  class="btn btn-danger" type="submit">Log Out</button>
            </form>
          </div>
        </nav>

      <div class="container pt-4">

          <table class="table">
              <thead>
              <th>First Name</th>
              <th>Last name</th>
              </thead>
              <tbody>
              <#list users as user>
                  <tr>
                      <td>${user.firstName}</td>
                      <td> ${user.lastName}</td>
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


    </body>

</html>