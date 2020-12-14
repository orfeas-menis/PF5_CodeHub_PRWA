<#import "/spring.ftl" as spring />

<h4 class="mb-3">Create User</h4>

<form id="createForm" action="/owner/create" method="post">

    <div class="mb-3">
        <label for="vat">VAT</label>
        <div class="input-group">
            <input type="text" class="form-control" id="vat" name="vat">
        </div>
    </div>

    <div class="mb-3">
        <label for="email">Email</label>
        <div class="input-group">
            <input type="text" class="form-control" id="email" name="email">
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
                        <option value="${role}">${role}</option>
                    </#list>
                </#if>
            </select>
        </div>
    </div>

    <div class="mb-3">
        <label for="firstName">First Name</label>
        <div class="input-group">
            <input type="text" class="form-control" id="firstName" name="firstName">
        </div>
    </div>

    <div class="mb-3">
        <label for="lastName">Last Name</label>
        <div class="input-group">
            <input type="text" class="form-control" id="lastName" name="lastName">
        </div>
    </div>

    <div class="mb-3">
        <label for="city">City</label>
        <div class="input-group">
            <input type="text" class="form-control" id="city" name="city">
        </div>
    </div>

    <div class="mb-3">
        <label for="street">Street</label>
        <div class="input-group">
            <input type="text" class="form-control" id="street" name="street">
        </div>
    </div>

    <div class="mb-3">
        <label for="streetNumber">Number</label>
        <div class="input-group">
            <input type="text" class="form-control" id="streetNumber" name="streetNumber">
        </div>
    </div>

    <div class="mb-3">
        <label for="postalCode">Postal Code</label>
        <div class="input-group">
            <input type="text" class="form-control" id="postalCode" name="postalCode">
        </div>
    </div>

    <div class="mb-3">
        <label for="phoneNumber">Phone Number</label>
        <div class="input-group">
            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber">
        </div>
    </div>

    <div class="mb-3">
        <label for="propertyType">Property Type</label>
        <div class="input-group">
            <select class="custom-select d-block w-100" id="propertyType" name="propertyType">
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