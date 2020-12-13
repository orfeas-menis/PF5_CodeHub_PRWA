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
                <a class="nav-link" href="/admin">Home <span class="sr-only">(current)</span></a>
              </li>
              <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" href="/owner" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Owners
                      </a>
                      <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Create</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="/owner">Update</a>
                      </div>
                    </li>
              <li class="nav-item">
                          <a class="nav-link" href="/repair">Repairs</a>
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
              <th>E-mail</th>
              <th class="text-center">Edit</th>
              <th class="text-center">Remove</th>
              </thead>
              <tbody>
              <#list users as user>
                  <tr>

                      <td>${user.firstName}</td>
                      <td> ${user.lastName}</td>
                      <td>${user.email}</td>

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

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
            integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
            crossorigin="anonymous"></script>
    <script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>



    </body>

</html>