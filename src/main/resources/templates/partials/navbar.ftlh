<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav justify-content-between w-25">
        <li class="nav-item">
                     <a class="nav-link" href="/admin">Home</a>
        </li>
          <li class="nav-item dropdown">
               <a class="nav-link dropdown-toggle" href="/owner" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     Owners
               </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <a class="dropdown-item" href="/owner/create">Create</a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="/owner">Update</a>

                </div>
          </li>

          <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="/repair" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     Repairs
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                     <a class="dropdown-item" href="/repair/create">Create</a>
                     <div class="dropdown-divider"></div>
                     <a class="dropdown-item" href="/repair">Update</a>
                </div>
          </li>





        </ul>
      </div>
       <form class="form-inline my-2 my-lg-0">
                <button  class="btn btn-danger" type="submit">Log Out</button>
       </form>
    </nav>