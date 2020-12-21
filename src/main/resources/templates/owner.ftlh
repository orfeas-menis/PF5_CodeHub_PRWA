<#import "/spring.ftl" as spring />
<html>
<head>
    <title>Users</title>
    <#include "partials/head.ftlh">
</head>
<body>

<#include "partials/navbar.ftlh">

<div class="container-fluid">
    <div class="row">
        <main role="main" class="ml-sm-auto col-lg-12 pt-3 px-4">
            <form id="searchByAfmOrEmailForm" class="form-inline my-2 my-lg-0" method="post" action="/admin/search-vat">
                <h6 style="margin:3px;"> E-mail </h6> <input type="radio" style="margin:20px;" name="searchRadio"
                                                             onclick="changeFormAction(1)">
                <h6 style="margin:3px;"> Vat </h6><input type="radio" style="margin:20px;" name="searchRadio"
                                                         onclick="changeFormAction(2)" checked>
                <input class="form-control mr-sm-2" type="search" placeholder="Choose and Search" aria-label="Search"
                       name="parameter">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
            <h3 class="mb-3">Users</h3>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>VAT</th>
                        <th>Email</th>
                        <th>Phone Number</th>
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
                                <td>${user.phoneNumber}</td>
                                <td class="text-center"><a class="btn btn-link"
                                                           href="/admin/owner/${user.id}/edit"><span
                                                data-feather="tool"></span></a></td>
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
<script>
    function changeFormAction(formAction) {
        if (formAction == 1) {
            $('#searchByAfmOrEmailForm').attr('action', '/admin/search-email');
        } else if (formAction == 2) {
            $('#searchByAfmOrEmailForm').attr('action', '/admin/search-vat');
        }
    }
</script>
</body>
</html>