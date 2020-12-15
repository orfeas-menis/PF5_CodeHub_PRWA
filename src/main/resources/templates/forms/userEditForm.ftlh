<#import "/spring.ftl" as spring />

<h4 class="mb-3">Create User</h4>

<form id="editForm" action="/owner/edit" method="post">

    <input type="hidden" name="id" value="${user.id}">

    <div class="mb-3">
        <label for="vat">VAT</label>
        <div class="input-group">
            <input type="text" class="form-control" id="vat" name="vat" value="${user.vat}">
        </div>
    </div>

    <div class="mb-3">
        <label for="email">Email</label>
        <div class="input-group">
            <input type="text" class="form-control" id="email" name="email" value="${user.email}">
        </div>
    </div>

    <div class="mb-3">
        <label for="password">Password</label>
        <div class="input-group">
            <input type="text" class="form-control" id="password" name="password">
        </div>
    </div>

    <div class="mb-3">
        <label for="userRole">User Role</label>
        <div class="input-group">
            <select class="custom-select d-block w-100" id="userRole" name="userRole">
                <#if userRoles??>
                    <#list userRoles as role>
                        <option value="${role}"<#if user.userRole == role> selected</#if>>${role}</option>
                    </#list>
                </#if>
            </select>
        </div>
    </div>

    <div class="mb-3">
        <label for="firstName">First Name</label>
        <div class="input-group">
            <input type="text" class="form-control" id="firstName" name="firstName" value="${user.firstName}">
        </div>
    </div>

    <div class="mb-3">
        <label for="lastName">Last Name</label>
        <div class="input-group">
            <input type="text" class="form-control" id="lastName" name="lastName" value="${user.lastName}">
        </div>
    </div>

    <div class="mb-3">
        <label for="city">City</label>
        <div class="input-group">
            <input type="text" class="form-control" id="city" name="city" value="${user.city}">
        </div>
    </div>

    <div class="mb-3">
        <label for="street">Street</label>
        <div class="input-group">
            <input type="text" class="form-control" id="street" name="street" value="${user.street}">
        </div>
    </div>

    <div class="mb-3">
        <label for="streetNumber">Number</label>
        <div class="input-group">
            <input type="text" class="form-control" id="streetNumber" name="streetNumber" value="${user.streetNumber}">
        </div>
    </div>

    <div class="mb-3">
        <label for="postalCode">Postal Code</label>
        <div class="input-group">
            <input type="text" class="form-control" id="postalCode" name="postalCode" value="${user.postalCode}">
        </div>
    </div>

    <div class="mb-3">
        <label for="phoneNumber">Phone Number</label>
        <div class="input-group">
            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" value="${user.phoneNumber}">
        </div>
    </div>

    <div class="mb-3">
        <label for="propertyType">Property Type</label>
        <div class="input-group">
            <select class="custom-select d-block w-100" id="propertyType" name="propertyType">
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