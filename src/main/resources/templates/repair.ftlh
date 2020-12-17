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
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h3 class="mb-3">Users</h3>
            <div class="table-responsive">
                <table class="table table-striped table-sm">
                    <thead>
                    <tr>
                        <th>Category</th>
                        <th>City</th>
                        <th>street</th>
                        <th>Cost</th>
                        <th>status</th>
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
                                <td class="text-center"><a class="btn btn-link" href="/repair/${repair.id}/edit"><span
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
                                <h5 class="modal-title">User</h5>
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
<script src="/js/mainRepair.js"></script>
</body>
</html>