<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
        <li class="nav-item">
                     <a class="nav-link" href="/admin">Home</a>
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

          <form class="form-inline my-2 my-lg-0"  method="post" action="/search">
                        <input class="form-control mr-sm-2" type="search" placeholder="Enter Vat or Email" aria-label="Search" name="email">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>

        </ul>

        <form class="form-inline my-2 my-lg-0">

          <button  class="btn btn-danger" type="submit">Log Out</button>
        </form>
      </div>
    </nav>