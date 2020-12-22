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
            <form id="createForm" name="createForm" action="/admin/owner/create" method="post">
                <div class="mb-3">
                    <div class="form-group">
                        <label for="vat">VAT</label>
                        <@spring.bind "createForm.vat"/>
                        <input type="text" class="form-control" id="vat" name="vat" value="${createForm.vat!''}">
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
                        <@spring.bind "createForm.email"/>
                        <input type="text" class="form-control" id="email" name="email" value="${createForm.email!''}">
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
                        <label for="password">Password</label>
                        <@spring.bind "createForm.password"/>
                        <input type="password" class="form-control" id="password" name="password" value="${createForm.password!''}">
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
                        <@spring.bind "createForm.userRole"/>
                        <select class="custom-select d-block w-100" id="userRole" name="userRole" value="${createForm.userRole!''}">
                            <#if userRoles??>
                                <#list userRoles as role>
                                    <option value="${role}">${role}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                </div>

                <div class="mb-3">
                    <div class="form-group">
                        <label for="firstName">First Name</label>
                        <@spring.bind "createForm.firstName"/>
                        <input type="text" class="form-control" id="firstName" name="firstName" value="${createForm.firstName!''}">
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
                        <@spring.bind "createForm.lastName"/>
                        <input type="text" class="form-control" id="lastName" name="lastName" value="${createForm.lastName!''}">
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
                        <@spring.bind "createForm.city"/>
                        <input type="text" class="form-control" id="city" name="city" value="${createForm.city!''}">
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
                        <@spring.bind "createForm.street"/>
                        <input type="text" class="form-control" id="street" name="street" value="${createForm.street!''}">
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
                        <@spring.bind "createForm.streetNumber"/>
                        <input type="text" class="form-control" id="streetNumber" name="streetNumber" value="${createForm.streetNumber!''}">
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
                        <@spring.bind "createForm.postalCode"/>
                        <input type="text" class="form-control" id="postalCode" name="postalCode" value="${createForm.postalCode!''}">
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

                        <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${createForm.phoneNumber!''}">
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
                        <@spring.bind "createForm.propertyType"/>
                        <select class="custom-select d-block w-100" id="propertyType" name="propertyType" value="${createForm.phoneNumber!''}">
                            <#if propertyTypes??>
                                <#list propertyTypes as propertyType>
                                    <option value="${propertyType}">${propertyType}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                </div>
                <button class="btn btn-primary btn-lg mt-4" type="submit">Create</button>
            </form>
        </div>
    </div>

</div>


