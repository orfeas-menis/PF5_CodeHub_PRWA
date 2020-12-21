<#import "/spring.ftl" as spring />
<html>
<head>
    <title>Repairs</title>
    <#include "partials/head.ftlh">
</head>
<body>

<#include "partials/navbar.ftlh">
<div class="container-fluid">
    <div class="row">
        <main role="main" class="ml-sm-auto col-lg-12 pt-3 px-4">
            <div role="form">
                <div class="form-group">
                    <form id="searchByAfmOrDateForm" class="form-inline my-2 my-lg-0" method="post"
                          action="/admin/repair/search-vat">

                        <div class="btn-group" role="group" aria-label="Basic example">
                            <input size="26" class="form-control mr-sm-0" type="search" placeholder="Give a VAT"
                                   aria-label="Search"
                                   name="parameter">
                            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                        </div>

                    </form>
                </div>
                <div class="form-group">
                    <form id="DateForm" class="form-inline my-2 my-lg-0" method="post"
                          action="/admin/repair/search-date">

                        <label for="datepicker"> </label>
                        <div class="input-group">
                            <div class="input-group-prepend">
                                <span class="input-group-text"><span data-feather="calendar"></span></span>
                            </div>
                            <input type="text" class="form-control" id="datepicker" name="dateTime">
                        </div>
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>

                    </form>
                </div>
            </div>

            <h3 class="mb-3">Repairs</h3>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>Category</th>
                        <th>City</th>
                        <th>Street</th>
                        <th>Cost</th>
                        <th>Status</th>
                        <th>User VAT</th>
                        <th class="text-center">Edit</th>
                        <th class="text-center">Remove</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#if repairs??>
                        <#list repairs as repair>
                            <tr data-id="${repair.id}">
                                <td>${repair.category}</td>
                                <td>${repair.city}</td>
                                <td>${repair.street}</td>
                                <td>${repair.cost}</td>
                                <td>${repair.status}</td>
                                <td>${repair.userVat}</td>
                                <td class="text-center"><a class="btn btn-link"
                                                           href="/admin/repair/${repair.id}/edit"><span
                                                data-feather="tool"></span></a></td>
                                <td class="text-center">

                                    <button
                                            class="btn btn-link"
                                            data-toggle="modal"
                                            data-target="#modal"
                                            data-id="${repair.id}"
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
                                <h5 class="modal-title">Repair</h5>
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <p>Are you sure you want to delete this repair?</p>
                            </div>
                            <div class="modal-footer">
                                <form method="post" id="deleteRepairForm">
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
<#include "partials/script-datepicker.ftlh">
<script src="/js/mainRepair.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>


</body>
</html>