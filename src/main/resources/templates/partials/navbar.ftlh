<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav justify-content-between w-25">
        <li class="nav-item">
                     <a class="nav-link" href="/admin">Home</a>
        </li>
          <li class="nav-item dropdown">
               <a class="nav-link dropdown-toggle" href="/admin/owner" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     Owners
               </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                      <a class="dropdown-item" href="/admin/owner/create">Create</a>
                      <div class="dropdown-divider"></div>
                      <a class="dropdown-item" href="/admin/owner">Search</a>

                </div>
          </li>

          <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="/admin/repair" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                     Repairs
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                     <a class="dropdown-item" href="/admin/repair/create">Create</a>
                     <div class="dropdown-divider"></div>
                     <a class="dropdown-item" href="/admin/repair">Search</a>
                </div>
          </li>





        </ul>
      </div>
       <form class="form-inline my-2 my-lg-0" action="/logout">
                <button  class="btn btn-danger" type="submit">Log Out</button>
       </form>
    </nav>