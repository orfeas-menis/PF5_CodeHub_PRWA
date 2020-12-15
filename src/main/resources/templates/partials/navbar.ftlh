<nav class="navbar navbar-expand-lg navbar-dark bg-dark">

      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav justify-content-between w-50">
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
          <li class="nav-item">
             <a class="nav-link" href="/repair">Repairs</a>
          </li>


        <form id="searchByAfmOrEmailForm"  class="form-inline my-2 my-lg-0"  method="post" >

                            <input type="radio"   name="searchRadio" onclick="changeFormAction(1)"> <h6 style="color:white"> E-mail </h6>
                            <input type="radio"  name="searchRadio" onclick="changeFormAction(2)"><h6 style="color:white"> Vat </h6>
                            <input class="form-control mr-sm-2" type="search" placeholder="Choose and Search" aria-label="Search" name="parameter">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                  </form>
                  <script>
                          function changeFormAction(formAction){
                            if(formAction == 1){
                              $('#searchByAfmOrEmailForm').attr('action', '/search-email');
                            }
                            else if (formAction == 2){
                              $('#searchByAfmOrEmailForm').attr('action', '/search-vat');
                            }

                          }
                  </script>

        </ul>
      </div>
       <form class="form-inline my-2 my-lg-0">
                <button  class="btn btn-danger" type="submit">Log Out</button>
       </form>
    </nav>