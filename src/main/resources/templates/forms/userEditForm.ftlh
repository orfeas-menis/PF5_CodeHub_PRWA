<#import "/spring.ftl" as spring />
<div class="container-fluid">

    <div class="row">
        <div class="col">
            <h1>Create User</h1>
            <#if errorMessage??>
                <h3 style="color: #dc3545">${errorMessage!""}</h3>
            </#if>
        </div>
    </div>

    <div class="row">
        <div class="col-4">
            <form id="editForm" name="editForm" action="/admin/owner/edit" method="post">

                <input type="hidden" name="id" value="${user.id}">

                <div class="mb-3">
                    <div class="form-group">
                        <label for="vat">VAT</label>
                        <@spring.bind "editForm.vat"/>
                        <input type="text" class="form-control" id="vat" name="vat" value="${user.vat!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="email">Email</label>
                        <@spring.bind "editForm.email"/>
                        <input type="text" class="form-control" id="email" name="email" value="${user.email!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="userRole">User Role</label>
                        <@spring.bind "editForm.userRole"/>
                        <select class="custom-select d-block w-100" id="userRole" name="userRole" value="${user.userRole!''}">
                            <#if userRoles??>
                                <#list userRoles as role>
                                    <option value="${role}"<#if user.userRole == role> selected</#if>>${role}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="firstName">First Name</label>
                        <@spring.bind "editForm.firstName"/>
                        <input type="text" class="form-control" id="firstName" name="firstName" value="${user.firstName!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="lastName">Last Name</label>
                        <@spring.bind "editForm.lastName"/>
                        <input type="text" class="form-control" id="lastName" name="lastName" value="${user.lastName!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="city">City</label>
                        <@spring.bind "editForm.city"/>
                        <input type="text" class="form-control" id="city" name="city" value="${user.city!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="city">Street</label>
                        <@spring.bind "editForm.street"/>
                        <input type="text" class="form-control" id="street" name="street" value="${user.street!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="streetNumber">Number</label>
                        <@spring.bind "editForm.streetNumber"/>
                        <input type="text" class="form-control" id="streetNumber" name="streetNumber" value="${user.streetNumber!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="postalCode">Postal Code</label>
                        <@spring.bind "editForm.postalCode"/>
                        <input type="text" class="form-control" id="postalCode" name="postalCode" value="${user.postalCode!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="phoneNumber">Phone Number</label>

                        <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${user.phoneNumber!''}">
                        <#if spring.status.error>
                            <ul>
                                <#list spring.status.errorMessages as error>
                                    <li style="color: #dc3545">${error}</li>
                                </#list>
                            </ul>
                        </#if>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="propertyType">Property Type</label>
                        <@spring.bind "editForm.propertyType"/>
                        <select class="custom-select d-block w-100" id="propertyType" name="propertyType" value="${user.propertyTypes!''}">
                            <#if propertyTypes??>
                                <#list propertyTypes as type>
                                    <option value="${type}"<#if user.propertyTypes == type> selected</#if>>${type}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                </div>

                <button class="btn btn-primary btn-lg mt-4" type="submit">Update</button>
            </form>
        </div>
    </div>
</div>