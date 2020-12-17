<#--<#import "/spring.ftl" as spring />-->

<#--<!DOCTYPE html>-->
<#--<html lang="en">-->
<#--<head>-->
<#--    <meta charset="UTF-8"/>-->
<#--    <title>Users List</title>-->

<#--    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"-->
<#--          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">-->
<#--    <link href="/css/main.css" rel="stylesheet"/>-->
<#--</head>-->
<#--<body>-->
<#--<#include "partials/navbar.ftlh">-->

<#--<form id="searchByAfmOrEmailForm" class="form-inline my-2 my-lg-0" method="post">-->

<#--    <h6 style="margin:3px;"> E-mail </h6> <input type="radio" style="margin:20px;" name="searchRadio"-->
<#--                                                 onclick="changeFormAction(1)">-->
<#--    <h6 style="margin:3px;"> Vat </h6><input type="radio" style="margin:20px;" name="searchRadio"-->
<#--                                             onclick="changeFormAction(2)">-->
<#--    <input class="form-control mr-sm-2" type="search" placeholder="Choose and Search" aria-label="Search"-->
<#--           name="parameter">-->
<#--    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>-->
<#--</form>-->
<#--<script>-->
<#--    function changeFormAction(formAction) {-->
<#--        if (formAction == 1) {-->
<#--            $('#searchByAfmOrEmailForm').attr('action', '/search-email');-->
<#--        } else if (formAction == 2) {-->
<#--            $('#searchByAfmOrEmailForm').attr('action', '/search-vat');-->
<#--        }-->
<#--    }-->
<#--</script>-->

<#--<div class="container pt-4">-->

<#--    <table class="table">-->
<#--        <thead>-->
<#--        <th>First Name</th>-->
<#--        <th>Last name</th>-->
<#--        <th>Vat</th>-->
<#--        <th>E-mail</th>-->
<#--        <th class="text-center">Edit</th>-->
<#--        <th class="text-center">Remove</th>-->
<#--        </thead>-->
<#--        <tbody>-->
<#--        <#list users as user>-->
<#--            <tr data-id="${user.id}">-->
<#--                <td>${user.firstName}</td>-->
<#--                <td>${user.lastName}</td>-->
<#--                <td>${user.vat}</td>-->
<#--                <td>${user.email}</td>-->
<#--                <td class="text-center">-->
<#--                    <a href="/owner/${user.id}/edit">-->
<#--                        <span data-feather="tool"></span>-->
<#--                    </a>-->
<#--                </td>-->
<#--                <td class="text-center">-->
<#--                    <a href="#" data-toggle="modal" data-target="#remove">-->
<#--                        <span data-feather="x"></span>-->
<#--                    </a>-->
<#--                </td>-->
<#--            </tr>-->
<#--        </#list>-->
<#--        </tbody>-->
<#--    </table>-->

<#--    <div id="remove" class="modal" tabindex="-1">-->
<#--        <div class="modal-dialog">-->
<#--            <div class="modal-content">-->
<#--                <div class="modal-header">-->
<#--                    <h5 class="modal-title">Confirm delete</h5>-->
<#--                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">-->
<#--                        <span aria-hidden="true" data-feather="x"></span>-->
<#--                    </button>-->
<#--                </div>-->
<#--                <div class="modal-body">-->
<#--                    Are you sure you want to delete this entry?-->
<#--                </div>-->
<#--                <div class="modal-footer">-->
<#--                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>-->
<#--                    <form data-action-url="/owner-delete/" method="delete" class="modal-delete-action">-->
<#--                        <buttton type="submit" class="btn btn-danger">Delete</buttton>-->
<#--                    </form>-->
<#--                </div>-->
<#--            </div>-->
<#--        </div>-->
<#--    </div>-->
<#--</div>-->

<#--<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"-->
<#--        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"-->
<#--        crossorigin="anonymous"></script>-->
<#--<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"-->
<#--        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"-->
<#--        crossorigin="anonymous"></script>-->
<#--<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>-->
<#--<script src="/js/main.js"></script>-->
<#--<script src="/js/modal.js"></script>-->
<#--<script>feather.replace();</script>-->

<#--</body>-->
<#--</html>-->

<#import "/spring.ftl" as spring />
<html>
<head>
    <title>Users</title>
    <#include "partials/head.ftlh">
</head>
<body>

<#include "partials/navbar.ftlh">
<form id="searchByAfmOrEmailForm" class="form-inline my-2 my-lg-0" method="post">

    <h6 style="margin:3px;"> E-mail </h6> <input type="radio" style="margin:20px;" name="searchRadio"
                                                 onclick="changeFormAction(1)">
    <h6 style="margin:3px;"> Vat </h6><input type="radio" style="margin:20px;" name="searchRadio"
                                             onclick="changeFormAction(2)">
    <input class="form-control mr-sm-2" type="search" placeholder="Choose and Search" aria-label="Search"
           name="parameter">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
</form>
<script>
    function changeFormAction(formAction) {
        if (formAction == 1) {
            $('#searchByAfmOrEmailForm').attr('action', '/search-email');
        } else if (formAction == 2) {
            $('#searchByAfmOrEmailForm').attr('action', '/search-vat');
        }
    }
</script>

<div class="container-fluid">
    <div class="row">
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h3 class="mb-3">Users</h3>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>VAT</th>
                        <th>Email</th>
                        <th class="text-center">Edit</th>
                        <th class="text-center">Remove</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#if users??>
                        <#list users as user>
                            <tr data-id="${user.id}">
                                <td>${user.firstName}</td>
                                <td>${user.lastName}</td>
                                <td>${user.vat}</td>
                                <td>${user.email}</td>
                                <td class="text-center"><a class="btn btn-link" href="/owner/${user.id}/edit"><span data-feather="tool"></span></a></td>
                                <td class="text-center">

                                    <button
                                            class="btn btn-link"
                                            data-toggle="modal"
                                            data-target="#modal"
                                            data-id="${user.id}"
                                    >
                                        <span data-feather="x"></span>
                                    </button>

                                </td>
                            </tr>
                        </#list>
                    </#if>
                    </tbody>
                </table>

                <div id="modal" class="modal" tabindex="-1" role="dialog">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">User</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <p>Are you sure you want to delete this user?</p>
                            </div>
                            <div class="modal-footer">
                                <form method="post" id="deleteForm">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </main>
    </div>
</div>

<#include "partials/script.ftlh">
</body>
</html>